package com.alick.kotlin

import com.alick.kotlin.api.A
import com.alick.kotlin.api.impl.AImpl1
import java.util.*
import kotlin.math.max

/**
 * @author 崔兴旺
 * @package com.alick.kotlin
 * @title:
 * @description: TODO
 * @date 2019/5/12 22:16
 */

fun main() {
    var commonUtil = CommonUtil()


    val str = commonUtil.getStr("alick");

    println(str)


    var list: List<String> = LinkedList()

    when (list) {
        is ArrayList -> println("ArrayList")
        is LinkedList -> println("LinkedList")
    }

    if (list is LinkedList) {
        println("更好")
    }


    var aImpl: A = AImpl1("崔兴旺",28)
    aImpl.fun1(100)
    aImpl.fun2("谢谢")
    aImpl.fun3(true)

    println(aImpl.name)
    println(aImpl.age)

    println(max(1,3))

}

class Test3 {
}