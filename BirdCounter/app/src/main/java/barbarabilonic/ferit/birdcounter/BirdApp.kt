package barbarabilonic.ferit.birdcounter

import android.app.Application
import android.content.Context
import barbarabilonic.ferit.birdcounter.di.appModule
import barbarabilonic.ferit.birdcounter.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class BirdApp:Application() {
    companion object {
        lateinit var ApplicationContext: Context
            private set
    }
    override fun onCreate() {
        super.onCreate()
        ApplicationContext = this

        startKoin{
            androidContext(this@BirdApp)
            modules(appModule, viewModelModule)
        }
    }
}