package com.alick.kotlin.C学习表达式

/**
 * @author 崔兴旺
 * @package com.alick.kotlin.C学习表达式
 * @title:
 * @description:
 * @date 2019/5/19 19:32
 */
fun main() {
    val str = "AAA"
    val result = when (str) {
        "aaa", "AAA" -> {//多个"或"条件可以用逗号","连接
            println("打印aaa")
            "AAA"
        }
        "bbb", "BBB" -> {//多个"或"条件可以用逗号","连接
            println("打印bbb")
            "BBB"
        }
        is String -> {
            println("是String")
            "是String"
        }
        else -> "CCC"
    }
    println("when表达式返回值:$result")
}