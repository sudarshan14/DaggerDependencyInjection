package sid.angel.daggerdependencyinjection.module

import javax.inject.Inject

class Wheel @Inject constructor() {

    companion object{
        private val TAG: String? = Wheel::class.java.getSimpleName()
    }

}
