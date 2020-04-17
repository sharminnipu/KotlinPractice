package com.sharmin.kotlinpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class AssignmentActivity : AppCompatActivity() {

    lateinit var editText: EditText
    lateinit var addItem:Button
    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment)

        editText=findViewById(R.id.editText)
        addItem=findViewById(R.id.add)
        listView=findViewById(R.id.list_item)



        var item= arrayListOf<String>()

         var adapter=ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,item)
        listView.adapter=adapter

        addItem.setOnClickListener {
            var editItem=editText.text.toString()
            item.add(editItem)
            adapter.notifyDataSetChanged()
            editText.text.clear()
        }
    }
}
