package kj.x.jd.jeatpack

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.edit

class JeatPackActivity_AndroidKTX : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var sharedPreferences = getSharedPreferences("JeatPack", Context.MODE_PRIVATE)
        sharedPreferences.edit().putBoolean("key", true).apply()             //传统kotlin写法
        sharedPreferences.edit(true){putBoolean("key", false)}      //KTX写法
    }
}