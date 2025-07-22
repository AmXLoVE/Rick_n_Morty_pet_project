package com.rick_n_morty_pet_project.android.ui.Bars

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import com.rick_n_morty_pet_project.android.R

@Composable
fun TopBar(
    isSearchMode: Boolean,

    ) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(56.dp)
            .background(color = Color.DarkGray)
    ) {
        if (isSearchMode) {

            TextField(
                modifier = Modifier
                    .weight(1f),
                value = "",
                onValueChange = {},
            )
        } else {

            Text(
                text = "Search character",
                modifier = Modifier
                    .weight(1f),
            )
        }

        Icon(
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