package model

abstract class Person(protected val name: String, private val age: Int) {

    abstract fun thatIsMyName(): String

    fun workingWithNames(): String {
        return "${thatIsMyName()} $age"
    }


    fun testOneMoreHighOrderFunction(name: () -> String) {
        val phrase = "${name()} and I am still 28 yo "
        print(phrase)
    }
}