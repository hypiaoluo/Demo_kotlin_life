package com.example.yanghang.demo_kotlin_life.di.component

import com.example.yanghang.demo_kotlin_life.mvp.contract.RandomContract
import com.example.yanghang.demo_kotlin_life.ui.activity.MainActivity
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

/**
 * Created by yanghang
 * on 2018/6/6.
 */
@Subcomponent(modules = arrayOf(RandomModule::class))
interface RandomComponent {
    fun inject(activity: MainActivity)
}


@Module
class RandomModule(private val mView: RandomContract.View) {
    @Provides
    fun getView() = mView
}