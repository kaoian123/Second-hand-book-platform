package com.example.hellofigma.memberresetpassword

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
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
 * resetpassword
 *
 * This composable was generated from the UI Package 'member_resetpassword'.
 * Generated code; do not edit directly
 */
@Composable
fun MemberResetpassword(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Image3(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        Back(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        Back1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 81.0.dp,
                    y = 480.0.dp
                )
            )
        ) {
            Rectangle7(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -8.5.dp
                    )
                )
            )
            Back2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 3.0.dp
                    )
                )
            )
        }
        Send(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 236.0.dp,
                    y = 480.0.dp
                )
            )
        ) {
            Rectangle8(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = -9.0.dp
                    )
                )
            )
            Send1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 1.0.dp,
                        y = 3.5.dp
                    )
                )
            )
        }
        NewPassword(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 81.0.dp,
                    y = 410.0.dp
                )
            )
        ) {
            Rectangle4(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            NewPassword2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -24.0.dp,
                        y = 3.0.dp
                    )
                )
            )
        }
        NewPassword1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 81.0.dp,
                    y = 340.0.dp
                )
            )
        ) {
            Rectangle3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            NewPassword3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -51.43229293823242.dp,
                        y = 2.5004043579101562.dp
                    )
                )
            )
        }
        Resetpassword(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -2.0.dp,
                    y = -150.0.dp
                )
            )
        )
        Bookapp(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -1.5.dp,
                    y = -205.5.dp
                )
            )
        )
        Logo(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 150.209716796875.dp,
                    y = 132.0213623046875.dp
                )
            )
        ) {
            Ellipse1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = -1.0526962280273438.dp,
                        y = 0.0.dp
                    )
                )
            )
            Logo(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 3.401660919189453.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 430, heightDp = 932)
@Composable
private fun MemberResetpasswordPreview() {
    MaterialTheme {
        RelayContainer {
            MemberResetpassword(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Image3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.member_resetpassword_image_3),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(430.0.dp).requiredHeight(932.0.dp)
    )
}

@Composable
fun Back(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.member_resetpassword_back),
        modifier = modifier.requiredWidth(350.0.dp).requiredHeight(700.0.dp)
    )
}

@Composable
fun Rectangle7(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.member_resetpassword_rectangle_7),
        modifier = modifier.requiredWidth(105.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Back2(modifier: Modifier = Modifier) {
    RelayText(
        content = "返回",
        fontSize = 18.8835506439209.sp,
        fontFamily = inter,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        height = 1.2102272641188216.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(55.0.dp).requiredHeight(43.0.dp)
    )
}

@Composable
fun Back1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 4.3577423095703125,
        content = content,
        modifier = modifier.requiredWidth(105.0.dp).requiredHeight(49.0.dp)
    )
}

@Composable
fun Rectangle8(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.member_resetpassword_rectangle_8),
        modifier = modifier.requiredWidth(105.0.dp).requiredHeight(32.0.dp)
    )
}

@Composable
fun Send1(modifier: Modifier = Modifier) {
    RelayText(
        content = "送出",
        fontSize = 18.8835506439209.sp,
        fontFamily = inter,
        height = 1.2102272641188216.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(49.0.dp).requiredHeight(43.0.dp)
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
        radius = 4.3577423095703125,
        content = content,
        modifier = modifier.requiredWidth(105.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun Rectangle4(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.member_resetpassword_rectangle_4),
        modifier = modifier.requiredWidth(260.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun NewPassword2(modifier: Modifier = Modifier) {
    RelayText(
        content = "再次輸入新密碼",
        fontSize = 23.748123168945312.sp,
        fontFamily = inter,
        height = 1.2102272325693912.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(182.0.dp).requiredHeight(38.0.dp)
    )
}

@Composable
fun NewPassword(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 7.262904167175293,
        content = content,
        modifier = modifier.requiredWidth(260.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun Rectangle3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.member_resetpassword_rectangle_3),
        modifier = modifier.requiredWidth(260.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun NewPassword3(modifier: Modifier = Modifier) {
    RelayText(
        content = "輸入新密碼",
        fontSize = 23.748123168945312.sp,
        fontFamily = inter,
        height = 1.2102272325693912.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.requiredWidth(126.34537506103516.dp).requiredHeight(38.33332824707031.dp)
    )
}

@Composable
fun NewPassword1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        radius = 7.262904167175293,
        content = content,
        modifier = modifier.requiredWidth(260.0.dp).requiredHeight(50.0.dp)
    )
}

@Composable
fun Resetpassword(modifier: Modifier = Modifier) {
    RelayText(
        content = "重製密碼\n",
        fontSize = 29.051616668701172.sp,
        fontFamily = inter,
        height = 1.2102272316936562.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(128.0.dp).requiredHeight(46.0.dp)
    )
}

@Composable
fun Bookapp(modifier: Modifier = Modifier) {
    RelayText(
        content = "二手書平台",
        fontSize = 35.62218475341797.sp,
        fontFamily = inter,
        height = 1.2102272593413121.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(189.0.dp).requiredHeight(53.0.dp)
    )
}

@Composable
fun Ellipse1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.member_resetpassword_ellipse_1),
        modifier = modifier.requiredWidth(87.37359619140625.dp).requiredHeight(87.08447265625.dp)
    )
}

@Composable
fun Logo(modifier: Modifier = Modifier) {
    RelayText(
        content = "Logo",
        fontSize = 29.051616668701172.sp,
        fontFamily = inter,
        height = 1.2102272316936562.em,
        maxLines = -1,
        modifier = modifier.requiredWidth(127.37596130371094.dp).requiredHeight(44.902931213378906.dp)
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
        modifier = modifier.requiredWidth(127.37596130371094.dp).requiredHeight(87.08447265625.dp)
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
            red = 252,
            green = 189,
            blue = 85
        ),
        isStructured = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
