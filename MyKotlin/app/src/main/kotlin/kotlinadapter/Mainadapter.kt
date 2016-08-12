package com.example.mykotlin

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import java.util.*

/**
 * Created by vvguoliang on 16/8/12.
 */
/**
 *  创建适配器参数
 */

class Mainadapter(val list: ArrayList<String>, val  context: Context) : BaseAdapter() {

    override fun getCount(): Int {
        return list.size
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItem(position: Int): Any? {
        return list.get(position)
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var holder : Holder
        val v : View
        if(convertView == null){
            v = View.inflate(context , R.layout.mainadapter,null)
            holder = Holder(v)
            v.tag = holder
        }else{
            v = convertView
            holder = v.tag as Holder
        }
        holder.str.text = list[position]
        return v
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    class Holder(var viewItem : View){

        var str : TextView = viewItem.findViewById(R.id.textadapter_item) as TextView
    }


}


