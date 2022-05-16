//Author : Chante Lee Davids
//Student No. : 220246688

package za.ac.cput.jetpackjourney.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import za.ac.cput.jetpackjourney.NavRoutes
import za.ac.cput.jetpackjourney.R
import za.ac.cput.jetpackjourney.data.listOfCourses
import za.ac.cput.jetpackjourney.data.loadCourseCards
import kotlin.system.exitProcess

@Composable
fun Courses(navController: NavHostController) {

    var dialogState by remember{
        mutableStateOf(false)
    }

    Column(horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
        .padding(5.dp)
        .verticalScroll(rememberScrollState())) {
        listOfCourses().forEach { courseData ->
            loadCourseCards(courseData = courseData)
        }

            Button(
                modifier = Modifier.padding(20.dp),
                shape = CircleShape,
                elevation = ButtonDefaults.elevation(0.dp,0.dp),
                contentPadding = PaddingValues(20.dp,12.dp),
                border = BorderStroke(2.dp, Color.Blue),
                onClick = {
                    navController.navigate(NavRoutes.Details.route)
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

            Button(
                modifier = Modifier.padding(20.dp),
                shape = CircleShape,
                elevation = ButtonDefaults.elevation(0.dp,0.dp),
                contentPadding = PaddingValues(20.dp,12.dp),
                border = BorderStroke(2.dp, Color.Blue),
                onClick = {
                    dialogState = true
                },
                colors = ButtonDefaults.buttonColors(
                    backgroundColor = Color.Blue,
                    contentColor = Color.White
                )
            ) {
                Text(text = " Goodbye ",
                    fontSize = 20.sp,
                    modifier = Modifier.padding(start = 10.dp)
                )

                Image(painter = painterResource(id = R.drawable.ic_baseline_exit_24),
                    contentDescription = null,
                    modifier = Modifier.size(35.dp)
                )
            }
    }

    AlertDialog(dialogState) {
        dialogState = !it
    }
}

@Composable
fun AlertDialog(dialogState: Boolean, onDismiss: (dialogState: Boolean) -> Unit){

    if(dialogState){

        AlertDialog(
            onDismissRequest = {
                onDismiss(dialogState)
            },
            title = {
                Row(){

                    Image(painter = painterResource(id = R.drawable.ic_baseline_warning_24),
                        contentDescription = null,
                        modifier = Modifier.size(30.dp)
                    )

                    Text(
                        text = "Warning",
                        fontWeight = FontWeight.Bold,
                        style = MaterialTheme.typography.h5
                    )
                }
            },

            text = {
                Text(
                    text = "Leaving now?",
                    fontSize = 20.sp,
                    color = Color.Gray
                )
            },
            confirmButton = {
                TextButton(
                    shape = CircleShape,
                    elevation = ButtonDefaults.elevation(0.dp,0.dp),
                    contentPadding = PaddingValues(20.dp,12.dp),
                    border = BorderStroke(2.dp, Color.Blue),
                    onClick = {
                        exitProcess(0)
                    },
                    colors = ButtonDefaults.textButtonColors(
                        backgroundColor = Color.White,
                        contentColor = Color.Black
                    )
                ){
                    Text(
                        "YES",
                        fontSize = 16.sp
                    )
                }
            },
            dismissButton = {
                TextButton(
                    shape = CircleShape,
                    elevation = ButtonDefaults.elevation(0.dp,0.dp),
                    contentPadding = PaddingValues(20.dp,12.dp),
                    border = BorderStroke(2.dp, Color.Blue),
                    onClick = {
                        onDismiss(dialogState)
                    },
                    colors = ButtonDefaults.textButtonColors(
                        backgroundColor = Color.Blue,
                        contentColor = Color.White
                    )
                ){
                    Text(
                        "NO",
                        fontSize = 16.sp
                    )
                }
            },
        )
    }
}