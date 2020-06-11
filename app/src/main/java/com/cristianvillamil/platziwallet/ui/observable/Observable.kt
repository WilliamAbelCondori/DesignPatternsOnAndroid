package com.cristianvillamil.platziwallet.ui.observable

interface Observable {
    fun addObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers(newValue: Double) // es de tipo double porque estamos cambiando el valor del saldo
}