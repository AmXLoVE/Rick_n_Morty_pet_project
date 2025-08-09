package com.rick_n_morty_pet_project.android.feature_character_info_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rick_n_morty_pet_project.android.R
import com.rick_n_morty_pet_project.android.core_network_data.CharacterDTO
import com.rick_n_morty_pet_project.android.core_network_data.characterLocation.LocationDTO
import com.rick_n_morty_pet_project.android.ui.top_bars.TopBarBack

@Composable
fun CharacterInfoScreen(
    character: CharacterDTO
) {
    Scaffold(
        topBar = {
            TopBarBack(
                returnScreen = {},
            )
        }
    ) {
        Box(
            modifier = Modifier
                .padding(it),
        ) {
            DrawInfo(character)
        }
    }
}

@Composable
fun DrawInfo(
    character: CharacterDTO
) {
    Column {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {

            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .weight(1f)
            ) {
                DrawTitle(character.name)

                DrawDescription(character.gender, onSearch = {})

                DrawDescription(character.species, onSearch = {})

                DrawDescription(character.type, onSearch = {})
            }

            Column(
                modifier = Modifier
                    .clip(shape = RoundedCornerShape(20))
                    .background(color = Color.DarkGray)

            ) {

                Image(
                    modifier = Modifier
                        .size(200.dp),
                    painter = painterResource(character.image.toInt()),
                    contentDescription = "",
                    contentScale = ContentScale.Crop
                )

                Row(
                    modifier = Modifier
                        .align(alignment = Alignment.CenterHorizontally)
                ) {

                    Icon(
                        modifier = Modifier
                            .align(alignment = Alignment.CenterVertically)
                            .size(16.dp),
                        painter = painterResource(R.drawable.baseline_circle_24),
                        contentDescription = "",

                    )

                    DrawTitle(
                        character.status,
                        Modifier
                            .padding(4.dp),
                        color = Color.LightGray
                    )
                }
            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {

            Column(
                modifier = Modifier
                    .padding(start = 20.dp)
                    .weight(1f)
            ) {

                DrawTitle("Location")

                DrawDescription(character.location.name, onSearch = {})

                DrawTitle("Episodes")

                character.episode.forEach {
                    DrawDescription(it, onSearch = {})
                }

            }
        }
    }
}

@Composable
fun DrawTitle(title: String, modifier: Modifier = Modifier, color: Color = Color.Black) {

    Text(
        modifier = modifier,
        text = title,
        fontSize = 24.sp,
        color = color,
        maxLines = 2,
    )
}

@Composable
fun DrawDescription(
    description: String,
    modifier: Modifier = Modifier,
    color: Color = Color.White,
    onSearch: () -> Unit,
) {

    Box(
        modifier = Modifier
            .padding(4.dp)
            .size(
                width = 170.dp,
                height = 40.dp,
            )
            .clip(shape = RoundedCornerShape(40))
            .background(color = Color.DarkGray),
    ) {

        Row(
            modifier = Modifier
                .fillMaxSize()
                .clickable(
                    onClick = onSearch,
                )
        ) {
            Icon(
                modifier = Modifier
                    .align(alignment = Alignment.CenterVertically)
                    .padding(start = 12.dp),
                painter = painterResource(R.drawable.baseline_search_24),
                contentDescription = "",
                tint = color,
            )

            Text(
                modifier = modifier
                    .align(alignment = Alignment.CenterVertically),
                text = " $description",
                fontSize = 18.sp,
                color = color,
                maxLines = 2,
            )
        }
    }
}

@Preview
@Composable
fun CharacterInfoScreenPreview() {
    CharacterInfoScreen(
        CharacterDTO(
            name = "Rick Sanchez",
            id = 0,
            status = "Alive",
            species = "species",
            gender = "Male",
            type = "Type",
            origin = LocationDTO("Earth", "www.com"),
            location = LocationDTO("Earth 2", "www.com"),
            image = R.drawable._598.toString(),
            episode = listOf("S0101", "S0102"),
            url = "www.com.char",
            created = "Monday",
        )
    )
}