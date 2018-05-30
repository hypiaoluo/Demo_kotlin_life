package com.example.yanghang.demo_kotlin_life.di

import com.example.yanghang.demo_kotlin_life.App
import dagger.Component
import dagger.Module
import javax.inject.Singleton

/**
 * Created by yanghang
 * on 2018/5/30.
 */
@Singleton
@Component(modules =)
interface ApiComponet {
    fun inject(app:App)

}