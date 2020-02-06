package sid.angel.daggerdependencyinjection.module

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor(){



    fun setListener(car:Car){

        Log.d("Sud", " open car")
    }
}