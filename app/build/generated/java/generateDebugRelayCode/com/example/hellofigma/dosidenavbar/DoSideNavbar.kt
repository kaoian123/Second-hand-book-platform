package com.example.hellofigma.dosidenavbar

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
 * sideNavbar
 *
 * This composable was generated from the UI Package 'do_side_navbar'.
 * Generated code; do not edit directly
 */
@Composable
fun DoSideNavbar(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Sidebar {
            Image4(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            Option(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 19.0.dp,
                        y = 205.0.dp
                    )
                )
            ) {
                Logout(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 652.0.dp
                        )
                    )
                ) {
                    Background(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Logout(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 32.0.dp,
                                y = -4.5.dp
                            )
                        )
                    )
                }
                Setting(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 3.83154296875.dp,
                            y = 215.0224609375.dp
                        )
                    )
                ) {
                    Setting(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 35.584228515625.dp,
                                y = 2.4887771606445312.dp
                            )
                        )
                    )
                    Settings(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = -77.3482723236084.dp,
                                y = -1.7808971405029297.dp
                            )
                        )
                    ) {
                        Vector96(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = -1.0.dp,
                                    y = -1.0.dp
                                )
                            ).rowWeight(1.0f).columnWeight(1.0f)
                        )
                        Vector12(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = -1.0.dp,
                                    y = -1.0.dp
                                )
                            ).rowWeight(1.0f).columnWeight(1.0f)
                        )
                    }
                }
                Notification(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 3.83154296875.dp,
                            y = 161.224609375.dp
                        )
                    )
                ) {
                    News(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 35.584228515625.dp,
                                y = 2.8877487182617188.dp
                            )
                        )
                    )
                    Mail(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = -77.3482723236084.dp,
                                y = -2.179777145385742.dp
                            )
                        )
                    ) {
                        Vector97(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = -1.0.dp,
                                    y = -1.0.dp
                                )
                            ).rowWeight(1.0f).columnWeight(1.0f)
                        )
                        Vector78(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = -1.0.dp,
                                    y = -1.0.dp
                                )
                            ).rowWeight(1.0f).columnWeight(1.0f)
                        )
                    }
                }
                ManageBook(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 5.0.dp,
                            y = 110.0.dp
                        )
                    )
                ) {
                    BookMange(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 35.0.dp,
                                y = 1.5.dp
                            )
                        )
                    )
                    OpenBookContentBooksBookOpen(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = -77.2528076171875.dp,
                                y = -1.2808990478515625.dp
                            )
                        )
                    ) {
                        OpenBookContentBooksBookOpen1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                            Vector11(
                                modifier = Modifier.boxAlign(
                                    alignment = Alignment.TopStart,
                                    offset = DpOffset(
                                        x = -0.5.dp,
                                        y = -0.5.dp
                                    )
                                ).rowWeight(1.0f).columnWeight(1.0f)
                            )
                            Vector23(
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
                OrderRecords(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 1.0.dp,
                            y = 49.382080078125.dp
                        )
                    )
                ) {
                    History(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 37.0.dp,
                                y = 5.808929443359375.dp
                            )
                        )
                    )
                    Order(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = -75.93258285522461.dp,
                                y = -2.269664764404297.dp
                            )
                        )
                    ) {
                        Rectangle25(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = -1.0.dp,
                                    y = -1.0.dp
                                )
                            ).rowWeight(1.0f).columnWeight(1.0f)
                        )
                        Vector59(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = -1.0.dp,
                                    y = -1.0.dp
                                )
                            ).rowWeight(1.0f).columnWeight(1.0f)
                        )
                        Vector60(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = -1.0.dp,
                                    y = -1.0.dp
                                )
                            ).rowWeight(1.0f).columnWeight(1.0f)
                        )
                        Vector61(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = -1.0.dp,
                                    y = -1.0.dp
                                )
                            ).rowWeight(1.0f).columnWeight(1.0f)
                        )
                    }
                }
                Home(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 4.0.dp,
                            y = 0.0.dp
                        )
                    )
                ) {
                    Home1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 35.5.dp,
                                y = 2.5.dp
                            )
                        )
                    )
                    Home4HomeHouseRoofShelter(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                        Vector(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.Center,
                                offset = DpOffset(
                                    x = -0.5.dp,
                                    y = -6.2582197189331055.dp
                                )
                            )
                        )
                        Vector2(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.Center,
                                offset = DpOffset(
                                    x = -0.5002470016479492.dp,
                                    y = 5.2581377029418945.dp
                                )
                            )
                        )
                    }
                }
            }
            UserPicture(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 41.0.dp,
                        y = 32.0.dp
                    )
                )
            ) {
                UserPicture1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                User(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.5.dp,
                            y = -0.5.dp
                        )
                    )
                )
            }
        }
    }
}

@Preview(widthDp = 215, heightDp = 932)
@Composable
private fun DoSideNavbarPreview() {
    MaterialTheme {
        RelayContainer {
            DoSideNavbar(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Image4(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.do_side_navbar_image_4),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(215.0.dp).requiredHeight(932.0.dp)
    )
}

@Composable
fun Background(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_side_navbar_background),
        modifier = modifier.requiredWidth(171.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun Logout(modifier: Modifier = Modifier) {
    RelayText(
        content = "登出",
        fontSize = 20.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(107.0.dp).requiredHeight(15.0.dp)
    )
}

@Composable
fun Logout(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 6.221674919128418,
        content = content,
        modifier = modifier.requiredWidth(171.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun Setting(modifier: Modifier = Modifier) {
    RelayText(
        content = "設定",
        fontSize = 20.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(117.505615234375.dp).requiredHeight(32.561798095703125.dp)
    )
}

@Composable
fun Vector96(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_side_navbar_vector_96),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.741455078125.dp,
                top = 12.741455078125.dp,
                end = 12.741690635681152.dp,
                bottom = 12.741690635681152.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector12(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_side_navbar_vector_12),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.415771484375.dp,
                top = 1.415771484375.dp,
                end = 1.415689468383789.dp,
                bottom = 1.415689468383789.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Settings(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(33.9775276184082.dp).requiredHeight(33.9775276184082.dp)
    )
}

@Composable
fun Setting(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(188.674072265625.dp).requiredHeight(37.53932189941406.dp)
    )
}

@Composable
fun News(modifier: Modifier = Modifier) {
    RelayText(
        content = "消息通知",
        fontSize = 20.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(117.505615234375.dp).requiredHeight(32.561798095703125.dp)
    )
}

@Composable
fun Vector97(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_side_navbar_vector_97),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.83154296875.dp,
                top = 5.662841796875.dp,
                end = 2.831378936767578.dp,
                bottom = 5.663000106811523.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector78(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_side_navbar_vector_78),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.83154296875.dp,
                top = 8.494384765625.dp,
                end = 2.831378936767578.dp,
                bottom = 15.573030471801758.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Mail(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(33.9775276184082.dp).requiredHeight(33.9775276184082.dp)
    )
}

@Composable
fun Notification(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(188.674072265625.dp).requiredHeight(38.33708190917969.dp)
    )
}

@Composable
fun BookMange(modifier: Modifier = Modifier) {
    RelayText(
        content = "書本管理",
        fontSize = 20.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(117.505615234375.dp).requiredHeight(32.561798095703125.dp)
    )
}

@Composable
fun Vector11(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_side_navbar_vector_11),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 15.321423530578613.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector23(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_side_navbar_vector_23),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 15.321533203125.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun OpenBookContentBooksBookOpen1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.178466796875.dp,
                top = 1.178466796875.dp,
                end = 1.1786327362060547.dp,
                bottom = 1.1789112091064453.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun OpenBookContentBooksBookOpen(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        content = content,
        modifier = modifier.requiredWidth(33.0.dp).requiredHeight(33.0.dp)
    )
}

@Composable
fun ManageBook(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(187.505615234375.dp).requiredHeight(35.561798095703125.dp)
    )
}

@Composable
fun History(modifier: Modifier = Modifier) {
    RelayText(
        content = "訂單紀錄",
        fontSize = 20.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(117.505615234375.dp).requiredHeight(32.561798095703125.dp)
    )
}

@Composable
fun Rectangle25(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_side_navbar_rectangle_25),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.258544921875.dp,
                top = 6.606689453125.dp,
                end = 8.258308410644531.dp,
                bottom = 4.955106735229492.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector59(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_side_navbar_vector_59),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 14.865234375.dp,
                top = 14.865234375.dp,
                end = 14.865102767944336.dp,
                bottom = 24.77521514892578.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector60(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_side_navbar_vector_60),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 14.865234375.dp,
                top = 21.471923828125.dp,
                end = 14.865102767944336.dp,
                bottom = 18.16852569580078.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector61(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_side_navbar_vector_61),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 14.865234375.dp,
                top = 28.07861328125.dp,
                end = 18.168473720550537.dp,
                bottom = 11.561836242675781.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Order(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(39.64044952392578.dp).requiredHeight(39.64044952392578.dp)
    )
}

@Composable
fun OrderRecords(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(191.505615234375.dp).requiredHeight(44.179779052734375.dp)
    )
}

@Composable
fun Home1(modifier: Modifier = Modifier) {
    RelayText(
        content = "首頁",
        fontSize = 20.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(117.505615234375.dp).requiredHeight(32.561798095703125.dp)
    )
}

@Composable
fun Vector(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_side_navbar_vector),
        modifier = modifier.requiredWidth(33.2696647644043.dp).requiredHeight(16.63483238220215.dp)
    )
}

@Composable
fun Vector2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_side_navbar_vector_2),
        modifier = modifier.requiredWidth(23.0328426361084.dp).requiredHeight(16.63483238220215.dp)
    )
}

@Composable
fun Home4HomeHouseRoofShelter(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 155.2359504699707.dp,
                bottom = 9.410526275634766.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Home(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(188.505615234375.dp).requiredHeight(37.561798095703125.dp)
    )
}

@Composable
fun Option(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(192.505615234375.dp).requiredHeight(690.0.dp)
    )
}

@Composable
fun UserPicture1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_side_navbar_user_picture),
        modifier = modifier.requiredWidth(119.0.dp).requiredHeight(119.0.dp)
    )
}

@Composable
fun User(modifier: Modifier = Modifier) {
    RelayText(
        content = "user",
        fontSize = 30.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        modifier = modifier
    )
}

@Composable
fun UserPicture(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(119.0.dp).requiredHeight(119.0.dp)
    )
}

@Composable
fun Sidebar(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(215.0.dp).requiredHeight(932.0.dp)
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
