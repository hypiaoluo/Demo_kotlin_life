package com.example.yanghang.demo_kotlin_life.ui.activity

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.airbnb.deeplinkdispatch.DeepLink
import com.example.yanghang.demo_kotlin_life.R
import com.example.yanghang.demo_kotlin_life.router.GankClientUri

/**
 * Created by yanghang
 * on 2018/6/7.
 */
@DeepLink(GankClientUri.ABOUT)
class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_about)
    }
}