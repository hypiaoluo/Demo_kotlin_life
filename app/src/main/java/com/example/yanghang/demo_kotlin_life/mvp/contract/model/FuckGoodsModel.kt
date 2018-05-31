package com.example.yanghang.demo_kotlin_life.mvp.contract.model

import com.example.yanghang.demo_kotlin_life.api.GankApi
import com.example.yanghang.demo_kotlin_life.bean.FuckGoods
import com.example.yanghang.demo_kotlin_life.bean.JsonResult
import com.example.yanghang.demo_kotlin_life.mvp.contract.FuckGoodsContract
import rx.Observable
import javax.inject.Inject

/**
 * Created by yanghang
 * on 2018/5/31.
 */
class FuckGoodsModel
@Inject constructor(private val api: GankApi) :FuckGoodsContract.Model{
    override fun getData(page: Int, type: String): Observable<JsonResult<List<FuckGoods>>> {

        when(type){
//            AndroidFragment.ANDROID -> return api.getAndroidData(page)
//            IOSFragment.IOS -> return api.getiOSData(page)
//            GirlFragment.GIRL -> return api.getGirlData(page)
            else -> return api.getAndroidData(page)
        }
    }

}