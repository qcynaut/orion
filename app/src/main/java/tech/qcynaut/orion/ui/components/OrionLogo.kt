package tech.qcynaut.orion.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import tech.qcynaut.orion.R

@Composable
fun OrionLogo(size: Dp) {
    Box(
        modifier = Modifier
            .size(size)
            .padding(5.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.logo_outer),
            contentDescription = null,
        )
        Image(
            painter = painterResource(R.drawable.logo_inner),
            contentDescription = null,
        )
    }
}

@Composable
@Preview
fun OrionLogoPreview() {
    OrionLogo(100.dp)
}