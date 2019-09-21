import constants.ITEM_NAME
import extension.formatToAmericaCurrency
import model.Item
import java.math.BigDecimal

fun main() {

    val item = Item("Mouse", BigDecimal(12.21))

    println(ITEM_NAME)
    println(item.price.formatToAmericaCurrency())
}