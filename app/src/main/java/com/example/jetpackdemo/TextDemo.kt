package com.example.jetpackdemo

import android.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackdemo.ui.theme.JetPackDemoTheme

@Composable
fun TextDemo(navController: NavController){
    Column(modifier = Modifier.fillMaxWidth()
        .padding(horizontal = 30.dp)
        .verticalScroll(rememberScrollState())
    ) {
        Text(text = "Hello, Jetpack Compose",
            style = MaterialTheme.typography.bodyLarge,
            color = com.example.jetpackdemo.ui.theme.BrightRed,
            modifier = Modifier.padding(top = 2.dp),
            fontSize = 14.sp,
            fontWeight = FontWeight.Medium,
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.Monospace,
        )

        Text("Large Text",
            style = MaterialTheme.typography.bodySmall,
            color = com.example.jetpackdemo.ui.theme.BrightYellow,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Normal,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
            )
        Text("Colored Tealed",
            color = Color(0xFF00897B),
            fontSize = 10.sp
            )
        Text("This is a very long text that will be cut off with an ellipsis because it exceeds the maximum number of lines allowed.",
            overflow = TextOverflow.Ellipsis,
            maxLines = 1)

        Text("Text Underlined",
            textDecoration = TextDecoration.Underline,
            color = com.example.jetpackdemo.ui.theme.BrightBlue)

        Text("Strikethrough Text",
            textDecoration = TextDecoration.LineThrough,
            color = com.example.jetpackdemo.ui.theme.BrightGreen,
            fontSize = 12.sp,
            fontWeight = FontWeight.Thin,
            fontStyle = FontStyle.Italic,
            textAlign = TextAlign.Justify,
            fontFamily = FontFamily.Monospace
            )

        Text("Custom TextStyle",
            style = TextStyle(
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFF5C6BC0),
                letterSpacing = 2.sp
            )
        )

        Text(text = buildAnnotatedString {
            append("Normal")
            withStyle(SpanStyle(fontWeight = FontWeight.Bold, color = Color.Red)){
                append(" Bold Red ")
            }
            withStyle(SpanStyle(textDecoration = TextDecoration.Underline, color = Color.Blue)){
                append("UnderLine Blue")
            }
        })

        ButtonDemo(navController)

    }
}

@Preview(showBackground = true, name = "Text Demo")
@Composable
fun TextDemoPreview(){
    JetPackDemoTheme {
        TextDemo(navController = rememberNavController())
    }
}