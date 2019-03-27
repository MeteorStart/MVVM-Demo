package com.x_meteor.mvvm_demo.view.fragment

import android.view.View
import com.x_meteor.mvvm_demo.R
import com.x_meteor.mvvm_demo.base.BaseFragment

/**
 * @author: X_Meteor
 * @description: 类描述
 * @version: V_1.0.0
 * @date: 2018/11/21 15:59
 * @company:
 * @email: lx802315@163.com
 */
class RepositoryFragment : BaseFragment() {
    override fun getLayoutView(): View {
        return layoutInflater.inflate(R.layout.fragment_repository, null)
    }

    override fun initView() {
    }

    override fun lazyLoad() {
    }
}