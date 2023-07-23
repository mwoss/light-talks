package context

import kotlin.random.Random

data class USD(val units: Int)
data class PLN(val units: Int)

class ExchangeProvider {
    val euroToPln = 4.65
    val plnToEuro = 1 / euroToPln
}

context(ExchangeRateContext)
fun monthlyRevenue(): USD {
    val usdRevenue = USD(Random.nextInt(100))
    val plRevenue = PLN(Random.nextInt(500))
    return usdRevenue + plRevenue
}


context(ExchangeRateContext)
operator fun USD.plus(other: PLN): USD {
    return USD((this.units + other.units * exchangeRateProvider.plnToEuro).toInt())
}

interface ExchangeRateContext {
    val exchangeRateProvider: ExchangeProvider
}
