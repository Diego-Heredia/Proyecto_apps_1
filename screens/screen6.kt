package up.edu.mx.nav_pages.screens

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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
import org.intellij.lang.annotations.JdkConstants
import up.edu.mx.nav_pages.R
import up.edu.mx.nav_pages.navigation.AppScreens

@Composable
fun SextaScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arrow Back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                }


            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Sexta Screen")
        }
    }) {
        SextoBodyContent(navController)
    }
}

@Composable
fun SextoBodyContent(navController: NavController){
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Row{
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
        Column() {
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    "Nombre de usuario: ",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    "Fernando Gonzales", fontSize = 17.sp, modifier = Modifier.padding(8.dp)
                )
            }
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    "Correo electrónico: ",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    "fergon@gmail.com", fontSize = 17.sp, modifier = Modifier.padding(8.dp)
                )
            }
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    "Dirección: ",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    "Arkansas 5, 804, 03810, México, Ciudad de México", fontSize = 17.sp, modifier = Modifier.padding(8.dp)
                )

            }
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    "Intercambios: ",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    "1 Otros / 3 Cocina / 2 Juegos", fontSize = 17.sp, modifier = Modifier.padding(8.dp)
                )
            }
        }


    }
}