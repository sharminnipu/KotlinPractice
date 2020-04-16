package com.sharmin.kotlinpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)



        val hero=intent.getSerializableExtra(MainActivity.KEY_NAME) as Hero


        textView.text="Name is:" +hero.name +  " and  Real Name is :"+ hero.realName




    }
}
