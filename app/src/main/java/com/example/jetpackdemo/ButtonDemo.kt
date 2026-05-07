package com.example.jetpackdemo

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackdemo.ui.theme.JetPackDemoTheme
import kotlin.math.cos

@Composable
fun ButtonDemo(navController: NavController) {
    var clickMe by remember { mutableStateOf("Tap to button...") }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = clickMe, style = MaterialTheme.typography.bodyMedium)

        HorizontalDivider()

        Button(
            onClick = {
                clickMe = "Button Clicked!"
                navController.navigate("image_screen")
            }, modifier = Modifier.padding(2.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black,
                containerColor = Color.Red
            )
        ) {
            Text("Basic Button")
        }

        val imageModifier = Modifier.size(30.dp)
        Button(onClick = { clickMe = "Send tapped"
            navController.navigate("text_field")
        }) {
            Icon(
                painter = painterResource(R.drawable.ic_send),
                contentDescription = null,
                modifier = imageModifier
            )
            Spacer(Modifier.size(ButtonDefaults.IconSize))
            Text("Send")
        }

        Button(
            onClick = {},
            enabled = false
        ) {
            Text("Diable Button")
        }

        Button(
            onClick = { clickMe = "Custom Color button!" },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFF6A1B9A),
                contentColor = Color.White
            )
        ) {
            Text("Custom color Button")
        }

        Button(onClick = { clickMe = "Full-Width clicked!" }, modifier = Modifier.fillMaxWidth()) {
            Text("full width button")
        }

        var isSelect by remember { mutableStateOf(false) }
        Button(
            onClick = { isSelect = !isSelect },
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isSelect) Color.Green else Color.DarkGray
            )
        ) {
            Text(if (isSelect) "Selected" else "Not Selected")
        }

        HorizontalDivider()

        // ******** Outlined Button ***********
        OutlinedButton(onClick = { clickMe = "OutlinedButton CLicked " }) {
            Text("Outlined Button")
        }

        OutlinedButton(onClick = { clickMe = "Favourite Outlined" }) {
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = null,
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(Modifier.size(ButtonDefaults.IconSpacing))
            Text("Favorite")
        }

        OutlinedButton(onClick = {}, enabled = false) {
            Text("Diable Outlined!")
        }

        HorizontalDivider()
        //******** TextButton *********

        TextButton(onClick = { clickMe = "TextButton CLicked!" }) {
            Text(
                "Text Button",
                style = MaterialTheme.typography.displayMedium,
                color = com.example.jetpackdemo.ui.theme.BrightRed,
                fontSize = 14.sp,
                fontStyle = FontStyle.Italic,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.End,
                textDecoration = TextDecoration.Underline
            )
        }

        TextButton(onClick = { clickMe = "Learn More tapped!" }) {
            Text("Learn More ->")
        }

        TextButton(onClick = {}, enabled = false) {
            Text("Disable Text")
        }

        TextButton(
            onClick = { clickMe = "Danger TextButton" },
            colors = ButtonDefaults.textButtonColors(
                contentColor = MaterialTheme.colorScheme.error
            )
        ) {
            Text("Delete")
        }

    }

}


@Composable
@Preview(showBackground = true)
fun ButtonPreview() {
    JetPackDemoTheme {
        ButtonDemo(navController = rememberNavController())
    }
}