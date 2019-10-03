package models

import actions.Crawlable
import actions.Voiceable

class Snake(val name: String, var age: Int) : Crawlable, Voiceable {
    override fun crawl() {
        println("$name is crawling")
    }

    override fun voice() {
        println("$name says: hs-s-s!")
    }
}