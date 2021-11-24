package com.hotel.ormanjhi.mkmotel

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MKMotelCard(title: String, description: String, onclick: () -> Unit, link: String) {
    
}

@Preview
@Composable
fun MKMotelCardPreview() {
    MKMotelCard(
        title = "This is a card",
        description = "And this is the description",
        onclick = { Log.d("MKMotelCard", "Hello!") },
        link = "https://google.com/"
    )
}