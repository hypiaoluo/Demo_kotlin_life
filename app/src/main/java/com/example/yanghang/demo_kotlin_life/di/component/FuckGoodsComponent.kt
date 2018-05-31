package com.example.yanghang.demo_kotlin_life.di.component

import com.example.yanghang.demo_kotlin_life.mvp.contract.FuckGoodsContract
import dagger.Module
import dagger.Provides
import dagger.Subcomponent

/**
 * Created by yanghang
 * on 2018/5/31.
 */
@Subcomponent(modules = arrayOf(FuckGoodsModule::class))
interface FuckGoodsComponent {
//    fun inject(fragment: AndroidFragment)
//    fun inject(fragment: IOSFragment)
//
//    fun inject(fragment: GirlFragment)
}

@Module
class FuckGoodsModule(private val mView: FuckGoodsContract.View){
    @Provides
    fun getView() = mView
}