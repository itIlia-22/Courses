package com.example.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.IntegerRes
import androidx.annotation.StringRes

data class TopicCourse(
    @StringRes val courseText: Int,
     val courseNumber: Int,
    @DrawableRes val courseImage: Int

)
