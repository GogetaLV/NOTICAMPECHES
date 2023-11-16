package com.example.notiapp.io.Responsive

import com.example.notiapp.model.User

data class LoginResponse(
    val success:Boolean,
    val user: User,
    val jwt:String

)
