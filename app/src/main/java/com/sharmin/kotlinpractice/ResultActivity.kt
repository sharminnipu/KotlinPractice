package com.sharmin.kotlinpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        listView=findViewById(R.id.listViewTwo)

        val heros= arrayOf("Mango","Jackfruit","Banana","Lichy","Nipu")


        listView.adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,heros)

        assignment.setOnClickListener {

            startActivity(Intent(this,AssignmentActivity::class.java))

        }



    }
}
