package com.alick.kotlin.C学习表达式

/**
 * @author 崔兴旺
 * @package com.alick.kotlin.C学习表达式
 * @title:
 * @description:
 * @date 2019/5/19 13:45
 */
fun main() {
    val array: Array<String> = arrayOf("a", "b", "c")
    val util = Util("a")
    println("==========使用中缀表达式调用该函数==========")
    if(util isInArray array){
        println("在数组中")
    }else{
        println("没在数组中")
    }

    println("==========使用常规方式调用该函数==========")
    if(util.isInArray(array)){
        println("在数组中")
    }else{
        println("没在数组中")
    }
}


