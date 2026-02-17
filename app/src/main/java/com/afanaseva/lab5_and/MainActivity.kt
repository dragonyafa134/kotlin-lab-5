package com.afanaseva.lab5_and

import android.R
import android.R.attr.color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
                MainScreen()
            TitleBlock()
            ColorRow()

//            Scaffold(
//                topBar = {
//                    TopAppBar(
//                        title = {Text ( text = "Scaffold")}
//                    )
//                }
//            ) {
//                    paddingValues ->
//                Column(
//                    modifier = Modifier
//                        .fillMaxSize()
//                        .padding(paddingValues),
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Text(text = "Осноное содержимое экрана")
//                }
//
//                Scaffold(
//                    topBar = {
//                        TopAppBar(
//                            title = {Text(text = "sc")}
//                        )
//                    },
//                    floatingActionButton = {
//                        FloatingActionButton(onClick = { }) {
//                            Text(text = "+")
//                        }
//                    }
//                ) { paddingValues ->  }
//            }
        }
    }
}

@Composable
fun TitleBlock(
){


    Text(text = "Row, Column, Size, ARGB")

}

@Composable
fun MainScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        TitleBlock()
        ColorRow()
    }
}


@Composable
fun ColorRow() {
    Row (modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly

    )
    {
        Box(
        modifier = Modifier
            .size(100.dp)
            .background(Color(0xFFFF0000))
            .padding(30.dp),

    ) {}
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Yellow)
                .padding(30.dp),) {}

        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Blue)
                .padding(30.dp)
                ,) {}
    }




}


//val symbols = "Heloo world".filter { it.isLetter() }
//Column(
//modifier = Modifier
//.fillMaxSize()
//.padding(8.dp)
//.background(color = Color.Red),
//verticalArrangement = Arrangement.SpaceEvenly,
//horizontalAlignment = Alignment.CenterHorizontally
//) {
//    Row(
//        modifier = Modifier.fillMaxWidth(),
//        horizontalArrangement = Arrangement.SpaceEvenly
//    ) {
//        for (char in symbols) {
//            Text(
//                modifier = Modifier
//                    .background(color = Color.Green)
//                    .padding(top = 48.dp, start = 16.dp, end = 16.dp)
//                    .width(100.dp),
//                text = char.toString(),
//                fontWeight = FontWeight.ExtraBold,
//                color = Color.Blue,
//                fontSize = 20.sp,
//                letterSpacing = 24.sp
//            )
//        }
//        Spacer(modifier = Modifier.height(16.dp))
//        Row(
//            modifier = Modifier.fillMaxWidth(),
//            horizontalArrangement = Arrangement.SpaceEvenly
//        ) {
//            for (char in symbols.reversed()) {
//                Text(
//                    modifier = Modifier
//                        .background(color = Color.Green)
//                        .padding(top = 48.dp, start = 16.dp, end = 16.dp)
//                        .width(100.dp),
//                    text = char.toString(),
//                    fontWeight = FontWeight.ExtraBold,
//                    color = Color.Blue,
//                    fontSize = 20.sp,
//                    letterSpacing = 24.sp
//                )
//            }
//
//        }
//
//    }
//}










//Column(
//modifier = Modifier
//.fillMaxSize()
//.background(Color.White)
//.padding(16.dp),
//verticalArrangement = Arrangement.SpaceEvenly,
//horizontalAlignment = Alignment.CenterHorizontally
//) {
//    Box(
//        modifier = Modifier
//            .size(100.dp)
//            .background(Color(0xFFFF0000))
//    )
//    Box(
//        modifier = Modifier
//            .size(100.dp)
//            .background(Color(0x80FF0000))
//    )
//}