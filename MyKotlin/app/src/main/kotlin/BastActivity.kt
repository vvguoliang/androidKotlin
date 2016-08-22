/**
 * Created by vvguoliang on 16/8/12.
 */
package com.example.mykotlin

import android.annotation.TargetApi
import android.app.ActivityManager
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.FragmentActivity
import android.text.TextUtils
import android.view.WindowManager

abstract class BastActivity : FragmentActivity() {


    private var isImmerStateBar = true

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    @TargetApi(19)
    protected fun setTranslucentStatus(on: Boolean) {
        val win = window
        val winParams = win.attributes
        // final int bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        // win.setFlags(bits, bits);
        val bits = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS
        if (on) {
            winParams.flags = winParams.flags or bits
        } else {
            winParams.flags = winParams.flags and bits.inv()
        }
        win.attributes = winParams
    }

    /**
     * 禁止到老的沉浸方式
     *
     *
     * 在setContentView之前调用
     */
    fun setImmerStateBar(isImmerStateBar: Boolean) {
        this.isImmerStateBar = isImmerStateBar
    }

    /**
     * 判断某个界面是否在前台

     * @param context
     * *
     * @param className
     * *            某个界面名称
     */
    private fun isForeground(context: Context?, className: String): Boolean {
        if (context == null || TextUtils.isEmpty(className)) {
            return false
        }

        val am = context.getSystemService(Context.ACTIVITY_SERVICE) as ActivityManager
        val list = am.getRunningTasks(1)
        if (list != null && list!!.size > 0) {
            val cpn = list!!.get(0).topActivity
            if (className == cpn.getClassName()) {
                return true
            }
        }

        return false
    }

    override fun finish() {
        super.finish()
    }

    protected override fun onStart() {
        super.onStart()
    }

    protected override fun onStop() {
        super.onStop()
    }

    /**
     * 通过类名启动Activity

     * @param pClass
     */
    protected fun openActivity(pClass: Class<*>) {
        openActivity(pClass, null)
    }

    /**
     * 通过类名启动Activity，并且含有Bundle数据

     * @param pClass
     * *
     * @param pBundle
     */
    protected fun openActivity(pClass: Class<*>, pBundle: Bundle?) {
        val intent = Intent(this, pClass)
        if (pBundle != null) {
            intent.putExtras(pBundle)
        }
        startActivity(intent)
    }

    /**
     * 通过Action启动Activity

     * @param pAction
     */
    protected fun openActivity(pAction: String) {
        openActivity(pAction, null)
    }

    /**
     * 通过Action启动Activity，并且含有Bundle数据

     * @param pAction
     * *
     * @param pBundle
     */
    protected fun openActivity(pAction: String, pBundle: Bundle?) {
        val intent = Intent(pAction)
        if (pBundle != null) {
            intent.putExtras(pBundle)
        }
        startActivity(intent)
    }
}