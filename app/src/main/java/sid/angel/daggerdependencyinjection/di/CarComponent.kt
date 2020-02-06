package sid.angel.daggerdependencyinjection.di

import dagger.Component
import sid.angel.daggerdependencyinjection.MainActivity


/*compile time code generation is done.   this is beneficial then the previous dependency
frameworks which relied on another java functionality called REFLECTION which does all this work at run time*/
@Component(modules = [CarModule::class])
interface CarComponent {

    fun getCar(activity: MainActivity)
}