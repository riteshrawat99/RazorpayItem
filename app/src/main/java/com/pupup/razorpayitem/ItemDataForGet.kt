package com.pupup.razorpayitem

data class ItemDataForGet(
    val count: Int,
    val entity: String,
    val items: List<Item>
)