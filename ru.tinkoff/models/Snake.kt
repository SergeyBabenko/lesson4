package models

import actions.Crawlable
import actions.Voiceable

class Snake(name: String, age: Int) : Pet(name, age), Crawlable, Voiceable {
    override fun crawl() {
        println("$name is crawling")
    }

    override fun voice() {
        println("$name says: hs-s-s!")
    }
}