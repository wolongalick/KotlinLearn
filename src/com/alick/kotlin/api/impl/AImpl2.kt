package com.alick.kotlin.api.impl

import com.alick.kotlin.api.A

/**
 * @author 崔兴旺
 * @package com.alick.kotlin.api.impl
 * @title:
 * @description:
 * @date 2019/5/13 0:00
 */
class AImpl2(override var name: String, override var age: Int) : A {
    /**
     * fun1方法
     */
    override fun fun1(i: Int) {
        println("AImpl2-fun1:"+i)
    }

    /**
     * fun2方法
     */
    override fun fun2(str: String) {
        println("AImpl2-fun2:"+str)
    }
}