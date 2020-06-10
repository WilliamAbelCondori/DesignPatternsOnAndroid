package com.cristianvillamil.platziwallet.ui.home.presenter

import com.cristianvillamil.platziwallet.UserSingleton
import com.cristianvillamil.platziwallet.ui.home.FavoriteTransfer
import com.cristianvillamil.platziwallet.ui.home.HomeContract
import com.cristianvillamil.platziwallet.ui.home.data.HomeInteractor

class HomePresenter(private val view: HomeContract.View) : HomeContract.Presenter {

    private val homeInteractor: HomeInteractor = HomeInteractor()
    override fun retrieveFavoriteTransfers() {
        view.showLoader()
        homeInteractor.retrieveFavoriteTransferFromCache(object : HomeContract.OnResponseCallback {
            override fun onResponse(favoriteTransfer: List<FavoriteTransfer>) {
                UserSingleton.getInstance().userName="Hola"

                view.hideLoader()
                view.showFavoriteTransfers(favoriteTransfer)
            }
        })
    }



}