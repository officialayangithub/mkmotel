package com.hotel.ormanjhi.mkmotel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.hotel.ormanjhi.mkmotel.ui.theme.MKMotelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MKMotelTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Main()
                }
            }
        }
    }
}

@Composable
fun Main() {
    Column(modifier = Modifier.padding(12.dp)) {
        Text(text = Copyright())
        Text(text = "Thanks to Ayan Shekhar, Chinmoy Kumar and Tarang Dayal for developing / making this app and publishing it to the Play Store")
        List()
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MKMotelTheme {
        Main()
    }
}