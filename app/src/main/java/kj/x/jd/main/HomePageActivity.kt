package kj.x.jd.main

import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import kj.x.jd.R
import kj.x.jd.base.SupperActivity

class HomePageActivity : SupperActivity() {
    lateinit var bottomNavigationView: BottomNavigationView
    override fun getContentView(): Int {
        return R.layout.activity_hp
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val host: NavHostFragment = supportFragmentManager.findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment
        val navController = host.navController
        initWidget()
        initBottomNavigationView(bottomNavigationView, navController)
    }

    private fun initBottomNavigationView(bottomNavigationView: BottomNavigationView, navController: NavController) {
        bottomNavigationView.setupWithNavController(navController)
    }

    private fun initWidget() {
        bottomNavigationView = findViewById(R.id.navigation_view)
    }
}