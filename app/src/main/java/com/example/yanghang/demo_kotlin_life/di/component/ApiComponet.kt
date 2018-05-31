package com.example.yanghang.demo_kotlin_life.di.component

import com.example.yanghang.demo_kotlin_life.App
import com.example.yanghang.demo_kotlin_life.di.module.ApiModule
import com.example.yanghang.demo_kotlin_life.mvp.contract.model.FuckGoodsModel
import dagger.Component
import javax.inject.Singleton

/**
 * Created by yanghang
 * on 2018/5/30.
 */
@Singleton
@Component(modules = arrayOf(ApiModule::class))
interface ApiComponet {
    fun inject(app:App)

    fun plus(module:FuckGoodsModel)
    fun plus(module: RandomModule):RandomComponent
}