package com.example.addapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Viewの取得（idで）
        var et1:EditText = findViewById(R.id.et1)
        var et2:EditText = findViewById(R.id.et2)
        var btnAdd :Button = findViewById(R.id.btnAdd)
        var tvAns :TextView = findViewById(R.id.tvAns)
        var btnClear :Button = findViewById(R.id.btnClear)
        //クリック処理は.setOnClickListener
        btnAdd.setOnClickListener{
            //Edit(編集型)は計算出来ない
            //int型に直接変換出来ないのでString型にしてから
            //.toStringでString型に変更できる　型推論で:Intは省略可能
            var sum:Int = et1.text.toString().toInt() + et2.text.toString().toInt()
            tvAns.text = "合計は" + sum
        }
        //クリア処理
            btnClear.setOnClickListener {
                et1.text.clear()
                et2.text.clear()
                tvAns.text = "答え"
            }
    }
}