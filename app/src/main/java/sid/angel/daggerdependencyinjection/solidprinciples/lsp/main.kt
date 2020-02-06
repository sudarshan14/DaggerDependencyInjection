package sid.angel.daggerdependencyinjection.solidprinciples.lsp

fun main() {

    println("Welcome to liskov Substitution Principle ")


    val vehicle1: Vehicle = Car()
    vehicle1.increaseSpeed()
    vehicle1.addFuel()

    val vehicle2: Vehicle = EletricVehicle()
    //vehicle2.increaseSpeed()
    if (vehicle2 is EletricVehicle)
        vehicle2.addFuel()
    // we should not be checking types of a parent class
    // here use of addFuel method is not applicable in case of electric car so it violates the liskov substitution method.
// we can handle this using contract pattern i.e different interface of superclass for different type.
    // we will be adding two interfaces here one for electric car one for normal car
//    VehicleC().addFuelC()


    /*
    *
    * */
}

