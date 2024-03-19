package com.example.simplebankinguiapp_kotlin.model

import androidx.compose.material3.CardColors
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

data class BankingCard(
    val type: String,
    val name: String,
    val balance: Double,
    val number: String,
    val color: CardColor,
    val image: Int
)

data class CardColor(
    val startColor: Color,
    val endColor: Color
)
