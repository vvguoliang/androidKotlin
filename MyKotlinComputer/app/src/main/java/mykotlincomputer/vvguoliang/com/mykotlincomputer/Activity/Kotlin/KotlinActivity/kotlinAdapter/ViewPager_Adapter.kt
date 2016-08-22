package mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.kotlinAdapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.view.ViewGroup
import java.util.*

/**
 * Created by vvguoliang on 16/8/18.
 */
class ViewPager_Adapter(var fm: FragmentManager, val listfrage: ArrayList<Fragment>) : FragmentPagerAdapter(fm) {

    var mChildCount: Int = 0
    override fun getCount(): Int {
        return listfrage.size
    }

    override fun instantiateItem(container: ViewGroup?, position: Int): Any {
        getItem(position)
        return super.instantiateItem(container, position)
    }

    override fun destroyItem(container: ViewGroup?, position: Int, `object`: Any?) {
        super.destroyItem(container, position, `object`)
    }

    override fun notifyDataSetChanged() {
        super.notifyDataSetChanged()
        mChildCount = count
    }

    override fun getItemPosition(`object`: Any?): Int {
        if (mChildCount > 0) {
            mChildCount--
            return POSITION_NONE
        }
        return super.getItemPosition(`object`)
    }

    override fun getItem(position: Int): Fragment {

        var fragment: Fragment? = null

        when (position) {
            0 -> fragment = listfrage.get(position)
            1 -> fragment = listfrage.get(position)
            2 -> fragment = listfrage.get(position)
            3 -> fragment = listfrage.get(position)
            4 -> fragment = listfrage.get(position)
            5 -> fragment = listfrage.get(position)
            6 -> fragment = listfrage.get(position)
            7 -> fragment = listfrage.get(position)
            8 -> fragment = listfrage.get(position)
            9 -> fragment = listfrage.get(position)
            10 -> fragment = listfrage.get(position)
            11 -> fragment = listfrage.get(position)
            12 -> fragment = listfrage.get(position)
            13 -> fragment = listfrage.get(position)
            14 -> fragment = listfrage.get(position)
            15 -> fragment = listfrage.get(position)
            16 -> fragment = listfrage.get(position)
            17 -> fragment = listfrage.get(position)
            18 -> fragment = listfrage.get(position)
            19 -> fragment = listfrage.get(position)
            20 -> fragment = listfrage.get(position)
            21 -> fragment = listfrage.get(position)
            22 -> fragment = listfrage.get(position)
            23 -> fragment = listfrage.get(position)
            24 -> fragment = listfrage.get(position)
            25 -> fragment = listfrage.get(position)
            26 -> fragment = listfrage.get(position)
            27 -> fragment = listfrage.get(position)
            28 -> fragment = listfrage.get(position)
            else -> {

            }
        }
        return fragment!!
    }

}

