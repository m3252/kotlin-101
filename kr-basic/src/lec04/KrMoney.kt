package lec04

data class KrMoney(
    val amount: Long
) {
    operator fun plus(other: KrMoney): KrMoney {
        return KrMoney(amount + other.amount)
    }
}
