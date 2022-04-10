package up.edu.mx.nav_pages.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import up.edu.mx.nav_pages.R
import up.edu.mx.nav_pages.navigation.AppScreens

@ExperimentalFoundationApi
@Composable
fun cuartaScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arrow Back",
                modifier = Modifier.clickable {
                    navController.navigate(route = AppScreens.TerceraScreen.route )
                }


            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Cuarta Screen")
        }
    }) {
        cuartoBodyContent(navController)
    }
}

@ExperimentalFoundationApi
@Composable
fun cuartoBodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(1f)
                .padding(start = 10.dp),
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
        Text("Buscador", fontSize = 30.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(8.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(2f)
                .padding(start = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Top
        ) {
            Button(onClick = {
                navController.navigate(route = AppScreens.SextaScreen.route )
            }, modifier = Modifier.padding(12.dp)) {
                Text("Perfil")
            }
            Button(onClick = {
                navController.navigate(route = AppScreens.SeptimaScreen.route )
            }, modifier = Modifier.padding(12.dp)) {
                Text("Ingresa Producto")
            }
            Button(onClick = {
                navController.navigate(route = AppScreens.DecimaScreen.route )
            }, modifier = Modifier.padding(12.dp)) {
                Text("Mapa")
            }

        }
        Row(
            modifier = Modifier
                .fillMaxWidth(2f)
                .padding(start = 10.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.Top
        ){
            Button(onClick = {
                navController.navigate(route = AppScreens.NovenaScreen.route )
            }, modifier = Modifier.padding(12.dp)) {
                Text("Chat")
            }
            Button(onClick = {
                navController.navigate(route = AppScreens.OctavaScreen.route )
            }, modifier = Modifier.padding(12.dp)) {
                Text("Historial de Intercambios")
            }
        }
        val images = (0..8).toList()

        LazyVerticalGrid(
            cells = GridCells.Fixed(3)
        ) {
            items(images.size) {  // ---------> You need to add this
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painterResource(R.drawable.ic_launcher_foreground),"Imagen Prueba",
                        modifier = Modifier.padding(15.dp).clip(CircleShape).background(MaterialTheme.colors.primary).size(64.dp))
                    Image(painterResource(R.drawable.ic_launcher_foreground),"Imagen Prueba",
                        modifier = Modifier.padding(15.dp).clip(CircleShape).background(MaterialTheme.colors.primary).size(64.dp))
                    Image(painterResource(R.drawable.ic_launcher_foreground),"Imagen Prueba",
                        modifier = Modifier.padding(15.dp).clip(CircleShape).background(MaterialTheme.colors.primary).size(64.dp))
                    Image(painterResource(R.drawable.ic_launcher_foreground),"Imagen Prueba",
                        modifier = Modifier.padding(15.dp).clip(CircleShape).background(MaterialTheme.colors.primary).size(64.dp))


                }
            }
        }

    }
}