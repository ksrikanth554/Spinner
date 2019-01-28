package com.sritech.www.spinner

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinner.onItemSelectedListener=object :AdapterView.OnItemSelectedListener
        {

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {

                if (position>0)
                Toast.makeText(this@MainActivity,"selected gender is: "+spinner.selectedItem.toString(),Toast.LENGTH_LONG).show()

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }



    }
}
