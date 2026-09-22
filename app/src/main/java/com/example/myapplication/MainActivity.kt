package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize()
            ) {
                ColoredBoxesScreen()
            }
        }
    }
}

@Composable
fun ColoredBoxesScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 40.dp, start = 16.dp, end = 16.dp, bottom = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(130.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            ColorBox(
                text = "1",
                backgroundColor = Color(0xFF1E88E5),
                modifier = Modifier.weight(1f)
            )
            ColorBox(
                text = "2",
                backgroundColor = Color(0xFFE53935),
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(120.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Row(
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                ColorBox(
                    text = "3",
                    backgroundColor = Color(0xFFFDD835),
                    textColor = Color.Black,
                    modifier = Modifier.weight(1f)
                )
                ColorBox(
                    text = "4",
                    backgroundColor = Color(0xFF2E7D32),
                    modifier = Modifier.weight(1f)
                )
            }

            ColorBox(
                text = "5",
                backgroundColor = Color(0xFF7E57C2),
                modifier = Modifier.weight(1f)
            )
        }

        Spacer(modifier = Modifier.height(8.dp))

        ColorBox(
            text = "6",
            backgroundColor = Color(0xFFFB8C00),
            modifier = Modifier
                .fillMaxWidth()
                .height(110.dp)
        )

        Spacer(modifier = Modifier.weight(1f))

        Text(
            text = "Mai Văn Việt - BIT240253",
            color = Color.Black,
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier.padding(bottom = 32.dp)
        )
    }
}

@Composable
fun ColorBox(
    text: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier,
    textColor: Color = Color.White
) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .background(backgroundColor),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            color = textColor,
            fontSize = 38.sp,
            fontWeight = FontWeight.Bold
        )
    }
}