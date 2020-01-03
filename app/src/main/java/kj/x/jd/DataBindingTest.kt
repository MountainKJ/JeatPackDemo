package kj.x.jd

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import kj.x.jd.databinding.ActDbLayoutBinding
import kj.x.jd.mode.SimpleViewModel

class DataBindingTest : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActDbLayoutBinding>(this, R.layout.act_db_layout)
        var viewModel = SimpleViewModel()
        viewModel.name = "modelName"
        viewModel.lastName = "modelLastName"
        binding.viewmodel = viewModel
    }
}