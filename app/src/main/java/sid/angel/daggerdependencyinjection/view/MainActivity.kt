package sid.angel.daggerdependencyinjection.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import sid.angel.daggerdependencyinjection.R
import sid.angel.daggerdependencyinjection.module.Car
import sid.angel.daggerdependencyinjection.module.Engine
import sid.angel.daggerdependencyinjection.module.Wheel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        /*
        This is dependency injection without Dagger.
        This may get complicated if let say Engine and Wheel class has its own dependencies and further more.
         */

        val engine:Engine = Engine()
        val wheel:Wheel = Wheel()

        val car:Car = Car(engine,wheel)
    }
}
