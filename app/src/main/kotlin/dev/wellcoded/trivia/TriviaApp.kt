package dev.wellcoded.trivia

import android.app.Application
import dev.wellcoded.trivia.core.network.networkCoreModule
import dev.wellcoded.trivia.ui.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

class TriviaApp : Application() {

    private val viewModelModule = module {
        viewModel { HomeViewModel() }
    }

    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(listOf(viewModelModule, networkCoreModule))
        }

    }
}