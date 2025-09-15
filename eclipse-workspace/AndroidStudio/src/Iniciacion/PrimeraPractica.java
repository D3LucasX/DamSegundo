package com.example.ejemplo3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ejemplo3.ui.theme.Ejemplo3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DostextosVertical()
        }
    }
}

@Composable
fun DostextosVertical(){

    Row (modifier = Modifier.padding(top = 25.dp)){
        Text("Primer Texto row")
        Text("Segundo Texto row")
    }
    Column(modifier = Modifier.fillMaxSize().padding(top = 40.dp)){
        Text("Primer Texto")
        Text("Segundo Texto")
    }
}
@Preview
@Composable
fun DostextosVerticalPreview(){
    DostextosVertical()
}