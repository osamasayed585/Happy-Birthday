package com.visionstech.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.visionstech.happybirthday.ui.theme.HappyBirthdayTheme

class ComposeQuadrantActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column {
        Text(
            text = "Text composable",
            modifier = Modifier.background(Color(0xFFEADDFF))
        )
        Text(
            text = "Displays text and follows the recommended Material Design guidelines.",
            modifier = Modifier.background(Color(0xFFD0BCFF))
        )


        Row {
            Text(
                text = "Image composable",
                modifier = Modifier.background(Color(0xFFB69DF8))
            )
            Text(
                text = "Creates a composable that lays out and draws a given Painter class object.",
                modifier = Modifier.background(Color(0xFFB69DF8))
            )
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview2() {
    HappyBirthdayTheme {
        Greeting()
    }
}