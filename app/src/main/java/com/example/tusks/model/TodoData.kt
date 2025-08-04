package com.example.tusks.model

import java.util.UUID
import kotlin.math.abs

data class TodoData(
    val id: Int = abs(UUID.randomUUID().hashCode()),
    var title: String,
    var description: String,
    var time: String,
    var isToday: Boolean = false
)
