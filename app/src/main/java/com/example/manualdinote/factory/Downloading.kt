package com.example.manualdinote.factory

import android.util.Log


class Request constructor(private val client: HttpClient, private val executor: Executor) {
    fun getRequest() {
        Log.d("main", "fileDownloading")
    }
}

class HttpClient() {

}

class Executor {

}

class Downloader constructor(private val request: Request) {
    fun getDownload() {
        request.getRequest()
    }
}

// creating a factory

object DownloaderFactory {
    fun create( ) : Downloader {
        val client = HttpClient()
        val executor = Executor()
        val request = Request(client = client, executor = executor)
        return Downloader(request)
    }
}


