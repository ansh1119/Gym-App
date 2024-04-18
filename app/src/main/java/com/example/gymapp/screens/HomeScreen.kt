package com.example.gymapp.screens

import android.app.Activity
import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.gymapp.R
import com.example.gymapp.components.navbar


val InterFamily = FontFamily(
    Font(R.font.inter, FontWeight.Light),

)
val PoppinsFamily = FontFamily(
    Font(R.font.poppins, FontWeight.Light),

)

@Composable
fun HomeScreen(navController: NavHostController, ) {

    val context = LocalContext.current
    Surface(color = Color(0xFFDAD9D4),
    modifier= Modifier
        .fillMaxSize()) {
        Column (modifier= Modifier
            .padding(top = 20.dp)
            .verticalScroll(rememberScrollState())){
            Image(painter = painterResource(id = R.drawable.logo), contentDescription ="logo",
                Modifier
                    .fillMaxWidth(0.3f)
                    .padding(start = 10.dp)
                    .height(50.dp))

  Row(
      Modifier
          .fillMaxWidth()
          .padding(start = 10.dp)){
                Text(text = "Welcome,",
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


            Spacer(Modifier.height(5.dp))

            Divider(color=Color(0xFFC6C6C6), thickness = 2.dp,
                modifier=Modifier.padding(start=10.dp, end = 10.dp))

            Spacer(modifier = Modifier.height(30.dp))


            Text(modifier= Modifier
                .fillMaxWidth()
                .padding(start = 10.dp),
                fontSize = 16.sp,
                color = Color(0xFF313131),
                fontFamily = InterFamily,
                fontWeight = FontWeight.Bold,
                text = "\"A mind all logic is like a knife all blade. It makes the hand bleed that uses it\"")


            Spacer(Modifier.height(15.dp))

            Divider(color=Color(0xFFC6C6C6), thickness = 2.dp,
                modifier=Modifier.padding(start=10.dp, end = 10.dp))

            Spacer(modifier = Modifier.height(15.dp))


            Row {
                Card (colors = CardDefaults.cardColors(Color(0xFF9C9B98)),
                    modifier= Modifier
                        .padding(start = 10.dp)
                        .weight(0.3f)
                        .defaultMinSize(minHeight = 122.dp),
                    elevation = CardDefaults.cardElevation(10.dp)){
                    Text(modifier= Modifier
                        .fillMaxWidth()
                        .padding(start = 35.dp, top = 5.dp),
                        fontSize = 16.sp,
                        text = "Status",
                        color = Color.White,
                        fontFamily = PoppinsFamily,
                        fontWeight = FontWeight.Bold)

                }

                Spacer(modifier = Modifier.width(40.dp))

                Card(colors = CardDefaults.cardColors(Color(0xFF9C9B98)),
                    modifier= Modifier
                        .padding(end = 10.dp)
                        .weight(0.5f)
                        .defaultMinSize(minHeight = 122.dp),
                    elevation = CardDefaults.cardElevation(10.dp)) {
                    Text(text = "Owner's Message",
                        Modifier
                            .fillMaxWidth()
                            .padding(start = 40.dp, top = 5.dp),
                        fontSize = 16.sp,
                        color = Color.White,

                        fontFamily = PoppinsFamily,
                        fontWeight = FontWeight.Bold)
                }
            }


            Spacer(modifier = Modifier.height(24.dp))


            Row(verticalAlignment = Alignment.CenterVertically,
            modifier=Modifier.padding(start = 10.dp)) {
                Text(text = "Day at a glance",
                    fontSize = 16.sp,
                    fontFamily = InterFamily,
                    fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.width(6.dp))
                Card(colors = CardDefaults.cardColors(Color.Black),
                modifier= Modifier
                    .width(80.dp)
                    .padding(4.dp)
                    ) {
                    Text(text = "Today",
                        modifier = Modifier
                            .fillMaxHeight(.8f)
                            .fillMaxWidth()
                            .padding(start = 20.dp),
                        fontSize = 12.sp,
                        color = Color.White,
                        )
                }
            }



            Spacer(modifier = Modifier.height(24.dp))


            Row (
                Modifier
                    .fillMaxSize()
                    .padding(start = 10.dp)
                    .padding(end = 10.dp)){
                Card(modifier= Modifier
                    .weight(0.3f)
                    .defaultMinSize(minHeight = 257.dp),
                    elevation = CardDefaults.cardElevation(10.dp),
                    colors = CardDefaults.cardColors(Color(0xFF131313))) {
                }
                Spacer(modifier = Modifier.width(20.dp))
                Column(modifier= Modifier
                    .weight(0.3f)
                    .defaultMinSize(minHeight = 257.dp)
                    .padding(start = 10.dp)) {
                    Card (modifier= Modifier
                        .weight(0.4f)
                        .fillMaxWidth(),
                        elevation = CardDefaults.cardElevation(10.dp),
                        colors = CardDefaults.cardColors(Color(0xFFBF4846))){
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    Card(modifier= Modifier
                        .weight(0.4f)
                        .fillMaxWidth(),
                        colors = CardDefaults.cardColors(Color(0xFF131313)),
                        elevation = CardDefaults.cardElevation(10.dp)) {
                    }
                }
            }
            Spacer(modifier = Modifier.height(80.dp))

            Row(modifier= Modifier
                .fillMaxWidth()
                .padding(start = 10.dp)
                .padding(end = 10.dp)
                .weight(0.05f),
                verticalAlignment = Alignment.CenterVertically) {


                Box(modifier = Modifier
                    .fillMaxWidth(.7f)
                    .clip(RoundedCornerShape(20.dp))) {
                    navbar()
                }


                Spacer(modifier = Modifier.weight(0.5f))
                Button(
                    onClick = {navController.navigate("plans")},
                    shape = CircleShape,
                    modifier= Modifier
                        .size(70.dp)
                        .clip(RoundedCornerShape(20.dp)),
                    colors = ButtonDefaults.buttonColors(Color(0xFF131313)),
                ) {
                    Image(modifier=Modifier
                        .fillMaxSize(),
                        painter = painterResource(id = R.drawable.baseline_add_24),
                        contentDescription = "add")
                }
            }
        }

    }
}