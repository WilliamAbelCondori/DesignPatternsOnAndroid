package com.cristianvillamil.platziwallet.ui.observable

class AvailableBalanceObservable: Observable {
    private val amountObserverList : ArrayList<Observer> = arrayListOf()
    private var amount:Double = 0.0


    fun changeAmount(newValue : Double){
        amount=newValue
        notifyObservers(amount)
    }

    // a qui nos suscribimos como observadores
    override fun addObserver(observer: Observer) {
        amountObserverList.add(observer)
    }

    // o en algun evento como en el onDestroy nos vamos a desuscribir
    override fun removeObserver(observer: Observer) {
        amountObserverList.remove(observer)
    }

    // cuando vamos a generar uncambio y notificar este cambio hacemos lo siguiente :
    override fun notifyObservers(newValue: Double) {
        amountObserverList.forEach{
            it.notifyChange(newValue)
        }
    }
}