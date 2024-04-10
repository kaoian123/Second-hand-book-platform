package com.example.hellofigma.homeorderdetail

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
 *
 * home-order-detail
 *
 * This composable was generated from the UI Package 'home_order_detail'.
 * Generated code; do not edit directly
 */
@Composable
fun HomeOrderDetail(modifier: Modifier = Modifier) {
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
        OrderDetail(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -1.0.dp,
                    y = -239.0.dp
                )
            )
        )
        Detail(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 36.2135009765625.dp,
                    y = 173.59799194335938.dp
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
            BookName(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -6.38134765625.dp,
                        y = -127.07150268554688.dp
                    )
                )
            )
            Count(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -6.88134765625.dp,
                        y = -44.071502685546875.dp
                    )
                )
            )
            SellerName(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -6.38134765625.dp,
                        y = 38.928497314453125.dp
                    )
                )
            )
            SellerPhone(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -6.38134765625.dp,
                        y = 114.42849731445312.dp
                    )
                )
            )
        }
        Send(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 107.0.dp,
                    y = 625.0.dp
                )
            )
        ) {
            Rectangle153(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Send1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 1.5973663330078125.dp,
                        y = 0.5353336334228516.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 398, heightDp = 725)
@Composable
private fun HomeOrderDetailPreview() {
    MaterialTheme {
        RelayContainer {
            HomeOrderDetail(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Ellipse73(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_order_detail_ellipse_73),
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(42.0.dp)
    )
}

@Composable
fun Arrow1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_order_detail_arrow_1),
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
fun OrderDetail(modifier: Modifier = Modifier) {
    RelayText(
        content = "訂單明細",
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
        vector = painterResource(R.drawable.home_order_detail_rectangle_152),
        modifier = modifier.requiredWidth(323.335693359375.dp).requiredHeight(407.947021484375.dp)
    )
}

@Composable
fun BookName(modifier: Modifier = Modifier) {
    RelayText(
        content = "書名：xxx",
        fontSize = 27.90633773803711.sp,
        fontFamily = inter,
        height = 1.2102272455433198.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(143.0.dp).requiredHeight(43.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Count(modifier: Modifier = Modifier) {
    RelayText(
        content = "小計：\$ xxx",
        fontSize = 27.90633773803711.sp,
        fontFamily = inter,
        height = 1.2102272455433198.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(162.0.dp).requiredHeight(43.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun SellerName(modifier: Modifier = Modifier) {
    RelayText(
        content = "賣家：xxx",
        fontSize = 27.90633773803711.sp,
        fontFamily = inter,
        height = 1.2102272455433198.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(167.0.dp).requiredHeight(43.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun SellerPhone(modifier: Modifier = Modifier) {
    RelayText(
        content = "賣家聯絡方式：xxxx",
        fontSize = 27.90633773803711.sp,
        fontFamily = inter,
        height = 1.2102272455433198.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(307.0.dp).requiredHeight(28.0.dp).wrapContentHeight(
            align = Alignment.CenterVertically,
            unbounded = true
        )
    )
}

@Composable
fun Detail(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 27.90633773803711,
        content = content,
        modifier = modifier.requiredWidth(323.335693359375.dp).requiredHeight(407.947021484375.dp)
    )
}

@Composable
fun Rectangle153(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_order_detail_rectangle_153),
        modifier = modifier.requiredWidth(176.9999542236328.dp).requiredHeight(39.613975524902344.dp)
    )
}

@Composable
fun Send1(modifier: Modifier = Modifier) {
    RelayText(
        content = "確認送出",
        fontSize = 27.90633773803711.sp,
        fontFamily = inter,
        height = 1.2102272455433198.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(116.29600524902344.dp).requiredHeight(21.412960052490234.dp).wrapContentHeight(
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
        modifier = modifier.requiredWidth(176.9999542236328.dp).requiredHeight(39.613975524902344.dp)
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
