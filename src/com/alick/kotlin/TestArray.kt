package com.alick.kotlin

/**
 * @author 崔兴旺
 * @package com.alick.kotlin
 * @title:
 * @description: TODO
 * @date 2019/4/7 22:09
 */

const val b ="100"
fun main(args: Array<String>) {
    val arr1: IntArray = intArrayOf(1, 2, 3)
    var arr2: Array<String> = arrayOf("A", "B","C")
    val arr3: Array<Int> = arrayOf(1, 2, 3)

    val a=1

    for( (index) in arr1.withIndex()){
        println("第${index}个是${arr1[index]}")
    }

    for (i in arr3){
        println(i)
    }

}

