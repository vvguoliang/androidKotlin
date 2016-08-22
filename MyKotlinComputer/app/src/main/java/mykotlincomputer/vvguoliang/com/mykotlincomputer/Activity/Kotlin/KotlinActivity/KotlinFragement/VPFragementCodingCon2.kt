package mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinFragement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fra_vpbs1.view.*
import mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinBaseActivity.BaseFragemt
import mykotlincomputer.vvguoliang.com.mykotlincomputer.R
import java.io.InputStreamReader

class VPFragementCodingCon2 : BaseFragemt() {


    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView = inflater?.inflate(R.layout.fra_vpfragement_coding_con2, container , false)
        init(rootView!!)
        return rootView!!
    }

    fun init(rootView : View){
        val asse = activity.getResources().assets
        val string = InputStreamReader(asse.open("coding_conventions.md")).readText()
        rootView?.text.text = string
    }

}
