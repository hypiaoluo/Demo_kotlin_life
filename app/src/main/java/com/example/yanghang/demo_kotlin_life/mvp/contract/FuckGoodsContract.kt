package com.example.yanghang.demo_kotlin_life.mvp.contract

import com.example.yanghang.demo_kotlin_life.bean.FuckGoods
import com.example.yanghang.demo_kotlin_life.bean.JsonResult
import rx.Observable

/**
 * Created by yanghang
 * on 2018/5/31.
 */
interface FuckGoodsContract{

    interface View{
        fun setData(results: List<FuckGoods>)
    }

    interface Model{
        fun getData(page: Int,type:String): Observable<JsonResult<List<FuckGoods>>>
    }

    interface Presenter{
        open fun getData(page: Int, type: String)
    }
}