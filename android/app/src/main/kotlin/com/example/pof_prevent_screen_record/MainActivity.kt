package com.example.pof_prevent_screen_record

import android.os.Bundle
import android.os.PersistableBundle
import android.view.WindowManager
import io.flutter.embedding.android.FlutterActivity

class MainActivity: FlutterActivity() {

    override fun onStart() {
        super.onStart()
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_SECURE);
    }
}

