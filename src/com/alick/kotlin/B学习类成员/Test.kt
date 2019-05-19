package com.alick.kotlin.B学习类成员

/**
 * @author 崔兴旺
 * @package com.alick.kotlin.B学习类成员
 * @title:
 * @description:
 * @date 2019/5/19 0:23
 */
fun main() {
    val user = User("崔兴旺",28)
    println(user.username)
    println(user.age)
    println(user.order.orderId)
}