package com.example.asssignment_01

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {

    lateinit var ned: CheckBox
    lateinit var jon : CheckBox
    lateinit var jaehae: CheckBox
    lateinit var button: Button
    lateinit var textView1: TextView
    lateinit var textView2: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        setContentView(R.layout.activity_main)



        ned = findViewById(R.id.ned)
        jon  = findViewById(R.id.jon)
        jaehae = findViewById(R.id.jaehae)
        button = findViewById(R.id.button)
        textView1 = findViewById(R.id.textView1)
        textView2 = findViewById(R.id.textView2)


        button.setOnClickListener {

            //textView1.setTextColor(Color.parseColor("#212121"))

            if (ned.isChecked && jon.isChecked) {
                textView1.text = " "
                textView2.text = "You can select only one option"
            }
            else if (ned.isChecked && jaehae.isChecked) {
                textView1.text = " "
                textView2.text = "You can select only one option"
            }
            else if (jon.isChecked && jaehae.isChecked) {
                textView1.text = " "
                textView2.text = "You can select only one option"
            }
            else if (ned.isChecked && jon.isChecked && jaehae.isChecked) {
                textView1.text = " "
                textView2.text = "You can select only one option"
            }
            else if (jon.isChecked) {
                textView1.text = "Wrong Answer"
                //textView1.setTextColor(Color.parseColor("#E53935"))
                textView2.text = " "
            }
            else if (ned.isChecked) {
                textView1.text = "Right Answer"
                textView2.text = " "
            }
            else if (jaehae.isChecked) {
                textView1.text = "Wrong Answer"
               // textView1.setTextColor(Color.parseColor("#FF0000"))
                textView2.text = " "
            }
            else {
                textView1.text = " "
                textView2.text = "You have to select any option"
            }

        }




    }
}