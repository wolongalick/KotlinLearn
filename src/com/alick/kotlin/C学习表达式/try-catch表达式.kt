package com.alick.kotlin.C学习表达式

/**
 * @author 崔兴旺
 * @package com.alick.kotlin.C学习表达式
 * @title:
 * @description:
 * @date 2019/5/19 21:50
 */
fun main() {
    val a=1
    val b=0
    val result= try {
        a/b
    } catch (e: Exception) {
        e.printStackTrace()
        -999
    } finally {
        println("计算完毕")
    }
    println("结果:$result")
}