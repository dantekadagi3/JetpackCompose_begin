package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme

                }
            }
        }
    }
@Composable
fun business(){
Column(modifier= Modifier
    .fillMaxSize()
    .background(color = Color.Black)
) {
    Column (modifier=Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center){
Image(painter = painterResource(id = R.drawable.logo), contentDescription ="logo",
    modifier=Modifier.clip(RoundedCornerShape(percent = 50))
        .size(width = 100.dp, height = 100.dp)
        .align(Alignment.CenterHorizontally))
        Text(text = "Dante kadagi",
        color=Color.White,
            fontSize =40.sp,
            textAlign= TextAlign.Center,
            modifier = Modifier.padding(start=80.dp))
        Text(text = "Android Developer Extraordinaire",
            color=Color(color=0xff006400),
            fontSize =15.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start=80.dp)
        )
    }

}
    Column(modifier=Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        Row (modifier=Modifier,
            Arrangement.Absolute.SpaceBetween
        ){
         Icon(imageVector = Icons.Default.Call, contentDescription ="call", 
         tint = Color.White,
            // modifier=Modifier.padding(end = 12.dp)
         )
            Text(text = "+11(123)444 555 666",
                color= Color.White,
                fontSize = 20.sp,
               )
        }
        Row (modifier=Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            ){
            Icon(imageVector = Icons.Default.Share, contentDescription ="call",
                tint = Color.White,
               // modifier=Modifier.padding(end = 65.dp)
            )
            Text(text = "@AndroidDev",
                color= Color.White,
                fontSize = 20.sp,
                modifier=Modifier.padding(5.dp))
        }
        Row (modifier=Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,

            ){
            Icon(imageVector = Icons.Default.Email, contentDescription ="call",
                tint = Color.White,
               // modifier=Modifier.padding(end = 12.dp)
            )
            Spacer(modifier=Modifier.width(10.dp))
            Text(text = "jen.doe@android.com",
                color= Color.White,
                fontSize = 20.sp
               )
        }
    }
}
@Preview
@Composable
fun businessPreview(){
    business();
}

