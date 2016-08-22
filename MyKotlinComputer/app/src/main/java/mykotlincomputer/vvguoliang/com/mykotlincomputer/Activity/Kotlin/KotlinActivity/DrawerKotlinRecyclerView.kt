package mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity

import android.content.res.Configuration
import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.act_drawerkotlin.*
import mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinBaseActivity.BaseActivity
import mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinFragement.DrawerFragment
import mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.kotlinAdapter.AdapterDrawer
import mykotlincomputer.vvguoliang.com.mykotlincomputer.R
import java.util.*

/**
 * Created by vvguoliang on 16/8/17.
 */
class DrawerKotlinRecyclerView : BaseActivity(){

    var mPlanetTitles = ArrayList<String>()
    var mTitle: CharSequence? = null
    var mDrawerTitle: CharSequence? = null
    var mDrawerToggle: ActionBarDrawerToggle? = null
    var adapter: AdapterDrawer? = null
    private var iString = arrayOf("入门","基础", "类与对象", "功能与Lambda表达式", "其他", "参考", "互操作", "工具")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_drawerkotlinrecycler)
        initView()

        initActionBarDrawerToggle() //初始化actionBar和ActionBarDrawerToggle

        //默认显示第一列内容
        if (savedInstanceState == null)
            selectItem(0)
    }

    fun initView() {
        mTitle = mDrawerTitle
        mTitle = title
        mDrawerTitle = title

        mPlanetTitles.getData()
        drawer_act.setDrawerShadow(R.mipmap.drawer_shadow, GravityCompat.START)
        adapter = AdapterDrawer(mPlanetTitles, this@DrawerKotlinRecyclerView)
        drawer_list.adapter = adapter
        drawer_list.setOnItemClickListener { adapterView, view, i, l ->
            selectItem(i)
        }
    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        val drawerOpen = drawer_act.isDrawerOpen(drawer_list)
        return super.onPrepareOptionsMenu(menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (mDrawerToggle?.onOptionsItemSelected(item) as Boolean)
            return true
        return super.onOptionsItemSelected(item)
    }

    override fun setTitle(title: CharSequence?) {
        super.setTitle(title)
        mTitle = title
    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        mDrawerToggle?.syncState()
        super.onPostCreate(savedInstanceState)
    }

    override fun onConfigurationChanged(newConfig: Configuration?) {
        mDrawerToggle?.onConfigurationChanged(newConfig)
        super.onConfigurationChanged(newConfig)
    }

    fun ArrayList<String>.getData() {

        for (iStringS in iString) {
            this.add(iStringS)
        }
    }

    fun selectItem(position: Int) {
        //关闭drawer
        drawer_act.closeDrawer(GravityCompat.START)
        try {
            Thread.sleep(500)
        } catch (e: InterruptedException) {
            e.printStackTrace()
        }
        val fragment = DrawerFragment()
        val args = Bundle()
        args.putInt("ARG_PLANET_NUMBER", position)
        fragment.setArguments(args)
        var fragmentManager = supportFragmentManager
        fragmentManager.beginTransaction().replace(R.id.drawer_frame, fragment).commit()
    }

    /**
     * 初始化actionBar和ActionBarDrawerToggle
     */
    @SuppressWarnings("ConstantConditions")
    private fun initActionBarDrawerToggle() {
        //点击home键返回上一级而不是返回最上级
        try {
            actionBar?.setDisplayHomeAsUpEnabled(true)
            actionBar?.setHomeButtonEnabled(true)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        mDrawerToggle = object : ActionBarDrawerToggle(this, drawer_act,
                R.string.drawer_open, R.string.drawer_close) {
            override fun onDrawerOpened(drawerView: View?) {
                actionBar?.title = mDrawerTitle
                invalidateOptionsMenu()   //call onCreateOptionMenu
            }

            override fun onDrawerClosed(drawerView: View?) {
                actionBar?.title = mTitle
                invalidateOptionsMenu()   //call onPrepareOptionMenu刷新菜单栏
            }
        }

        drawer_act.setDrawerListener(mDrawerToggle)
    }
}