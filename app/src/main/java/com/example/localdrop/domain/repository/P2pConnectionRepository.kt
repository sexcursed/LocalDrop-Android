package com.example.localdrop.domain.repository

import com.example.localdrop.domain.model.NetworkDevice
import com.example.localdrop.domain.model.TransferMessage
import kotlinx.coroutines.flow.Flow

interface P2pConnectionRepository {

    fun startServer() : Flow<TransferMessage>

    suspend fun stopServer()

    suspend fun sendMessage(targetDevice : NetworkDevice, text : String)
}