package com.example.localdrop.domain.model

class TransferMessage(
    val text : String,
    val isFromMe : Boolean,
    val timestamp : Long
)