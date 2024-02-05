package com.example.cartedevisite

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartedevisite.ui.theme.CarteDeVisiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CarteDeVisiteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize(),

                    color = Color(0xfff0fff0)

                ) {
                    profil(name = "Rania Jaberi", emploi ="Android Developper" )
                    coordonnees(phone = "2233445566", share = "@AndroidDev", mail = "rania.jaberi.contact@gmail.com" )
                }

                }
                }
            }
        }

@Composable
fun profil (name: String, emploi: String, modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.rania)
    Column (
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = image,
            contentDescription = null,
            contentScale = ContentScale.None,
            modifier = Modifier
                .size(width = 100.dp, height = 150.dp))
        Text(text = name,
            fontSize = 34.sp)
        Text(text = emploi,
            color = Color(0xFF3ddc84))
    }

}
@Composable
fun coordonnees (phone: String, share: String, mail: String, modifier: Modifier = Modifier){
    Column( modifier = Modifier
        .padding(start = 100.dp, bottom = 45.dp),

        verticalArrangement = Arrangement.Bottom
        ) {
        Row(modifier = Modifier
            .padding(10.dp)) {
            Icon(
                imageVector = Icons.Default.Call,
                tint = Color(android.graphics.Color.parseColor("#3ddc84")),
                contentDescription = null
            )
            Text(text = phone)
        }
        Row(modifier = Modifier
            .padding(10.dp)) {
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = null,
                tint = Color(android.graphics.Color.parseColor("#3ddc84"))
            )
            Text(text = share)
        }
        Row(modifier = Modifier
            .padding(10.dp)) {
            Icon(
                imageVector = Icons.Default.Email,
                tint = Color(android.graphics.Color.parseColor("#3ddc84")),
                contentDescription = null
            )
            Text(text = mail)
        }
    }


}

