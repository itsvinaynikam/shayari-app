package com.example.ishakachinavka.Class

import android.content.Context
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.rewarded.RewardedAd
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback

class Constance {


    companion object{

         var rewardedAd:RewardedAd?=null

        fun loadRewardedAd(context: Context)
        {
            var adRequest = AdRequest.Builder().build()
            RewardedAd.load(context,"ca-app-pub-3940256099942544/5224354917", adRequest, object : RewardedAdLoadCallback() {

                override fun onAdFailedToLoad(adError: LoadAdError) {
                    rewardedAd = null
                   loadRewardedAd(context)
                }

                override fun onAdLoaded(ad: RewardedAd) {
                    rewardedAd = ad
                }

            })


        }



    }
}