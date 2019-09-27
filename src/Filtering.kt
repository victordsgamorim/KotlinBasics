import constants.ITEM_NAME
import extension.formatToAmericaCurrency
import model.Item
import java.math.BigDecimal

fun main() {

    //named parameter
    val item = Item(name = "Mouse", price = BigDecimal(12.21))

    //functin extension
    println(ITEM_NAME)
    println(item.price.formatToAmericaCurrency())

    println(creatingNewFunction(integer = 2, double = 1.2))

    creatingList()
    creatingAnotherList()
    creatingThirdList()
    creatingForthList()
    creatingFifthList()
}

//named $PARAMENTER
fun creatingNewFunction(string: String = "hello world", double: Double, integer: Int): String {
    return "$string + $double + $integer"
}

fun creatingList() {
    val item1 = Item(name = "Mouse", price = BigDecimal(111))
    val item2 = Item(name = "Computer", price = BigDecimal(200))
    val item3 = Item(name = "Mouse", price = BigDecimal(333))
    val listOfItems = listOf<Item>(item1, item2, item3)


    val sumByDouble = listOfItems
        .filter { it.name == "Mouse" }
        .sumByDouble { it.price.toDouble() }

    println(sumByDouble)
}

fun creatingAnotherList() {
    val listOfNumber = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val map: List<Int> = listOfNumber.map { it * it }

    for (item in map) {
        println(item)
    }

    println("///////////")

}

fun creatingThirdList() {
    val listOfNumber = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    val map: List<Int> = listOfNumber.filter { it < 5 }.map { it }

    for (item in map) {
        println(item)
    }
    println("///////////")

}

fun creatingForthList() {
    val listOfNumber = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val list = listOfNumber.filter { it < 5 }.map { it * it }.sumByLong { it.toLong() }
    println(list)

}

fun creatingFifthList() {
    val listOfNumber = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val list = listOfNumber.filter { it < 5 }.sumBy { it }
    println(list)

}


fun <T> Iterable<T>.sumByLong(selector: (T) -> Long): Long {
    var sum = 0L
    for (element in this) {
        sum += selector(element)
    }
    return sum
}

