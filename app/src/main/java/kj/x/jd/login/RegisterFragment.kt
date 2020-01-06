package kj.x.jd.login

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.navArgs
import kj.x.jd.R
import kj.x.jd.base.SupperFragment
import kotlinx.android.synthetic.main.fg_register_layout.*

class RegisterFragment : SupperFragment() {
    override fun getContentView(): Int {
        return R.layout.fg_register_layout
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val safeArgs:RegisterFragmentArgs by navArgs()
        val email = safeArgs.email
        mEmailEt.setText(email)
    }
}