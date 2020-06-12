package com.cristianvillamil.platziwallet.ui.home.presenter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.cristianvillamil.platziwallet.UserSingleton
import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor
import com.cristianvillamil.platziwallet.ui.home.data.User

class HomePresenter(private val view: HomeContract.View) : HomeContract.Presenter {

    private val homeInteractor: HomeInteractor = HomeInteractor()

    // es mutableliveData porque va a cambiar en tiempo de ejecucion
    private val percentageLiveData: MutableLiveData<String> = MutableLiveData()

    override fun retrieveFavoriteTransfers() {
        view.showLoader()
        homeInteractor.retrieveFavoriteTransferFromCache(object : HomeContract.OnResponseCallback {
            override fun onResponse(favoriteTransfer: List<FavoriteTransfer>) {
                //UserSingleton.getInstance().userName="Hola"

                val user = User.Builder()
                    .setUserName("Hola")
                    .setPassword("otra")
                    .build()

                percentageLiveData.value = "40%"

                view.hideLoader()
                view.showFavoriteTransfers(favoriteTransfer)
            }
        })
    }

    override fun getPercentageLiveData(): LiveData<String> = percentageLiveData



}