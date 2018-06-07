package com.example.yanghang.demo_kotlin_life.ui.activity

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import android.view.View
import com.example.yanghang.demo_kotlin_life.R
import com.example.yanghang.demo_kotlin_life.bean.FuckGoods
import com.example.yanghang.demo_kotlin_life.databinding.ActivityMainBinding
import com.example.yanghang.demo_kotlin_life.di.component.RandomModule
import com.example.yanghang.demo_kotlin_life.getMainComponent
import com.example.yanghang.demo_kotlin_life.mvp.contract.RandomContract
import com.example.yanghang.demo_kotlin_life.mvp.contract.presenter.RandomPresent
import com.example.yanghang.demo_kotlin_life.router.GankClientUri
import com.example.yanghang.demo_kotlin_life.router.GankRouter
import com.example.yanghang.demo_kotlin_life.toast
import kotlinx.android.synthetic.main.activity_main.*
import java.net.URLEncoder
import java.util.*
import javax.inject.Inject

class MainActivity : BaseBindingActivity<ActivityMainBinding>(), RandomContract.View {


    lateinit var mFragments: MutableList<Fragment>

    @Inject lateinit var mPresenter: RandomPresent
    override fun createDataBinding(savedInstanceState: Bundle?): ActivityMainBinding {
        return DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    override fun initView() {
        initFragments()
        getMainComponent().plus(RandomModule(this)).inject(this)
        viewPager.adapter = object : FragmentPagerAdapter(supportFragmentManager) {
            override fun getItem(position: Int) = mFragments[position]
            override fun getCount() = mFragments.size
        }
        viewPager.offscreenPageLimit = 4

        navigationView.setOnNavigationItemSelectedListener { item ->
            var tab = 0
            when (item.itemId) {
                R.id.menu_android -> tab = 0
                R.id.menu_ios -> tab = 1
                R.id.menu_girl -> tab = 2
                R.id.menu_about -> tab = 3
            }
            viewPager.currentItem=tab
            false
        }
        floatingButton.setOnClickListener(View.OnClickListener {
            mPresenter.getRandom("Android")
        })

    }

    private fun initFragments() {
        mFragments = ArrayList()
        //添加Fragment
    }

    override fun onRandom(goods: FuckGoods) {
        val url = URLEncoder.encode(goods.url)
        toast("手气不错～")
        GankRouter.router(this, GankClientUri.DETAIL + url)
    }


}

