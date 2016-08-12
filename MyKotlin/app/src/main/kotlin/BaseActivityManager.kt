/**
 * Created by vvguoliang on 16/8/12.
 */
package com.example.mykotlin

import android.app.Activity
import java.util.*

public class BaseActivityManager {

    private var activityStack: Stack<Activity>? = null
    private var instance: BaseActivityManager? = null


    fun getActivityManager() {
        if (instance == null) {
            instance = BaseActivityManager()
        }
    }

    fun popActivity() {
        var activity = activityStack!!.lastElement()
        if (activity != null) {
            activity.finish()
            activity = null
        }
    }

    fun remove(activity: Activity?) {
        if (activity != null) {
            activityStack!!.remove(activity)
        }
    }

    fun popActivity(activity: Activity?) {
        var activity = activity
        if (activity != null) {
            activity.finish()
            activityStack!!.remove(activity)
            activity = null
        }
    }

    fun currentActivity(): Activity? {
        if (activityStack == null || activityStack!!.size === 0) {
            return null
        }
        val activity = activityStack!!.lastElement()
        return activity
    }

    fun pushActivity(activity: Activity) {
        if (activityStack == null) {
            activityStack = Stack<Activity>()
        }
        activityStack!!.add(activity)
    }

    fun popAllActivityExceptOne(cls: Class<*>) {
        while (true) {
            val activity = currentActivity() ?: break
            if (activity.javaClass.equals(cls)) {
                break
            }
            popActivity(activity)
        }
    }

    fun finshAllActivityExceptOne(cls: Class<*>) {
        for (i in 0..activityStack!!.size - 1) {
            if (!activityStack!![i].javaClass.equals(cls)) {
                activityStack!![i].finish()
            }
        }
    }

    fun popActivityOne(cls: Class<*>) {
        for (i in 0..activityStack!!.size - 1) {
            if (activityStack!![i].javaClass.equals(cls)) {
                activityStack!![i].finish()
            }

            // String name1 = activityStack.get(i).getClass().getName();
            // String name2 = cls.getName();
            // if(name1.equals(name2)){
            // activityStack.get(i).finish();
            // }
            // }
        }
    }

    fun exitApp() {
        while (true) {
            val activity = currentActivity() ?: break
            popActivity(activity)
        }
    }

    fun isStart(cls: Class<*>): Boolean? {
        var start: Boolean? = false
        for (i in 0..activityStack!!.size - 1) {
            if (activityStack!![i].javaClass.equals(cls)) {
                start = true
                break
            }
        }
        return start
    }

}
