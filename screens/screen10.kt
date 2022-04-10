package up.edu.mx.nav_pages.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import up.edu.mx.nav_pages.R
import androidx.navigation.NavController
import up.edu.mx.nav_pages.navigation.AppScreens

@Composable
fun decimaScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arrow Back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                }


            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Decima Screen")
        }
    }) {
        decimoBodyContent(navController)
    }
}

@Composable
fun decimoBodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ){
        Image(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .height(600.dp),
            painter = painterResource(id = R.drawable.mapa),
            contentDescription = "Mapa",
            contentScale = ContentScale.FillWidth,
        )
    }
}
