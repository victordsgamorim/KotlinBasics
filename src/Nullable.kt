import delegate.DelegateMethod
import model.Student
import java.text.NumberFormat

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
    testingHOFInObjects2()
    testingDelegatedInterfaces()
    testingHOFInObjects3()

    testingHOFWithReturnVariables {
        val age = 29
        val oneYear = 365
        val times = age.times(oneYear)
        times.toDouble()

    }
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

fun testingHOFInObjects2() {
    val student = Student("Victor Amorim", 28)
    student.testWithOneMoreHof { "${student.thatIsMyName()} and my age is ${it}yo " }
}

fun testingDelegatedInterfaces() {
    val student = Student("Victor", 28)
    student.creatingADelegatedMethod(object : DelegateMethod {
        override fun delegate(name: String) {
            println(name)
        }
    })
}

fun testingHOFInObjects3() {
    val student = Student("Victor", 28)
    student.testingHOFAgain { e, i -> "$e and $i" }
}

fun testingHOFWithReturnVariables(test: () -> Double) {

    val instance = NumberFormat.getInstance()
    val format = instance.format(test())
    println("$format was the total days that I have been living.")
}

