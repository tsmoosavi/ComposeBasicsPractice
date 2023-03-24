package com.example.composebasicspractice

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
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
//                    FirstPracticeScreen()
//                    SecondPracticeScreen()
                    ThirdPracticeScreen()
                }
            }
        }
    }
}

@Composable
fun FirstPracticeScreen(modifier: Modifier = Modifier){
val picture = painterResource(R.drawable.compose_background)
    Column {
        Image(painter = picture , contentDescription = null)
        Text(text = stringResource(R.string.jetpack_compose_tutorial), fontSize = 24.sp, modifier = Modifier.padding(10.dp))
        Text(text = stringResource(R.string.jetpack_compose_explanation), modifier = Modifier.padding(start = 16.dp, end = 16.dp), textAlign = TextAlign.Justify)
        Text(text = stringResource(R.string.tutorial_explanation), modifier = Modifier.padding(16.dp), textAlign = TextAlign.Justify)

    }
}

@Composable
fun SecondPracticeScreen(modifier: Modifier = Modifier){
    val picture = painterResource(R.drawable.task_completed)
    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .background(color = Color.Red), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = picture , contentDescription = null)
        Text(text = stringResource(R.string.task_completed), fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 24.dp, bottom = 8.dp))
        Text(text = stringResource(R.string.nice_work), fontSize = 16.sp)

    }
}

@Composable
fun TextColumn(modifier: Modifier = Modifier,backgroundColor:Color,title: String, explanation:String){
    Column(modifier = modifier
        .fillMaxSize()
        .background(color = backgroundColor)
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp))
        Text(text = explanation,
            textAlign = TextAlign.Justify)

    }
}


@Composable
fun ThirdPracticeScreen() {
   Column(Modifier.fillMaxWidth()) {
       Row (Modifier.weight(1f)){
           TextColumn(modifier = Modifier.weight(1f),backgroundColor = Color.Green, title = stringResource(R.string.firstTitle), explanation = stringResource(R.string.firstExplanation))
           TextColumn(modifier = Modifier.weight(1f),backgroundColor = Color.Yellow, title = stringResource(R.string.secondTitle), explanation = stringResource(R.string.secondExplanation))

       }
       Row (Modifier.weight(1f)){
           TextColumn(modifier = Modifier.weight(1f),backgroundColor = Color.Cyan, title = stringResource(R.string.thirdTitle), explanation = stringResource(R.string.thirdExplanation))
           TextColumn(modifier = Modifier.weight(1f),backgroundColor = Color.LightGray, title = stringResource(R.string.thirdTitle), explanation = stringResource(R.string.thirdExplanation))

       }
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
//        FirstPracticeScreen()
//        SecondPracticeScreen()
        ThirdPracticeScreen()
    }
}