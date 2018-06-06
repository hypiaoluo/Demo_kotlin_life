package com.example.yanghang.demo_kotlin_life.mvp.contract.presenter

import rx.Subscription
import rx.subscriptions.CompositeSubscription

/**
 * Created by yanghang
 * on 2018/6/6.
 */
open class BasePresenter{
    var compositeSubscription=CompositeSubscription()

    protected fun addSubscription(subscription: Subscription){
        compositeSubscription.add(subscription)
    }

    fun unSubscribe(){
        if (compositeSubscription.hasSubscriptions()){
            compositeSubscription.unsubscribe()
        }
    }
}