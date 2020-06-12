package com.cristianvillamil.platziwallet.ui.commands

import android.content.Context

interface FileCommand {
    // vararg : nos dice que son varios argumentos de tipo string
    fun execute(context: Context, fileName: String, vararg  arguments: String)

}