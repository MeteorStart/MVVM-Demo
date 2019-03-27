package com.x_meteor.mvvm_demo.view.fragment

import android.databinding.DataBindingUtil
import android.view.View
import com.x_meteor.mvvm_demo.R
import com.x_meteor.mvvm_demo.base.BaseFragment
import com.x_meteor.mvvm_demo.databinding.FragmentReadBinding
import com.x_meteor.mvvm_demo.net.RetrofitManager
import com.x_meteor.mvvm_demo.viewmodel.ReadViewModel

/**
 * @author: X_Meteor
 * @description: 类描述
 * @version: V_1.0.0
 * @date: 2018/11/21 15:59
 * @company:
 * @email: lx802315@163.com
 */
class ReadFragment : BaseFragment() {

    lateinit var mBinding: FragmentReadBinding
    lateinit var readViewModel: ReadViewModel

    override fun getLayoutView(): View {
        mBinding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_read, null, false)
        return mBinding.root
    }

    override fun initView() {
        readViewModel = ReadViewModel(RetrofitManager.getInstance(), mBinding)
        mBinding.readViewModel = readViewModel
    }

    override fun lazyLoad() {
    }
}