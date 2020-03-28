package com.sharmin.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastMsg.setOnClickListener {
              Toast.makeText(this,"Hello EveryOne",Toast.LENGTH_LONG).show()
          }

        submitBtn.setOnClickListener {
           val message: String=ETName.text.toString()
            //string to Integer convert
            //  var message:Int=ETName.text.toString().toInt()

            //set text from edittext
            showText.text= message


        }



    }
}
