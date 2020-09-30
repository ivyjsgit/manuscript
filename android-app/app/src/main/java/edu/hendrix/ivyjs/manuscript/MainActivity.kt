package edu.hendrix.ivyjs.manuscript

import android.app.Application
import android.content.Context
import android.graphics.Canvas
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var symbol =  Symbol("6-8-Time",  "A");
//        println(symbol.symbolType);

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val context: Context = MainActivity@this.applicationContext
        val symbolImage = symbol.getSymbolDrawable(context);
        val canvas = Canvas();

        when(symbolImage){
            null -> {
                Log.i("Manuscript:", "SymbolImage is null")
            }
            else -> {
                Log.i("Manuscript:","SymbolImage is an image!");
                symbolImage.draw(canvas);
            }
        }
    }
}

