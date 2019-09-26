package model

import java.math.BigDecimal

class Item(
    val name: String,
    val price: BigDecimal,
    val type: ItemType = ItemType.ELETRONIC
) {

}