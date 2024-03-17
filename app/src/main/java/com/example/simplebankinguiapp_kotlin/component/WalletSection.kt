package com.example.simplebankinguiapp_kotlin.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Wallet
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun WalletSection() {
   Row(
       modifier = Modifier
           .fillMaxWidth().padding(16.dp),
       verticalAlignment = Alignment.CenterVertically,
       horizontalArrangement = Arrangement.SpaceBetween

   ){
       Column {
              Text(
                text = "Wallet",
                 // style = MaterialTheme.typography.headlineSmall,
                  fontSize = 17.sp,
                  color = MaterialTheme.colorScheme.onSurface,
              )
              Spacer(modifier = Modifier.height(8.dp))
           Text(
                 text = "$ 50.000",
               fontSize = 25.sp,
               fontWeight = FontWeight.Bold,
                // style = MaterialTheme.typography.headlineMedium,
               color = MaterialTheme.colorScheme.onSurface
                  )

   }
       Box(
           modifier = Modifier
               .clip(RoundedCornerShape(15.dp))
               .background(MaterialTheme.colorScheme.secondaryContainer)
               .padding(8.dp)
               .clickable { /*TODO*/ },
           contentAlignment = Alignment.TopEnd
       ) {
           Column {
               Icon(
                   imageVector = Icons.Filled.Search,
                   contentDescription = "Search",
                   tint = MaterialTheme.colorScheme.onSecondaryContainer
               )
           }
       }
   }
}