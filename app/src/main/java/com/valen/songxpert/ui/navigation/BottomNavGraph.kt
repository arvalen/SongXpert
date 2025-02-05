package com.valen.songxpert.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.valen.songxpert.ui.screens.achievement.AchievementScreen
import com.valen.songxpert.ui.screens.history.HistoryScreen
import com.valen.songxpert.ui.screens.home.HomeScreen

@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen()
        }

        composable("achievement") {
            AchievementScreen()
        }

        composable("history") {
            HistoryScreen()
        }
    }
}