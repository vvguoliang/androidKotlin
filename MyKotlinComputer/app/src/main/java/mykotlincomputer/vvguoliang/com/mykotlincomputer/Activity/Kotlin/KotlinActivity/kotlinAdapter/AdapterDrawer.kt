package mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.kotlinAdapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import mykotlincomputer.vvguoliang.com.mykotlincomputer.R
import java.util.*

/**
 * Created by vvguoliang on 16/8/17.
 */
class AdapterDrawer(val list: ArrayList<String>, val content: Context) : BaseAdapter() {

    override fun getCount(): Int {
        return list.size
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItem(position: Int): Any {
        return list.get(position)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var holder: TextViewHollder
        var v: View
        if (convertView == null) {
            v = View.inflate(content, R.layout.drawer_list_item, null)
            holder = TextViewHollder(v)
            v.tag = holder
        }else{
            v = convertView
            holder = v.tag as TextViewHollder
        }
        holder.str.text = list[position]
        return v
    }

    class TextViewHollder(var viewItem: View) {
        var str: TextView = viewItem.findViewById(android.R.id.text1) as TextView
    }


}