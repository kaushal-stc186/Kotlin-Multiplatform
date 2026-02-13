package my.kmp.app

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import my.kmp.app.screens.Home
import my.kmp.app.screens.About
import my.kmp.app.screens.Contact

private object Routes {
    const val Home = "home"
    const val Contact = "contact"
    const val About = "about"
}

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.Home
    ) {
        composable(Routes.Home) {
            Home(
                onOpenAbout = { navController.navigate(Routes.About) },
                onOpenContact = { navController.navigate(Routes.Contact) }
            )
        }

        composable(Routes.About) {
            About(
                onOpenHome = { navController.navigate(Routes.Home) },
                onOpenContact = { navController.navigate(Routes.Contact) }
            )
        }

        composable(Routes.Contact) {
            Contact(
                onOpenHome = { navController.navigate(Routes.Home) },
                onOpenAbout = { navController.navigate(Routes.About) }
            )
        }
    }
}
