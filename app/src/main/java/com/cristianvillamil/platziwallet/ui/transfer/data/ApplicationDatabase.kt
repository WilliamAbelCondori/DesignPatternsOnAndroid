package com.cristianvillamil.platziwallet.ui.transfer.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

// heredamos de la clase room
@Database(entities = [TransferEntity::class], version = 1)
abstract class ApplicationDatabase : RoomDatabase(){

    // declaramos una funcion abstracta para poder obtener la instancias de nuestro
    // DAO y de esa manera realizamos operaciones con nuestra base de datos
    abstract fun getDAO():TransferDAO

    companion object {
        // Singleton
        private var INSTANCE: ApplicationDatabase? = null

        fun getAppDatabase(context: Context) : ApplicationDatabase?{
            if(INSTANCE==null){
                INSTANCE = Room.databaseBuilder(
                    context.applicationContext,
                    ApplicationDatabase::class.java,
                    "platziWalletDatabase"
                ).allowMainThreadQueries().build()
            }
            return INSTANCE
        }


        fun destroyInstance(){
            INSTANCE=null
        }
    }
}