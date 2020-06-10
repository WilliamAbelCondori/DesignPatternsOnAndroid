package com.cristianvillamil.platziwallet

class UserSingleton {
    var userName = "William"

    companion object{
        private var instance: UserSingleton? = null

        fun getInstance(): UserSingleton {
            if (instance == null) {
                instance == UserSingleton()
            }
            return instance as UserSingleton  // Hacemos el casteo de que esta variable simpre ser UserSingleton
        }
    }

}