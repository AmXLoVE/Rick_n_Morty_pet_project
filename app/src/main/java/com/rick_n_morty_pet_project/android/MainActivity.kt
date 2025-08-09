package com.rick_n_morty_pet_project.android

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.LaunchedEffect
import com.rick_n_morty_pet_project.android.core_network.retrofit.RetrofitInstance
import com.rick_n_morty_pet_project.android.feature_characters_screen.CharactersScreen
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            CharactersScreen()
            LaunchedEffect(1) {

                withContext(context = Dispatchers.IO) {

                    Log.i("123", RetrofitInstance.api.(
                        name = "Rick",
                        status = null,
                        species = null,
                        type = null,
                        gender = null,
                    ).results[0].episode[0])
                }
            }
        }
    }
}