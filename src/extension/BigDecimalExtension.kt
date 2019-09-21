package extension

import java.math.BigDecimal
import java.text.NumberFormat
import java.util.*

fun BigDecimal.formatToAmericaCurrency(): String {
    var format = NumberFormat.getCurrencyInstance(Locale.ENGLISH)
    return format.format(this)
}