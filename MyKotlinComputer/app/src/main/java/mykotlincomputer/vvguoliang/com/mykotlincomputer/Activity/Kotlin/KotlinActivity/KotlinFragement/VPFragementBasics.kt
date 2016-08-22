package mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinFragement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fra_vpbs1.view.*
import mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinBaseActivity.BaseFragemt
import mykotlincomputer.vvguoliang.com.mykotlincomputer.R
import java.io.InputStreamReader

/**
 *  i 表示那个文件
 *  k 表示英文还是中文
 */
class VPFragementBasics(var i: Int , var k: Int) : BaseFragemt() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val rootView = inflater?.inflate(R.layout.fra_vpfragement_basics, container, false)
        init(rootView!!)
        return rootView!!
    }

    fun init(rooView : View){
        if(k == 1) {
            when (i) {
                0 -> {
                    val asse = activity.getResources().assets
                    val string = InputStreamReader(asse.open("basic_types.md")).readText()
                    rooView?.text.text = string
                }
                1 -> {
                    val asse = activity.getResources().assets
                    val string = InputStreamReader(asse.open("packages.md")).readText()
                    rooView?.text.text = string
                }
                2 ->{
                    val asse = activity.getResources().assets
                    val string = InputStreamReader(asse.open("control_flow.md")).readText()
                    rooView?.text.text = string
                }
                3 ->{
                    val asse = activity.getResources().assets
                    val string = InputStreamReader(asse.open("returns.md")).readText()
                    rooView?.text.text = string
                }
            }
        }else {
            when (i) {
                0 -> {

                }
                1 -> {

                }
                2 ->{

                }
                3 ->{

                }

            }
        }
    }
}
