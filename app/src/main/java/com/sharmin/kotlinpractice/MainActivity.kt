package com.sharmin.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {


    lateinit var editTextName: EditText
    lateinit var buttonClick:Button
    lateinit var textViewShow:TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         editTextName=findViewById(R.id.ETName)
         buttonClick=findViewById(R.id.submitBtn)
         textViewShow=findViewById(R.id.showText)

         buttonClick.setOnClickListener(this)


        /*  toastMsg.setOnClickListener {
              Toast.makeText(this,"Hello EveryOne",Toast.LENGTH_LONG).show()
          }

        submitBtn.setOnClickListener {
           val message: String=ETName.text.toString()
            //string to Integer convert
            //  var message:Int=ETName.text.toString().toInt()

            //set text from edittext
            showText.text= message


        }  */
    }

    override fun onClick(v: View?) {
        val name=editTextName.text.toString()
        textViewShow.text="Hello $name"

    }
}
