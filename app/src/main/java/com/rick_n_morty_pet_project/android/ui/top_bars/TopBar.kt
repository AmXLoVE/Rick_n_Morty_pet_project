package com.rick_n_morty_pet_project.android.ui.top_bars

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rick_n_morty_pet_project.android.R
import com.rick_n_morty_pet_project.android.feature_characters_screen_data.CharactersScreenState

@Composable
fun TopBar(
    isSearchMode: Boolean,
    state: CharactersScreenState,
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(72.dp)
            .background(color = Color.DarkGray)
    ) {

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(12.dp)
                .clip(shape = RoundedCornerShape(100))
                .background(color = Color.LightGray)
        ) {

            if (isSearchMode) {

                TextField(
                    modifier = Modifier
                        .padding(4.dp)
                        .padding(start = 10.dp)
                        .align(alignment = Alignment.CenterStart),
                    value = "",
                    onValueChange = {},

                    )
            } else {

                Text(
                    text = "Search character",
                    modifier = Modifier
                        .padding(4.dp)
                        .padding(start = 10.dp)
                        .align(alignment = Alignment.CenterStart),
                    fontSize = 18.sp,
                )
            }

            Icon(
                modifier = Modifier
                    .align(alignment = Alignment.CenterEnd)
                    .padding(end = 10.dp),
                painter = painterResource(
                    if (isSearchMode) {
                        R.drawable.baseline_clear_24
                    } else {
                        R.drawable.baseline_search_24
                    }
                ),
                contentDescription = "",
            )
        }
    }
}