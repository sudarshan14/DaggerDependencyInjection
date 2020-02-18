package sid.angel.daggerdependencyinjection.designpatterna.behavioral.strategy

class Add : Strategy {

    override fun operation(num1: Int, num2: Int) {
        println("{$num1+$num2}")
    }
}