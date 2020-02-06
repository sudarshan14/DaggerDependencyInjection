package sid.angel.daggerdependencyinjection.solidprinciples.lsp

class Car : VehicleC(), Vehicle   {

    override fun addFuel() {
    println("fuel added to the car")
    }

    override fun increaseSpeed() {
        println("speed increased of the car")
    }


}