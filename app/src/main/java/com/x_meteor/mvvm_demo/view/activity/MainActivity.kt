package com.x_meteor.mvvm_demo.view.activity

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import com.x_meteor.mvvm_demo.R
import com.x_meteor.mvvm_demo.base.BaseActivity
import com.x_meteor.mvvm_demo.base.BaseFragmentAdapter
import com.x_meteor.mvvm_demo.view.fragment.HomeFragment
import com.x_meteor.mvvm_demo.view.fragment.MyFragment
import com.x_meteor.mvvm_demo.view.fragment.ReadFragment
import com.x_meteor.mvvm_demo.view.fragment.RepositoryFragment
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : BaseActivity() {

    private var pagerAdapter: FragmentStatePagerAdapter? = null
    //声明一个集合用于存放Fragment
    private var fragments: ArrayList<Fragment>? = null

    override fun layoutId() = R.layout.activity_main

    override fun initView() {
        bottomMain.enableAnimation(false)
        bottomMain.enableShiftingMode(false)
        vpMain.offscreenPageLimit = 3
    }

    override fun initData() {
        //初始化数据
        fragments = ArrayList()
        fragments?.add(HomeFragment())
        fragments?.add(ReadFragment())
        fragments?.add(RepositoryFragment())
        fragments?.add(MyFragment())

        pagerAdapter = BaseFragmentAdapter(supportFragmentManager, fragments!!)
        //为viewpager设置适配器
        vpMain?.adapter = pagerAdapter

        bottomMain?.setupWithViewPager(vpMain)
    }

    override fun initListener() {
        //viewpager页面切换换监听
        vpMain.addOnAdapterChangeListener(object : ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {
            override fun onAdapterChanged(viewPager: ViewPager, oldAdapter: PagerAdapter?, newAdapter: PagerAdapter?) {
            }

            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageSelected(position: Int) {
                bottomMain.menu.getItem(position).isChecked = true
            }

        })

        //设置viewPager为不可滑动状态,存在主Fragment无法切换左右切换
        vpMain?.setOnTouchListener { v, event ->
            //修改为true 不可滑动，false 可滑动
            true
        }

        //bottom点击监听
        bottomMain.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.btn_home -> vpMain.currentItem = 0
                R.id.btn_read -> vpMain.currentItem = 1
                R.id.btn_repository -> vpMain.currentItem = 2
                R.id.btn_my -> vpMain.currentItem = 3
                else -> -1
            }
        }
    }

    override fun getNetData() {

    }
}
