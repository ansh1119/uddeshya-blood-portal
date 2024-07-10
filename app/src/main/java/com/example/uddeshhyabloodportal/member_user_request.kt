package com.example.uddeshhyabloodportal

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.uddeshhyabloodportal.databinding.ActivityMemberUserRequestBinding
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds
import com.google.firebase.auth.FirebaseAuth

class member_user_request : AppCompatActivity() {
    private lateinit var binding: ActivityMemberUserRequestBinding
    lateinit var reqBloodPageAdView:AdView


    @SuppressLint("UseCompatLoadingForDrawables")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMemberUserRequestBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MobileAds.initialize(this) {}

        reqBloodPageAdView = findViewById(R.id.requestBloodPageAd)
        val adRequest = com.google.android.gms.ads.AdRequest.Builder().build()
        reqBloodPageAdView.loadAd(adRequest)

        reqBloodPageAdView.adListener = object: AdListener() {
            override fun onAdClicked() {
                super.onAdClicked()
                // Code to be executed when the user clicks on an ad.
            }

            override fun onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }

            override fun onAdFailedToLoad(adError : LoadAdError) {
                super.onAdFailedToLoad(adError)
                reqBloodPageAdView.loadAd(adRequest)
                // Code to be executed when an ad request fails.
            }

            override fun onAdImpression() {
                // Code to be executed when an impression is recorded
                // for an ad.
            }

            override fun onAdLoaded() {
                super.onAdLoaded()
                // Code to be executed when an ad finishes loading.
            }

            override fun onAdOpened() {
                super.onAdOpened()
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }
        }



        val bloodReqBtn = binding.bloodReqBtn
        val createReqBtn = binding.createRequest

        bloodReqBtn.setOnClickListener {
            val intent = Intent(this, membersList::class.java)
            startActivity(intent)
        }

        createReqBtn.setOnClickListener {
            val intent = Intent(this,bloodRequestWritten::class.java)
            startActivity(intent)
            finish()
        }

    }
}
