package za.ac.cput.jetpackjourney.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import za.ac.cput.jetpackjourney.NavRoutes
import za.ac.cput.jetpackjourney.R

@Composable
fun Details(navController: NavHostController) {

    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
    Column(horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center){

        Column(verticalArrangement = Arrangement.Center)
        {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.ic_baseline_person_24),
                    contentDescription = null,
                    modifier = Modifier.size(35.dp)
                )

                Text(
                    text = " Chante Lee Davids ",
                    fontSize = 25.sp,
                    modifier = Modifier.padding(start = 10.dp)
                )
            }
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.ic_baseline_laptop_chromebook_24),
                    contentDescription = null,
                    modifier = Modifier.size(35.dp)
                )

                Text(
                    text = " Applications Development ",
                    fontSize = 25.sp,
                    modifier = Modifier.padding(start = 10.dp)
                )
            }
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.ic_baseline_laptop_chromebook_24),
                    contentDescription = null,
                    modifier = Modifier.size(35.dp)
                )

                Text(
                    text = " Informatics & Design ",
                    fontSize = 25.sp,
                    modifier = Modifier.padding(start = 10.dp)
                )
            }
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.ic_baseline_person_24),
                    contentDescription = null,
                    modifier = Modifier.size(35.dp)
                )

                Text(
                    text = " 220246688 ",
                    fontSize = 25.sp,
                    modifier = Modifier.padding(start = 10.dp)
                )
            }

            }
            Column(horizontalAlignment = Alignment.CenterHorizontally
            ){

                Button(
                    modifier = Modifier.padding(20.dp),
                    shape = CircleShape,
                    elevation = ButtonDefaults.elevation(0.dp,0.dp),
                    contentPadding = PaddingValues(20.dp,12.dp),
                    border = BorderStroke(2.dp, Color.Blue),
                    onClick = {

                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Blue,
                        contentColor = Color.White
                    )
                ) {
                    Text(text = " Current Courses ",
                        fontSize = 20.sp,
                        modifier = Modifier.padding(start = 10.dp)
                    )

                    Image(painter = painterResource(id = R.drawable.ic_baseline_library_books_24),
                        contentDescription = null,
                        modifier = Modifier.size(35.dp)
                    )
                }

                Button(
                    modifier = Modifier.padding(20.dp),
                    shape = CircleShape,
                    elevation = ButtonDefaults.elevation(0.dp,0.dp),
                    contentPadding = PaddingValues(20.dp,12.dp),
                    border = BorderStroke(2.dp, Color.Blue),
                    onClick = {
                        navController.navigate(NavRoutes.Home.route)
                    },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = Color.Blue,
                        contentColor = Color.White
                    )
                ) {
                    Text(text = " Back ",
                        fontSize = 20.sp,
                        modifier = Modifier.padding(start = 10.dp)
                    )

                    Image(painter = painterResource(id = R.drawable.ic_baseline_keyboard_arrow_left_24),
                        contentDescription = null,
                        modifier = Modifier.size(35.dp)
                    )
                }

            }
        }
    }
}