package com.example.simplebankinguiapp_kotlin.component

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simplebankinguiapp_kotlin.R
import com.example.simplebankinguiapp_kotlin.model.BankingCard
import com.example.simplebankinguiapp_kotlin.model.CardColor
import com.example.simplebankinguiapp_kotlin.ui.theme.BlueStart
import com.example.simplebankinguiapp_kotlin.ui.theme.GreenStart
import com.example.simplebankinguiapp_kotlin.ui.theme.OrangeStart
import com.example.simplebankinguiapp_kotlin.ui.theme.PurpleEnd
import com.example.simplebankinguiapp_kotlin.ui.theme.PurpleStart

@Preview
@Composable
fun CardSection() {
    LazyRow(){
        item {
            CommonCard(
                card = BankingCard(
                    "VISA",
                    "Business",
                    500.0,
                    "1234 5678 9012 3456",
                    CardColor(PurpleStart, PurpleEnd),
                    R.drawable.ic_visa))
        }
        item {
            CommonCard(
                card = BankingCard(
                    "MASTERCARD",
                    "Savings",
                    450.0,
                    "5347 1233 2456 9879",
                    CardColor(BlueStart, BlueStart),
                    R.drawable.ic_mastercard))
        }
        item {
            CommonCard(
                card = BankingCard(
                    "MASTERCARD",
                    "Learnings",
                    900.0,
                    "5347 3325 4567 5689",
                    CardColor(OrangeStart, OrangeStart),
                    R.drawable.ic_mastercard))
        }
        item {
            CommonCard(
                card = BankingCard(
                    "MASTERCARD",
                    "Trips",
                    600.0,
                    "5347 6300 4599 1278",
                    CardColor(GreenStart, GreenStart),
                    R.drawable.ic_mastercard))
        }
    }
}

@Composable
fun CommonCard(card: BankingCard) {
    Box(
        modifier = Modifier
            .padding(16.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(
                brush = Brush.horizontalGradient(
                    colors = listOf(card.color.startColor, card.color.endColor)
                )
            )
    ){
        Column(
            modifier = Modifier.padding(10.dp).width(250.dp).height(150.dp)
        ) {
            Image(
              painter = painterResource(id = card.image),
              contentDescription = card.name,
                modifier = Modifier
                    .padding(1.dp)
                    .width(50.dp)
                    .height(50.dp)
            )
            Text(text = card.name, color = Color.White , fontSize = 20.sp)
            Text(text = card.balance.toString(),color = Color.White, fontSize = 30.sp,  fontWeight = FontWeight.Bold)
            Text(text = card.number, color = Color.White, fontSize = 20.sp)
        }
    }
}