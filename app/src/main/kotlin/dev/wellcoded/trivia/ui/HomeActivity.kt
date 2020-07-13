package dev.wellcoded.trivia.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.wellcoded.trivia.core.Activities
import dev.wellcoded.trivia.core.intentTo
import dev.wellcoded.trivia.R
import kotlinx.android.synthetic.main.activity_home.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeActivity : AppCompatActivity() {

    val homeViewModel: HomeViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnSinglePlayer.setOnClickListener { _ -> startActivity(intentTo(Activities.SinglePlayer)) }

    }
}