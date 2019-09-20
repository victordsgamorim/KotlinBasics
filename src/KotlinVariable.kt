fun main() {
    println(creatingFirstVariable())
    println("Integer: " + creatingSecondVariable())
    println(concatVariables())
    println(concatMethods())
    println(concatExternalVariable())
    println(concatInternalVariable())
    println("Double: " + otherVariables())
}

fun creatingFirstVariable(): String {
    val myName: String = "Victor"
    return "String: " + myName
}

fun creatingSecondVariable(): Int {
    val myAge: Int = 28
    return myAge
}

fun concatVariables(): String {
    val name: String = "Victor"
    val age: Int = 28

    // when set with no '$' is shown an alert of redundant type
    return "ConcatVariable: My name is " + name + " and my age is " + age
}

fun concatMethods(): String {
    return "ConcatMethods: My name is ${creatingFirstVariable()} " +
            "and my age is ${creatingSecondVariable()}"
}

//
private val name: String = "Victor"
private val age: Int = 28
fun concatExternalVariable(): String {
    return "External: My name is $name and my age is $age"
}

//
fun concatInternalVariable(): String {
    val name: String = "Victor"
    val age: Int = 28
    return "Internal: My name is $name and my age is $age"
}


fun otherVariables(): String {

    // it is not necessary set the type of the variables when an value is already set.
    val doubleValue = 26.2
    val floatValue = 223123213678f

    //only in specific cases.
    val longValue: Long = 12313131313213
    val shortValue: Short = 1121
    val charValue = 'a'

    val concatString = "Double: $doubleValue, Float: $floatValue, " +
            "Long: $longValue, Short: $shortValue, Char: $charValue"

    return concatString
}




