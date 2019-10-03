package models

import actions.Voiceable
import actions.Walkable

class Dog(val name: String, var age: Int) : Voiceable, Walkable {
    override fun voice() {
        println("$name says: Waf-waf!")
    }

    override fun walk() {
        println("$name is walking")
    }
}