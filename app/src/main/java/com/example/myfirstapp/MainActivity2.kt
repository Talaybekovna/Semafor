package com.example.myfirstapp

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2: AppCompatActivity() {

    lateinit var imgView: ImageView
    lateinit var imgBtn: ImageButton
    var is_run = false
    var counter = 0
    val semaforArray = arrayOf(R.drawable.semafor_red, R.drawable.semafor_yellow, R.drawable.semafor_green)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        imgView = findViewById(R.id.imgView)
        imgBtn = findViewById(R.id.imgBtn)
    }

    fun clickBtn (v: View){
        if(!is_run) {
            imgBtn.setImageResource(R.drawable.button_stop)
            for (col in semaforArray) {
                imgView.setImageResource(semaforArray[counter])
                counter++
                if (counter == 2) counter = 0
            }
            is_run=true
        }else{
            imgBtn.setImageResource(R.drawable.button_start)
            is_run=false
        }
    }
}