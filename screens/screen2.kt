package up.edu.mx.nav_pages.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import up.edu.mx.nav_pages.navigation.AppScreens

@Composable
fun SecondScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arrow Back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                }
                    

            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Second Screen")
        }
    }) {
        SecondBodyContent(navController)
    }
}

@Composable
fun SecondBodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Inserta tu correo y contraseña")

        var (user,setUser) = remember {
            mutableStateOf("")
        }
        var(password,setPassword) = remember {
            mutableStateOf("")
        }
        OutlinedTextField(
            value = user,
            onValueChange = { setUser},
            label = { Text("Usuario")},
            placeholder = { Text("@TuUsuario") },
            modifier = Modifier.padding(5.dp)
        )
        TextField(
            value = password,
            onValueChange = setPassword,
            label = { Text("Enter password") },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            modifier = Modifier.padding(5.dp)
        )


        Button(onClick = {
            navController.popBackStack()
        },modifier = Modifier.padding(15.dp)) {
            Text("Regresa")
        }
        Button(onClick = {
            navController.navigate(route = AppScreens.TerceraScreen.route )
        },modifier = Modifier.padding(15.dp)) {
            Text("Inicio sesion")
        }
    }
}

