package com.space.laucher.ui.detail

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.space.laucher.R
import com.space.laucher.databinding.ActivityDetailBinding
import com.space.laucher.model.Launch
import com.space.laucher.sample.DataBindingActivity

class DetailActivity : DataBindingActivity() {
    private val binding:ActivityDetailBinding by binding(R.layout.activity_detail)
    companion object{
        const val LAUNCH_KEY = "LAUNCH_EXTRA"
        fun startActivity(context: Context,launch: Launch){
            val intent = Intent(context,DetailActivity::class.java)
            intent.putExtra(LAUNCH_KEY,launch)
            context.startActivity(intent)
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val launchExtra:Launch? = intent.extras?.getParcelable(LAUNCH_KEY)
        if(launchExtra == null) finish()
        binding.apply {
            launch = launchExtra
            lifecycleOwner = this@DetailActivity
        }
    }
}