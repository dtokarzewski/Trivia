package dev.wellcoded.singleplayer.di

import dev.wellcoded.singleplayer.ui.SinglePlayerViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val singlePlayerModule = module {
    viewModel { SinglePlayerViewModel() }
}