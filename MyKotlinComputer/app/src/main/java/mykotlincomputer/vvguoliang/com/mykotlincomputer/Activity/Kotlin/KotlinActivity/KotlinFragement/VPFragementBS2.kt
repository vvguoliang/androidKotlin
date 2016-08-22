package mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinFragement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinBaseActivity.BaseFragemt
import mykotlincomputer.vvguoliang.com.mykotlincomputer.R

/**
 * Created by vvguoliang on 16/8/18.
 */
class VPFragementBS2: BaseFragemt(){

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView = inflater?.inflate(R.layout.fra_vpbs2, container, false)

        return rootView!!
    }
}
