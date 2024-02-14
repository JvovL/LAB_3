package com.raywenderlich.android.lab1.screens

import androidx.compose.runtime.Composable
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen

val THREE_ELEMENT_LIST = listOf("first", "second", "third")

@Composable
fun RowScreen()
{
    MyRow()

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

@Composable
fun MyRow() {

}
