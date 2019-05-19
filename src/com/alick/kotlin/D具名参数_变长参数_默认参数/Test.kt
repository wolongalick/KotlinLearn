package com.alick.kotlin.D具名参数_变长参数_默认参数

/**
 * @author 崔兴旺
 * @package com.alick.kotlin.D具名参数_变长参数_默认参数
 * @title:
 * @description:
 * @date 2019/5/19 23:19
 */
fun main() {
    buildUser("崔兴旺",28, orders = *arrayOf("111","222"), company = "微医")
}

fun buildUser(name: String, age: Int, gender: Boolean = true, vararg orders: String,company:String) {
    println("name:$name,age:$age,gender:$gender,orders:${orders.toList()},company:$company")
}
