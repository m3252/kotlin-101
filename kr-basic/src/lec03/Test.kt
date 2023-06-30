package lec03

fun main() {
    val number1 : Int? = 3
    val number2: Long = number1?.toLong() ?: 0L
    println(number2)

    val number3 = 3L
    val number4 = 5;
    val result = number3 / number4.toDouble()
    println(result)
    printAge(Person(10))

    val name = "moon"
    println("나 $name")
    val str = """
        ABC
        EFDS
        ${name}
    """.trimIndent()
    println(str)
    println(str[1])
}

fun printAge(obj : Any) {
    if (obj is Person) {
        println(obj.age)
    }
}