package com.alick.kotlin.api

/**
 * @author 崔兴旺
 * @package com.alick.kotlin.api
 * @title:
 * @description:
 * @date 2019/5/12 23:59
 */
interface A {
    var name: String
    var age: Int

    /**
     * fun1方法
     */
    fun fun1(i: Int)


    /**
     * fun2方法
     */
    fun fun2(str: String)

    /**
     * fun3方法
     */
    fun fun3(boo: Boolean){
        println("fun3:"+ boo)
    }
}