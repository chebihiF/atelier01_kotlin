package org.doronco.atelier01_kotlin

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    lateinit var spinner : Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onStart() {
        super.onStart()
        spinner = findViewById(R.id.sp1)
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.data,
            android.R.layout.simple_spinner_item)
        spinner.adapter = adapter
    }

    fun showDialog(view: View) {
        val alertDialog = AlertDialog.Builder(this).create()
        alertDialog.setTitle("test")
        alertDialog.setMessage("test test test")
        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE,"Ok", DialogInterface.OnClickListener(){
            dialog, which -> Log.d("testtest","test")
        })
        alertDialog.show()
    }

}