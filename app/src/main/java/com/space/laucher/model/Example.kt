package com.space.laucher.model

import java.util.*

data class LaunchesResponse(
    val launches: List<Launch>,
    val total: Int,
    val offset: Int,
    val count: Int)