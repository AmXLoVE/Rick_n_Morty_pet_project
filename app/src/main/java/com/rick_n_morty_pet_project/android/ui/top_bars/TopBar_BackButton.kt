package com.rick_n_morty_pet_project.android.ui.top_bars

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.rick_n_morty_pet_project.android.R

@Composable
fun TopBarBack(
    returnScreen: () -> Unit,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(72.dp)
            .background(color = Color.DarkGray)
    ) {

        Box(
            modifier = Modifier
                .fillMaxHeight()
                .size(size = 65.dp)
                .padding(8.dp)
                .clip(shape = RoundedCornerShape(100))
        ) {
            Icon(
                modifier = Modifier
                    .padding(8.dp)
                    .align(alignment = Alignment.Center)
                    .fillMaxSize(),
                painter = painterResource(R.drawable.round_arrow_back_24),
                contentDescription = "",
                tint = Color.White,
            )
        }
    }
}