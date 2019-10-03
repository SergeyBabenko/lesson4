package models

import actions.Flyable
import actions.Voiceable
import actions.Walkable

class Parrot(name: String, age: Int) : Pet(name, age), Flyable, Voiceable, Walkable {
    override fun fly() {
        println("$name is flying")
    }

    override fun voice() {
        println("$name says: i'm a parrot!")
    }

    override fun walk() {
        println("$name is walking")
    }
}