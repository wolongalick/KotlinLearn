package com.alick.kotlin.A学习lambda表达式

/**
 * @author 崔兴旺
 * @package com.alick.kotlin.A学习lambda表达式
 * @title:
 * @description:
 * @date 2019/5/19 2:15
 */
fun main() {
    val view = View()
    //最完整的lambda写法
    view.setOnClickListener({ view: View -> println("被点击了,view:$view") })
    //去掉了小括号和View类型
    view.setOnClickListener { view -> println("被点击了,view:$view") }
    //当参数只有一个view时,用it代替view
    view.setOnClickListener { println("被点击了,view:$it") }

    //点击view,触发监听
    view.click()
}