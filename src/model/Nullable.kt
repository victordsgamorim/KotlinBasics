package model

private var variable: Double? = null
private val variable2 by lazy { variable }


fun main() {

    variable = 2.2
    variable?.let { println(it) }
    testLazy()

    testHighOrderFunction {
        val doubleResult = 202.1
        doubleResult
    }

    testingObjects()
    testingHOFInObjects()
}

fun testLazy() {
    println(variable2)
}

fun testHighOrderFunction(parameterThatIWillUseWhenIhaveAResul: () -> Double) {
    println("High order function is working")
    println(parameterThatIWillUseWhenIhaveAResul())
}

fun testingObjects() {
    val student = Student("Victor", 28)
    val name = student.workingWithNames()
    val myName = student.thatIsMyName()
    println(myName)
    println(name)
}

fun testingHOFInObjects() {
    val student = Student("Victor Amorim", 28)
    student.testOneMoreHighOrderFunction { student.thatIsMyName() }

}