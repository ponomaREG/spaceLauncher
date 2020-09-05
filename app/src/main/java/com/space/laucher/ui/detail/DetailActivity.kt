package com.space.laucher.ui.detail

import android.content.Context
import android.content.Intent
import android.os.Bundle
import com.space.laucher.R
import com.space.laucher.databinding.ActivityDetailBinding
import com.space.laucher.extensions.loadPhoto
import com.space.laucher.model.Launch
import com.space.laucher.sample.DataBindingActivity
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : DataBindingActivity() {
//    private val binding:ActivityDetailBinding by binding(R.layout.activity_detail)
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
        setContentView(R.layout.activity_detail)
        val launchExtra:Launch? = intent.extras?.getParcelable(LAUNCH_KEY)
        if(launchExtra == null) finish()
        //ptv_name.setTextOfRightTextView(launchExtra?.name)
//        binding.apply {
//            lifecycleOwner = this@DetailActivity
//            launch = launchExtra
//        }
        ptv_name.setTextOfRightTextView(launchExtra?.name)
        ptv_date.setTextOfRightTextView(launchExtra?.net)
        ptv_location.setTextOfRightTextView(launchExtra?.location?.name)
        ptv_lsp.setTextOfRightTextView(launchExtra?.lsp?.name)
        ptv_countryCode.setTextOfRightTextView(launchExtra?.lsp?.countryCode)
        val imageURL = launchExtra?.rocket?.imageURL
        if(imageURL != null)detail_imageOfRocket.loadPhoto(imageURL)
    }
}