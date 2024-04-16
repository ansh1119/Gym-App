package com.example.gymapp.screens

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsEndWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gymapp.R


val InterFamily = FontFamily(
    Font(R.font.inter, FontWeight.Light),

)
val PoppinsFamily = FontFamily(
    Font(R.font.poppins, FontWeight.Light),

)

@Preview(showBackground = true)
@Composable
fun HomeScreen() {
    Surface(color = Color(0xFFDBD9D4),
    modifier= Modifier
        .padding(top = 40.dp)
        .fillMaxSize()) {
        Column (modifier= Modifier.verticalScroll(rememberScrollState())){
            Image(painter = painterResource(id = R.drawable.logo), contentDescription ="logo",
                Modifier
                    .fillMaxWidth(0.3f)
                    .padding(start = 10.dp)
                    .height(50.dp))

  Row(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp)){
                Text(text = "Welcome",
                    fontFamily = PoppinsFamily,
                    fontWeight = FontWeight.Medium,
                    fontSize = 24.sp,
                    color = Color(0xFF787879))
                Text(text = " Vipul!",
                    color = Color(0xFF313131),
                    fontSize = 24.sp,
                    fontFamily = PoppinsFamily,
                    fontWeight = FontWeight.Medium)
            }


            Spacer(Modifier.height(30.dp))


            Text(modifier= Modifier
                .fillMaxWidth()
                .padding(start = 10.dp),
                color = Color(0xFF313131),
                fontFamily = InterFamily,
                fontWeight = FontWeight.Bold,
                text = "\"A mind all logic is like a knife all blade. It makes the hand bleed that uses it\"")


            Spacer(modifier = Modifier.height(30.dp))


            Row {
                Card (colors = CardDefaults.cardColors(Color(0xFF9C9B98)),
                    modifier= Modifier
                        .padding(start = 10.dp)
                        .weight(0.3f)
                        .height(122.dp)){
                    Text(modifier= Modifier
                        .fillMaxWidth()
                        .padding(start = 40.dp),
                        text = "Status",
                        color = Color(0xFF70706E),
                        fontFamily = PoppinsFamily,
                        fontWeight = FontWeight.Bold)

                }

                Spacer(modifier = Modifier.width(10.dp))

                Card(colors = CardDefaults.cardColors(Color(0xFF9C9B98)),
                    modifier= Modifier
                        .padding(end = 10.dp)
                        .weight(0.5f)
                        .height(122.dp)) {
                    Text(text = "Owner's Message",
                        Modifier
                            .fillMaxWidth()
                            .padding(start = 60.dp),
                        color = Color(0xFF70706E),
                        fontFamily = PoppinsFamily,
                        fontWeight = FontWeight.Bold)
                }
            }


            Spacer(modifier = Modifier.height(16.dp))


            Row(verticalAlignment = Alignment.CenterVertically,
            modifier=Modifier.padding(start = 10.dp)) {
                Text(text = "Day at a glance",
                    fontFamily = InterFamily,
                    fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.width(6.dp))
                Card(colors = CardDefaults.cardColors(Color.Black),
                modifier=Modifier.padding(8.dp)) {
                    Text(text = "Today",
                        modifier = Modifier.padding(8.dp),
                        fontSize = 8.sp,
                        color = Color.White,
                        )
                }
            }



            Spacer(modifier = Modifier.height(16.dp))


            Row (
                Modifier
                    .fillMaxWidth()
                    .padding(start = 10.dp)
                    .padding(end = 10.dp)){
                Card(modifier= Modifier
                    .weight(0.4f)
                    .height(257.dp),
                    colors = CardDefaults.cardColors(Color(0xFF131313))) {
                }
                Column(modifier= Modifier
                    .weight(0.4f)
                    .height(257.dp)
                    .padding(start = 10.dp)) {
                    Card (modifier= Modifier
                        .weight(0.4f)
                        .fillMaxWidth(),
                        colors = CardDefaults.cardColors(Color(0xFFBF4846))){
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    Card(modifier= Modifier
                        .weight(0.4f)
                        .fillMaxWidth(),
                        colors = CardDefaults.cardColors(Color(0xFF131313))) {
                    }
                }
            }
//            Spacer(modifier = Modifier.height(80.dp))
            Row(modifier= Modifier
                .fillMaxWidth()
                .padding(start = 10.dp)
                .padding(end = 10.dp)) {

                Spacer(modifier = Modifier.weight(0.5f))
                Button(
                    onClick = { /*TODO*/ },
                    shape = CircleShape,
                    modifier=Modifier
                        .weight(0.2f)
                    ,
                    colors = ButtonDefaults.buttonColors(Color(0xFF131313)),
                ) {
                    Image(painter = painterResource(id = R.drawable.baseline_add_24), contentDescription = "add")
                }
            }
        }

    }
}