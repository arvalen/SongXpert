package com.valen.songxpert.ui.screens.achievement

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun AchievementScreen() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Your Achievements")
    }
}

@Preview(showBackground = true)
@Composable
fun AchievementScreenPreview() {
    AchievementScreen()
}