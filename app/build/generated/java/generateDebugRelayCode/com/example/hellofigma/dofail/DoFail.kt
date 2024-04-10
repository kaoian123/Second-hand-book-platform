package com.example.hellofigma.dofail

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.hellofigma.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * do-fail
 *
 * This composable was generated from the UI Package 'do_fail'.
 * Generated code; do not edit directly
 */
@Composable
fun DoFail(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        FailText(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 2.8619842529296875.dp,
                    y = 38.013004302978516.dp
                )
            )
        )
        Check(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 83.0950927734375.dp,
                    y = 355.509765625.dp
                )
            )
        ) {
            Rectangle11(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Check1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 1.1961212158203125.dp,
                        y = -0.3294658660888672.dp
                    )
                )
            )
        }
        Fail1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 143.0.dp,
                    y = 62.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 430, heightDp = 500)
@Composable
private fun DoFailPreview() {
    MaterialTheme {
        RelayContainer {
            DoFail(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun FailText(modifier: Modifier = Modifier) {
    RelayText(
        content = "XX失敗",
        fontSize = 53.07563781738281.sp,
        fontFamily = inter,
        height = 1.2102272188226364.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(295.2332458496094.dp).requiredHeight(72.31555938720703.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Rectangle11(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_fail_rectangle_11),
        modifier = modifier.requiredWidth(266.6167907714844.dp).requiredHeight(63.988033294677734.dp)
    )
}

@Composable
fun Check1(modifier: Modifier = Modifier) {
    RelayText(
        content = "確認",
        fontSize = 34.66018295288086.sp,
        fontFamily = inter,
        height = 1.210227230829459.em,
        modifier = modifier
    )
}

@Composable
fun Check(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 7.998503684997559,
        content = content,
        modifier = modifier.requiredWidth(266.6167907714844.dp).requiredHeight(63.988033294677734.dp)
    )
}

@Composable
fun Fail1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.do_fail_fail_1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(144.0.dp).requiredHeight(145.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        backgroundColor = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
