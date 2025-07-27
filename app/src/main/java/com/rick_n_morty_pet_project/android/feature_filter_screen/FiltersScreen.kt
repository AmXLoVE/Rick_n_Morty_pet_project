package com.rick_n_morty_pet_project.android.feature_filter_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rick_n_morty_pet_project.android.R
import com.rick_n_morty_pet_project.android.feature_characters_screen_data.CharactersScreenState
import com.rick_n_morty_pet_project.android.ui.top_bars.TopBar

@Composable
fun FiltersScreen(

) {

    val isCharNameChange = true
    val isCharStatusChange = false
    val isCharSpeciesChange = false
    val isCharTypeChange = false
    val isCharGenderChange = false
    val isLocNameChange = false
    val isLocTypeChange = false
    val isLocDimensionChange = false
    val isEpNameChange = false
    val isEpCodeChange = false

    Scaffold(
        topBar = {
            TopBar(
                isSearchMode = false,
                CharactersScreenState(),
            )
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .background(color = Color.White)
        ) {

            FilterName("Character")

            FilterItem(isCharNameChange, "Name", "Toxic Rick")

            FilterItem(isCharStatusChange, "Status", "Dead")

            FilterItem(isCharSpeciesChange, "Species", "Humanoid")

            FilterItem(isCharTypeChange, "Type", "Rick's Toxic Side")

            FilterItem(isCharGenderChange, "Gender", "Male")

            FilterName("Location")

            FilterItem(isLocNameChange, "Name", "Citadel of Ricks")

            FilterItem(isLocTypeChange, "Type", "Space station")

            FilterItem(isLocDimensionChange, "Dimension", "Dimension C-137")

            FilterName("Episode")

            FilterItem(isEpNameChange, "Name", "The Ricklantis Mixup")

            FilterItem(isEpCodeChange, "Episode code", "S0101")

            Button(
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(8.dp),
                onClick = {},
                content = { Text("Применить", fontSize = 16.sp) },
            )
        }
    }
}

@Preview
@Composable
fun FiltersScreenPreview() {
    FiltersScreen()
}

@Composable
fun FilterName(
    title: String,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
    ) {
        Text(
            modifier = Modifier
                .padding(6.dp)
                .align(alignment = Alignment.CenterVertically),
            text = title,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}

@Composable
fun FilterItem(
    isChange: Boolean,
    filterName: String,
    placeholder: String,
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(85.dp)
    ) {

        Column {

            Text(
                modifier = Modifier
                    .padding(4.dp)
                    .padding(start = 10.dp)
                    .align(alignment = Alignment.Start),
                text = filterName,
                fontSize = 16.sp,
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
                    .border(
                        4.dp,
                        color = Color.LightGray,
                        shape = RoundedCornerShape(20)
                    )
            ) {

                if (isChange) {

                    TextField(
                        modifier = Modifier
                            .padding(4.dp)
                            .align(alignment = Alignment.CenterStart)
                            .fillMaxSize(),
                        value = "",
                        onValueChange = {},
                        colors = TextFieldDefaults.colors().copy(
                            focusedTextColor = Color.White,
                            unfocusedTextColor = Color.White,
                            disabledTextColor = Color.White,
                            errorTextColor = Color.White,
                            focusedContainerColor = Color.White,
                            unfocusedContainerColor = Color.White,
                        )
                    )
                } else {

                    Text(
                        text = placeholder,
                        modifier = Modifier
                            .padding(4.dp)
                            .padding(start = 10.dp)
                            .align(alignment = Alignment.CenterStart),
                        fontSize = 18.sp,
                        color = Color.DarkGray.copy(alpha = 0.5f),
                    )
                }

                if (isChange) {

                    Icon(
                        modifier = Modifier
                            .align(alignment = Alignment.CenterEnd)
                            .padding(end = 10.dp),
                        painter = painterResource(R.drawable.baseline_clear_24),
                        contentDescription = "",
                    )
                }
            }
        }
    }
}