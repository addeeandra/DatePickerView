package com.khoiron.calendarvertical.model

import java.util.*

data class DayDataVerticalModel(var year     : Int  = 0,
                                var month    : Int = 0,
                                var day      : Int   = 0,
                                var fullDay  : String = "",
                                var date     : Date,
                                var typeDay  : Int = 0
)
