fun convertUsdToEur(usd: Double): Double = usd * 0.91

fun main() {
    val usd = 100.0
    println("/$${usd} = €${convertUsdToEur(usd)}")
}
