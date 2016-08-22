package mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinFragement

import android.graphics.Color
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fra_basicsyntax.view.*
import mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinBaseActivity.BaseFragemt
import mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.kotlinAdapter.ViewPager_Adapter
import mykotlincomputer.vvguoliang.com.mykotlincomputer.R
import java.util.*

class FragmentCodingCon : BaseFragemt() {

    var viewpager: ViewPager_Adapter? = null
    var listfra: List<Fragment>? = null

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView = inflater?.inflate(R.layout.fra_codingcon, container, false)
        init(rootView!!)
        return rootView!!
    }

    fun init(rootview: View) {
        rootview?.viewpager_c_e.setCurrentItem(0, true)
        rootview?.viewpager_c_e.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {

            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
            }

            override fun onPageSelected(position: Int) {
//state的状态有三个，0表示什么都没做，1正在滑动，2滑动完毕
                if (position == 2) {
                    when (rootview?.viewpager_c_e.currentItem) {
                        0 -> {
                            rootview?.english.isChecked = true
                            rootview?.english.setBackgroundResource(Color.WHITE)
                            rootview?.english.setTextColor(R.color.colorBlack)
                            rootview?.chinese.setBackgroundResource(Color.BLACK)
                            rootview?.chinese.setTextColor(R.color.colorWhite)
                        }
                        1 -> {
                            rootview?.chinese.isChecked = true
                            rootview?.english.setBackgroundResource(Color.BLACK)
                            rootview?.english.setTextColor(R.color.colorWhite)
                            rootview?.chinese.setBackgroundResource(Color.WHITE)
                            rootview?.chinese.setTextColor(R.color.colorBlack)
                        }
                    }
                }
            }

        })
        listfra = mutableListOf(VPFragementCodingCon1(), VPFragementCodingCon2())
        //重点 这里会出现奇葩问题 要用childFragmentManager 而不是用fragmentManager
        viewpager = ViewPager_Adapter(childFragmentManager, listfra as ArrayList<Fragment>)
        rootview?.viewpager_c_e.adapter = viewpager
        viewpager?.notifyDataSetChanged()
        rootview?.radio.setOnCheckedChangeListener { radioGroup, i ->
            when (i) {
                R.id.english -> {
                    rootview?.viewpager_c_e.setCurrentItem(0, true)
                    rootview?.english.setBackgroundColor(Color.WHITE)
                    rootview?.english.setTextColor(Color.BLACK)
                    rootview?.chinese.setBackgroundColor(Color.BLACK)
                    rootview?.chinese.setTextColor(Color.WHITE)
                }
                R.id.chinese -> {
                    rootview?.viewpager_c_e.setCurrentItem(1, true)
                    rootview?.english.setBackgroundColor(Color.BLACK)
                    rootview?.english.setTextColor(Color.WHITE)
                    rootview?.chinese.setBackgroundColor(Color.WHITE)
                    rootview?.chinese.setTextColor(Color.BLACK)
                }
            }
        }
    }

}
