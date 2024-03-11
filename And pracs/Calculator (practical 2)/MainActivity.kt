package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener{
    lateinit var btnadd:Button
    lateinit var btnsub:Button
    lateinit var btnmul:Button
    lateinit var btndiv:Button
    lateinit var eta:EditText
    lateinit var eta1:EditText
    lateinit var tv:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnadd = findViewById(R.id.add_button)
        btnsub = findViewById(R.id.subtract_button)
        btnmul = findViewById(R.id.multiply_button)
        btndiv = findViewById(R.id.divide_button)
        eta = findViewById(R.id.eta1)
        eta1 = findViewById(R.id.eta2)
        tv = findViewById(R.id.tv)
        btnadd.setOnClickListener(this)
        btnsub.setOnClickListener(this)
        btnmul.setOnClickListener(this)
        btndiv.setOnClickListener(this)


    }

    override fun onClick(v: View?) {
        var a = eta.text.toString().toDouble()
        var b = eta1.text.toString().toDouble()
        var result = 0.0
        when(v?.id)
        {
            R.id.add_button ->{
                result = a+b
            }
            R.id.subtract_button ->{
                result = a-b
            }
            R.id.multiply_button ->{
                result = a*b
            }
            R.id.divide_button ->{
                result = a/b
            }
        }
        tv.text ="Result is $result"
    }

}