package com.cristianvillamil.platziwallet.ui.home.data

// Un data class nos da los getter y los setter y el constructor
data class UserResponse (
    val id: String,
    val name: String,
    val token: String,
    val userPhotoURL: String,
    val tokenTransfer: String

)
