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
/**
 * 第一个页面，初始化操作
 */
class MainKotlin : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_mainkotlin)
        init()
    }

    /**
    *   在kotlin里面不用过多的初始化，直接应用就可以
     */
    fun init() {
        /*
        在网上看到的跳转都是错误的提示，比如跳转 this 都要求用@XXXX 什么来做本类， 跳转的类都是仿 C#的方式 ::CLASS.JAVA 表示跳转类引用java方法
         */
        activitybuton.setOnClickListener{Toast.makeText(this@MainKotlin , "暂时没有展示 Activity" , Toast.LENGTH_LONG).show() }
        kotlinbuton.setOnClickListener{ startActivity(Intent(this@MainKotlin , KotlinAll::class.java)) }


        text.text = "所有控件插件都会给你做初始化操作，这个不用担心"
        text.textSize = 16f
        text.setTextColor(R.color.colorBlack)

    }


}