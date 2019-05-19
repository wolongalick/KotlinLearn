package com.alick.kotlin.A学习lambda表达式

/**
 * @author 崔兴旺
 * @package com.alick.kotlin.A学习lambda表达式
 * @title:
 * @description:
 * @date 2019/5/19 2:13
 */
class View {
    //定义一个lambda表达式变量
    //第一种方式:使用lambda表达式作为成员变量
    var mOnClickListener = { view: View -> Unit }
    //第二种方式:使用函数作为成员变量
    /*
    var mOnClickListener = fun(view: View) {

    }
    */

    //为lambda赋值
    fun setOnClickListener(onClick: (View) -> Unit) {
        this.mOnClickListener = onClick
    }

    //在点击事件中触发回调
    fun click() {
        mOnClickListener(this)
    }
}