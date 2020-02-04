package sid.angel.daggerdependencyinjection.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import sid.angel.daggerdependencyinjection.R
import sid.angel.daggerdependencyinjection.di.CarComponent
import sid.angel.daggerdependencyinjection.di.DaggerCarComponent

import sid.angel.daggerdependencyinjection.module.Car
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


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
