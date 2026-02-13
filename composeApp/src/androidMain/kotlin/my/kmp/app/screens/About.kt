package my.kmp.app.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

@Composable
fun About(
    onOpenHome: () -> Unit,
    onOpenContact: () -> Unit
) {
    Column(verticalArrangement = Arrangement.spacedBy(12.dp)) {

        Text(text = "About Screen")

        Button(onClick = onOpenHome) {
            Text("Go to Home")
        }

        Button(onClick = onOpenContact) {
            Text("Go to Contact")
        }
    }
}
