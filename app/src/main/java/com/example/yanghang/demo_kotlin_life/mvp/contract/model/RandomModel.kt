package com.example.yanghang.demo_kotlin_life.mvp.contract.model

import com.example.yanghang.demo_kotlin_life.api.GankApi
import com.example.yanghang.demo_kotlin_life.bean.FuckGoods
import com.example.yanghang.demo_kotlin_life.bean.JsonResult
import com.example.yanghang.demo_kotlin_life.mvp.contract.RandomContract
import rx.Observable
import javax.inject.Inject

/**
 * Created by yanghang
 * on 2018/6/6.
 */
class RandomModel
@Inject constructor(private val api: GankApi):RandomContract.Model{
    override fun getRandom(type: String): Observable<JsonResult<List<FuckGoods>>> {
       return api.getRandom(type)
    }

}