package sid.angel.daggerdependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import sid.angel.daggerdependencyinjection.di.DaggerCarComponent
import sid.angel.daggerdependencyinjection.module.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    /*
    if we have constructor injector then Field and later method injection automatically happens
     */

    @Inject
    lateinit var car: Car
    
    init {

        DaggerCarComponent.create().getCar(this)
        //inject method is form ApiComponent interface
//        DaggerApiComponent.create().inject(this)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*
        This is dependency injection without Dagger.
        This may get complicated if let say Engine and Wheel class has its own dependencies and further more.
         */
//      val component:CarComponent =  DaggerCarComponent.create()

        car.drive()
    }
}
