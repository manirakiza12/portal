package com.example.portal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class web : AppCompatActivity() {
    private val webView:WebView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)
        title="portal"
        // here connecting my web to its declation webView
        val webView=findViewById<WebView>(R.id.prt)
        webView.webViewClient= WebViewClient()
        val webSettings=webView.settings
        webSettings.javaScriptEnabled
        webView.loadUrl("https://kyu.ac.ug/")

    }

    override fun onBackPressed() {
        if(webView!!.canGoBack()){
            webView.goBack()
        }else{
        super.onBackPressed()
    }
    }}