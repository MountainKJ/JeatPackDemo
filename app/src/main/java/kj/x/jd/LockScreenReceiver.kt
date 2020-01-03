package kj.x.jd

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

class LockScreenReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val action: String? = intent!!.action
        if(Intent.ACTION_SCREEN_OFF == action) {
            var intent = Intent(context, LockScreenActivity::class.java)
            var flags: Int = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS
            intent.addFlags(flags)
            context!!.startActivity(intent)
        }
    }
}