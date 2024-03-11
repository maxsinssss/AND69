package com.example.menutree

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.RelativeLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var textView: TextView
    lateinit var relativeLayout: RelativeLayout
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        relativeLayout = findViewById(R.id.relLayout)
        registerForContextMenu(textView)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu!!.setHeaderTitle("Choose a Color")
        menu.add(0, v!!.id,0,"Yellow")
        menu.add(0, v.id,0,"Red")
        menu.add(0, v.id,0,"Cyan")

    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        if (item.title == "Yellow") {
            relativeLayout.setBackgroundColor(Color.YELLOW)
        } else if (item.title == "Red") {
            relativeLayout.setBackgroundColor(Color.RED)
        } else if (item.title == "Cyan") {
            relativeLayout.setBackgroundColor(Color.CYAN)
        }
        return true
    }
}
