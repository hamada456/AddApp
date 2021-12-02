package com.example.addapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
        @SuppressLint("SetTextI18n")
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
            if( et1.text.toString() == "" || et2.text.toString() == ""){
                //トースト
                Toast.makeText(this , "数字を入力してください", Toast.LENGTH_LONG).show()
                //アラート
                AlertDialog.Builder(this)
                    .setTitle("エラーです")
                    .setMessage("数字を入力してください")
                    .setPositiveButton("OK",null)
                    .show()
            } else {
                //Edit(編集型)は計算出来ない
                //int型に直接変換出来ないのでString型にしてから
                //.toStringでString型に変更できる　型推論で:Intは省略可能
                var sum: Int = et1.text.toString().toInt() + et2.text.toString().toInt()
                tvAns.text = "合計は$sum"
                    }
            }
        //クリア処理
            btnClear.setOnClickListener {
                et1.text.clear()
                et2.text.clear()
                tvAns.text = "答え"
            }
    }
}