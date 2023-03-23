package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*


    var sl1:CheckBox?=null
    var sl2:CheckBox?=null

    var rdo1:RadioButton?=null
    var rdo2:RadioButton?=null

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val botonIngresar:Button=findViewById(R.id.button)
        botonIngresar.setOnClickListener {Ingresar() }
    }
    private  fun Ingresar(){
        var Text:EditText=findViewById(R.id.editTextTextPersonName2)
        val Nombre:String=Text.text.toString()

        sl1 = findViewById(R.id.checkBox1)
        sl2 = findViewById(R.id.checkBox2)

        rdo1 = findViewById(R.id.radioButton1)
        rdo2 = findViewById(R.id.radioButton2)



        val toggle:ToggleButton=findViewById(R.id.toggleButton)
        val OptionToggle:String=toggle.text.toString()

        var car:String="Seleccionado:\n"
        if (sl1?.isChecked() == true){
            car += "Opcion 1"
        }
        if (sl2?.isChecked() == true){
            car += "Opcion 2"
        }

        var car2:String="Seleccionado:\n"
        if(rdo1?.isChecked()==true){
            car2 += "Opcion 1"
        }
        if(rdo2?.isChecked()==true){
            car2 += "Opcion 2"
        }

        Toast.makeText(this,"$Nombre\n"+"$OptionToggle\n"+"$car\n"+"$car2\n", Toast.LENGTH_SHORT).show()

    }
}