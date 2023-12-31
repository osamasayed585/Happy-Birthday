package com.visionstech.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.visionstech.happybirthday.ui.theme.HappyBirthdayTheme

class DayTasksActivity : ComponentActivity() {
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


    @Composable
    fun Greeting() {
        Column(verticalArrangement = Arrangement.Center) {
            Image(
                painter = painterResource(id = R.drawable.ic_task_completed),
                contentDescription = null,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )

            Text(
                text = stringResource(id = R.string.all_tasks_completed),
                modifier = Modifier
                    .padding(top = 24.dp, bottom = 8.dp)
                    .align(Alignment.CenterHorizontally),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(id = R.string.nice_work),
                fontSize = 16.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally),

                )


        }
    }

    @Preview(
        showBackground = true,
        showSystemUi = true
    )
    @Composable
    fun DefaultPreview2() {
        HappyBirthdayTheme {
            Greeting()
        }
    }
}