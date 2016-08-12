package com.example.mykotlin

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by vvguoliang on 16/8/12.
 */

abstract class BaseFragment : Fragment() {

    private var mRootView: View? = null
    protected var onClickNum = 0
    private var time: Long = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup, savedInstanceState: Bundle?): View {
        if (savedInstanceState != null) {
            val FRAGMENTS_TAG = "Android:support:fragments"
            savedInstanceState!!.remove(FRAGMENTS_TAG)

        }
        mRootView = inflater.inflate(getLayout(), container, false)
        initView()
        return (mRootView as View?)!!
    }

    fun getmRootView(): View {
        return mRootView!!
    }

    /**
     * 初始化Fragment的Layout

     * @return
     */
    protected abstract fun getLayout(): Int

    /**
     * 初始化View
     */
    protected abstract fun initView()

    /**
     * 通过ID获取相应的View

     * @param id
     * *
     * @return
     */
    protected fun findViewById(id: Int): View? {
        if (mRootView == null) {
            return null
        }
        return mRootView!!.findViewById(id)
    }

    fun netWorkChange(netWorkState: Int) {
    }

    fun onRefresh() {

    }

    /**
     * 判断是否是第一次看到这个页面 @Title: isFirstTime @author: xusonghui @Description:
     * TODO(这里用一句话描述这个方法的作用) @param: @return @return: boolean @throws
     */
    protected fun isFirstTime(): Boolean {
        return onClickNum <= 1
    }

    /**
     * 在MainActivity里面会在点击的时候去调用该方法，用于在加载的时候加载数据，建议在这里面加载数据 @Title:
     * loadData @author: xusonghui @Description:
     * TODO(这里用一句话描述这个方法的作用) @param: @return: void @throws
     */
    fun loadData() {
        onClickNum++
    }
}
