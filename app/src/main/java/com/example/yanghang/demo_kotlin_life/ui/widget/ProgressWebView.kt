package com.example.yanghang.demo_kotlin_life.ui.widget

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.webkit.WebView
import android.widget.AbsoluteLayout
import android.widget.ProgressBar
import com.example.yanghang.demo_kotlin_life.R

/**
 * Created by yanghang
 * on 2018/6/7.
 */
class ProgressWebView(context: Context, attrs: AttributeSet) : WebView(context, attrs) {

    private val progressbar: ProgressBar

    init {
        progressbar = ProgressBar(context, null,
                R.attr.progressBarStyle)
        progressbar.layoutParams = AbsoluteLayout.LayoutParams(AbsoluteLayout.LayoutParams.FILL_PARENT,
                10, 0, 0)

        val drawable = context.resources.getDrawable(R.drawable.progress_bar)
        progressbar.progressDrawable = drawable
        addView(progressbar)
        setWebChromeClient(WebChromeClient())
        settings.builtInZoomControls = true
    }

    inner class WebChromeClient : android.webkit.WebChromeClient() {
        override fun onProgressChanged(view: WebView, newProgress: Int) {
            if (newProgress == 100) {
                progressbar.visibility = View.GONE
            } else {
                if (progressbar.visibility == View.GONE)
                    progressbar.visibility = View.VISIBLE
                progressbar.progress = newProgress
            }
            super.onProgressChanged(view, newProgress)
        }

    }

    override fun onScrollChanged(l: Int, t: Int, oldl: Int, oldt: Int) {
        val lp = progressbar.layoutParams as AbsoluteLayout.LayoutParams
        lp.x = l
        lp.y = t
        progressbar.layoutParams = lp
        super.onScrollChanged(l, t, oldl, oldt)
    }
}