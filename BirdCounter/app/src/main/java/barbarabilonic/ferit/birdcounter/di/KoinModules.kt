package barbarabilonic.ferit.birdcounter.di

import barbarabilonic.ferit.birdcounter.model.BirdCounter
import barbarabilonic.ferit.birdcounter.ui.viewmodels.BirdCounterViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module{
    factory<BirdCounter> { BirdCounter() }
}

val viewModelModule = module{
    viewModel<BirdCounterViewModel> { BirdCounterViewModel(get()) }
}