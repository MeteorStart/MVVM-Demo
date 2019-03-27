package com.x_meteor.mvvm_demo.view.adapter

import android.content.Context
import com.x_meteor.mvvm_demo.base.BaseMvvmRecyAdapter
import com.x_meteor.mvvm_demo.databinding.ItemHomeBinding
import com.x_meteor.mvvm_demo.model.GankModel
import com.x_meteor.mvvm_demo.utils.LogUtils

/**
 * @author: X_Meteor
 * @description: 类描述
 * @version: V_1.0.0
 * @date: 2018/11/23 14:12
 * @company:
 * @email: lx802315@163.com
 */
class HomeAdapter(mContext: Context?, list: MutableList<GankModel.ResultsBean>?, layoutId: Int) :
    BaseMvvmRecyAdapter<GankModel.ResultsBean>(mContext, list, layoutId) {

    override fun convert(helper: MyViewHolder?, item: GankModel.ResultsBean?) {
        item?.createdAt = item?.createdAt?.substring(0, 10)
        (helper?.binding as ItemHomeBinding).imageUrl = item?.images?.get(0)
        (helper?.binding as ItemHomeBinding).item = item
    }


}