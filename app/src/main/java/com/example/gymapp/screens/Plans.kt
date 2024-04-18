package com.example.gymapp.screens

import android.app.Activity
import android.content.Context
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.gymapp.R
import com.example.gymapp.components.Payment


@Composable
fun Plans(navController: NavHostController, context: Context, ob: Payment, activity: Activity) {

    val InterFamily = FontFamily(
        Font(R.font.inter, FontWeight.Light),

        )
    val PoppinsFamily = FontFamily(
        Font(R.font.poppins, FontWeight.Light),
    )


    Surface(modifier = Modifier.fillMaxSize(),
        color=Color(0xFFDAD9D4)) {
        Column(modifier=Modifier.padding(10.dp),) {
            Image(painter = painterResource(id = R.drawable.logo), contentDescription = "logo")


            Text(text = "Say Hello to your\nbest self.",
                fontFamily = PoppinsFamily,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold)


            Text(modifier=Modifier.padding(top=10.dp),
                text = "Choose your Subscription Plan",
                fontFamily = PoppinsFamily,
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium)

            Divider(modifier=Modifier.padding(top=30.dp, bottom = 15.dp),)


            var opt1 by remember{ mutableStateOf(false) }
            var opt2 by remember{ mutableStateOf(false) }
            var opt3 by remember{ mutableStateOf(false) }
            var opt4 by remember{ mutableStateOf(false) }

            var color1 by remember{mutableStateOf(Color.Black)}
            var color2 by remember{mutableStateOf(Color.Black)}
            var color3 by remember{mutableStateOf(Color.Black)}
            var color4 by remember{mutableStateOf(Color.Black)}

            OutlinedCard(modifier= Modifier
                .padding(10.dp)
                .padding(bottom=10.dp)
                .fillMaxWidth(),
                colors = CardDefaults.cardColors(Color.Transparent),
                border= BorderStroke(2.dp,color1))
            {
                Row(modifier=Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(selected = opt1,
                        onClick = { opt1=true;opt2=false;opt3=false;opt4=false},)
                    Column(modifier=Modifier.padding(10.dp)) {
                        if(opt1){
                            color1=Color.Red
                        }
                        else
                            color1=Color.Black
                        Text(text = "FlexMax",
                            fontFamily = PoppinsFamily,
                            fontSize = 16.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold)


                        Text(text = "Duration:1 Month",
                            fontFamily = PoppinsFamily,
                            fontSize = 12.sp,
                            color=Color.Black,
                            fontWeight=FontWeight.Bold)
                    }
                    Spacer(modifier = Modifier.weight(.7f))
                    Text(modifier=Modifier
                        .padding(end=10.dp),
                        fontFamily = PoppinsFamily,
                        fontSize = 16.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        text = "₹1200/-",
                    )
                }
            }


            OutlinedCard(modifier= Modifier
                .padding(10.dp)
                .padding(bottom=10.dp)
                .fillMaxWidth(),
                colors = CardDefaults.cardColors(Color.Transparent),
                border= BorderStroke(2.dp,color2),
            ) {
                Row(modifier=Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(selected = opt2, onClick = { opt2=true;opt1=false;opt3=false;opt4=false  })
                    Column(modifier=Modifier.padding(10.dp)) {
                        if(opt2){
                            color2=Color.Red
                        }
                        else
                            color2=Color.Black
                        Text(fontFamily = PoppinsFamily,
                            fontSize = 16.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            text = "EndurePro")


                        Text(fontFamily = PoppinsFamily,
                            fontSize = 12.sp,
                            color=Color.Black,
                            fontWeight=FontWeight.Bold,
                            text = "Duration:3 Months")
                    }
                    Spacer(modifier = Modifier.weight(.7f))
                    Text(modifier=Modifier
                        .padding(end=10.dp),
                        fontFamily = PoppinsFamily,
                        fontSize = 16.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        text = "₹3000/-")
                }

            }


            OutlinedCard(modifier= Modifier
                .padding(10.dp)
                .padding(bottom=10.dp)
                .fillMaxWidth(),
                colors = CardDefaults.cardColors(Color.Transparent),
                border= BorderStroke(2.dp,color3)) {
                Row(modifier=Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(selected = opt3, onClick = { opt3=true;opt1=false;opt2=false;opt4=false })
                    Column (modifier=Modifier.padding(10.dp)){
                        if(opt3){
                            color3=Color.Red
                        }
                        else
                            color3=Color.Black
                        Text(fontFamily = PoppinsFamily,
                            fontSize = 16.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            text = "StrengthPrime")


                        Text(fontFamily = PoppinsFamily,
                            fontSize = 12.sp,
                            color=Color.Black,
                            fontWeight=FontWeight.Bold,
                            text = "Duration:6 Months")
                    }
                    Spacer(modifier = Modifier.weight(.7f))
                    Text(modifier=Modifier
                        .padding(end=10.dp),
                        fontFamily = PoppinsFamily,
                        fontSize = 16.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        text = "₹6000/-")
                }

            }


            OutlinedCard(modifier= Modifier
                .padding(10.dp)
                .padding(bottom=10.dp)
                .fillMaxWidth(),
                colors = CardDefaults.cardColors(Color.Transparent),
                border= BorderStroke(2.dp,color4)) {
                Row(modifier=Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(selected = opt4, onClick = { opt4=true;opt1=false;opt2=false;opt3=false })
                    Column(modifier=Modifier.padding(10.dp)){
                        if(opt4){
                            color4=Color.Red
                        }
                        else
                            color4=Color.Black
                        Text(fontFamily = PoppinsFamily,
                            fontSize = 16.sp,
                            color = Color.Black,
                            fontWeight = FontWeight.Bold,
                            text = "FitMaster")


                        Text(fontFamily = PoppinsFamily,
                            fontSize = 12.sp,
                            color=Color.Black,
                            fontWeight=FontWeight.Bold,
                            text = "Duration:1 Year")
                    }
                    Spacer(modifier = Modifier.weight(.7f))
                    Text(modifier=Modifier
                        .padding(end=10.dp),
                        fontFamily = PoppinsFamily,
                        fontSize = 16.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold,
                        text = "₹10000/-")
                }

            }
            Row(modifier=Modifier
                .fillMaxWidth()
                .padding(top=30.dp),
                horizontalArrangement = Arrangement.Center){
                Button(modifier=Modifier.fillMaxWidth(.6f),
                    colors = ButtonDefaults.buttonColors(Color(0xFF131313)),
                    onClick = { ob.startPayment(context, activity) }) {
                    Text(text = "Pay Now",
                        fontSize = 20.sp)
                }
            }


        }
    }
}