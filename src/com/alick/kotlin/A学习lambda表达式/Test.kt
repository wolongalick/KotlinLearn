package com.alick.kotlin.A学习lambda表达式

/**
 * @author 崔兴旺
 * @package com.alick.kotlin.A学习lambda表达式
 * @title:
 * @description:
 * @date 2019/5/18 1:52
 */
fun main() {
    val array: Array<String> = arrayOf("a", "", "c")

    println("==========lambda终极遍历方式==========")
    array.forEach(::println)

    println("==========普通遍历方式==========")
    for (a in array) {
        testPrint(a)
    }

    println("==========完整版的lambda写法==========")
    array.forEach({ element -> testPrint(element) })

    println("==========如果一个函数的最后一个参数是lambda表达式,则可以将该表达式写在括号后面==========")
    array.forEach() { element -> testPrint(element) }

    println("==========如果一个函数只有一个参数,且参数是lambda表达式,则小括号都可以省略==========")
    array.forEach { element -> testPrint(element) }

    println("==========如果lambda表达式参数只有一个,则参数名默认用it==========")
    array.forEach { testPrint(it) }

    println("==========如果函数与lambda表达式的`参数、返回值一致,则可以用双冒号写法()==========")
    array.forEach(::testPrint)
}

/**
 * 自定义的打印方法
 */
fun testPrint(str: String) {
    println(str)
}

fun <T> testLambda(array: Array<T>, aaaaa: (T) -> Boolean): Boolean {
    var result = true
    for (arr in array) {
        val re = aaaaa(arr)
        if (re == false) {
            result = re
        }
    }
    return result
}

fun <T> T.testLambda2(isBoolean: Boolean, b: T, lambdaFun: (aa: T, aaa: T) -> Boolean): Boolean {
    println(isBoolean)
    val result = lambdaFun(this, b)

    return result
}

/*fun <T> Boolean.testLambda2(a: T, b: T, lambdaFun: (aa: T, aaa: T) -> Boolean): Boolean {
    println(this)
    val result = lambdaFun(a, b)

    return result
}*/

/*
fun <T> T.testLambda2(isBoolean: Boolean, b: T, lambdaFun: (aa: T, aaa: T) -> Boolean): Boolean {
    println(isBoolean)
    val result = lambdaFun(this, b)

    return result
}*/

fun <T> testLambda2(isBoolean: Boolean, a: T, b: T, lambdaFun: (aa: T, aaa: T) -> Boolean): Boolean {
    println(isBoolean)
    val result = lambdaFun(a, b)
    return result
}



/**
 * 自定义的打印方法
 */
fun method_arg2(str1: String, str2: String): Boolean {
    var result = str1 + str2
    println(result)
    return false;
}

var aaaa = { str1: String, str2: String ->
    var result = str1 + str2
    println(result)
}