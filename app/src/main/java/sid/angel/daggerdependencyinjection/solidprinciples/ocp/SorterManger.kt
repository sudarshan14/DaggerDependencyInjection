package sid.angel.daggerdependencyinjection.solidprinciples.ocp

class SorterManger {


    fun sort(sorter: Sorter) {

        // this is perfect abstraction because we do not know about concrete implementation of sort method
        sorter.sort()
    }
}