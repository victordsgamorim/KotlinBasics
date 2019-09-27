package model

class Student(name: String, age: Int) : Person(name, age) {
    override fun thatIsMyName(): String {
        return name
    }


}