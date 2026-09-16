package com.github.maomao.service

import android.app.Service
import com.github.maomao.common.BroadcastAction
import com.github.maomao.common.GlobalState
import com.github.maomao.common.sendBroadcast

interface ManagedService {
    fun start()

    fun stop()
}

internal fun Service.notifyVpnStartRequested() {
    GlobalState.log("VPN start requested")
    BroadcastAction.VPN_START_REQUESTED.sendBroadcast()
}

internal fun Service.notifyVpnRevoked() {
    GlobalState.log("VPN permission revoked")
    BroadcastAction.VPN_REVOKED.sendBroadcast()
}
