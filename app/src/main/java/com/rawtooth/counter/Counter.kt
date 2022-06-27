package com.rawtooth.counter

import android.content.Intent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rawtooth.firstcompose.MainActivity2

@Composable
fun Counter(){

    val counter= remember {
        mutableStateOf(0)
    }
    Scaffold(

        topBar = { TopAppBar(title = { Text(text = "Counter App Using Compose")}) },
        floatingActionButton = { FloatingActionButton(onClick = { counter.value++ },) {
            Icon(imageVector = Icons.Default.Add, contentDescription ="Add" )
            
        }},

    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center, modifier =Modifier.fillMaxSize()) {
            Text(text = "You have pressed button this many times",
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Cursive,
                color = Color.White,
                fontSize = 32.sp)
            Text(text = "${counter.value}",
                style = MaterialTheme.typography.h3,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.Cursive,
                fontSize = 22.sp)
        }
    }
}
@Composable
fun Next(){
    val mContext = LocalContext.current

    Column(modifier = Modifier.padding(20.dp), horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Bottom) {

        // Creating a Button that on-click
        // implements an Intent to go to SecondActivity
        Button(onClick = {
            mContext.startActivity(Intent(mContext, MainActivity2::class.java))
        },
            colors = ButtonDefaults.buttonColors(backgroundColor = Color(0XFF0F9D58)),
        ) {
            Text("Go to Second Activity", color = Color.White)
        }
    }
}