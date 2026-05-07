package com.example.jetpackdemo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Cloud
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.StarBorder
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
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
            .padding(16.dp)
        .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text("----- Image ----", style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.padding(top=10.dp))
        Image(
            painter = painterResource(R.drawable.shivji),
            contentDescription = "Shiv ji photo",
            modifier = Modifier.fillMaxWidth()
                .height(180.dp),
            contentScale = ContentScale.Crop
        )

        Button(onClick = { navController.popBackStack() }) {
            Icon(
                imageVector = Icons.Default.ArrowBackIosNew,
                contentDescription = null,
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
        }
        Box(
            modifier = Modifier.fillMaxWidth()
                .height(160.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(Brush.linearGradient(
                    colors = listOf(Color(0xFF42A5F5), Color(0xFF1565C0))
                )),
            contentAlignment = Alignment.Center
        ){
            Text("Image — ContentScale.Crop\\n(replace with painterResource)",
                color = Color.White,
                style = MaterialTheme.typography.bodySmall)
        }

        Box(modifier = Modifier.size(80.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xFFF3E5F5)),
            contentAlignment = Alignment.Center){
            Icon(
                imageVector = Icons.Default.Image,
                contentDescription = "Tinted icon",
                modifier = Modifier.size(40.dp)
            )
        }
        HorizontalDivider(color = Color.Red)

        Text("---Icon---", style = MaterialTheme.typography.titleMedium)

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(Icons.Default.Home, contentDescription = "Home")
            Icon(Icons.Default.Favorite, contentDescription = "Favorite", tint = Color.Red)
            Icon(Icons.Default.Settings, contentDescription = "Setting")
            Icon(Icons.Default.Search, contentDescription = "Search", tint = Color(0xFF1976D2))
            Icon(Icons.Default.Notifications, contentDescription = "Notification")
        }

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(Icons.Default.FavoriteBorder, contentDescription = "Outlined Favorite")
            Icon(Icons.Default.MailOutline, contentDescription = "Mail")
            Icon(Icons.Default.StarBorder, contentDescription = "Start")
        }

        Icon(Icons.Default.Cloud, contentDescription = "Large Cloud",
            modifier = Modifier.size(64.dp),
            tint = Color(0xFF4FC3F7)
        )
        Box(
            modifier = Modifier.size(48.dp)
                .background(color = Color(0xFF43A047), shape = CircleShape),
            contentAlignment = Alignment.Center
        ){
            Icon(Icons.Default.Check, contentDescription = "Success", tint = Color.White,
                modifier = Modifier.size(28.dp))
        }

        Surface(shape = RoundedCornerShape(8.dp),
            color = Color(0xFFFFF3E0),
            modifier = Modifier.size(56.dp))
        {
            Box(contentAlignment = Alignment.Center){
                Icon(Icons.Default.Warning, contentDescription = "Warning", tint = Color(0xFFE65100),
                    modifier = Modifier.size(32.dp))
            }
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