package sid.angel.daggerdependencyinjection.designpatterna.behavioral.strategy

class Manager : Strategy {


    /*This is abstract implementation as Manger do no know which strategy it will be implementing*/
     var strategy: Strategy

        get() = strategy
        set(value) {
            strategy = value
        }

    override fun operation(num1: Int, num2: Int) {
        this.strategy.operation(num1, num2)
    }
}
