package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var btn0:Button
    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    lateinit var btn4:Button
    lateinit var btn5:Button
    lateinit var btn6:Button
    lateinit var btn7:Button
    lateinit var btn8:Button
    lateinit var btn9:Button
    lateinit var btndot:Button
    lateinit var btntaghsim:Button
    lateinit var btnmosavi:Button
    lateinit var btnzarb:Button
    lateinit var btnmenha:Button
    lateinit var btnplus:Button
    lateinit var btnclear:Button
    lateinit var btnbac:Button
    lateinit var textView:TextView
    var calculitor=calc()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }
    fun  init(){
        btn0 = findViewById(R.id.btn0)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        btn6 = findViewById(R.id.btn6)
        btn7 = findViewById(R.id.btn7)
        btn8 = findViewById(R.id.btn8)
        btn9 = findViewById(R.id.btn9)
        btnclear = findViewById(R.id.btnclear)
        btnbac = findViewById(R.id.btnbac)
        btndot = findViewById(R.id.btndot)
        btntaghsim = findViewById(R.id.btntaghsim)
        btnmosavi = findViewById(R.id.btnmosavi)
        btnzarb = findViewById(R.id.btnzarb)
        btnmenha = findViewById(R.id.btnmenha)
        btnplus = findViewById(R.id.btnplus)
        textView = findViewById(R.id.textView)


        btn0.setOnClickListener(this)
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btn4.setOnClickListener(this)
        btn5.setOnClickListener(this)
        btn6.setOnClickListener(this)
        btn7.setOnClickListener(this)
        btn8.setOnClickListener(this)
        btn9.setOnClickListener(this)
        btnclear.setOnClickListener(this)
        btnbac.setOnClickListener(this)
        btndot.setOnClickListener(this)
        btntaghsim.setOnClickListener(this)
        btnmosavi.setOnClickListener(this)
        btnzarb.setOnClickListener(this)
        btnmenha.setOnClickListener(this)
        btnplus.setOnClickListener(this)
        textView.setOnClickListener(this)

        calculitor.setresultview(textView)


    }

    override fun onClick(v: View?) {
       when(v?.id){
           R.id.btn0  ->calculitor.addnumber("0")
           R.id.btn1  ->calculitor.addnumber("1")
           R.id.btn2  ->calculitor.addnumber("2")
           R.id.btn3  ->calculitor.addnumber("3")
           R.id.btn4  ->calculitor.addnumber("4")
           R.id.btn5  ->calculitor.addnumber("5")
           R.id.btn6  ->calculitor.addnumber("6")
           R.id.btn7  ->calculitor.addnumber("7")
           R.id.btn8  ->calculitor.addnumber("8")
           R.id.btn9  ->calculitor.addnumber("9")
           R.id.btnclear ->calculitor.clear()
           R.id.btnbac ->calculitor.back()
           R.id.btndot ->calculitor.dot(".")
           R.id.btntaghsim ->calculitor.setopratoe("/")
           R.id.btnmenha ->calculitor.setopratoe("-")
           R.id.btnzarb ->calculitor.setopratoe("*")
           R.id.btnplus ->calculitor.setopratoe("+")
           R.id.btnmosavi ->calculitor.calculit()


       }

    }
}