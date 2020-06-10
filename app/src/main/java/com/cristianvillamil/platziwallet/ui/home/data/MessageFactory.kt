package com.cristianvillamil.platziwallet.ui.home.data

import android.app.AlertDialog
import android.content.Context

class MessageFactory {
    companion object {
        val TYPE_ERROR = "typeError"
        val TYPE_SUCCESS = "typeSucces"
    }

    fun getDialog(context: Context, type: String): AlertDialog.Builder {
        when (type) {
            TYPE_ERROR -> {
                return AlertDialog.Builder(context)
                    .setMessage("Hay un error al momento de traer el contenido")
            }
            TYPE_SUCCESS -> {
                return AlertDialog.Builder(context)
                    .setMessage("El contenido fue cargado exitosamente")
            }
        }
        return AlertDialog.Builder(context)
            .setMessage("Necesitas añadir el nuevo tipo")
    }

}