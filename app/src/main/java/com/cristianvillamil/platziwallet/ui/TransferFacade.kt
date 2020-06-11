package com.cristianvillamil.platziwallet.ui

//esta clase nos ayuda a encapsular todos los subsistemas
class TransferFacade {
    val analyticsManager: AnalyticsManager = AnalyticsManager()
    val securityManager = SecurityManager()
    val transferManager : TransferManager = TransferManager()

    fun transfer() {
        val token = securityManager.getToken()
        analyticsManager.registerTransfer(token)
        transferManager.transfer(token)

    }
}