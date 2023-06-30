package lec04

fun main() {
    val money1 = Money(1000L)
    val money2 = money1
    val money3 = Money(1000L)

    if (money1 > money2) {
        println("money1 > money2")
    }

    println(money1 == money2)
    println(money1 === money2)
    println(money1 == money3)
    println(money1 === money3)

    if (test1() || test2()) {
        println("true")
    }

    if (test2() || test1()) {
        println("true")
    }

    val krMoney1 = KrMoney(1000L)
    val krMoney2 = KrMoney(1000L)
    println(krMoney1 + krMoney2)
}

fun test1(): Boolean {
    println("fund test1")
    return true
}

fun test2(): Boolean {
    println("fund test2")
    return false
}