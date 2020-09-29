package edu.hendrix.ivyjs.manuscript

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var symbol =  Symbol("6-8-Time",  "A");
        println(symbol.symbolType);

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}