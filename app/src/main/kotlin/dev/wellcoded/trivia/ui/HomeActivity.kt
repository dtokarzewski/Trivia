package dev.wellcoded.trivia.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.wellcoded.trivia.R
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeActivity : AppCompatActivity() {

    val homeViewModel: HomeViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

    }
}