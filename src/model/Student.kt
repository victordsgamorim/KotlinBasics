package model

import delegate.DelegateMethod

class Student(name: String, age: Int) : Person(name, age) {
    override fun thatIsMyName(): String {
        return name
    }

    fun creatingADelegatedMethod(delegate: DelegateMethod) {
        delegate.delegate(name)
    }


}