package com.x_meteor.mvvm_demo.view.fragment

import android.databinding.DataBindingUtil
import android.support.v7.widget.LinearLayoutManager
import android.view.View
import com.x_meteor.mvvm_demo.R
import com.x_meteor.mvvm_demo.base.BaseFragment
import com.x_meteor.mvvm_demo.databinding.FragmentHomeBinding
import com.x_meteor.mvvm_demo.model.GankModel
import com.x_meteor.mvvm_demo.net.RetrofitManager
import com.x_meteor.mvvm_demo.view.adapter.HomeAdapter
import com.x_meteor.mvvm_demo.viewmodel.HomeViewModel
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * @author: X_Meteor
 * @description: 类描述
 * @version: V_1.0.0
 * @date: 2018/11/21 15:59
 * @company:
 * @email: lx802315@163.com
 */
class HomeFragment : BaseFragment() {

    private var itemList = ArrayList<GankModel.ResultsBean>()

    private val homeAdapter by lazy { HomeAdapter(context, itemList, R.layout.item_home) }

    lateinit var homeBinding: FragmentHomeBinding

    lateinit var homeViewModel: HomeViewModel

    private val linearLayoutManager by lazy {
        LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
    }

    override fun getLayoutView(): View {
        homeBinding = DataBindingUtil.inflate(layoutInflater, R.layout.fragment_home, null, false)
        return homeBinding.root
    }

    override fun initView() {
        recyHome.layoutManager = linearLayoutManager
        recyHome.adapter = homeAdapter
        homeViewModel = HomeViewModel(RetrofitManager.getInstance(), homeBinding)
        homeBinding.home = homeViewModel
    }

    override fun lazyLoad() {
        homeViewModel.getGankInfo()

    }

}