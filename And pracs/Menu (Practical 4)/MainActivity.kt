package com.example.menu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var pizza : CheckBox
    lateinit var coffee : CheckBox
    lateinit var pasta : CheckBox
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pizza = findViewById(R.id.checkBox)
        coffee = findViewById(R.id.checkBox2)
        pasta = findViewById(R.id.checkBox3)
        button = findViewById(R.id.button)

        button.setOnClickListener{
            var totalAmount = 0
            var result = StringBuilder()
            if(pizza.isChecked){
                result.append("Pizza Rs.150 ")
                totalAmount += 150
            }
            if(coffee.isChecked){
                result.append(", Coffee Rs.70 ")
                totalAmount += 70
            }
            if(pasta.isChecked){
                result.append(", Pasta Rs.100 ")
                totalAmount += 100
            }
            result.append("Total : Rs."+totalAmount)
            Toast.makeText(applicationContext,result.toString(),Toast.LENGTH_SHORT).show()

        }
    }
}