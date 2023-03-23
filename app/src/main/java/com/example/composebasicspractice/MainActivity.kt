package com.example.composebasicspractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebasicspractice.ui.theme.ComposeBasicsPracticeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBasicsPracticeTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
//                    Greeting("Android")
                    MainScreen()
                }
            }
        }
    }
}

@Composable
fun MainScreen(modifier: Modifier = Modifier){
val picture = painterResource(R.drawable.compose_background)
    Column {
        Image(painter = picture , contentDescription = null)
        Text(text = stringResource(R.string.jetpack_compose_tutorial), fontSize = 24.sp, modifier = Modifier.padding(10.dp))
        Text(text = stringResource(R.string.jetpack_compose_explanation), modifier = Modifier.padding(start = 16.dp, end = 16.dp), textAlign = TextAlign.Justify)
        Text(text = stringResource(R.string.tutorial_explanation), modifier = Modifier.padding(16.dp), textAlign = TextAlign.Justify)

    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true, name = "nice")
@Composable
fun DefaultPreview() {
    ComposeBasicsPracticeTheme {
//        Greeting("Android")
        MainScreen()
    }
}