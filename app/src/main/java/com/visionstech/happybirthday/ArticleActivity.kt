package com.visionstech.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.visionstech.happybirthday.ui.theme.HappyBirthdayTheme

class ArticleActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ContainerAllOfThem()
                }
            }
        }
    }
}

@Composable
fun ShowImage() {
    Image(
        painter = painterResource(id = R.drawable.bg_compose_background),
        contentDescription = null
    )
}

@Composable
fun ShowTexts() {
    Column {
        Text(
            text = stringResource(id = R.string.title),
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = stringResource(id = R.string.bio),
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(id = R.string.body),
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    end = 16.dp,
                ),
            textAlign = TextAlign.Justify
        )

    }
}

@Composable
fun ContainerAllOfThem(modifier: Modifier = Modifier) {
    Column {
        ShowImage()
        ShowTexts()
    }

}

@Preview(
    showBackground = true,
    showSystemUi = true,
    name = "My Article Screen"

)
@Composable
fun DefaultPreview() {
    HappyBirthdayTheme {
        ContainerAllOfThem()
    }
}