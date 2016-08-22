package com.example.mykotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : BastActivity() {
    private var itemList = ArrayList<String>()
    private var adapter: Mainadapter? = null
    private var iString = arrayOf("基础", "变量", "属性", "函数", "类名", "方法", "UI", "操作", "继承", "接口", "重叠", "修饰符", "整形", "字符型", "数组", "按钮", "文字", "编辑框", "进度条")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        itemList.getData()

        adapter = Mainadapter(itemList, this)
        list_item.adapter = adapter

        list_item.setOnItemClickListener { adapterView, view, i, l ->
            val i1 = Intent(this@MainActivity, MyActivity::class.java)
            i1.putExtra("text", "第" + i + "个" + itemList.get(i).toString())
            startActivityForResult(i1, 0x001)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        val textdata = data?.getStringExtra("text") as String
        if (requestCode == 0x001) {
            Toast.makeText(this@MainActivity, textdata, Toast.LENGTH_LONG).show();
            return
        }
    }

    fun ArrayList<String>.getData() {

        for (iStringS in iString) {
            this.add(iStringS)
        }
    }
}

