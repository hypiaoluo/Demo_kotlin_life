package com.example.yanghang.demo_kotlin_life.bean

/**
 * Created by yanghang
 * on 2018/5/30.
 * 数据接收类
 */
data class FuckGoods(
        val _id:String,
        val createdAt:String,
        val desc: String,
        val images:Array<String>,
        val publishedAt:String,
        val source: String,
        val type: String,
        val url: String,
        val used: Boolean,
        val who: String

){
    fun hasImg():Boolean{
        return images!=null
    }

    fun create()=createdAt.substring(0,10)
}
