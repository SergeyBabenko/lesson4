package models

abstract class Pet(val name: String, var age: Int) {

    var isSleep = false
    var isHungry = true

    fun eat() {
        isHungry = false
        println("$name ate")
    }

    fun sleep() {
        isSleep = true
        println("$name is sleeping")
    }

    fun wakeUp() {
        isSleep = false
        println("$name woke up")
    }

    fun goAway() {
        println("$name is go away")
    }

    override fun toString(): String {
        return "Name: $name, Age: $age"
    }
}