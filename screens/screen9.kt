package up.edu.mx.nav_pages.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import up.edu.mx.nav_pages.navigation.AppScreens

@Composable
fun novenaScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arrow Back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                }


            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Novena Screen")
        }
    }) {
        novenoBodyContent(navController)
    }
}

@Composable
fun novenoBodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {

        Row(modifier = Modifier.fillMaxWidth(1f)){
            Text(
                "Hola buenas tardes Javier",
                fontSize = 17.sp,
                modifier = Modifier.padding(8.dp),
                textAlign = TextAlign.Left
            )
        }
        Row(modifier = Modifier.fillMaxWidth(1f), horizontalArrangement = Arrangement.End){
            Text(
                "Buenas tardes, ¿cuando te pudiera ver?",
                fontSize = 17.sp,
                modifier = Modifier.padding(8.dp),
                textAlign = TextAlign.Right
            )

        }
        Row(modifier = Modifier.fillMaxWidth(1f)){
            Text(
                "¿Puedes mañana?",
                fontSize = 17.sp,
                modifier = Modifier.padding(8.dp),
                textAlign = TextAlign.Left
            )
        }
        Row(modifier = Modifier.fillMaxWidth(1f), horizontalArrangement = Arrangement.End){
            Text(
                "Claro, empaco tu producto",
                fontSize = 17.sp,
                modifier = Modifier.padding(8.dp),
                textAlign = TextAlign.Right
            )
        }

        Row(modifier = Modifier.fillMaxWidth(1f)){
            Text(
                "Pasaré en una camioneta Ford",
                fontSize = 17.sp,
                modifier = Modifier.padding(8.dp),
                textAlign = TextAlign.Left
            )
        }
        Row(modifier = Modifier.fillMaxWidth(1f), horizontalArrangement = Arrangement.End){
            Text(
                "Perfecto aún así estaré el pendiente",
                fontSize = 17.sp,
                modifier = Modifier.padding(8.dp),
                textAlign = TextAlign.Right
            )
        }
        Row(modifier = Modifier.fillMaxWidth(1f)){
            Text(
                "Tenga un bonito día",
                fontSize = 17.sp,
                modifier = Modifier.padding(8.dp),
                textAlign = TextAlign.Left
            )
        }
        Row(modifier = Modifier.fillMaxWidth(1f), horizontalArrangement = Arrangement.End){
            Text(
                "Igualmente y gracias por el cambio",
                fontSize = 17.sp,
                modifier = Modifier.padding(8.dp),
                textAlign = TextAlign.Right
            )
        }
        Spacer(modifier = Modifier.height(198.dp))
        var (chatString,setChatString) = remember{
            mutableStateOf("")
        }
        Row(modifier = Modifier.fillMaxWidth(1f),horizontalArrangement = Arrangement.Center) {
            TextField(value = chatString, onValueChange = {setChatString}, label = { Text("Escribe Algo: ")},
                placeholder = { Text("Mensaje.....") },
                modifier = Modifier.padding(5.dp))
        }
    }
}
