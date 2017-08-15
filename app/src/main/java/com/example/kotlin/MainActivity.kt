package com.example.kotlin

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 初始Kotlin
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Kotlin设置文字
        textview.text = "Hello Kotlin!"
        //Kotlin设置字体
        textview.textSize = 20.0f
        //Kotlin添加文字颜色
        textview.setTextColor(Color.BLACK)
        //Kotlin点击事件
        textview.setOnClickListener { Toast.makeText(this, "Kotlin点击事件", Toast.LENGTH_SHORT).show() }
        val sum = sum(1, 9)
        Log.d("Cwm", sum.toString())
        main()
        operationString()
        val maxOf = maxOf(2, 10)
        Log.d("Cwm", maxOf.toString())
        gatherData()
    }

    //两数求和
    fun sum(a: Int, b: Int) = a + b

    //局部变量
    fun main() {

        var a = 0
        a += 5
        Log.d("Cwm", a.toString())

    }

    //操作字符串
    fun operationString() {

        var s = "这是字符串"
        var str = "$s.length is ${s.length} "
        Log.d("Cwm", str)
    }

    //判断返回布尔值
    fun maxOf(a: Int, b: Int) = if (a > b) a else b

    //即生成遍历集合
    fun gatherData() {

        var lists = listOf("a", "b", "c")
        for (list in lists) {
            Log.d("Cwm", list)
        }

    }



}

