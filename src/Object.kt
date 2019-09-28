import model.Test

val test = Test("Victor")
val test2 = Test("Victor")


fun main() {
    hashCodeAndEquals()
}

private fun hashCodeAndEquals() {
    val list = listOf<Test>(test)

    for (item in list) {
        if (list.contains(test) && list.contains((test2))) {
            println("Yes")
        } else {
            println("No")
        }
    }
}