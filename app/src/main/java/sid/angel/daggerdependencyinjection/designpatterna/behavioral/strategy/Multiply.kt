package sid.angel.daggerdependencyinjection.designpatterna.behavioral.strategy

import java.nio.file.OpenOption

class Multiply :Strategy {

    override fun operation(num1: Int, num2: Int) {
        println("$num1*$num2")
    }

}