package com.example.hellofigma.uploadbookmange

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
 * book-mange
 *
 * This composable was generated from the UI Package 'upload_book_mange'.
 * Generated code; do not edit directly
 */
@Composable
fun UploadBookMange(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        SellList(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = -73.0.dp,
                    y = 180.0.dp
                )
            )
        ) {
            SellList2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 74.0.dp,
                        y = 144.0.dp
                    )
                )
            ) {
                BookDetail2 {
                    Background2(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Name2(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = -47.61130142211914.dp,
                                y = -43.958045959472656.dp
                            )
                        )
                    )
                    Price2(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = -47.61130142211914.dp,
                                y = -7.958045959472656.dp
                            )
                        )
                    )
                }
                Picture2(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -157.8688507080078.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
            SellList1 {
                BookDetail1 {
                    Background1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 73.0.dp,
                                y = 0.0.dp
                            )
                        )
                    )
                    Name1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = -84.61130142211914.dp,
                                y = -44.0.dp
                            )
                        )
                    )
                    Price1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = -84.61130142211914.dp,
                                y = -8.0.dp
                            )
                        )
                    )
                }
                DeleteBook(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 428.0.dp,
                            y = 0.0.dp
                        )
                    )
                ) {
                    Rectangle8(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 0.0.dp,
                                y = -10.660003662109375.dp
                            )
                        )
                    )
                    DeleteBook1(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.Center,
                            offset = DpOffset(
                                x = 4.875244140625.dp,
                                y = 26.499996185302734.dp
                            )
                        )
                    )
                }
                Picture1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -121.95552062988281.dp,
                            y = -10.660003662109375.dp
                        )
                    )
                )
            }
        }
        AddBook(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 285.396240234375.dp,
                    y = 110.0.dp
                )
            )
        ) {
            Rectangle9(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            AddBook1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.7304344177246094.dp,
                        y = 2.451507568359375.dp
                    )
                )
            )
        }
        Shop(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -132.0.dp,
                    y = -329.0.dp
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
                                y = 0.000091552734375.dp
                            )
                        )
                    )
                }
                SearchBar(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.TopStart,
                        offset = DpOffset(
                            x = 10.065185546875.dp,
                            y = 48.898345947265625.dp
                        )
                    )
                ) {
                    Input(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 0.03980005963487088.dp,
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
                                y = 1.5836219787597656.dp
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
private fun UploadBookMangePreview() {
    MaterialTheme {
        RelayContainer {
            UploadBookMange(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Background2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_book_mange_background2),
        modifier = modifier.requiredWidth(428.0.dp).requiredHeight(131.9160919189453.dp)
    )
}

@Composable
fun Name2(modifier: Modifier = Modifier) {
    RelayText(
        content = "書名",
        fontSize = 25.0.sp,
        fontFamily = inter,
        height = 1.210227279663086.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(78.18267059326172.dp).requiredHeight(26.0.dp)
    )
}

@Composable
fun Price2(modifier: Modifier = Modifier) {
    RelayText(
        content = "價錢",
        fontSize = 25.0.sp,
        fontFamily = inter,
        height = 1.210227279663086.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(78.18267059326172.dp).requiredHeight(26.0.dp)
    )
}

@Composable
fun BookDetail2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(428.0.dp).requiredHeight(131.9160919189453.dp)
    )
}

@Composable
fun Picture2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.upload_book_mange_picture2),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(112.26229858398438.dp).requiredHeight(132.0.dp)
    )
}

@Composable
fun SellList2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(428.0.dp).requiredHeight(132.0.dp)
    )
}

@Composable
fun Background1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_book_mange_background1),
        modifier = modifier.requiredWidth(502.0.dp).requiredHeight(132.0.dp)
    )
}

@Composable
fun Name1(modifier: Modifier = Modifier) {
    RelayText(
        content = "書名",
        fontSize = 25.0.sp,
        fontFamily = inter,
        height = 1.210227279663086.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(78.18267059326172.dp).requiredHeight(26.0.dp)
    )
}

@Composable
fun Price1(modifier: Modifier = Modifier) {
    RelayText(
        content = "價錢",
        fontSize = 25.0.sp,
        fontFamily = inter,
        height = 1.210227279663086.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(78.18267059326172.dp).requiredHeight(26.0.dp)
    )
}

@Composable
fun BookDetail1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(502.0.dp).requiredHeight(132.0.dp)
    )
}

@Composable
fun Rectangle8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_book_mange_rectangle_8),
        modifier = modifier.requiredWidth(74.17333984375.dp).requiredHeight(132.0.dp)
    )
}

@Composable
fun DeleteBook1(modifier: Modifier = Modifier) {
    RelayText(
        content = "刪除\n",
        fontSize = 25.0.sp,
        fontFamily = inter,
        height = 1.210227279663086.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(63.5771484375.dp).requiredHeight(100.31999969482422.dp)
    )
}

@Composable
fun DeleteBook(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 4.038461208343506,
        content = content,
        modifier = modifier.requiredWidth(74.17333984375.dp).requiredHeight(153.32000732421875.dp)
    )
}

@Composable
fun Picture1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.upload_book_mange_picture2),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(112.26229858398438.dp).requiredHeight(132.0.dp)
    )
}

@Composable
fun SellList1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(502.17333984375.dp).requiredHeight(153.32000732421875.dp)
    )
}

@Composable
fun SellList(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(502.17333984375.dp).requiredHeight(276.0.dp)
    )
}

@Composable
fun Rectangle9(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_book_mange_rectangle_9),
        modifier = modifier.requiredWidth(130.5998077392578.dp).requiredHeight(58.04632568359375.dp)
    )
}

@Composable
fun AddBook1(modifier: Modifier = Modifier) {
    RelayText(
        content = "上傳書籍",
        fontSize = 30.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(123.05677032470703.dp)
    )
}

@Composable
fun AddBook(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 15.0,
        content = content,
        modifier = modifier.requiredWidth(130.5998077392578.dp).requiredHeight(58.04632568359375.dp)
    )
}

@Composable
fun Shop(modifier: Modifier = Modifier) {
    RelayText(
        content = "你的賣場",
        fontSize = 30.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(144.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun Background(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_book_mange_background),
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
        image = painterResource(R.drawable.upload_book_mange_logo),
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
        vector = painterResource(R.drawable.upload_book_mange_input),
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
        vector = painterResource(R.drawable.upload_book_mange_vector),
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
        vector = painterResource(R.drawable.upload_book_mange_vector_2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 17.965087890625.dp,
                top = 17.96514892578125.dp,
                end = 0.00007009506225585938.dp,
                bottom = 0.000009059906005859375.dp
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
                top = 0.945526123046875.dp,
                end = 0.9455127716064453.dp,
                bottom = 0.9455432891845703.dp
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
        vector = painterResource(R.drawable.upload_book_mange_ellipse_1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 8.8212890625.dp,
                top = 0.000091552734375.dp,
                end = 9.801300048828125.dp,
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
        vector = painterResource(R.drawable.upload_book_mange_line_22),
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line24(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_book_mange_line_24),
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line23(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_book_mange_line_23),
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
