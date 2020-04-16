package com.sharmin.kotlinpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)


        val intentObject:Intent=intent

        val name=intentObject.getStringExtra("name")

        textView.text="Hey, $name"

        //another intent pass//

        /*  val bundle:Bundle?=intent.extras
          val msg=bundle!!.getString("name")
         textView.text="Hey, $name"

       */

        buttonToshareApp.setOnClickListener {

            val intent=Intent()
            intent.action=Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT,name)
            intent.type= "text/plain"

            startActivity(Intent.createChooser(intent,"Share To : "))
        }


    }
}
