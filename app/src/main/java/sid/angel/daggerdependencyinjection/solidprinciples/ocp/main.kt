package sid.angel.daggerdependencyinjection.solidprinciples.ocp

fun main() {

    println("hello from Open Close Principle demo")

    /* by applying strategy design pattern we can add any number of sorting class( open for extension)  without
    changing functionality of existing modules thus close for modification,
*/
    val sorterManger = SorterManger()
    sorterManger.sort(MergeSort())
    sorterManger.sort(InsertionSort())


}