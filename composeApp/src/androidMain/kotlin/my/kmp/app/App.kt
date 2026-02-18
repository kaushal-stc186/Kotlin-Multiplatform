package my.kmp.app

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview
fun App() {
    val counterLogic = remember { CounterLogic() }
    var counterState by remember { mutableStateOf(defaultCounterState()) }

    MaterialTheme {
        Column(
            modifier = Modifier
                .statusBarsPadding()
                .navigationBarsPadding()
                .padding(10.dp)
        ) {
            Text(text = "${counterState.count}")

            Button(onClick = {
                counterState = counterLogic.inc(counterState)
            },
                shape = RoundedCornerShape(
                    topEnd = 5.dp,
                    topStart = 10.dp,
                    bottomEnd = 15.dp,
                    bottomStart = 20.dp
                ),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF000000)
                )


            ) {
                Text(text = "+")
            }
            Button(onClick = {
                counterState = counterLogic.dec(counterState)
            }) {
                Text(text = "-")
            }
        }
    }
}
