package com.dev.gauravbhagat.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dev.gauravbhagat.snackbars.Snackbars

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Snackbars.snacks(this, "Lets")
    }
}