package com.valen.songxpert.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.valen.songxpert.ui.components.RoundedButton
import com.valen.songxpert.ui.screens.home.components.RoundedSearchBar
import com.valen.songxpert.ui.theme.SongXpertTheme

@Composable
fun HomeScreen() {
    val searchQuery = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "ARE YOU A SONG EXPERT?",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = "Guess the track",
            fontSize = 14.sp,
            modifier = Modifier.padding(bottom = 24.dp)
        )

        RoundedSearchBar(
            value = searchQuery.value,
            onValueChange = { searchQuery.value = it },
            placeholder = "Search for a song..."
        )

        RoundedButton(
            text = "Let's Go",
            onClick = { /* Handle button click */ },
            modifier = Modifier.padding(top = 16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    SongXpertTheme {
        HomeScreen()
    }
}