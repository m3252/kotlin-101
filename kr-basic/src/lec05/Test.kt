package lec05

fun validateScoreIsNotNegative(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("스코어 범위는 0부터 100 입니다.")
    }
}

fun getPassOrFail(score: Int): String {
//    if (score >= 50) {
//        return "P"
//    } else {
//        return "F"
//    }
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun getGrade(score: Int): String {
    return if (score >= 90) {
        "A"
    } else if (score >= 80) {
        "B"
    } else if (score >= 70) {
        "C"
    } else if (score >= 60) {
        "D"
    } else {
        "F"
    }
}


fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        in 60..69 -> "D"
        else -> "F"
    }

//    return when (score / 10) {
//        10, 9 -> "A"
//        8 -> "B"
//        7 -> "C"
//        6 -> "D"
//        else -> "F"
//    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("0, 1, -1 중 하나입니다.")
        else -> println("0, 1, -1이 아닙니다.")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("0입니다.")
        number % 2 == 0 -> println("짝수입니다.")
        number % 2 == 1 -> println("홀수입니다.")
    }
}