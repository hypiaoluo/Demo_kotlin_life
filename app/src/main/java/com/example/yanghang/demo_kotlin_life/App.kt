package com.example.yanghang.demo_kotlin_life

import android.app.Application
import com.example.yanghang.demo_kotlin_life.di.ApiComponet
import javax.inject.Inject

/**
 * Created by yanghang
 * on 2018/5/30.
 */
class App: Application(){

    init {
        instance=this
    }
    @Inject lateinit var apiComponent:ApiComponet

    override fun onCreate() {
        super.onCreate()

    }

    //类似java静态成员
    //Object expression是马上执行的
   // Object declaration是lazy的，在第一次使用时执行
   // Companion Object是在类第一次加载时执行
    companion object{

        lateinit var instance:App
    }
}