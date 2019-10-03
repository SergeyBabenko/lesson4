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
}