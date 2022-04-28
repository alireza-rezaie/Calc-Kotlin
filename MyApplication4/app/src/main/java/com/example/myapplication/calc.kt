package com.example.myapplication


import android.util.Log
import android.widget.TextView
import java.lang.NumberFormatException



class calc {
    private var firsnumber = ""
    private var secendnumber = ""
    private var oprator = ""



    private var culect = false
    private var doti1 = false
    private var doti = true
    private var dot3 = false
    private var dot4 = true


    private lateinit var result: TextView


    fun addnumber(number: String) {
        if (result == null) {
            Log.e("calct", "result is null")
        }



        if (oprator == "") {
            if (culect) {
                firsnumber = ""
                result.text = ""
                firsnumber += number
                culect = false




            } else {
                firsnumber += number
            }
            culect = false
            Log.e("calc", "adding first number$number")

        } else {
            secendnumber += number
            Log.e("calc", "adding secend number$number")
        }
        result.append(number)
    }


    fun setopratoe(op: String) {
        if (result == null) {
            Log.e("calc", "result view null")
            return
        }
        Log.e("calc", "oper is $op")
        if (firsnumber == "") {
            Log.e("calc", "first number is null")
            return
        }
        if (oprator == "") {
            oprator = op
            result.append(op)
        } else {
            if (firsnumber != "" && secendnumber != "") {
// result
            }
        }
    }

    fun calculit(op: String = "") {
        if (result == null) {
            Log.e("calc", "result view null")
            return
        }
        Log.e("calc", "calculit")
        if (firsnumber == "" || secendnumber == "" || oprator == "") {
            Log.e("calc", "not enough deta...")
            return
        }

        try {
            var a: Double = firsnumber.toDouble()
            var b: Double = secendnumber.toDouble()
            var calcresult: Double = when (oprator) {
                "+" -> this.sum(a, b)
                "-" -> this.minus(a, b)
                "*" -> this.mult(a, b)
                "/" -> this.div(a, b)

                else -> (0).toDouble()
            }
            result.text = "$calcresult$op"
            firsnumber = "$calcresult"
            oprator = op
            secendnumber = ""
            culect = true

        } catch (e: NumberFormatException) {
            Log.e("calc", "NumberFormatException")

        }
    }

    fun clear() {
        firsnumber = ""
        secendnumber = ""
        oprator = ""
        result.text = ""
        doti = true
        doti1 = false
        dot3 = false
        dot4 = true
    }

    fun back() {

        doti = true
        doti1 = false
        dot3 = false
        dot4 = true


        if (secendnumber == "" && oprator == "" && firsnumber.length >= 1) {
            firsnumber = firsnumber.substring(0, firsnumber.length - 1)

        }







        if (firsnumber != "" && secendnumber == "" && oprator.length >= 1) {
            oprator = oprator.substring(0, oprator.length - 1)
        }



        if (firsnumber != "" && oprator != "" && secendnumber.length >= 1) {
            secendnumber = secendnumber.substring(0, secendnumber.length - 1)
        }







        if (result.length() >= 1) {
            result.text = result.text.substring(0, result.length() - 1)
        }

    }


    fun dot(num: String) {
        if (oprator != "") {
            doti = true
            doti1 = false
        }


        if (doti1 == true) {
            when (num) {
                "." -> result.text = "error"

            }
        }

        if (doti == true) {
            when (num) {
                "." -> doti1 = true
            }
        }



        if (result == null) {
            Log.e("calct", "result is null")
        }

        if (oprator == "") {


            if (culect) {
                firsnumber = ""
                result.text = ""
                firsnumber += num
                culect = false


            } else {

                firsnumber += num
            }

            culect = false
            Log.e("calc", "adding first number$num")

        } else {

            if (dot3 == true) {
                when (num) {
                    "." -> result.text = "error"

                }
            }

            if (dot4 == true) {
                when (num) {
                    "." -> dot3 = true
                }
            }
            secendnumber += num
            Log.e("calc", "adding secend number$num")

        }
        result.append(num)
    }


    fun setresultview(result: TextView) {
        this.result = result
        Log.e("calc", "result view is set")
    }

    fun sum(a: Double, b: Double): Double = a + b
    fun minus(a: Double, b: Double): Double = a - b
    fun mult(a: Double, b: Double): Double {

        return a * b
    }

    fun div(a: Double, b: Double): Double {
        if (b == 0.0) return 0.0
        else return a / b
    }



}
