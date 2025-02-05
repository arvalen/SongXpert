package com.valen.songxpert.ui.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import com.valen.songxpert.R

sealed class Screen(
    val route: String,
    val title: String,
    val icon: Int
) {
    object Home : Screen("home", "Home", R.drawable.music)
    object Achievement : Screen("achievement", "Achievement", R.drawable.achievement)
    object History : Screen("history", "History", R.drawable.history)
}