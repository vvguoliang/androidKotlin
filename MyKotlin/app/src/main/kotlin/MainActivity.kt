package com.example.mykotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text = "Hello MyKotlin"
        tv.textSize = 50.0f

        button.setOnClickListener {
            val i = Intent(this@MainActivity, MyActivity::class.java)
            i.putExtra("text", "阿奎罗大大大大开")
            startActivityForResult(i, 0x001)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val textdata = data?.getStringExtra("text") as String
        if (requestCode == 0x001) {
            text.text = textdata
            return
        }

    }
}

