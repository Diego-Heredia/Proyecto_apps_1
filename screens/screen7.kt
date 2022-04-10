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
fun septimaScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
                contentDescription = "Arrow Back",
                modifier = Modifier.clickable {
                    navController.popBackStack()
                }


            )
            Spacer(modifier = Modifier.width(8.dp))
            Text("Septima Screen")
        }
    }) {
        septimoBodyContent(navController)
    }
}

@Composable
fun septimoBodyContent(navController: NavController){
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
        Column() {
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    "Nombre producto: ",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)

                )
                Text(
                    "Mesa para 6 personas", fontSize = 17.sp, modifier = Modifier.padding(10.dp)
                )

            }
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    "Marca: ",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    "IKEA", fontSize = 17.sp, modifier = Modifier.padding(10.dp)
                )
            }
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    "Categoría del producto: ",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    "Otros", fontSize = 17.sp, modifier = Modifier.padding(10.dp)
                )

            }
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    "Cantidad: ",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(8.dp)
                )
                Text(
                    "1", fontSize = 17.sp, modifier = Modifier.padding(10.dp)
                )
            }
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    "Agregar Imagen: ",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(10.dp)
                )
                OutlinedButton(
                    onClick = {}

                ) {
                    Text("Agregar Imágen")
                }
            }

        }


    }
}