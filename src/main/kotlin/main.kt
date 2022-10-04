import kotlin.random.Random

fun main() {
    val amount: Int = Random.nextInt(1, 50_000)
    val discount1: Int = 100  // скидка в рублях
    val discount2: Int = 5  // скидка в процентах
    val meloman: Boolean = Random.nextBoolean()
    var totalDiscount: Int = 0
    if (amount > 10_000) {
        totalDiscount = amount * discount2 / 100
    } else if (amount > 1_000) {
        totalDiscount = discount1
    }
    var totalAmount: Int = amount - totalDiscount
    if (meloman) {
        totalDiscount += totalAmount / 100
        totalAmount = amount - totalDiscount
        println(
            """Сумма покупок $amount руб.
    |Скидка составила $totalDiscount руб.
    |в т.ч. 1% как постоянному клиенту
    |Итого к оплате $totalAmount руб.""".trimMargin()
        )
    } else {
        println(
            """Сумма покупок $amount руб.
    |Скидка составила $totalDiscount руб.
    |Итого к оплате $totalAmount руб.""".trimMargin()
        )
    }
}