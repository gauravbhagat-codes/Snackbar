package com.dev.gauravbhagat.snackbars

import android.content.Context
import android.widget.Toast

class Snackbars {

    companion object {
        fun snacks(context: Context, textMessage: String) {
            Toast.makeText(context, textMessage, Toast.LENGTH_SHORT).show()
        }
    }
}

