/**
 * Created by vvguoliang on 16/8/11.
 */
package com.example.mykotlin;

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.myactivity.*

class MyActivity : Activity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.myactivity)

        val i1 = intent?.getStringExtra("text") as String
        text1.text = i1.toString()

        button1.setOnClickListener {

            val i = Intent()
            i.putExtra("text" , "knadadkaldal")
            setResult(0x001 , i)
            finish()
        }

    }
}
