package com.example.servenep.response

import com.example.servenep.entities.Users

data class GetTaskerCategory(
    val success: Boolean?= null,
    val count: Int? =null,
    val data : MutableList<Users>?= null
)