package models

import actions.Flyable
import actions.Voiceable
import actions.Walkable

class Parrot(val name: String, var age: Int) : Flyable, Voiceable, Walkable {
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