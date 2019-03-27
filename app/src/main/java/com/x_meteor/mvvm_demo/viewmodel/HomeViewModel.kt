package com.x_meteor.mvvm_demo.viewmodel

import com.x_meteor.kotlindemo.rx.scheduler.SchedulerUtils
import com.x_meteor.mvvm_demo.databinding.FragmentHomeBinding
import com.x_meteor.mvvm_demo.net.ApiService
import com.x_meteor.mvvm_demo.net.RetrofitManager
import com.x_meteor.mvvm_demo.view.adapter.HomeAdapter

/**
 * @author: X_Meteor
 * @description: 类描述
 * @version: V_1.0.0
 * @date: 2018/11/26 14:32
 * @company:
 * @email: lx802315@163.com
 */
class HomeViewModel(val apiService: ApiService, val mDataBing: FragmentHomeBinding) {

    fun getGankInfo() {
        apiService.getAllGankData(20, 1)
            .compose(SchedulerUtils.ioToMain())
            .subscribe({
                var adapte = (mDataBing.recyHome.adapter as HomeAdapter)
                adapte.list = it.results
                adapte.notifyDataSetChanged()
            })

    }
}