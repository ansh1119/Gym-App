package com.example.gymapp.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gymapp.R

@Preview(showBackground = true)
@Composable
fun navbar() {
    Box(modifier = Modifier){
        Row (modifier= Modifier
            .background(Color.Black)
            .fillMaxWidth()
            .fillMaxHeight(.4f),
            verticalAlignment = Alignment.CenterVertically

        ){

            var button1 by remember{mutableStateOf(false)}
            var button2 by remember{mutableStateOf(false)}
            var button3 by remember{mutableStateOf(false)}
            var color1 by remember {
                mutableStateOf(Color.Transparent)
            }
            var color2 by remember {
                mutableStateOf(Color.Transparent)
            }
            var color3 by remember {
                mutableStateOf(Color.Transparent)
            }


            Button(modifier=Modifier
                .weight(1f)
                .padding(start=5.dp),
                colors = ButtonDefaults.buttonColors(color1),
                onClick = { button1=true }) {
                Column(modifier=Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painter = painterResource(id = R.drawable.baseline_person_24), contentDescription = "icon 1")
                    if(button1) {
                        Text(text = "Home",
                            modifier=Modifier.fillMaxWidth(),
                            fontSize = 12.sp)
                        button2=false
                        button3=false
                        color1=Color.Red
                    }
                    else
                        color1=Color.Transparent
                }
            }


            Button(modifier=Modifier
                .weight(1f),
                colors = ButtonDefaults.buttonColors(color2),
                onClick = { button2=true }) {
               Column(modifier=Modifier.fillMaxWidth(),
                   horizontalAlignment = Alignment.CenterHorizontally) {
                   Image(painter = painterResource(id = R.drawable.baseline_person_24), contentDescription = "icon 2")
                   if(button2) {
                       Text(text = "Home",
                           modifier=Modifier.fillMaxWidth(),
                           fontSize = 12.sp)
                       button1=false
                       button3=false
                       color2=Color.Red
                   }
                   else
                       color2=Color.Transparent
               }
            }


            Button(modifier=Modifier
                .weight(1f)
                .padding(end=5.dp),
                colors = ButtonDefaults.buttonColors(color3),
                onClick = { button3=true }) {
                Column(modifier=Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(painter = painterResource(id = R.drawable.baseline_person_24), contentDescription = "icon 3")
                    if(button3) {
                        button1=false
                        button2=false
                        Text(text = "Home",
                            modifier=Modifier.fillMaxWidth(),
                            fontSize = 12.sp)
                        color3 = Color.Red
                    }
                    else
                        color3=Color.Transparent
                }
            }
        }
    }
}