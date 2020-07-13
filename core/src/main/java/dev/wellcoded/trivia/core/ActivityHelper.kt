package dev.wellcoded.trivia.core

import android.content.Context
import android.content.Intent


private const val PACKAGE_NAME = "dev.wellcoded.trivia"

fun intentTo(addressableActivity: AddressableActivity): Intent {
    return Intent(Intent.ACTION_VIEW).setClassName(
        PACKAGE_NAME,
        addressableActivity.className)
}

interface AddressableActivity {
    val className: String
}

object Activities {
    object SinglePlayer : AddressableActivity {
        override val className = "$PACKAGE_NAME.singleplayer.ui.SinglePlayerMenuActivity"
    }
}