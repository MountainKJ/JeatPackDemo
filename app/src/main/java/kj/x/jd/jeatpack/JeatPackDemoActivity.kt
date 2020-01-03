package kj.x.jd.jeatpack

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kj.x.jd.R
import kotlinx.android.synthetic.main.act_jeat_pack_demo_layout.*

class JeatPackDemoActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_jeat_pack_demo_layout)
        jpKtxBtn.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v) {
            jpKtxBtn -> startActivity(Intent(this, JeatPackActivity_AndroidKTX::class.java))
        }
    }
}