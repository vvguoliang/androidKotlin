package mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinFragement

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinBaseActivity.BaseFragemt
import mykotlincomputer.vvguoliang.com.mykotlincomputer.R

/**
 * Created by vvguoliang on 16/8/17.
 */
/**
 * 所有Fragment 跳转不同Fragment类
 */
class DrawerFragment : BaseFragemt() {

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {

        val rootView = inflater?.inflate(R.layout.fra_drawer, container, false)
        val i = arguments.getInt("ARG_PLANET_NUMBER")
        val i1 = arguments.getInt("ARG_PLANET_NUMBER_LIST")

        var fragmentManager = getFragmentManager()  // 这里用getFragmentManager  来代表  这里是重点
        //用wehen 代表
        when (i1) {
            0 -> {
                if (i == 0) {  //第一个类属于分别跳转
                    var fragment = FragmentBasic_Syntax()
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                } else if (i == 1) {
                    var fragment = FragmentIdioms()
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                } else if (i == 2) {
                    var fragment = FragmentCodingCon()
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                }
            }
            1 -> {
                if (i == 0) {  //从这里就用同一个Fragment 来做跳转
                    var fragment = FragmentBasics(i)
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                } else if (i == 1) {
                    var fragment = FragmentBasics(i)
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                } else if (i == 2) {
                    var fragment = FragmentBasics(i)
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                } else if (i == 3) {
                    var fragment = FragmentBasics(i)
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                }
            }

            2 -> {
                if (i == 0) { // 这里也是
                    var fragment = FragmentClassObject(i)
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                } else if (i == 1) {
                    var fragment = FragmentClassObject(i)
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                } else if (i == 2) {
                    var fragment = FragmentClassObject(i)
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                } else if (i == 3) {
                    var fragment = FragmentClassObject(i)
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                } else if (i == 4) {
                    var fragment = FragmentClassObject(i)
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                } else if (i == 5) {
                    var fragment = FragmentClassObject(i)
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                } else if (i == 6) {
                    var fragment = FragmentClassObject(i)
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                } else if (i == 7) {
                    var fragment = FragmentClassObject(i)
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                } else if (i == 8) {
                    var fragment = FragmentClassObject(i)
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                } else if (i == 9) {
                    var fragment = FragmentClassObject(i)
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                } else if (i == 10) {
                    var fragment = FragmentClassObject(i)
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                } else if (i == 11) {
                    var fragment = FragmentClassObject(i)
                    fragmentManager.beginTransaction().add(R.id.drawer_frame, fragment).commit()
                }
            }

            3 -> {
                if (i == 0) {  //如果想做操作 你可以在这里实现
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 1) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 2) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                }
            }

            4 -> {
                if (i == 0) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 1) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 2) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 3) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 4) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 5) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 6) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 7) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 8) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 9) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 10) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 11) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 12) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                }
            }

            5 -> {
                if (i == 0) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 1) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                }
            }
            6 -> {
                if (i == 0) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 1) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                }
            }
            7 -> {
                if (i == 0) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 1) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                }
            }
            8 -> {
                if (i == 0) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 1) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 2) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 3) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                } else if (i == 4) {
                    Toast.makeText(activity, "===================" + i1 + "===="+i, Toast.LENGTH_SHORT).show()
                }
            }
            else -> { // Note the block
                print("x is neither 1 nor 2=================" + i)
                Toast.makeText(activity, "===================" + i, Toast.LENGTH_SHORT).show()

            }
        }
        return rootView!!
    }

}
