package kj.x.jd.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

abstract class SupperActivity : AppCompatActivity() {
    abstract fun getContentView() : Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getContentView())
    }
}