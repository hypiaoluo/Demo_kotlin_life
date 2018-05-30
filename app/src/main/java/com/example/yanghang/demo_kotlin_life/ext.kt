package com.example.yanghang.demo_kotlin_life

import android.content.Context
import android.widget.Toast

/**
 * Created by yanghang
 * on 2018/5/30.
 */
fun Context.getMainComponent()=App.instance.apiComponent

fun Context.toast(msg:String,length:Int=Toast.LENGTH_SHORT){
    Toast.makeText(this,msg,length).show()
}