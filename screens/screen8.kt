package up.edu.mx.nav_pages.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import up.edu.mx.nav_pages.navigation.AppScreens

@Composable
fun octavaScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arrow Back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                }


            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Octava Screen")
        }
    }) {
        octavoBodyContent(navController)
    }
}

@Composable
fun octavoBodyContent(navController: NavController) {
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {


        Column(

        ) {
            Row {
                Text(
                    "Producto Intercambio: ",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    "Tarjeta de regalo AppStore",
                    fontSize = 17.sp,
                    modifier = Modifier.padding(8.dp)
                )
            }
            Row() {
                Text(
                    "Fecha: ",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    "17/12/2021",
                    fontSize = 17.sp,
                    modifier = Modifier.padding(8.dp)
                )
            }



            Row() {
                Text(
                    "Producto Intercambio: ",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    "Palomitas",
                    fontSize = 17.sp,
                    modifier = Modifier.padding(8.dp)
                )
            }
            Row() {
                Text(
                    "Fecha: ",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    "15/08/2021",
                    fontSize = 17.sp,
                    modifier = Modifier.padding(8.dp)
                )
            }




            Row {
                Text(
                    "Producto Intercambio: ",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    "Nintendo Switch",
                    fontSize = 17.sp,
                    modifier = Modifier.padding(8.dp)
                )
            }
            Row() {
                Text(
                    "Fecha: ",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    "21/05/2021",
                    fontSize = 17.sp,
                    modifier = Modifier.padding(8.dp)
                )
            }




            Row() {
                Text(
                    "Producto Intercambio: ",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    "Blue Ray Juego de Tronos",
                    fontSize = 17.sp,
                    modifier = Modifier.padding(8.dp)
                )
            }
            Row() {
                Text(
                    "Fecha: ",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    "02/01/2021",
                    fontSize = 17.sp,
                    modifier = Modifier.padding(8.dp)
                )
            }



        }
    }
}
