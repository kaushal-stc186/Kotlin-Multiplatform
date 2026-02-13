package my.kmp.app

import android.app.Activity
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.view.WindowCompat
import androidx.compose.foundation.layout.Column

@Composable
@Preview
fun App() {
    MaterialTheme {

        // 🔵 Status bar styling
        val view = LocalView.current
        val window = (view.context as Activity).window

        SideEffect {
            @Suppress("DEPRECATION")
            window.statusBarColor = android.graphics.Color.WHITE

            WindowCompat.getInsetsController(window, window.decorView)
                ?.isAppearanceLightStatusBars = true
        }

        // 🔵 Safe area wrapper
        Column(
            modifier = Modifier
                .statusBarsPadding()
                .navigationBarsPadding()
        ) {
            AppNavigation()
        }
    }
}
