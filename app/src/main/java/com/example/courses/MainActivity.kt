package com.example.courses

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.courses.data.DataSource
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
                    CoursesApp()
                }
            }
        }
    }
}

@Composable
fun CoursesApp() {
    CoursesListGrid(topicCourse = DataSource.topicsCourse)
}

@Composable
private fun CoursesListGrid(topicCourse: List<TopicCourse>) {
    LazyVerticalGrid(
        columns = GridCells.Adaptive(minSize = 168.dp),
        contentPadding = PaddingValues(start = 8.dp, end = 8.dp, top = 8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(topicCourse) { topicCourse ->
            CoursesCard(topicCourse)
        }
    }

}


@Composable
fun CoursesCard(
    topicCourse: TopicCourse,
    modifier: Modifier = Modifier
) {
    Card(elevation = 4.dp) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(topicCourse.courseImage),
                contentDescription = null,
                modifier = modifier
                    .size(width = 68.dp, height = 68.dp)
                    .aspectRatio(1f),
                contentScale = ContentScale.Crop


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