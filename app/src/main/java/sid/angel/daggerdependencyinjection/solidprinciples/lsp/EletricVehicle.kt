package sid.angel.daggerdependencyinjection.solidprinciples.lsp

import java.lang.RuntimeException

class EletricVehicle : Vehicle {
    override fun addFuel() {
      //  throw RuntimeException("Can not add fuel to electric vehicle")
    }

    override fun increaseSpeed() {
        println("speed added of the electric car")
    }
}