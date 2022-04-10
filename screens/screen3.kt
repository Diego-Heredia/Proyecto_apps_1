package up.edu.mx.nav_pages.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import up.edu.mx.nav_pages.R
import up.edu.mx.nav_pages.navigation.AppScreens

@Composable
fun terceraScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar() {
            Text("Tercera Screen")
        }
    }) {
        tercerBodyContent(navController)
    }
}

@Composable
fun tercerBodyContent(navController: NavController){

    Column(
        modifier = Modifier.fillMaxSize().padding(start = 10.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(1f).padding(start = 10.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.Top

        ) {
            Image(
                painterResource(R.drawable.ic_launcher_foreground),
                "Imagen prueba",
                modifier = Modifier
                    .padding(15.dp)
                    .clip(CircleShape)
                    .background(MaterialTheme.colors.primary)
                    .size(64.dp)



            )

        }
        Column(
            modifier = Modifier.fillMaxSize().padding(start = 10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Button(onClick = {
                navController.navigate(route = AppScreens.SextaScreen.route )
            }, modifier = Modifier.padding(12.dp)){
                Text("Cuenta")
            }

            Button(onClick = {
                navController.navigate(route = AppScreens.FirstScreen.route )
            }, modifier = Modifier.padding(12.dp)){
                Text("Cerrar sesion")
            }
            Button(onClick = {
                navController.navigate(route = AppScreens.CuartaScreen.route )
            }, modifier = Modifier.padding(12.dp)){
                Text("Home")
            }
        }

    }
}