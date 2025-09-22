package com.example.ejemplo3

import android.os.Bundle
import android.text.style.BackgroundColorSpan
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomEnd
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.TopStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejemplo3.ui.theme.Ejemplo3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            //DostextosVertical()
            //EjemploBox()
            imagenConTexto()
        }
    }
}

@Composable
fun DostextosVertical(){
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.height(40.dp))
        Row() {
            Text("Primer Texto row")
            Spacer(modifier = Modifier.width(20.dp))
            Text("Segundo Texto row")
        }
        Column (modifier = Modifier.fillMaxSize().padding(top=40.dp)) {
            Text("Primer Texto")
            Text("Segundo Texto")
        }
    }
}

@Composable
fun EjemploBox(){

    Box(modifier = Modifier.fillMaxSize().padding(top = 40.dp)){
        Text("Parte superior izquierda", modifier = Modifier.align(Alignment.TopStart))

        Text("Parte central ", modifier = Modifier.align(Alignment.Center))

        Text("Parte inferior derecha", modifier = Modifier.align(Alignment.BottomEnd))
    }
}

@Composable
fun imagenConTexto(){
    var backgroundBoxClor by remember { mutableStateOf(Color.White) }
    var textPosicion by remember { mutableStateOf (Offset(0f, 0f) ) }
    Box(modifier = Modifier.fillMaxSize().padding( 40.dp).background(backgroundBoxClor)){
        Image(
            painter= painterResource(id = R.drawable.imagen_tortuga),
            contentDescription ="tortu",
            modifier = Modifier.align(Center).fillMaxSize()
        )

        Text(text = "tortuga andando",
            fontSize = 22.sp,
            color = Color.Green,
            textAlign = TextAlign.Center,
            modifier = Modifier.offset{
                IntOffset(textPosicion.x.toInt(), textPosicion.y.toInt())
            }.pointerInput(Unit){
                detectDragGestures { change, dragAmount ->  }
            }
            )
        Button(
            onClick = { backgroundBoxClor = randomColor()},
            modifier = Modifier.align(Alignment.TopStart)
        )
        {
            Text(text= "Cambiar Fondo")
        }
    }
}

fun randomColor(): Color {
    val rojo = (0..255).random()
    val azul = (0..255).random()
    val verde = (0..255).random()

    return Color(red= rojo, blue= azul, green= verde)
}

@Preview
@Composable
fun DostextosVerticalPreview(){
    DostextosVertical()
}