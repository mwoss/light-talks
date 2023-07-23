package types

import java.math.BigDecimal

fun main() {
    run {
        data class Price(val value: BigDecimal) {}

        fun priceInfo(regularPrice: Price) {}
        fun discountPriceInfo(discountPrice: Price) {}
    }

    run {
        data class RegularPrice(val value: BigDecimal) {}
        data class DiscountPrice(val value: BigDecimal) {}

        fun priceInfo(price: RegularPrice) {}
        fun priceInfo(price: DiscountPrice) {}
    }
}
