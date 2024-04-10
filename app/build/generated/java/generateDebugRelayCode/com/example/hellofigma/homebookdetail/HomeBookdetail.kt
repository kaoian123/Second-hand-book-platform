package com.example.hellofigma.homebookdetail

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
import androidx.compose.ui.text.style.TextAlign
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
 * bookdetail
 *
 * This composable was generated from the UI Package 'home_bookdetail'.
 * Generated code; do not edit directly
 */
@Composable
fun HomeBookdetail(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Send(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 107.0.dp,
                    y = 853.0.dp
                )
            )
        ) {
            BackgroundS2(
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
                        x = 1.7440414428710938.dp,
                        y = 0.6976690292358398.dp
                    )
                )
            )
        }
        Bookdetail {
            Picture(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -234.92759704589844.dp
                    )
                )
            )
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
                Arrow0(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = -7.363890465066355.dp
                        )
                    )
                )
            }
            SellerDetail(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 695.0.dp
                    )
                )
            ) {
                BackgroundS(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                PhoneNumber(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -98.0.dp,
                            y = 39.5.dp
                        )
                    )
                )
                Name1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -138.0.dp,
                            y = -22.5.dp
                        )
                    )
                )
            }
            Detail(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 455.0.dp
                    )
                )
            ) {
                BackgroundD(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Introduce(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -138.0.dp,
                            y = -82.18857097625732.dp
                        )
                    )
                )
                Illustrate(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -138.0.dp,
                            y = 29.811429023742676.dp
                        )
                    )
                )
            }
            Name(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 370.0.dp
                    )
                )
            ) {
                BackgroundN(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Bookname(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -160.71999740600586.dp,
                            y = 3.5191688537597656.dp
                        )
                    )
                )
                Price(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 145.28000259399414.dp,
                            y = 3.5191688537597656.dp
                        )
                    )
                )
            }
        }
    }
}

@Preview(widthDp = 430, heightDp = 932)
@Composable
private fun HomeBookdetailPreview() {
    MaterialTheme {
        RelayContainer {
            HomeBookdetail(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun BackgroundS2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_bookdetail_background_s2),
        modifier = modifier.requiredWidth(193.25137329101562.dp).requiredHeight(51.6267204284668.dp)
    )
}

@Composable
fun Send1(modifier: Modifier = Modifier) {
    RelayText(
        content = "下訂",
        fontSize = 27.90633773803711.sp,
        fontFamily = inter,
        height = 1.2102272455433198.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(126.97383117675781.dp).requiredHeight(27.906335830688477.dp).wrapContentHeight(
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
        modifier = modifier.requiredWidth(193.25137329101562.dp).requiredHeight(51.6267204284668.dp)
    )
}

@Composable
fun Picture(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.home_bookdetail_picture),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(352.1448059082031.dp)
    )
}

@Composable
fun Ellipse73(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_bookdetail_ellipse_73),
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(42.0.dp)
    )
}

@Composable
fun Arrow0(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_bookdetail_arrow_0),
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
fun BackgroundS(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_bookdetail_background_s),
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(127.0.dp)
    )
}

@Composable
fun PhoneNumber(modifier: Modifier = Modifier) {
    RelayText(
        content = "賣家聯絡方式",
        fontSize = 30.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(208.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun Name1(modifier: Modifier = Modifier) {
    RelayText(
        content = "賣家名稱",
        fontSize = 30.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(128.0.dp).requiredHeight(46.0.dp)
    )
}

@Composable
fun SellerDetail(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(127.0.dp)
    )
}

@Composable
fun BackgroundD(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_bookdetail_background_d),
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(222.0.dp)
    )
}

@Composable
fun Introduce(modifier: Modifier = Modifier) {
    RelayText(
        content = "書本介紹",
        fontSize = 30.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(128.0.dp).requiredHeight(21.62285804748535.dp)
    )
}

@Composable
fun Illustrate(modifier: Modifier = Modifier) {
    RelayText(
        content = "書況",
        fontSize = 30.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(128.0.dp).requiredHeight(21.62285804748535.dp)
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
        content = content,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(222.0.dp)
    )
}

@Composable
fun BackgroundN(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.home_bookdetail_background_n),
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(67.0.dp)
    )
}

@Composable
fun Bookname(modifier: Modifier = Modifier) {
    RelayText(
        content = "書名",
        fontSize = 30.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(82.56000518798828.dp).requiredHeight(41.64905548095703.dp)
    )
}

@Composable
fun Price(modifier: Modifier = Modifier) {
    RelayText(
        content = "價格",
        fontSize = 30.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(82.56000518798828.dp).requiredHeight(41.64905548095703.dp)
    )
}

@Composable
fun Name(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(67.0.dp)
    )
}

@Composable
fun Bookdetail(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(822.0.dp)
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
            red = 227,
            green = 227,
            blue = 227
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
