package com.example.yanghang.demo_kotlin_life.di.module

import android.content.Context
import dagger.Module
import dagger.Provides

/**
 * Created by yanghang
 * on 2018/5/31.
 */
@Module
        class AppMoudle(private val context:Context){
    //注入提供者
    @Provides fun provideContext()=context
}