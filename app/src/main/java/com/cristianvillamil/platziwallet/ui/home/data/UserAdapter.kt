package com.cristianvillamil.platziwallet.ui.home.data

import com.cristianvillamil.platziwallet.ui.home.view.UserViewModel

class UserAdapter() {
    // inicializacion de la clase

    //no se puede usar 'val o var' en la definicion de una funcion
    fun getUserViewModel(userResponse: UserResponse): UserViewModel {
        return UserViewModel(userResponse.name, userResponse.userPhotoURL)

    }
}