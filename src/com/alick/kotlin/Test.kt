package com.alick.kotlin

/**
 * @author 崔兴旺
 * @package com.alick.kotlin
 * @title:
 * @description: TODO
 * @date 2019/4/3 0:25
 */
open class People(var name: String, var age: Int) {
    init {
        println("${this.javaClass.simpleName},name:$name,age:$age")
    }
}

//子类继承父类
class Women(name: String, age: Int) : People(name, age)

class Men(name: String, age: Int) : People(name, age)

fun getName(): String? {
    return null
}


fun main(args: Array<String>) {
    val str1: String = "我是个字符串"
    val str2: String = String(charArrayOf('a', 'b', 'c'))

    println(str1)
    println(str2)

    Women("崔兴旺", 28)
    Men("张三", 25)

    println("名字长度" + getName()?.length)
    println("名字长度" + getStr1()?.length)

    val parent: Parent = Parent()
    parent.username="alick"
    val child: Child? = parent as? Child

    if (child != null) {
        println(child.username)
    }

    var s: String? =null

    println(s!!.length)
}


val st1 = null
fun getStr1(): String? {
    return st1
}
