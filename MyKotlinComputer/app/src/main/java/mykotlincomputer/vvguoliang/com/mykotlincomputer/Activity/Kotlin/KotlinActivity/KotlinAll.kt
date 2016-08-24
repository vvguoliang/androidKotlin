package mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.act_kotlinall.*
import mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinBaseActivity.BaseActivity
import mykotlincomputer.vvguoliang.com.mykotlincomputer.R

/**
 * Created by vvguoliang on 16/8/17.
 */
/**
 * KotlinALL 也是做了跳转
 *  写的不全，可以自己试试跳转怎么样？
 */
class KotlinAll : BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_kotlinall)
        kotlin_listview.setOnClickListener {startActivity(Intent(this@KotlinAll , DrawerKotlin::class.java))}
        kotlin_expandableListView.setOnClickListener {  }
    }
}