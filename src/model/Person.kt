package model

abstract class Person(protected val name: String, private val age: Int) {

    abstract fun thatIsMyName(): String

    fun workingWithNames(): String {
        return "${thatIsMyName()} $age"
    }


    fun testOneMoreHighOrderFunction(name: () -> String) {
        val phrase = "${name()} and I am still 28 yo "
        println(phrase)
    }

    fun testWithOneMoreHof(name: (value: Double) -> String) {
        val age: Double by lazy { this.age.toDouble() }
        println(name(age))
    }

    fun testingHOFAgain(delegate: (name: String, age: Int) -> String) {
        val delegated = delegate(name, age)
        println(delegated)
    }
}