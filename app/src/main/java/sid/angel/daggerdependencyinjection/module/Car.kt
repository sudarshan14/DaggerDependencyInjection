package sid.angel.daggerdependencyinjection.module

import android.util.Log

import javax.inject.Inject

//@Inject
class Car @Inject constructor(engine: Engine, wheel: Wheel) {

// lateinit var car:Car
//
//init {
//    DaggerCarComponent.create().getCar()
//}
    companion object {
        private val TAG: String? = "CAR"
    }


    fun drive() {

        Log.d("Sud", " driving")
    }


    @Inject
    fun enableRemote(remote: Remote){
        remote.setListener(this)
    }
}