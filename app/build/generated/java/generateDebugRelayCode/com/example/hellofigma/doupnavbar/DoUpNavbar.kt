package com.example.hellofigma.doupnavbar

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
 * upNavbar
 *
 * This composable was generated from the UI Package 'do_up_navbar'.
 * Generated code; do not edit directly
 */
@Composable
fun DoUpNavbar(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Navbar {
            Background(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.000002443789526296314.dp,
                        y = 8.940694442571839e-7.dp
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
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 18.999998092651367.dp,
                            y = -0.007841110229492188.dp
                        )
                    )
                )
                Logo(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -27.516904830932617.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
            SearchBar(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 10.065185546875.dp,
                        y = 48.8984375.dp
                    )
                )
            ) {
                Input(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.00009669049424587683.dp,
                            y = 3.8495186416298566e-7.dp
                        )
                    )
                )
                Content(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -99.16303253173828.dp,
                            y = -1.6196346282958984.dp
                        )
                    )
                )
                MagnifyingGlassGlassSearchMagnifying(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -182.1334104537964.dp,
                            y = -0.2639341354370117.dp
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
                Ellipse1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -0.4900054931640625.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Logo1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 1.5835609436035156.dp
                        )
                    )
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
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -6.5.dp,
                            y = -12.5.dp
                        )
                    )
                )
                Line24(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -6.5.dp,
                            y = 7.5.dp
                        )
                    )
                )
                Line23(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -6.5.dp,
                            y = -2.5.dp
                        )
                    )
                )
            }
        }
    }
}

@Preview(widthDp = 430, heightDp = 98)
@Composable
private fun DoUpNavbarPreview() {
    MaterialTheme {
        RelayContainer {
            DoUpNavbar(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Background(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_up_navbar_background),
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
        image = painterResource(R.drawable.do_up_navbar_logo),
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
        vector = painterResource(R.drawable.do_up_navbar_input),
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
        vector = painterResource(R.drawable.do_up_navbar_vector),
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
        vector = painterResource(R.drawable.do_up_navbar_vector_2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 17.965087890625.dp,
                top = 17.965087890625.dp,
                end = 0.00007009506225585938.dp,
                bottom = 0.00007009506225585938.dp
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
        vector = painterResource(R.drawable.do_up_navbar_ellipse_1),
        modifier = modifier.requiredWidth(43.6756591796875.dp).requiredHeight(40.54106140136719.dp)
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
        modifier = modifier.requiredWidth(62.298248291015625.dp).requiredHeight(20.90398406982422.dp)
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
        vector = painterResource(R.drawable.do_up_navbar_line_22),
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line24(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_up_navbar_line_24),
        modifier = modifier.requiredWidth(32.0.dp).requiredHeight(0.0.dp)
    )
}

@Composable
fun Line23(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.do_up_navbar_line_23),
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
