package com.trak.memory.scene.game

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.trak.memory.R
import com.trak.memory.scene.game.viewModel.GameViewModel
import com.trak.memory.ui.theme.MemoryTheme

@Composable fun GameScene(
    gameViewModel: GameViewModel = GameViewModel()
) {
    Box(modifier = Modifier, contentAlignment = Alignment.Center) {
        painterResource(id = R.drawable.ic_set).run {
            Image(
                painter = this,
                contentDescription = "",
                modifier = Modifier.fillMaxSize(),
                contentScale = if (intrinsicSize.width > intrinsicSize.height)
                    ContentScale.FillHeight else ContentScale.FillWidth
            )
        }
    }
}

@Preview()
@Composable fun GameScenePreview() {

    MemoryTheme {
        GameScene()
    }
}