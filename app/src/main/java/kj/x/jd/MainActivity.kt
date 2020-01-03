package kj.x.jd

import android.content.Intent
import android.content.IntentFilter
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kj.x.jd.jeatpack.JeatPackDemoActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.coroutines.CoroutineContext

class MainActivity : AppCompatActivity(),View.OnClickListener{

    private val TAG: String = MainActivity::class.java.name
    private val count = 50
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        registerBtn.setOnClickListener(this)
        unRegisterBtn.setOnClickListener(this)
        centerTv.setOnClickListener(this)
        jeatPackDemoBtn.setOnClickListener(this)
        var str = when{
            count == 40 -> "ssss"
            count > 30 -> ">30"
            else -> "wait"
        }
        centerTv.text = str

        //in 在..范围内 闭区间[1,4]
        var count = 1
        if(count in 1..4) {
            Log.e(TAG, "in$count")
        }

        //until 表示开区间
        for (i in 1 until 5) {
            Log.e(TAG, "in until$i count")
        }

        //downTo 倒叙判断
        for(i in 5 downTo 1) {
            Log.e(TAG, "in downTo$i")
        }

        //step  调整步长
        for (i in 1..5 step 2) {
            Log.e(TAG, "step$i")
        }
    }

    override fun onClick(v: View?) {
        when(v) {
            registerBtn -> registerLockScreenRegister()
            unRegisterBtn -> registerLockScreenRegister()
            centerTv -> startActivity(Intent(this, DataBindingTest::class.java))
            jeatPackDemoBtn -> startActivity(Intent(this, JeatPackDemoActivity::class.java))
        }

    }

    suspend fun fetchDocs() {
        val result = get("xxx")
    }

    suspend fun get(url: String) {
    }


    private var mReceiver: LockScreenReceiver? = null
    private fun registerLockScreenRegister() {
        mReceiver = LockScreenReceiver()
        var interFilter = IntentFilter()
        interFilter.addAction(Intent.ACTION_SCREEN_OFF)
        interFilter.addAction(Intent.ACTION_USER_PRESENT)
        registerReceiver(mReceiver, interFilter)
        stringLengthFunc("123456")
    }

    private fun unRegisterLockScreenRegister() {
        unregisterReceiver(mReceiver)
    }

    override fun onDestroy() {
        super.onDestroy()
        unRegisterLockScreenRegister()
    }

    fun generateAnswerString() : String{

        return ""
    }

    fun generateAnswerString(count: Int): String?{
        return if(count == 42){
            "I have the answer."
        } else {
            "The answer eludes me"
        }
    }

    //匿名函数
    val stringLengthFunc: (String) -> Int = {input ->
        input.length
    }

    //高阶函数(将其他函数作为参数的函数)
    fun stringMapper(str: String, mapper:(String) -> Int): Int{
        return mapper(str)
    }
}
