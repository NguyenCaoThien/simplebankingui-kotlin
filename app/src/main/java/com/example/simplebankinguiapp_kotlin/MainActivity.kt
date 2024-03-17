package com.example.simplebankinguiapp_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.annotation.ColorInt
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.simplebankinguiapp_kotlin.component.BottomNavigationBar
import com.example.simplebankinguiapp_kotlin.ui.theme.SimpleBankingUIAppKotlinTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleBankingUIAppKotlinTheme {
                // A surface container using the 'background' color from the theme
                SetBarColor(color = MaterialTheme.colorScheme.background)
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    HomeScreen();
                }
            }
        }
    }
}

@Composable
private fun SetBarColor(color: Color) {
//    val systemUiController = rememberSystemUiController();
//    SideEffect {
//        systemUiController.setSystemBarsColor(color = color)
//    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreen () {
  // A scaffold contain bottom bar
   Scaffold(
       bottomBar = {
        BottomNavigationBar()
       }
   )
   {
       padding -> Column(modifier = Modifier
       .fillMaxSize()
       .padding(padding)) {
           // Wallet section Content of the screen
           Spacer(modifier = Modifier.height(16.dp))
       }
   }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SimpleBankingUIAppKotlinTheme {
        Greeting("Android")
    }
}