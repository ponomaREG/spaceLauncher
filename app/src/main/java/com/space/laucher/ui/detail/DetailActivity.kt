package com.space.laucher.ui.detail

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.space.laucher.R
import com.space.laucher.extensions.gone
import com.space.laucher.extensions.loadPhoto
import com.space.laucher.extensions.prepareActionBar
import com.space.laucher.model.Launch
import com.space.laucher.sample.DataBindingActivity
import kotlinx.android.synthetic.main.activity_detail.*
import java.lang.Exception

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
        prepareActionBar()
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
        ptv_rocketName.setTextOfRightTextView(launchExtra?.rocket?.name)
        ptv_rocketFamily.setTextOfRightTextView(launchExtra?.rocket?.familyname)
        if(launchExtra?.missions?.size!! > 0) {
            ptv_missionName.setTextOfRightTextView(launchExtra.missions?.get(0)?.name)
            ptv_missionDesc.setTextOfRightTextView(launchExtra.missions?.get(0)?.description)
            ptv_missionTypeName.setTextOfRightTextView(launchExtra.missions?.get(0)?.typeName)
        }else{
            ptv_missionDesc.gone(true)
            ptv_missionName.gone(true)
            ptv_missionTypeName.gone(true)
            detail_title_mission.gone(true)
        }
        val imageURL = launchExtra?.rocket?.imageURL
        if(imageURL != null)detail_imageOfRocket.loadPhoto(imageURL)

        var latitude:String? = null
        var longitude:String? = null
        try {
            latitude = launchExtra?.location?.pads?.get(0)?.latitude.toString()
            longitude = launchExtra?.location?.pads?.get(0)?.longitude.toString()
            if ((latitude == null) or (longitude == null)) detail_showOnMap.gone(true)
        }catch (e:Exception) {
            detail_showOnMap.gone(true)
        }
        detail_showOnMap.setOnClickListener {
            val gmmIntentUri: Uri = Uri.parse("geo:0,0?q=$latitude,$longitude")
            val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
            mapIntent.setPackage("com.google.android.apps.maps")
            if (mapIntent.resolveActivity(packageManager) != null) {
                startActivity(mapIntent)
            }
        }
    }


}