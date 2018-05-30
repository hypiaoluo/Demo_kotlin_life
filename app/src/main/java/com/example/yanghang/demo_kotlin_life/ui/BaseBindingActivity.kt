package com.example.yanghang.demo_kotlin_life.ui

import android.databinding.ViewDataBinding
import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.example.yanghang.demo_kotlin_life.R

/**
 * Created by yanghang
 * on 2018/5/30.
 */

abstract class BaseBindingActivity<B :ViewDataBinding>: AppCompatActivity(){

    /**
     *  lateinit 不能用在可空属性上和java基本类型上
     *
     *  lazy{} 只能用在val类型,lateinit只能用在var类型
     *
     *  lateinit可以在任何位置初始化并且可以初始化多次 ,而lazy在第一次调用的时候就进行初始化
     *  要想改变只能重新定义
     */
    lateinit var mBinding: B

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        mBinding=createDataBinding(savedInstanceState)
        initView()
    }

    abstract fun initView()


    abstract fun createDataBinding(savedInstanceState: Bundle?): B

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    fun setupToolbar(toolbar: Toolbar){
        toolbar.title=""
        toolbar.setNavigationIcon(R.drawable.icon_back)
        setSupportActionBar(toolbar)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId){
            android.R.id.home->onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}