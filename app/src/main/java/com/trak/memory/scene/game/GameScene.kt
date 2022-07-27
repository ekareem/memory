package com.trak.memory.scene.game

import androidx.compose.foundation.layout.Box
import androidx.compose.material.Text
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.trak.memory.ui.theme.MemoryTheme

@Composable fun GameScene(
    modifier: Modifier = Modifier
) {
    Box(modifier = modifier, contentAlignment = Alignment.Center) {
        Text(
            text = "GAME SCENE",
            style = MaterialTheme.typography.titleLarge,
        )
    }
}

@Preview(showSystemUi = true)
@Composable fun GameScenePreview() {
    MemoryTheme {
        GameScene(
            Modifier
        )
    }
}