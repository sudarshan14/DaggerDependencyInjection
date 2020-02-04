package sid.angel.daggerdependencyinjection.di

import dagger.Module
import dagger.Provides
import sid.angel.daggerdependencyinjection.module.Car
import sid.angel.daggerdependencyinjection.module.Engine
import sid.angel.daggerdependencyinjection.module.Wheel

@Module
class CarModule {

    @Provides
    fun getCar(): Car {
        return Car(engine = Engine(), wheel = Wheel())
    }
}