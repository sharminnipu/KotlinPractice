package com.sharmin.kotlinpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.nio.channels.InterruptibleChannel

class MainActivity : AppCompatActivity(),View.OnClickListener {


    lateinit var editTextName: EditText
    lateinit var buttonClick: Button
    lateinit var buttonIntroduce: Button
    lateinit var buttonGoNext:Button
    lateinit var textViewShow: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextName = findViewById(R.id.ETName)
        buttonClick = findViewById(R.id.submitBtn)
        buttonIntroduce = findViewById(R.id.buttonIntroduce)
        buttonGoNext=findViewById(R.id.btnNext)

        textViewShow = findViewById(R.id.showText)

        buttonClick.setOnClickListener(this)
        buttonIntroduce.setOnClickListener(this)
        buttonGoNext.setOnClickListener(this)



      /*  Anonymous class of OnclickLister
       val myclickLister=object :View.OnClickListener{
            override fun onClick(v: View?) {

                when (v?.id) {
                    R.id.buttonIntroduce -> {
                        val name = editTextName.text.toString()
                        textViewShow.text = "Hello $name .I am a Android Developer"

                    }
                    R.id.submitBtn -> {

                        val name = editTextName.text.toString()
                        textViewShow.text = "Hello $name"

                    }


                }

            }


        }

        buttonClick.setOnClickListener(myclickLister)
        buttonIntroduce.setOnClickListener(myclickLister)

        */


    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.buttonIntroduce -> {
                val name = editTextName.text.toString()
                textViewShow.text = "Hello $name .I am a Android Developer"

            }
            R.id.submitBtn -> {

                val name = editTextName.text.toString()
                textViewShow.text = "Hello $name"

            }
            R.id.btnNext->{

                val intent: Intent = Intent(this,ResultActivity::class.java)
                val name=editTextName.text.toString()
                intent.putExtra("name",name)
                startActivity(intent)
            }


        }

    }
}


