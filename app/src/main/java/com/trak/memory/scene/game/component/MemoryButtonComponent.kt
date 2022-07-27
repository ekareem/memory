package com.trak.memory.scene.game.component

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.trak.memory.R
import com.trak.memory.ui.theme.MemoryTheme
import com.trak.memory.ui.theme.spacing

@Composable fun MemoryButtonComponent(
    icon: Int,
    contentDescription: String,
    containerColor: Color,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = {
            onClick()
        },
        border = BorderStroke(
            4.dp,
            MaterialTheme.colorScheme.background
        ),
        colors = ButtonDefaults.buttonColors(containerColor = containerColor),
        modifier = modifier
    ) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = contentDescription,
            tint = MaterialTheme.colorScheme.surface,
            modifier = Modifier
                .fillMaxSize()
                .aspectRatio(1f)
                .padding(MaterialTheme.spacing.extraSmall)
        )
    }
}

@Preview(widthDp = 145, heightDp = 145)
@Composable fun MemoryButtonComponentPreview() {
    val context = LocalContext.current
    MemoryTheme(
        darkTheme = true
    ) {
        MemoryButtonComponent(
            R.drawable.ic_cloud,
            "",
            Color.Yellow,
            {
                Toast.makeText(
                    context,
                    "memory button clicked",
                    Toast.LENGTH_SHORT
                ).show()
            }
        )
    }
}