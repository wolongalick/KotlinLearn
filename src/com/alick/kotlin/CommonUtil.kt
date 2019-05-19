package com.alick.kotlin

import com.alick.kotlin.api.A

/**
 * @author 崔兴旺
 * @package com.alick.kotlin
 * @title:
 * @description: TODO
 * @date 2019/5/12 22:16
 */
open class CommonUtil {

    var getStr=fun (str: String) = str + "哈哈哈"


    fun test(i:Int,a: A){
        a.fun1(i)
    }
}