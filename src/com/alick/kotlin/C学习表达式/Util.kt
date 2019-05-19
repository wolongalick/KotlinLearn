package com.alick.kotlin.C学习表达式

/**
 * @author 崔兴旺
 * @package com.alick.kotlin.C学习表达式
 * @title:
 * @description:
 * @date 2019/5/19 13:49
 */
open class Util(var name: String) {
    /**
     * 是否在指定数组中
     */
    open infix fun isInArray(array: Array<String>): Boolean {
        array.forEach {
            if (name === it) {
                return true
            }
        }
        return false
    }
}