package com.example.hellofigma.uploadbookupload

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
 * This composable was generated from the UI Package 'upload_book_upload'.
 * Generated code; do not edit directly
 */
@Composable
fun UploadBookUpload(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Send(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 117.0.dp,
                    y = 855.0.dp
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
        PictureUpload {
            Rectangle144(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            PictureUpload1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.373321533203125.dp,
                        y = 0.45682525634765625.dp
                    )
                )
            )
        }
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
        BookInformation(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 10.0.dp,
                    y = 374.0.dp
                )
            )
        ) {
            Introduct(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 255.0.dp
                    )
                )
            ) {
                Background1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Introduct1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -9.0.dp,
                            y = -34.513671875.dp
                        )
                    )
                )
            }
            Detail(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 169.9273681640625.dp
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
                Detail1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -15.767547607421875.dp,
                            y = -0.29053306579589844.dp
                        )
                    )
                )
            }
            Price(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 85.0.dp
                    )
                )
            ) {
                Background3(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Price1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -15.767547607421875.dp,
                            y = -0.36316490173339844.dp
                        )
                    )
                )
            }
            Name {
                Background4(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
                Name1(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -15.767547607421875.dp,
                            y = -5.363164901733398.dp
                        )
                    )
                )
            }
        }
    }
}

@Preview(widthDp = 430, heightDp = 932)
@Composable
private fun UploadBookUploadPreview() {
    MaterialTheme {
        RelayContainer {
            UploadBookUpload(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Background(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_book_upload_background),
        modifier = modifier.requiredWidth(193.25137329101562.dp).requiredHeight(51.6267204284668.dp)
    )
}

@Composable
fun Send1(modifier: Modifier = Modifier) {
    RelayText(
        content = "新增",
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
fun Rectangle144(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_book_upload_rectangle_144),
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(349.9112548828125.dp)
    )
}

@Composable
fun PictureUpload1(modifier: Modifier = Modifier) {
    RelayText(
        content = "上傳書本照片",
        fontSize = 40.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(241.12847900390625.dp).requiredHeight(40.19868469238281.dp)
    )
}

@Composable
fun PictureUpload(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(349.9112548828125.dp)
    )
}

@Composable
fun Ellipse73(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_book_upload_ellipse_73),
        modifier = modifier.requiredWidth(42.0.dp).requiredHeight(42.0.dp)
    )
}

@Composable
fun Arrow1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_book_upload_arrow_1),
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
fun Background1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_book_upload_background1),
        modifier = modifier.requiredWidth(408.0.dp).requiredHeight(206.02734375.dp)
    )
}

@Composable
fun Introduct1(modifier: Modifier = Modifier) {
    RelayText(
        content = "書本介紹",
        fontSize = 40.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(302.0.dp).requiredHeight(47.0.dp)
    )
}

@Composable
fun Introduct(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 20.0,
        content = content,
        modifier = modifier.requiredWidth(408.0.dp).requiredHeight(206.02734375.dp)
    )
}

@Composable
fun Background2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_book_upload_background2),
        modifier = modifier.requiredWidth(408.0.dp).requiredHeight(67.8013916015625.dp)
    )
}

@Composable
fun Detail1(modifier: Modifier = Modifier) {
    RelayText(
        content = "書況",
        fontSize = 40.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(288.46490478515625.dp).requiredHeight(37.0750617980957.dp)
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
        radius = 20.0,
        content = content,
        modifier = modifier.requiredWidth(408.0.dp).requiredHeight(67.8013916015625.dp)
    )
}

@Composable
fun Background3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_book_upload_background3),
        modifier = modifier.requiredWidth(408.0.dp).requiredHeight(67.8013916015625.dp)
    )
}

@Composable
fun Price1(modifier: Modifier = Modifier) {
    RelayText(
        content = "價格",
        fontSize = 40.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(288.46490478515625.dp).requiredHeight(37.0750617980957.dp)
    )
}

@Composable
fun Price(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 20.0,
        content = content,
        modifier = modifier.requiredWidth(408.0.dp).requiredHeight(67.8013916015625.dp)
    )
}

@Composable
fun Background4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.upload_book_upload_background4),
        modifier = modifier.requiredWidth(408.0.dp).requiredHeight(67.8013916015625.dp)
    )
}

@Composable
fun Name1(modifier: Modifier = Modifier) {
    RelayText(
        content = "請輸入書本名稱",
        fontSize = 40.0.sp,
        fontFamily = inter,
        height = 1.2102272033691406.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(288.46490478515625.dp).requiredHeight(37.0750617980957.dp)
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
        radius = 20.0,
        content = content,
        modifier = modifier.requiredWidth(408.0.dp).requiredHeight(67.8013916015625.dp)
    )
}

@Composable
fun BookInformation(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 20.0,
        content = content,
        modifier = modifier.requiredWidth(408.0.dp).requiredHeight(461.02734375.dp)
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
