package com.space.laucher.extensions

import kotlin.math.abs


fun findDifferenceBetweenTwoUnixTimestampInDays(firstTimeStamp:Long,secondTimestamp:Long) =
    abs(firstTimeStamp-secondTimestamp)/3600/24