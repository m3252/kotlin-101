package com.basic.lec02

fun main() {
    startsWithA1("AA")
    startsWithA2(null)
    startsWithA3(null)
    startsWithA4("aa")
    startsWithA4("AA")

    val str: String? = null
    println(str?.length ?: 1000)

    val person = Person(null)
    startsWithA4(person.name?: "홍길동")
    println(person.name?: "홍길동")

}

fun startsWithA1(str: String?): Boolean {
//    if(str == null) {
//        throw IllegalArgumentException("str must not be null")
//    }
    return str?.startsWith("A") ?: throw IllegalArgumentException("str must not be null")
}

fun startsWithA2(str: String?): Boolean? {
//    if(str == null) {
//        return null
//    }
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
//    if(str == null) {
//        return false
//    }
    return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA5(str: String?): Boolean {
    return str!!.startsWith("A")
}