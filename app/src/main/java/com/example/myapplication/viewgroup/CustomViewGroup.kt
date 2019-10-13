package com.example.myapplication.viewgroup

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.ViewGroup
import androidx.core.view.forEach
import com.example.myapplication.R

class CustomViewGroup @JvmOverloads constructor(
    context: Context,
    attributeSet: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ViewGroup(context, attributeSet, defStyleAttr) {

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        forEach { child ->
            if (child.visibility != GONE) {

            }
        }
    }

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {

    }

    override fun generateLayoutParams(attrs: AttributeSet): LayoutParams =
        CustomLayoutParams(context, attrs)

    override fun generateLayoutParams(p: LayoutParams): LayoutParams =
        CustomLayoutParams(p)

    @SuppressLint("CustomViewStyleable")
    class CustomLayoutParams : LayoutParams {

        constructor(
            context: Context,
            attributeSet: AttributeSet
        ) : super(context, attributeSet) {
            val typedArray = context.obtainStyledAttributes(attributeSet, R.styleable.CustomViewGroupLayoutParams)
            try {

            } finally {
                typedArray.recycle()
            }
        }

        constructor(params: LayoutParams) : super(params)
    }
}