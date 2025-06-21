package com.example.manualdinote

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.manualdinote.applicationlevel.BaseApp
import com.example.manualdinote.factory.DownloaderFactory
import com.example.manualdinote.ui.theme.ManualDINoteTheme

class MainActivity : ComponentActivity() {

    private lateinit var baseApp: BaseApp

    private val download = DownloaderFactory.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            baseApp = BaseApp()
            baseApp.car.getCar()

            download.getDownload()

        }
    }
}
