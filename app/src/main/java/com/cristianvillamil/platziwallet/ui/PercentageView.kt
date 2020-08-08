package com.cristianvillamil.platziwallet.ui

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.FrameLayout
import com.cristianvillamil.platziwallet.R

class PercentageView: FrameLayout{

    constructor(context:Context, attributeSet: AttributeSet, defStyle: Int): super(
        context,
        attributeSet,
        defStyle
    ){
        initView()
    }

    constructor(context: Context, attributeSet: AttributeSet): super(context, attributeSet){
        initView()
    }

    constructor(context: Context):super(context){
        initView()
    }

    private fun initView(){
        val view = View.inflate(context, R.layout.percentage_view, null)
        addView(view)

    }
}