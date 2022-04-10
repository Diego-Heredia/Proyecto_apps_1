package up.edu.mx.nav_pages.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavArgument
import androidx.navigation.NavArgumentBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import up.edu.mx.nav_pages.screens.*

@ExperimentalFoundationApi
@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route  ){
        composable(route = AppScreens.FirstScreen.route){
            FirstScreen(navController)
        }
        composable(route = AppScreens.SecondScreen.route){
            SecondScreen(navController)
        }
        composable(route = AppScreens.TerceraScreen.route){
            terceraScreen(navController)
        }
        composable(route = AppScreens.CuartaScreen.route){
            cuartaScreen(navController)
        }
        composable(route = AppScreens.QuintaScreen.route){
            quintaScreen(navController)
        }
        composable(route = AppScreens.SextaScreen.route){
            SextaScreen(navController)
        }
        composable(route = AppScreens.SeptimaScreen.route){
            septimaScreen(navController)
        }
        composable(route = AppScreens.OctavaScreen.route){
            octavaScreen(navController)
        }
        composable(route = AppScreens.NovenaScreen.route){
            novenaScreen(navController)
        }
        composable(route = AppScreens.DecimaScreen.route){
            decimaScreen(navController)
        }
    }
}