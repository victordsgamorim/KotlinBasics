private const val a = 5
private const val b = 1
private const val c = 10
private const val d = a

fun main() {

    println(creatingStatement01())
    println(creatingStatement02())
    println(creatingStatement03())
    println(creatingStatement04())
    println(creatingStatement05())
    println(creatingStatement06())
    println(creatingStatement07())
    println(creatingStatement08())
    println(creatingStatement09())
    println(creatingStatement10("Hello World", 5))
    println(creatingStatement11(2))
}

fun creatingStatement01(): String {
    val addResult = a.plus(b)

    if (addResult == 4) {
        return "Right Answer"
    }
    return "Wrong Answer"
}

fun creatingStatement02(): String {
    if (a > b) {
        return "$a is bigger than $b"
    }
    return "$a is smaller than $b"
}

fun creatingStatement03(): String {
    val max = if (a > b) true else false

    if (max) {
        return "Message is true"
    }
    return "Message is false"
}

fun creatingStatement04(): String {
    return if (a > b) "Message is true" else "Message is false"
}

fun creatingStatement05(): String {

    return if (a == 5 && b == 1) "Message is true" else "Message is false"

}

fun creatingStatement06(): String {


    if (a > b && a < c) {
        return "$a is bigger than $b and smaller than $c"
    } else if (a != d) {
        return "$a is diff of $d "
    }

    return "None are true"
}

fun creatingStatement07(): String {
    when (c) {
        1 -> return "Result is 1"
        2 -> return "Result is 2"
        10 -> return "Result is 10"
    }
    return "None are true"
}

fun creatingStatement08(): String {
    when (c) {
        1, 10 -> return "Result is 1 or 10"
        10 -> return "Result is 10"
    }
    return "None are true"
}

fun creatingStatement09(): String {

    when (c) {
        in 1..5 -> return "$c is in a range between 1 to 5"
        !in 1..10 -> return "$c is not is a range between 1 to 5"
        10 -> return "c is 10"
    }
    return "The statement above is not right "
}

fun creatingStatement10(x: String, y: Int): Int {

    if (x is String && y is Int) {
        return x.length.plus(y)
    }
    return 0
}

fun creatingStatement11(x: Any): String {
    return if (x !is String) return "Not a String" else "String"
}



