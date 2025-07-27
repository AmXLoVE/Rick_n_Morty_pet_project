package com.rick_n_morty_pet_project.android.feature_characters_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rick_n_morty_pet_project.android.R
import com.rick_n_morty_pet_project.android.feature_characters_screen_data.CharacterState

@Composable
fun CharactersGridView(
    characters: List<CharacterState>
) {
    LazyVerticalGrid(
        modifier = Modifier
            .padding(16.dp),
        columns = GridCells.Adaptive(150.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        items(characters.size) { item ->

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .height(230.dp)
                    .clip(shape = RoundedCornerShape(10))
            ) {

                Image(
                    painter = painterResource(R.drawable._598),
                    contentDescription = "",
                    contentScale = ContentScale.Crop
                )

                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.BottomCenter)
                        .fillMaxWidth()
                        .height(70.dp)
                        .background(color = Color.DarkGray)
                ) {

                    Column(
                        modifier = Modifier
                            .align(alignment = Alignment.TopCenter)
                    ) {

                        Text(
                            modifier = Modifier
                                .align(alignment = Alignment.CenterHorizontally)
                                .padding(2.dp),
                            text = characters[item].name,
                            fontSize = 18.sp,
                            fontStyle = FontStyle.Normal,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                        )

                        Text(
                            modifier = Modifier
                                .align(alignment = Alignment.CenterHorizontally)
                                .padding(2.dp),
                            text = characters[item].gender + " | " + characters[item].type,
                            fontSize = 14.sp,
                            color = Color.White,
                        )
                        Box(
                            modifier = Modifier
                                .fillMaxSize(),
                        ) {

                            Row(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .align(alignment = Alignment.Center),
                            ) {
                                Icon(
                                    modifier = Modifier
                                        .size(8.dp)
                                        .align(alignment = Alignment.CenterVertically),
                                    painter = painterResource(R.drawable.baseline_circle_24),
                                    contentDescription = "",
                                    tint = Color.Green,
                                )

                                Text(
                                    modifier = Modifier
                                        .padding(2.dp)
                                        .align(alignment = Alignment.CenterVertically),
                                    text = " Alive",
                                    fontSize = 14.sp,
                                    color = Color.White,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}