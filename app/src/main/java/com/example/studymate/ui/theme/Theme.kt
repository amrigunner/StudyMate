package com.example.studymate.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val LightColorScheme = lightColorScheme(
    primary = ButtonPink,
    secondary = SoftPink,
    background = SoftCream,
    surface = SoftCream,
    onPrimary = DarkGrey,
    onBackground = DarkGrey,
    onSurface = DarkGrey,
)

@Composable
fun StudyMateTheme(
    content: @Composable () -> Unit
) {
    val colorScheme = LightColorScheme
    val view = LocalView.current

    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            // This makes the status bar color match your app's background
            window.statusBarColor = colorScheme.background.toArgb()
            // This ensures status bar icons (time, battery) are dark/visible
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = true
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}