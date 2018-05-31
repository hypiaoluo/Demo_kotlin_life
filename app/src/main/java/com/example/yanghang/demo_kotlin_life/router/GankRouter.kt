package com.example.yanghang.demo_kotlin_life.router

import android.content.Context
import android.content.Intent
import android.net.Uri

/**
 * Created by yanghang
 * on 2018/5/31.
 */
object GankRouter{
    fun router(context: Context,uri:String){
        val intent=Intent()
        intent.data= Uri.parse(uri)
        intent.action=Intent.ACTION_VIEW
        context.startActivity(intent)
    }

}