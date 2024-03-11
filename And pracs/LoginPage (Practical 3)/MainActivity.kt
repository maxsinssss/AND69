package com.example.loginpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var et_username = findViewById(R.id.et_username) as EditText
        var et_password = findViewById(R.id.et_password) as EditText
        var btn_reset =findViewById(R.id.btn_reset) as Button
        var btn_submit = findViewById(R.id.btn_submit) as Button

        btn_reset.setOnClickListener{
            et_username.setText("")
            et_password.setText("")
        }
        btn_submit.setOnClickListener{
            var username = et_username.text
            Toast.makeText(this@MainActivity,username,Toast.LENGTH_LONG).show()
        }
    }
}