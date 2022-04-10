package up.edu.mx.nav_pages.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import up.edu.mx.nav_pages.navigation.AppScreens

@Composable
fun quintaScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar() {
            Text("Quinta Screen")
        }
    }) {
        quintoBodyContent(navController)
    }
}

@Composable
fun quintoBodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Hola navegacion")
        Button(onClick = {
            navController.navigate(route = AppScreens.SextaScreen.route )
        }) {
            Text("Navega a sexta")
        }
    }
}