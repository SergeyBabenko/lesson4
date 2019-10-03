package models

import actions.Swimable

class Fish(name: String, age: Int) : Pet(name, age), Swimable {
    override fun swim() {
        println("$name is swimming")
    }
}