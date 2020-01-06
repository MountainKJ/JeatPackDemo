package kj.x.jd.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import kj.x.jd.R
import kj.x.jd.base.SupperFragment
import kj.x.jd.main.HomePageActivity
import kotlinx.android.synthetic.main.fg_login_fragment.*

class LoginFragment : SupperFragment() {
    override fun getContentView(): Int {
        return R.layout.fg_login_fragment
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var name = arguments!!.get("name").toString()
        fgLoginUserNameEdi.setText(name)
        fgLoginSubmit.setOnClickListener {
            Snackbar.make(fgLoginRootLayout, "登录成功", Snackbar.LENGTH_LONG).show()
            fgLoginSubmit.postDelayed({
                startActivity(Intent(activity, HomePageActivity::class.java))
            }, 500)

        }
    }
}