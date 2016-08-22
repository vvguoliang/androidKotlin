/**
 * Created by vvguoliang on 16/8/11.
 */
package com.example.mykotlin;

import android.content.Intent
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.myactivity.*

class MyActivity : BastActivity(){
    fun initView() {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun findViewById(id: Int): View? {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.myactivity)

        val i1 = intent?.getStringExtra("text") as String
        text1.text = i1.toString()

        button1.setOnClickListener {
            val i = Intent()
            i.putExtra("text" , i1.toString())
            setResult(0x001 , i)
            finish()
        }

    }
}
