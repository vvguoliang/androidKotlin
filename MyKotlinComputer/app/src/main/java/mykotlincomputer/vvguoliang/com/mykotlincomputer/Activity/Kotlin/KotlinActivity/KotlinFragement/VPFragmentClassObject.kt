package mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinFragement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinBaseActivity.BaseFragemt
import mykotlincomputer.vvguoliang.com.mykotlincomputer.R

class VPFragmentClassObject(var i: Int , var k: Int) : BaseFragemt() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView = inflater?.inflate(R.layout.fra_class_object, container, false)
        init(rootView!!)
        return rootView!!
    }

    fun init(rootview: View) {

        if (k == 1) {

            when (i) {
                0 -> {
                }
                1 -> {
                }
                2 -> {
                }
                3 -> {
                }
                4 -> {
                }
                5 -> {
                }
                6 -> {
                }
                7 -> {
                }
                8 -> {
                }
                9 -> {
                }
                10 -> {
                }
                11 -> {
                }
                12 -> {
                }
            }
        } else {
            when (i) {
                0 -> {
                }
                1 -> {
                }
                2 -> {
                }
                3 -> {
                }
                4 -> {
                }
                5 -> {
                }
                6 -> {
                }
                7 -> {
                }
                8 -> {
                }
                9 -> {
                }
                10 -> {
                }
                11 -> {
                }
                12 -> {
                }
            }
        }
    }

}
