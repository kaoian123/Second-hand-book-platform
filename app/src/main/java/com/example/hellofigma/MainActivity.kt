/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.hellofigma

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.hellofigma.ui.theme.HelloFigmaTheme

import com.example.hellofigma.dosidenavbar.DoSideNavbar
import com.example.hellofigma.doupnavbar.DoUpNavbar
import com.example.hellofigma.dosuccess.DoSuccess
import com.example.hellofigma.dofail.DoFail

import com.example.hellofigma.membersignup.MemberSignup
import com.example.hellofigma.memberlogin.MemberLogin
import com.example.hellofigma.memberforgetpassword.MemberForgetpassword
import com.example.hellofigma.memberresetpassword.MemberResetpassword

import com.example.hellofigma.homescreen.Homescreen
import com.example.hellofigma.homebookdetail.HomeBookdetail
import com.example.hellofigma.homeorderdetail.HomeOrderDetail
import com.example.hellofigma.homeordernumber.HomeOrderNumber

import com.example.hellofigma.uploadbookmange.UploadBookMange
import com.example.hellofigma.uploadbookdetail.UploadBookDetail
import com.example.hellofigma.uploadbookupload.UploadBookUpload

import com.example.hellofigma.listhistory.ListHistory
import com.example.hellofigma.listorderdetail.ListOrderDetail
import com.example.hellofigma.listdone.ListDone


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloFigmaTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    Greeting("Android")
                    DoFail()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HelloFigmaTheme {
//        Greeting("Android")
        DoUpNavbar()
    }
}