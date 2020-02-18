package sid.angel.daggerdependencyinjection.designpatterna.behavioral.strategy

fun main(){


    println("Welcome to behavioral design pattern")

    val manager = Manager(Add())
    manager.strategy = Add()

    manager.operation(2,3)

}