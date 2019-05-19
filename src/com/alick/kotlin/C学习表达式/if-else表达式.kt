package com.alick.kotlin.C学习表达式

/**
 * @author 崔兴旺
 * @package com.alick.kotlin.C学习表达式
 * @title:
 * @description:
 * @date 2019/5/19 19:02
 */
fun main() {
    val str = "a"
    val result = if (str === "a") {
        println("相等")
        true//返回值会赋值给result
    } else {
        println("不相等")
        false//返回值会赋值给result
    }
    println("if-else表达式返回值:$result")
}