package models

class Owner() {
    private var currentPet: Pet? = null

    fun adoptPet(pet: Pet) {
        currentPet = pet
        println("You are adopt ${currentPet.toString()}")
    }

    fun feedPet() {
        println("You are feed ${currentPet?.name}")
        currentPet?.eat()
    }

    fun cleanUp() {
        println("You are clean up")
    }

    fun lostPet() {
        currentPet?.goAway()
        currentPet = null
    }

    fun hasPet(): Boolean {
        return (currentPet != null)
    }
}