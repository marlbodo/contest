package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // 화면에 띄울 글자
            Text(text = "안녕하세요! 첫 번째 앱입니다.")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Text(text = "안녕하gftr세요! 첫 앱입니다.")
}