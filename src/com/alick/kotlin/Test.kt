package com.alick.kotlin

/**
 * @author 崔兴旺
 * @package com.alick.kotlin
 * @title:
 * @description: TODO
 * @date 2019/4/3 0:25
 */
open class Parent(var name: String,var age: Int){
    init {
        println("${this.javaClass.simpleName},name:$name,age:$age")
    }
}

class Women(name: String,age: Int):Parent(name,age)
class Men(name: String,age: Int):Parent(name,age)



fun main(args: Array<String>) {
    val str1: String = "我是个字符串"
    val str2: String = String(charArrayOf('a','b','c'))

    println(str1)
    println(str2)

    Women("崔兴旺",28)
    Men("张三",25)



}