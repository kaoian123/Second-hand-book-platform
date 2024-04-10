package com.example.hellofigma.listorderdetail

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
import androidx.compose.ui.text.style.TextAlign
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
 * This composable was generated from the UI Package 'list_order_detail'.
 * Generated code; do not edit directly
 */
@Composable
fun ListOrderDetail(modifier: Modifier = Modifier) {
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
                        y = -7.363951500222605.dp
                    )
                )
            )
        }
        Check(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -1.0.dp,
                    y = -239.0.dp
                )
            )
        )
        BookDetail(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 36.213623046875.dp,
                    y = 173.5980224609375.dp
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
            OrderInfo(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 31.786376953125.dp,
                        y = 53.4019775390625.dp
                    )
                )
            ) {
                Seller(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 126.72852325439453.dp
                        )
                    )
                )
                Time(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 61.38404083251953.dp
                        )
                    )
                )
                Price(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 8.91057014465332.dp
                        )
                    )
                )
                Name(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = -50.49348258972168.dp
                        )
                    )
                )
                Number(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = -119.79804801940918.dp
                        )
                    )
                )
            }
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
                        y = 0.5352344512939453.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 398, heightDp = 725)
@Composable
private fun ListOrderDetailPreview() {
    MaterialTheme {
        RelayContainer {
            ListOrderDetail(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Ellipse73(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.list_order_detail_ellipse_73),
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(42.0.dp)
    )
}

@Composable
fun Arrow1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.list_order_detail_arrow_1),
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
fun Check(modifier: Modifier = Modifier) {
    RelayText(
        content = "訂單確認",
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
        vector = painterResource(R.drawable.list_order_detail_rectangle_152),
        modifier = modifier.requiredWidth(323.335693359375.dp).requiredHeight(407.947021484375.dp)
    )
}

@Composable
fun Seller(modifier: Modifier = Modifier) {
    RelayText(
        content = "賣家：xxx",
        fontSize = 25.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(286.8609313964844.dp).requiredHeight(45.54304504394531.dp)
    )
}

@Composable
fun Time(modifier: Modifier = Modifier) {
    RelayText(
        content = "訂單成立時間：xx/xx/xx",
        fontSize = 25.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(286.8609313964844.dp).requiredHeight(45.54304504394531.dp)
    )
}

@Composable
fun Price(modifier: Modifier = Modifier) {
    RelayText(
        content = "價格：XXX",
        fontSize = 25.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(286.8609313964844.dp).requiredHeight(59.40396499633789.dp)
    )
}

@Composable
fun Name(modifier: Modifier = Modifier) {
    RelayText(
        content = "書名：XXX",
        fontSize = 25.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(286.8609313964844.dp).requiredHeight(59.40396499633789.dp)
    )
}

@Composable
fun Number(modifier: Modifier = Modifier) {
    RelayText(
        content = "訂單編號：XXXXXXX",
        fontSize = 25.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(286.8609313964844.dp).requiredHeight(59.40396499633789.dp)
    )
}

@Composable
fun OrderInfo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(286.8609313964844.dp).requiredHeight(299.00006103515625.dp)
    )
}

@Composable
fun BookDetail(
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
        vector = painterResource(R.drawable.list_order_detail_rectangle_153),
        modifier = modifier.requiredWidth(176.9999542236328.dp).requiredHeight(39.613975524902344.dp)
    )
}

@Composable
fun Send1(modifier: Modifier = Modifier) {
    RelayText(
        content = "確認",
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
