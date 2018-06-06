package com.example.yanghang.demo_kotlin_life.mvp.contract.presenter

import com.example.yanghang.demo_kotlin_life.mvp.contract.RandomContract
import com.example.yanghang.demo_kotlin_life.mvp.contract.model.RandomModel
import rx.android.schedulers.AndroidSchedulers
import javax.inject.Inject

/**
 * Created by yanghang
 * on 2018/6/6.
 */
class RandomPresent
@Inject constructor(private val mModel: RandomModel,
                    private val mView: RandomContract.View) : RandomContract.Presenter, BasePresenter() {
    override fun getRandom(type: String) {
        addSubscription(mModel.getRandom(type).observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    res ->
                    if (!res.error){
                        mView.onRandom(res.result[0])
                    }
                },{}))
    }

}