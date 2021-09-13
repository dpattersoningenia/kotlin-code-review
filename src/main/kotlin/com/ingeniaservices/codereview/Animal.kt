package com.ingeniaservices.codereview

open class Animal {

    fun s(): String {
        if (this is Dog) {
            return "*bark*"
        } else if (this is Cat) {
            return "*meow*"
        }
        return ""
    }
}
