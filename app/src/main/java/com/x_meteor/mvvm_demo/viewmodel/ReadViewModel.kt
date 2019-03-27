package com.x_meteor.mvvm_demo.viewmodel

import android.databinding.ObservableField
import com.x_meteor.kotlindemo.rx.scheduler.SchedulerUtils
import com.x_meteor.mvvm_demo.databinding.FragmentReadBinding
import com.x_meteor.mvvm_demo.model.GankModel
import com.x_meteor.mvvm_demo.model.GankModel.ResultsBean
import com.x_meteor.mvvm_demo.net.ApiService

/**
 * @author: X_Meteor
 * @description: 类描述
 * @version: V_1.0.0
 * @date: 2018/11/22 14:17
 * @company:
 * @email: lx802315@163.com
 */
class ReadViewModel(val apiService: ApiService, val mDataBing: FragmentReadBinding) {

    fun getGankInfo() {
        apiService.getAllGankData(20, 1)
            .compose(SchedulerUtils.ioToMain())
            .subscribe({
                mDataBing.gankModel = it.results.get(0)
            })
    }

}