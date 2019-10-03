package models

import actions.Voiceable
import actions.Walkable

class Cat(val name: String, var age: Int) : Voiceable, Walkable {
    override fun voice() {
        println("$name says: Meow!")
    }

    override fun walk() {
        println("$name is walking")
    }
}