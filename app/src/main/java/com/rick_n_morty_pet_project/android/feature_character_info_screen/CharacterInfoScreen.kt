package com.rick_n_morty_pet_project.android.feature_character_info_screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
import com.rick_n_morty_pet_project.android.feature_characters_screen_data.CharactersScreenState
import com.rick_n_morty_pet_project.android.ui.top_bars.TopBar

@Composable
fun CharacterInfoScreen(
    character: CharacterDTO
) {
    Scaffold(
        topBar = {
            TopBar(
                isSearchMode = false,
                CharactersScreenState()
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

                DrawDescription(character.gender)

                DrawDescription(character.species)

                DrawDescription(character.type)
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

                DrawDescription(character.location.name)

                DrawTitle("Episodes")

                character.episode.forEach {
                    DrawDescription(it)
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
    color: Color = Color.Black
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
        ) {
            Icon(
                modifier = Modifier
                    .align(alignment = Alignment.CenterVertically)
                    .padding(start = 12.dp),
                painter = painterResource(R.drawable.baseline_search_24),
                contentDescription = "",
                tint = Color.White,
            )

            Text(
                modifier = modifier
                    .align(alignment = Alignment.CenterVertically),
                text = " $description",
                fontSize = 18.sp,
                color = Color.White,
                maxLines = 2,
            )
        }
    }
}

@Composable
fun DrawExploreIcon() {
    Icon(
        modifier = Modifier,
        painter = painterResource(R.drawable.baseline_search_24),
        contentDescription = "",
    )
}

@Preview
@Composable
fun CharacterInfoScreenPreview() {
    CharacterInfoScreen(
        CharacterDTO(
            name = "Rick",
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