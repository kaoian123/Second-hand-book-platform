package com.example.hellofigma.listdone

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
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
 * This composable was generated from the UI Package 'list_done'.
 * Generated code; do not edit directly
 */
@Composable
fun ListDone(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        OderRescords2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 470.0.dp
                )
            )
        ) {
            Background2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            OrderInfo2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 145.0.dp,
                        y = 17.0.dp
                    )
                )
            ) {
                Seller2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 64.0.dp
                        )
                    )
                )
                Time2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 31.0.dp
                        )
                    )
                )
                Price2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 4.5.dp
                        )
                    )
                )
                Name2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = -25.5.dp
                        )
                    )
                )
                Number2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = -60.5.dp
                        )
                    )
                )
            }
            Picture2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -151.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        OderRescords1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 269.0.dp
                )
            )
        ) {
            Background10(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            OrderInfo1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 145.0.dp,
                        y = 17.0.dp
                    )
                )
            ) {
                Seller1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 64.0.dp
                        )
                    )
                )
                Time1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 31.0.dp
                        )
                    )
                )
                Price1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 4.5.dp
                        )
                    )
                )
                Name1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = -25.5.dp
                        )
                    )
                )
                Number1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = -60.5.dp
                        )
                    )
                )
            }
            Picture1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -151.0.dp,
                        y = 0.0.dp
                    )
                )
            )
        }
        Switch(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 76.0.dp,
                    y = 198.0.dp
                )
            )
        ) {
            Selected(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 151.0.dp,
                        y = 0.0.dp
                    )
                )
            ) {
                BackgroundSE(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Done(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 11.5.dp,
                            y = 0.5.dp
                        )
                    )
                )
            }
            Loading(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -93.5.dp,
                        y = -6.0.dp
                    )
                )
            )
        }
        OrderHistory(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 17.0.dp,
                    y = -318.0.dp
                )
            )
        )
        DoUpNavbar(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = -417.0.dp
                )
            )
        ) {
            Navbar {
                Background(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = -0.000012814999536203686.dp,
                            y = -0.000002920627821367816.dp
                        )
                    )
                )
                User(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 332.0.dp,
                            y = 10.0.dp
                        )
                    )
                ) {
                    Name(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 38.0.dp,
                                y = 3.0.dp
                            )
                        )
                    )
                    Logo(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0001220703125.dp
                            )
                        )
                    )
                }
                SearchBar(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 10.065185546875.dp,
                            y = 48.8983154296875.dp
                        )
                    )
                ) {
                    Input(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.03967798932237088.dp,
                                y = 0.5474475895417079.dp
                            )
                        )
                    )
                    Content(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 11.934814453125.dp,
                                y = 7.1016845703125.dp
                            )
                        )
                    )
                    MagnifyingGlassGlassSearchMagnifying(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 8.934814453125.dp,
                                y = 7.1016845703125.dp
                            )
                        )
                    ) {
                        MagnifyingGlassGlassSearchMagnifying1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                            Vector(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -0.5.dp,
                                        y = -0.5.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                            Vector2(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -0.5.dp,
                                        y = -0.5.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                        }
                    }
                }
                Logo(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 63.0.dp,
                            y = 5.0.dp
                        )
                    )
                ) {
                    Ellipse1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Logo1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.CenterStart,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 1.5835609436035156.dp
                            )
                        ).rowWeight(1.0f)
                    )
                }
                Menu(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 13.0.dp,
                            y = 15.0.dp
                        )
                    )
                ) {
                    Line22(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -6.5.dp,
                                y = -2.5.dp
                            )
                        )
                    )
                    Line24(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -6.5.dp,
                                y = 17.5.dp
                            )
                        )
                    )
                    Line23(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = -6.5.dp,
                                y = 7.5.dp
                            )
                        )
                    )
                }
            }
        }
    }
}

@Preview(widthDp = 430, heightDp = 932)
@Composable
private fun ListDonePreview() {
    MaterialTheme {
        RelayContainer {
            ListDone(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Background2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.list_done_background2),
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(185.0.dp)
    )
}

@Composable
fun Seller2(modifier: Modifier = Modifier) {
    RelayText(
        content = "賣家：xxx",
        fontSize = 20.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(238.0.dp)
    )
}

@Composable
fun Time2(modifier: Modifier = Modifier) {
    RelayText(
        content = "訂單成立時間：xx/xx/xx",
        fontSize = 20.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(238.0.dp)
    )
}

@Composable
fun Price2(modifier: Modifier = Modifier) {
    RelayText(
        content = "價格：XXX",
        fontSize = 20.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(238.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Name2(modifier: Modifier = Modifier) {
    RelayText(
        content = "書名：XXX",
        fontSize = 20.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(238.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Number2(modifier: Modifier = Modifier) {
    RelayText(
        content = "訂單編號：XXXXXXX",
        fontSize = 20.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(238.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun OrderInfo2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(238.0.dp).requiredHeight(151.0.dp)
    )
}

@Composable
fun Picture2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.list_done_picture2),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(128.0.dp).requiredHeight(185.0.dp)
    )
}

@Composable
fun OderRescords2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(185.0.dp)
    )
}

@Composable
fun Background10(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.list_done_background10),
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(185.0.dp)
    )
}

@Composable
fun Seller1(modifier: Modifier = Modifier) {
    RelayText(
        content = "賣家：xxx",
        fontSize = 20.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(238.0.dp)
    )
}

@Composable
fun Time1(modifier: Modifier = Modifier) {
    RelayText(
        content = "訂單成立時間：xx/xx/xx",
        fontSize = 20.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(238.0.dp)
    )
}

@Composable
fun Price1(modifier: Modifier = Modifier) {
    RelayText(
        content = "價格：XXX",
        fontSize = 20.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(238.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Name1(modifier: Modifier = Modifier) {
    RelayText(
        content = "書名：XXX",
        fontSize = 20.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(238.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Number1(modifier: Modifier = Modifier) {
    RelayText(
        content = "訂單編號：XXXXXXX",
        fontSize = 20.0.sp,
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(238.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun OrderInfo1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(238.0.dp).requiredHeight(151.0.dp)
    )
}

@Composable
fun Picture1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.list_done_picture2),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(128.0.dp).requiredHeight(185.0.dp)
    )
}

@Composable
fun OderRescords1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(185.0.dp)
    )
}

@Composable
fun BackgroundSE(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.list_done_background_se),
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(55.0.dp)
    )
}

@Composable
fun Done(modifier: Modifier = Modifier) {
    RelayText(
        content = "已完成",
        fontSize = 25.457273483276367.sp,
        height = 1.1718750128774806.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(109.0.dp).requiredHeight(30.0.dp)
    )
}

@Composable
fun Selected(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 33.943031311035156,
        content = content,
        modifier = modifier.requiredWidth(152.0.dp).requiredHeight(55.0.dp)
    )
}

@Composable
fun Loading(modifier: Modifier = Modifier) {
    RelayText(
        content = "進行中",
        fontSize = 25.457273483276367.sp,
        height = 1.1718750128774806.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(116.0.dp).requiredHeight(13.0.dp)
    )
}

@Composable
fun Switch(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 33.943031311035156,
        content = content,
        modifier = modifier.requiredWidth(303.0.dp).requiredHeight(55.0.dp)
    )
}

@Composable
fun OrderHistory(modifier: Modifier = Modifier) {
    RelayText(
        content = "訂單紀錄",
        fontSize = 40.731632232666016.sp,
        height = 1.1718749604895429.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(210.0.dp).requiredHeight(68.0.dp)
    )
}

@Composable
fun Background(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.list_done_background),
        modifier = modifier.requiredWidth(430.0000305175781.dp).requiredHeight(98.00000762939453.dp)
    )
}

@Composable
fun Name(modifier: Modifier = Modifier) {
    RelayText(
        content = "user",
        fontSize = 20.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(48.97219467163086.dp).requiredHeight(24.062732696533203.dp)
    )
}

@Composable
fun Logo(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.list_done_logo),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(31.93838882446289.dp).requiredHeight(30.078414916992188.dp)
    )
}

@Composable
fun User(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(86.97219848632812.dp).requiredHeight(30.078414916992188.dp)
    )
}

@Composable
fun Input(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.list_done_input),
        modifier = modifier.requiredWidth(408.5320129394531.dp).requiredHeight(40.11106872558594.dp)
    )
}

@Composable
fun Content(modifier: Modifier = Modifier) {
    RelayText(
        content = "搜尋書本",
        fontSize = 20.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(186.4157257080078.dp).requiredHeight(23.763568878173828.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.list_done_vector),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 3.7821388244628906.dp,
                bottom = 3.7821388244628906.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.list_done_vector_2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 17.9652099609375.dp,
                top = 17.9652099609375.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MagnifyingGlassGlassSearchMagnifying1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.945556640625.dp,
                top = 0.945556640625.dp,
                end = 0.9455127716064453.dp,
                bottom = 0.9455127716064453.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MagnifyingGlassGlassSearchMagnifying(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(26.4749698638916.dp).requiredHeight(26.4749698638916.dp)
    )
}

@Composable
fun SearchBar(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(408.6114196777344.dp).requiredHeight(41.205963134765625.dp)
    )
}

@Composable
fun Ellipse1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.list_done_ellipse_1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.8211669921875.dp,
                top = 0.0001220703125.dp,
                end = 9.801422119140625.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Logo1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Logo",
        fontSize = 15.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        maxLines = -1,
        modifier = modifier.fillMaxWidth(1.0f).requiredHeight(20.90398406982422.dp)
    )
}

@Composable
fun Logo(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(62.298248291015625.dp).requiredHeight(40.54106140136719.dp)
    )
}

@Composable
fun Line22(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.list_done_line_22),
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line24(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.list_done_line_24),
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line23(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.list_done_line_23),
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Menu(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(20.0.dp)
    )
}

@Composable
fun Navbar(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(98.0.dp)
    )
}

@Composable
fun DoUpNavbar(
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
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(98.0.dp)
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
