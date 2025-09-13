package com.example.bienvenidoalcurso

import android.os.Bundle
import android.widget.Button
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
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
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.bienvenidoalcurso.ui.theme.BienvenidoAlCursoTheme

// ALGUNOS IMPORTS SON INUTILES SE ME COLARON DEL ANTERIOR PROBLEMA

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                GreetingCard()
            }
        }
    }
}

@Composable
fun GreetingCard() {
    Box(
        modifier = Modifier
            .fillMaxSize().background(Color(0xFF719963))
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.align(Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable._4415),
                contentDescription = "Course Image",
                modifier = Modifier.size(100.dp)
            )
            Text(
                text = "Jheremy Delgado",
                fontSize = 28.sp,
                style = TextStyle(fontFamily = FontFamily.Serif)
            )
            Text(
                text = "Android Developer Extraordinaire",
                fontSize = 20.sp,
                color = Color(0xFF507600)
            )
        }

        Column(
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(bottom = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "+51 946 276 913",
                fontSize = 15.sp,
                style = TextStyle(fontFamily = FontFamily.Serif)
            )
            Text(
                text = "@toko0715",
                fontSize = 15.sp,
                style = TextStyle(fontFamily = FontFamily.Serif)
            )
            Text(
                text = "jheremy.delgado@tecsup.edu.pe",
                fontSize = 15.sp,
                style = TextStyle(fontFamily = FontFamily.Serif)
            )
        }
    }
}


