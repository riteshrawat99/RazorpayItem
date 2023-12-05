package com.pupup.razorpayitem

data class ItemDataForPost(
    val amount: Int,
    val currency: String,
    val description: String,
    val name: String
)