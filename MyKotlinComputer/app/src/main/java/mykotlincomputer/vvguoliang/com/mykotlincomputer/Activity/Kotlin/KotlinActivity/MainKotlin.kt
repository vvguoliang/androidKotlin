package mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.act_mainkotlin.*
import mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinBaseActivity.BaseActivity
import mykotlincomputer.vvguoliang.com.mykotlincomputer.R

/**
 * Created by vvguoliang on 16/8/16.
 */
class MainKotlin : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_mainkotlin)
        init()
    }

    fun init() {
        activitybuton.setOnClickListener{Toast.makeText(this@MainKotlin , "暂时没有展示 Activity" , Toast.LENGTH_LONG).show() }
        kotlinbuton.setOnClickListener{ startActivity(Intent(this@MainKotlin , KotlinAll::class.java)) }
    }


}