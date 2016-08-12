package com.example.mykotlin

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    val webviewval = "https://pic2.zhimg.com/8a3ab4d0e9f254bbe6827c11296cbdfd_b.png"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        tv.text = "Hello MyKotlin"
//        tv.textSize = 50.0f
//
//        button.setOnClickListener {
//            val i = Intent(this@MainActivity, MyActivity::class.java)
//            i.putExtra("text", "阿奎罗大大大大开")
//            startActivityForResult(i, 0x001)
//        }
//
//    }
//
//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//
//        val textdata = data?.getStringExtra("text") as String
//        if (requestCode == 0x001) {
//            text.text = textdata
//            return
//        }
        webview.loadUrl(webviewval)
    }
}

