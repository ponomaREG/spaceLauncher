package com.space.laucher.ui.customViews

import android.content.Context
import android.util.AttributeSet
import android.util.Log
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.space.laucher.R
import kotlinx.android.synthetic.main.pair_textviews.view.*

class PairOfTextViews(context: Context,attributeSet: AttributeSet?):LinearLayout(context,attributeSet) {
    init {
        LayoutInflater.from(context).inflate(R.layout.pair_textviews,this,true)
        attributeSet?.let {
            val typedArray = context.obtainStyledAttributes(
                it,R.styleable.PairOfTextViews,0,0
            )
            var textOfRightTextView =
                typedArray.getText(R.styleable.PairOfTextViews_ptv_textOfRightTextView)
            var textOfLeftTextView =
                typedArray.getText(R.styleable.PairOfTextViews_ptv_textOfLeftTextView)
            if(textOfRightTextView == null) textOfRightTextView = "NULL"
            if(textOfLeftTextView == null) textOfLeftTextView = "NULL"
            this.pair_title.text = textOfLeftTextView.toString()
            this.pair_content.text = textOfRightTextView.toString()

            typedArray.recycle()
        }
    }


    fun setTextOfLeftTextView(text:String?) {
        if(text == null) this.pair_title.text = ""
        else this.pair_title.text = text
    }

    fun setTextOfRightTextView(text:String?){
        if(text == null) this.pair_content.text = ""
        else this.pair_content.text = text
    }




}