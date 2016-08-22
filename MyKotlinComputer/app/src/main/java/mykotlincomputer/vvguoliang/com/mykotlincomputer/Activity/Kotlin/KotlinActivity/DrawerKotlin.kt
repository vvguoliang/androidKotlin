package mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity

import android.content.res.Configuration
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.util.DisplayMetrics
import android.view.*
import android.widget.PopupWindow
import kotlinx.android.synthetic.main.act_drawerkotlin.*
import mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinBaseActivity.BaseActivity
import mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.KotlinFragement.DrawerFragment
import mykotlincomputer.vvguoliang.com.mykotlincomputer.Activity.Kotlin.KotlinActivity.kotlinAdapter.AdapterDrawer
import mykotlincomputer.vvguoliang.com.mykotlincomputer.R
import java.util.*

/**
 * Created by vvguoliang on 16/8/17.
 */
class DrawerKotlin : BaseActivity() {

    var mPlanetTitles = ArrayList<String>()
    var mTitle: CharSequence? = null
    var mDrawerTitle: CharSequence? = null
    var mDrawerToggle: ActionBarDrawerToggle? = null
    var adapter: AdapterDrawer? = null
    var inti: Int? = 0
    private var iString = arrayOf("入门\nGetting Srtarted", "基础\nBasics", "类与对象\nClass and Object", "功能与Lambda表达式\nFunctions and Lambda", "其他\nOther", "参考\nReference", "互操作\nInterop", "工具\nTools")

    private var iString1 = arrayOf("基本语言\nBasic Syntax", "成语\nIdioms", "编码约定\nCoding Conventions")
    var mIString = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_drawerkotlin)
        initView()

        initActionBarDrawerToggle() //初始化actionBar和ActionBarDrawerToggle

        //默认显示第一列内容
        if (savedInstanceState == null)
            selectItem(0,0)
    }

    fun initView() {
        mTitle = mDrawerTitle
        mTitle = title
        mDrawerTitle = title

        drawer_act.setDrawerShadow(R.mipmap.drawer_shadow, GravityCompat.START)
        mPlanetTitles.getData()
        adapter = AdapterDrawer(mPlanetTitles, this@DrawerKotlin)
        drawer_list.adapter = adapter
        drawer_list.setOnItemClickListener { adapterView, view, i, l ->
//            selectItem(i)
            inti = i
            downPopwindow(i)
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
        if (mDrawerToggle?.onOptionsItemSelected(item) as Boolean) {
            if (popWindow != null) {
                if (mPlanetTitles.size > 0)
                    mPlanetTitles.clear()
                mPlanetTitles.getData()
                adapter = AdapterDrawer(mPlanetTitles, this@DrawerKotlin)
                drawer_list.adapter = adapter
                drawer_list.setOnItemClickListener { adapterView, view, i, l ->
                    downPopwindow(i)
                }
            }
            return true
        }
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

    fun ArrayList<String>.getData1() {

        for (iStringS in iString1) {
            this.add(iStringS)
        }
    }

    fun selectItem(position: Int , ini: Int) {
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
        args.putInt("ARG_PLANET_NUMBER_LIST" , ini)
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

    val dm = DisplayMetrics()
    var popWindow: PopupWindow? = null
    fun downPopwindow(int: Int) {
        val contentView = LayoutInflater.from(this@DrawerKotlin).inflate(R.layout.act_drawerkotlin_listview, null)
        val screenHeight = dm.heightPixels * 2 / 3
        popWindow = PopupWindow(contentView, ViewGroup.LayoutParams.MATCH_PARENT, screenHeight)
        popWindow!!.isFocusable = true
        popWindow!!.setBackgroundDrawable(BitmapDrawable())
        popWindow!!.isOutsideTouchable = true


        when (int) {
            0 -> iString1 = arrayOf("基本语言\nBasic Syntax", "成语\nIdioms", "编码约定\nCoding Conventions")
            1 -> iString1 = arrayOf("基本类型\nBasic Types", "包\nPackages", "控制流\nControl Flow", "退货和活跃\nReturns and Jumps")
            2 -> iString1 = arrayOf("类和继承\nClasses and Inheritane", "属性和字段\nProperities and Fields", "接口\nInterfaces", "可见性修饰符\nVisibility Modifiers", "扩展\nExtensions", "数据类\nData Classes", "泛型\nGenerics", "嵌套类\nNestend Classes", "枚举类型\nEnum Classes", "对象\nObjects", "代表团\nDelegaion", "委托属性\nDelegated Properties")
            3 -> iString1 = arrayOf("功能\nFunctions", "Lambda表达式\nLambda", "内联函数\nInline Functions")
            4 -> iString1 = arrayOf("解构声明\nDestructuring Declarations", "集合\nCollections", "范围\nRanges", "类型检测和强制类型转换\nType Checks and Class", "这个表达式\nThis Expressions", "平等\nEquality", "运算符重载\nOperator overloading", "空安全\nNull Safety", "例外\nExceptions", "注释\nAnnotations", "反射\nReflections", "类型安全者的建设者\nTyper-Safe Buiders", "动态类型\nDynamic Type")
            5 -> iString1 = arrayOf("API参考\nAPI Reference", "语法\nGrammar")
            6 -> iString1 = arrayOf("从Kotlin中调用java\nCalling java from Kotlin", "从java调用Kotlin\nCalling Kotlin from java")
            7 -> iString1 = arrayOf("文档化Kotlin代码\nDocumenting Kotlin Code", "使用Maven\nUsing Maven", "使用Ant\nUsing Ant", "使用摇篮\nUsing Gradle", "Kotlin和OSGI\nKotlin and OSGi")

        }
        if (mIString.size > 0) {
            mIString.clear()
        }
        mIString.getData1()
        adapter = AdapterDrawer(mIString, this@DrawerKotlin)
        drawer_list.adapter = adapter

        drawer_list.setOnItemClickListener { adapterView, view, i, l ->
            selectItem(i , int)
        }
        popWindow!!.showAsDropDown(drawer_list)
    }

}