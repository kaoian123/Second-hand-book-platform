package com.example.hellofigma.homeordernumber

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.hellofigma.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * order-number
 *
 * This composable was generated from the UI Package 'home_order_number'.
 * Generated code; do not edit directly
 */
@Composable
fun HomeOrderNumber(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        BackArrow(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 12.0.dp,
                    y = 15.0.dp
                )
            )
        ) {
            Ellipse73(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Arrow1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -7.363890465066298.dp
                    )
                )
            )
        }
        OrderNumber(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 9.0.dp,
                    y = -117.0.dp
                )
            )
        )
        Number(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 51.0.dp,
                    y = 179.0.dp
                )
            )
        ) {
            Rectangle152(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            OrderNumber1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Send(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 110.0.dp,
                    y = 396.0.dp
                )
            )
        ) {
            Rectangle153(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.CenterStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -5.399492263793945.dp
                    )
                ).rowWeight(1.0f)
            )
            Send1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.CenterStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 14.5.dp
                    )
                ).rowWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 378, heightDp = 481)
@Composable
private fun HomeOrderNumberPreview() {
    MaterialTheme {
        RelayContainer {
            HomeOrderNumber(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Ellipse73(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_order_number_ellipse_73),
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(42.0.dp)
    )
}

@Composable
fun Arrow1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_order_number_arrow_1),
        modifier = modifier.requiredWidth(26.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun BackArrow(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(42.0.dp)
    )
}

@Composable
fun OrderNumber(modifier: Modifier = Modifier) {
    RelayText(
        content = "訂單編號",
        fontSize = 61.957183837890625.sp,
        fontFamily = inter,
        height = 1.2102272027614835.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(264.0.dp).requiredHeight(65.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Rectangle152(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_order_number_rectangle_152),
        modifier = modifier.requiredWidth(294.0.dp).requiredHeight(172.0.dp)
    )
}

@Composable
fun OrderNumber1(modifier: Modifier = Modifier) {
    RelayText(
        content = "訂單編號\nxxxxxxxx",
        fontSize = 27.90633773803711.sp,
        fontFamily = inter,
        height = 1.2102272455433198.em,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.0.dp,
                top = 18.0.dp,
                end = 15.0.dp,
                bottom = 31.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Number(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 27.90633773803711,
        content = content,
        modifier = modifier.requiredWidth(294.0.dp).requiredHeight(172.0.dp)
    )
}

@Composable
fun Rectangle153(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_order_number_rectangle_153),
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(39.613975524902344.dp)
    )
}

@Composable
fun Send1(modifier: Modifier = Modifier) {
    RelayText(
        content = "確認\n",
        fontSize = 27.90633773803711.sp,
        fontFamily = inter,
        height = 1.2102272455433198.em,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 30.0.dp,
                top = 0.0.dp,
                end = 30.703948974609375.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).requiredHeight(21.412960052490234.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Send(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 13.953168869018555,
        content = content,
        modifier = modifier.requiredWidth(176.9999542236328.dp).requiredHeight(50.412960052490234.dp)
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
