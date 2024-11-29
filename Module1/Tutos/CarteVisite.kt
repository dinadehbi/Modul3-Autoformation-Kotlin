package com.example.helloandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloandroid.ui.theme.HelloAndroidTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color

class MainActivity4 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloAndroidTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ContentImage2(
                        message = "Boulevard de la Corn, Casablanca, Maroc\n",
                        title = "Ville CasaBlanca",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }
    }
}



@Composable
fun ContentImage2(message: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.mosqu_e)
    val backgroundImage: Painter = painterResource(R.drawable.i) // Load the "sky" image

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = backgroundImage,
            contentDescription = null,
            modifier = Modifier.fillMaxSize()
            .alpha(0.5f),
            contentScale = ContentScale.Crop
        )

        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = title,
                fontSize = 40.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(30.dp),
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )

            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(300.dp)
                    .border(BorderStroke(6.dp,Color.White))
                    .clip(RoundedCornerShape(20.dp))
            )
            Text(
                text = message,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(30.dp),
                color = Color.Black,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CartVisitePreview() {
    HelloAndroidTheme {
        ContentImage2(title = "Ville : CasaBlanca\n", message = "\n Boulevard de la Corniche, Casablanca, Maroc\n")
    }
}
