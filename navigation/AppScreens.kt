package up.edu.mx.nav_pages.navigation

sealed class AppScreens(val route: String){
    object FirstScreen: AppScreens("first_screen")
    object SecondScreen: AppScreens("second_screen")
    object TerceraScreen: AppScreens("Tercera_screen")
    object CuartaScreen: AppScreens("cuarta_screen")
    object QuintaScreen: AppScreens("quinta_screen")
    object SextaScreen: AppScreens("sexta_screen")
    object SeptimaScreen: AppScreens("septima_screen")
    object OctavaScreen: AppScreens("octava_screen")
    object NovenaScreen: AppScreens("novena_screen")
    object DecimaScreen: AppScreens("decima_screen")

}
