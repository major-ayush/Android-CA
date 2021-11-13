package com.example.ayushca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.lang.StringBuilder

class QUESTION2 : AppCompatActivity() {
    lateinit var radioButton: RadioButton
var check=""
    var hostel=""
    var room=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question2)
        val grp1=findViewById<RadioGroup>(R.id.rg1)
        val grp2=findViewById<RadioGroup>(R.id.rg2)
        val name=findViewById<EditText>(R.id.name)

        val btn=findViewById<Button>(R.id.button)

        grp1.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(
                    applicationContext, " Selected Hostel : ${radio.text}",
                    Toast.LENGTH_SHORT
                ).show()
                hostel=(radio.text).toString()
                // radio.setTextColor(Color.parseColor("#fe9c02"))
            }
        )
        grp2.setOnCheckedChangeListener(
            RadioGroup.OnCheckedChangeListener { group, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                Toast.makeText(
                    applicationContext, "Selected Room Type : ${radio.text}",
                    Toast.LENGTH_SHORT
                ).show()
                room=(radio.text).toString()

                // radio.setTextColor(Color.parseColor("#fe9c02"))
            }
        )


        btn.setOnClickListener {

            if(name.text.isEmpty())
                Toast.makeText(applicationContext,"Enter Your Name", Toast.LENGTH_SHORT).show()
            else
            {
                var str= "Your Name: ${name.text.toString()}\nHostel: $hostel \nRoom: $room"
                Toast.makeText(applicationContext,str, Toast.LENGTH_SHORT).show()

            }
        }
    }
    fun click(v: View) {
        //code to check if this checkbox is checked!
        val checkBox = v as CheckBox
        if (checkBox.isChecked) {
            Toast.makeText(applicationContext, "${v.text.toString()} Selected",Toast.LENGTH_SHORT).show()
                 // check=check+" "+(v.text).toString()
        }
    }
}