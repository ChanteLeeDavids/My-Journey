//Author : Chante Lee Davids
//Student No. : 220246688

package za.ac.cput.jetpackjourney

sealed class NavRoutes(val route: String) {
    object Home : NavRoutes("home")
    object Details : NavRoutes("details")
    object Courses : NavRoutes("courses")

}
