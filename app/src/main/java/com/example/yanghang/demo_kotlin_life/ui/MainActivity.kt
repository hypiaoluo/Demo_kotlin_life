package com.example.yanghang.demo_kotlin_life.ui

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.example.yanghang.demo_kotlin_life.R
import com.example.yanghang.demo_kotlin_life.bean.FuckGoods
import com.example.yanghang.demo_kotlin_life.databinding.ActivityMainBinding
import com.example.yanghang.demo_kotlin_life.mvp.contract.RandomContract

class MainActivity : BaseBindingActivity<ActivityMainBinding>(),RandomContract.View{

    override fun createDataBinding(savedInstanceState: Bundle?): ActivityMainBinding{
        return DataBindingUtil.setContentView(this, R.layout.activity_main)
    }

    override fun initView() {

    }

    override fun onRandom(goods: FuckGoods) {

    }


}
