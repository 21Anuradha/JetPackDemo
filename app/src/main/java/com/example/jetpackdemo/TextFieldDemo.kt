package com.example.jetpackdemo

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.jetpackdemo.ui.theme.JetPackDemoTheme

@Composable
fun TextFieldDemo(navController: NavController) {
    var basictext by remember { mutableStateOf("") }
    var emailText by remember { mutableStateOf("") }
    var passwordText by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }
    var isPasswordValid = passwordText.length >= 6
    var multilineText by remember { mutableStateOf("") }
    var errorText by remember { mutableStateOf("") }
    var readonlyText by remember { mutableStateOf("Read only value") }
    var outlinedText by remember { mutableStateOf("") }
    var outlinedEmail by remember { mutableStateOf("") }
    var searchText by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text("-----TextField (filled)---", style = MaterialTheme.typography.titleMedium,modifier = Modifier.padding(top=10.dp))

        TextField(
            value = basictext,
            onValueChange = {basictext = it},
            label = {Text("UserName")},
            placeholder = {Text("Enter your username")},
            modifier = Modifier.fillMaxWidth(),
            singleLine = true
        )

        TextField(
            value = emailText,
            onValueChange = {emailText = it},
            label = { Text("Email") },
            leadingIcon = { Icon(Icons.Default.Email, contentDescription = null) },
            trailingIcon = {
                if (emailText.isNotEmpty()){
                    IconButton(onClick = {emailText=""}) {
                        Icon(Icons.Default.Clear, contentDescription = null)
                    }
                }
            },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Email,
                imeAction = ImeAction.Next
            ),
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        TextField(
            value = passwordText,
            onValueChange = {passwordText =it},
            label = {Text("Password")},
            leadingIcon = {Icon(Icons.Default.Lock, contentDescription = null)},
            trailingIcon = {
                var icon = if (passwordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff
                IconButton(onClick = {passwordVisible != passwordVisible}) {
                    Icon(icon, contentDescription = if (passwordVisible) "Hide" else "show")
                }
            },
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password,
                imeAction = ImeAction.Done
            ),
            singleLine = true,
            isError = passwordText.isNotEmpty() && !isPasswordValid,
            modifier = Modifier.fillMaxWidth()
        )
        if (passwordText.isNotEmpty() && !isPasswordValid){
            Text("Password must have 6 character", color = Color.Red, style = MaterialTheme.typography.bodySmall)
        }

        TextField(
            value = multilineText,
            onValueChange = {multilineText = it},
            label = {Text("Notes")},
            placeholder = {Text("Write your note here")},
            maxLines = 4,
            modifier = Modifier.fillMaxWidth()
                .height(120.dp)
        )

        TextField(
            value = errorText,
            onValueChange = {errorText = it},
            label = {Text("Required Field")},
            isError = errorText.isEmpty(),
            supportingText = {
                if (errorText.isEmpty())
                    Text("This Field can't be empty", color = MaterialTheme.colorScheme.error)
            },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        TextField(
            value = readonlyText,
            onValueChange = {},
            label = {Text("Read only")},
            readOnly = true,
            modifier = Modifier.fillMaxWidth()
        )

        TextField(
            value = "Diable Field",
            onValueChange = {},
            label = {Text("Disable")},
            enabled = false,
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = outlinedText,
            onValueChange = {outlinedText = it},
            label = {Text("Full Name")},
            placeholder = {Text("Enter your Full name")},
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = outlinedEmail,
            onValueChange = {outlinedEmail = it},
            label = {Text("Email Address")},
            leadingIcon = { Icon(Icons.Default.Email, contentDescription = null) },
            trailingIcon = {
                if (outlinedEmail.isNotEmpty()){
                    IconButton(onClick = {outlinedEmail=""}) {
                        Icon(Icons.Default.Clear, contentDescription = "Clear")
                    }
                }
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = searchText,
            onValueChange = { searchText = it },
            label = { Text("Search") },
            keyboardOptions = KeyboardOptions(
                imeAction = ImeAction.Search
            ),
            keyboardActions = KeyboardActions(
                onSearch = { /* trigger search logic here */ }
            ),
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
    }

}

@Composable
@Preview(showBackground = true, name = "Text Field")
fun TextFieldPreview(){
    JetPackDemoTheme {
        TextFieldDemo(navController = rememberNavController())
    }
}