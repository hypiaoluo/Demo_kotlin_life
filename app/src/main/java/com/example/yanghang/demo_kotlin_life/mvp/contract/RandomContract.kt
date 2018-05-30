package com.example.yanghang.demo_kotlin_life.mvp.contract

import com.example.yanghang.demo_kotlin_life.bean.FuckGoods
import com.example.yanghang.demo_kotlin_life.bean.JsonResult
import rx.Observable

/**
 * Created by yanghang
 * on 2018/5/30.
 */
interface RandomContract{
    interface View{
        fun onRandom(goods: FuckGoods)
    }
    interface Model{

        fun getRandom(type:String): Observable<JsonResult<List<FuckGoods>>>
    }

    interface Presenter{
        fun  getRandom(type: String)
    }
}