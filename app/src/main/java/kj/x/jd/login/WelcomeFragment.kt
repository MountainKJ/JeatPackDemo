package kj.x.jd.login

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.navigation.navOptions
import kj.x.jd.R
import kj.x.jd.base.SupperFragment
import kotlinx.android.synthetic.main.fg_welcome_layout.*

class WelcomeFragment : SupperFragment() {
    override fun getContentView(): Int {
        return R.layout.fg_welcome_layout
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnRegister.setOnClickListener{
            val action = WelcomeFragmentDirections.actionWelcomeToRegister()
                .setEMAIL("xudafeng@163.com")
            findNavController().navigate(action)
        }

        btnLogin.setOnClickListener{
            // 设置动画参数
            val navOption = navOptions {
                anim {
                    enter = R.anim.common_slide_in_right
                    exit = R.anim.common_slide_out_left
                    popEnter = R.anim.common_slide_in_left
                    popExit = R.anim.common_slide_out_right
                }
            }
            // 参数设置
            val bundle = Bundle()
            bundle.putString("name","TeaOf")
            findNavController().navigate(R.id.login, bundle,navOption)
        }
    }
}