package com.example.jetpackdemo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackdemo.ui.theme.JetPackDemoTheme

@Composable
fun ImageAndIconDemo(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("----- Image ----", style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(top=10.dp))
        Image(
            painter = painterResource(R.drawable.shivji),
            contentDescription = "Shiv ji photo",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

        Button(onClick = { navController.popBackStack() }) {
            Icon(
                imageVector = Icons.Default.ArrowBackIosNew,
                contentDescription = null,
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
        }
    }
}


@Composable
@Preview(showBackground = true, name = "Image And Icon")
fun ImageAndIconPreview(){
    JetPackDemoTheme {
        ImageAndIconDemo(navController = rememberNavController())
    }
}