//Author : Chante Lee Davids
//Student No. : 220246688

package za.ac.cput.jetpackjourney.data

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import za.ac.cput.jetpackjourney.R

@Composable
fun loadCourseCards(courseData: CourseData) {
    Card(
        modifier = Modifier.padding(10.dp),
        elevation = 5.dp,
        shape = RoundedCornerShape(corner = CornerSize(10.dp))
    ){
        Row(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_school_24),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .padding(4.dp)
                .height(50.dp)
            .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
            )
            Column{
                Text(
                    text = courseData.courseName,
                    fontSize = 18.sp

                )
                Spacer(
                    modifier = Modifier.height(4.dp)
                )
                Text(
                    text = courseData.courseType,
                    style = MaterialTheme.typography.subtitle2
                )
                Spacer(
                    modifier = Modifier.height(4.dp)
                )
                Text(
                    text = courseData.courseDuration,
                    style = MaterialTheme.typography.subtitle2
                )
            }
        }
    }

}