package com.alick.kotlin.B学习类成员

/**
 * @author 崔兴旺
 * @package com.alick.kotlin.B学习类成员
 * @title:
 * @description:
 * @date 2019/5/19 0:11
 */
open class User(username: String, age: Int) {
    //lateinit代表延迟初始化
    lateinit var userId: String

    //lateinit不能修饰基本数据类型,只能修饰对象
    //lateinit var gender:Boolean

    //由于order是val(相当于final)类型,因此需要用lazy(延迟初始化方式)
    val order: Order by lazy {
        //延迟初始化Order对象
        Order("123456")
    }

    var username: String = username
        //将set方法更改为受保护的
        protected set
        //重写get方法
        get() {
            println("获取:$field")
            return field
        }

    var age: Int = age
        //私有的set方法
        private set
        //重写get方法
        get() {
            println("获取:$field")
            return field
        }
}
