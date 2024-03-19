package com.example.labnavigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "List") {
        composable(route = "List") {
            ListScreen(navController)
        }

        composable(route = "About/{index}", arguments = listOf(
            navArgument(name = "index") {
                type = NavType.IntType
            }
        )) { backStackEntry ->
            AboutScreen(
                listIndex = backStackEntry.arguments?.getInt("index")
            )
        }

//        composable(route = "Home") {
//            HomeScreen(navController)
//        }
//        composable(route = "Details/{name}/{age}", arguments = listOf(
//            navArgument(name = "name") {
//                type = NavType.StringType
//            },
//            navArgument(name = "age") {
//                type = NavType.IntType
//            }
//        )) { backStackEntry ->
//            DetailScreen(
//                myName = backStackEntry.arguments?.getString("name"),
//                myAge = backStackEntry.arguments?.getInt("age")
//            )
//        }
    }
}