package com.example.courses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.courses.model.TopicCourse
import com.example.courses.ui.theme.CoursesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoursesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun CoursesCard(
    topicCourse: TopicCourse,
    modifier: Modifier = Modifier
) {
    Card() {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(topicCourse.courseImage),
                contentDescription = null,


                )
            Column {
                Text(
                    text = stringResource(topicCourse.courseText),
                    modifier = modifier.padding(start = 16.dp, end = 16.dp, top = 8.dp),
                    style = MaterialTheme.typography.body2
                )
                Row(
                    modifier.padding(top = 8.dp),

                    ) {
                    Icon(
                        painter = painterResource(R.drawable.is_google_icon),
                        contentDescription = null,
                        modifier = modifier.padding(start = 16.dp)


                    )
                    Text(
                        text = topicCourse.courseNumber.toString(),
                        modifier = modifier.padding(start = 8.dp),
                        style = MaterialTheme.typography.caption
                    )
                }

            }
        }
    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    CoursesTheme {
        CoursesCard(topicCourse = TopicCourse(R.string.architecture, 48, R.drawable.architecture))
    }
}