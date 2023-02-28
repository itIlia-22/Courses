package com.example.courses.data

import com.example.courses.R
import com.example.courses.model.TopicCourse

object DataSource {

    val topicsCourse = listOf<TopicCourse>(
        TopicCourse(R.string.architecture, 58, R.drawable.architecture),
        TopicCourse(R.string.crafts, 121, R.drawable.crafts),
        TopicCourse(R.string.business, 78, R.drawable.business),
        TopicCourse(R.string.culinary, 118, R.drawable.culinary),
        TopicCourse(R.string.design, 423, R.drawable.design),
        TopicCourse(R.string.fashion, 92, R.drawable.fashion),
        TopicCourse(R.string.film, 165, R.drawable.film),
        TopicCourse(R.string.gaming, 164, R.drawable.gaming),
        TopicCourse(R.string.drawing, 326, R.drawable.drawing),
        TopicCourse(R.string.lifestyle, 305, R.drawable.lifestyle),
        TopicCourse(R.string.music, 212, R.drawable.music),
        TopicCourse(R.string.painting, 172, R.drawable.painting),
        TopicCourse(R.string.photography, 321, R.drawable.photography),
        TopicCourse(R.string.tech, 118, R.drawable.tech)
    )
}