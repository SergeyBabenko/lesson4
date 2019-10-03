package models

import actions.Swimable

class Fish(val name: String, var age: Int) : Swimable {
    override fun swim() {
        println("$name is swimming")
    }
}