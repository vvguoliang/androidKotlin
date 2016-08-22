package mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.act_kotlinall.*
import mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinBaseActivity.BaseActivity
import mykotlincomputer.vvguoliang.com.mykotlincomputer.R

/**
 * Created by vvguoliang on 16/8/17.
 */
class KotlinAll : BaseActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_kotlinall)
        kotlin_listview.setOnClickListener {startActivity(Intent(this@KotlinAll , DrawerKotlin::class.java))}
        kotlin_expandableListView.setOnClickListener {  }
    }
}