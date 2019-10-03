package models

import actions.Voiceable
import actions.Walkable

class Cat(name: String, age: Int) : Pet(name, age), Voiceable, Walkable {
    override fun voice() {
        println("$name says: Meow!")
    }

    override fun walk() {
        println("$name is walking")
    }
}