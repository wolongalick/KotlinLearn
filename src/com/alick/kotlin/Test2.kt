package com.alick.kotlin

/**
 * 功能:
 * 作者: 崔兴旺
 * 日期: 2019/4/7
 * 备注:
 */
class Test2 {


}

fun main(args: Array<String>) {
    val v1:IntRange=1..10
    val v2:IntRange=1 until 10
    println(v1)
    println(v2)


    println(3 in v1)
    println(v1.contains(3))

    for (v in v1){
        print("$v,")
    }
}