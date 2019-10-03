package models

import actions.Voiceable
import actions.Walkable

class Dog(name: String, age: Int) : Pet(name, age), Voiceable, Walkable {
    override fun voice() {
        println("$name says: Waf-waf!")
    }

    override fun walk() {
        println("$name is walking")
    }

    override fun toString(): String {
        return "Animal: Dog, ${super.toString()} "
    }
}