package dev.wellcoded.singleplayer.ui

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import dev.wellcoded.singleplayer.R
import dev.wellcoded.singleplayer.di.singlePlayerModule
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules

class SinglePlayerMenuActivity : AppCompatActivity() {

    val viewModel: SinglePlayerViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_singleplayer_menu)

        loadKoinModules(singlePlayerModule)
    }

    override fun onDestroy() {
        super.onDestroy()
        unloadKoinModules(singlePlayerModule)
    }
}