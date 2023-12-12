package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.Model.Shayari
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivityMotivitionBinding
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds

class MotivitionActivity : AppCompatActivity() {

    lateinit var binding: ActivityMotivitionBinding
    lateinit var motivationalShayariShowAdapter: ShayariDataShowAdpter
    var motivationalShayriList= mutableListOf<Shayari>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
                binding= ActivityMotivitionBinding.inflate(layoutInflater)
        setContentView(binding.root)
        MobileAds.initialize(this) { }

        val adRequest = AdRequest.Builder().build()
        binding.adView.loadAd(adRequest)

        binding.adView.adListener = object: AdListener() {
            override fun onAdClicked() {
                super.onAdClicked()

            }

            override fun onAdClosed() {

            }

            override fun onAdFailedToLoad(adError : LoadAdError) {
                super.onAdFailedToLoad(adError)
                binding.adView.loadAd(adRequest)

            }

            override fun onAdImpression() {

            }

            override fun onAdLoaded() {
                super.onAdLoaded()
                Toast.makeText(this@MotivitionActivity, "ads loaded", Toast.LENGTH_SHORT).show()
            }

            override fun onAdOpened() {
                super.onAdOpened()
            }
        }

        motivationalShayriList.add(
            Shayari(282,"🥺दर्द, गम, डर जो भी है बस तेरे अंदर हैं,\n" +
                    "खुद के बनाये पिंजरे से निकल कर देख,तू भी एक सिकंदर हैं..🤴"))
        motivationalShayriList.add(Shayari(283,"🖤यही जज्बा रहा तो मुश्किलों का हल भी निकलेगा,जमीं बंजर हुई तो क्या वहीं से जल भी निकलेगा,ना हो मायूस ना घबरा अंधेरों से मेरे साथी,इन्हीं रातों के दामन से सुनहरा कल भी निकलेगा.💛"))
        motivationalShayriList.add(Shayari(284,"👑 जित और हार आपकी सोच पर निर्भर करती हैं,\n" +
                "मान लो तो हार होगी और ठान लो तो जित होगी.🤴"))
        motivationalShayriList.add(Shayari(285,"🖤न कोई कठिनाई न कोई तकलीफ, तो क्या मज़ा है जीने में, बड़े बड़े तूफान थम जाते है, जब आग लगी हो सीने में 🔥"))
        motivationalShayriList.add(Shayari(286,"💖जीवन में गिरना भी अच्छा है,औकात का पता चलता है,बढ़ते हैं जब हाथ उठाने को,तो अपनों का पता चलता है..👫"))
        motivationalShayriList.add(Shayari(287,"😐लाखों ठोकरों के बाद भी संभालता रहूँगा\n" +
                "गिरकर फिर से उठूंगा और चलता रहूँगा..🤴"))
        motivationalShayriList.add(Shayari(288,"☘️पतझड़ हुए बिना पेड़ों पर नए पत्ते नहीं आते,\n" +
                "कठिनाई और संघर्ष सहे बिना अच्छे दिन नही आते..🥺"))
        motivationalShayriList.add(Shayari(289,"सपनों को पाने के लिए समझदार नहीं\n" +
                "पागल बनना पड़ता है..🤑"))
        motivationalShayriList.add(Shayari(290,"🤴शक ना कर मेरी हिम्मत पर,\n" +
                "मैं ख्वाब बुन लेता हूँ टूटे धागों को जोड़कर..💛"))
        motivationalShayriList.add(Shayari(291,"🏊‍♂️पानी में गिरने से किसी की मृत्यु नहीं होती,\n" +
                "मृत्यु तभी होती है जब तैरना नहीं आता,परिस्थितियां कभी समस्या नहीं बनती,समस्या तभी बनती है जब उनसे निपटना नहीं आता..🖤"))
        motivationalShayriList.add(Shayari(292,"🖤ज़िन्दगी में अगर बुरा वक़्त नहीं आता\n" +
                "तो अपनों में छुपे हुए गैर और गैरों में छुपे हुए अपनो ंका कभी पता न चलता..👫"))


        motivationalShayriList.add(Shayari(293,"😡क्रोध के समय थोड़ा रुक जाएं,\n" +
                "और गलती के समय थोड़ा झुक जाएं,तो दुनिया की सब समस्याएं हल हो जाएगी..💖"))
        motivationalShayriList.add(Shayari(294,"🤴तकदीर भी बदलेगी, तस्वीर भी बदलेगी! तू हिम्मत ना हार मेरे दोस्त, तेरे हाथों की लकीरें भी बदलेगी..🖤"))
        motivationalShayriList.add(Shayari(295,"🖤कठिन रास्तों से कभी ना घबराएं क्योंकि कठिन रास्ते हमेशा खूबसूरत मंजिल की ओर लेकर जाते हैं..💖"))
        motivationalShayriList.add(Shayari(296,"नींद से इतना भी प्यार न करो कि मंज़िल भी ख्वाब बन जाए..💛"))
        motivationalShayriList.add(Shayari(297,"🥺दयालु बनो कमजोर नहीं, ज्ञानी बनो अहंकारी नहीं..☺️"))
        motivationalShayriList.add(Shayari(298,"बड़ी मंजिल के राहगीर छोटे दिल \n" +
                "नहीं रखते...💛"))
        motivationalShayriList.add(Shayari(299,"💘अगर जिंदगी में कुछ अलग करना चाहते हो तो भीड़ का हिस्सा कभी मत बनो क्योंकि भीड़ साहस तो देता है\n" +
                " मगर पहचान छिन लेता है..🖤"))
        motivationalShayriList.add(Shayari(300,"🕧हर वक़्त जीतने का जज्बा होना चाहिए, क्यूंकि किस्मत बदले न बदले पर समय ज़रूर बदलता है..💖"))
        motivationalShayriList.add(Shayari(301,"🖤मोती कभी भी किनारे पे खुद नहीं आते, उन्हें पाने के लिए समुन्दर में \n" +
                "उतरना ही पड़ता है..🏊‍♂️"))
        motivationalShayriList.add(Shayari(302,"🥺हार तो वो सबक है जो आपको बेहतर होने का मौका देगी..🤴"))
        motivationalShayriList.add(Shayari(303,"☺️हमेशा खुशियों में इन्वेस्ट करो. जितनी ज्यादा खुशियां बटोरोगे उतना ही अच्छा महसूस करोगे..💛"))
        motivationalShayriList.add(Shayari(304,"😝जीवन में हमेशा मुस्कुराने की वजह नहीं मिलती। लेकिन आपकी मुस्कान, दूसरों के मुस्कुराने की वजह जरुर होती है..☺️"))
        motivationalShayriList.add(Shayari(305,"🏞️बेशक हर दिन अच्छा नहीं होता, लेकिन हर दिन कुछ ना कुछ अच्छा जरूर होता है..💖"))

        motivationalShayriList.add(Shayari(306,"🪄खुद पर विश्वास करना एक जादू जैसा है, अगर आप ये कर सकते हो तो कुछ भी कर सकते हो..💖"))
        motivationalShayriList.add(Shayari(307,"अपने लक्ष्य पर नज़र और अपनी मेहनत पर विश्वास रखो..💛"))
        motivationalShayriList.add(
            Shayari(308,"🌇हर सूर्यास्त हमारा एक दिन कम तो जरूर करता है लेकिन हर सूर्यौदय हमारे जीवन में आशा की एक नई किरण \n" +
                    "लेकर आता है..💛"))
        motivationalShayriList.add(Shayari(309,"शौंक भले कितने ही ऊँचे रखो लेकिन जिम्मेदारी से बढ़कर नहीं..🖤"))
        motivationalShayriList.add(Shayari(310,"💖कभी-कभी आप अपनी खुद की ताकत का एहसास नहीं करते हैं जब तक कि आप अपनी सबसे बड़ी कमजोरी का सामना \n" +
                "नहीं करते..💛💖"))
        motivationalShayriList.add(Shayari(311,"“🤴अच्छा दिखने के लिए नहीं, किन्तु अच्छा बनने के लिए जिओ..🤗”"))
        motivationalShayriList.add(Shayari(312,"🏄जीवन में तूफान का आना भी ज़रूरी हैं क्यूंकि तभी हमें पता चलता है कि कौन हाथ पकड़ साथ चलता है  और कौन साथ छोड़कर जाता है..👫"))

        motivationalShayriList.add(Shayari(313,"💖सफलता इसमें नहीं है कि आप कितने बड़े सपने देखते हैं, बल्कि सफलता इस बात में है कि आप अपने छोटे से छोटे सपने को भी कितने जुनून से पूरा करते हैं..🖤"))
        motivationalShayriList.add(Shayari(314,"💖ए मंजिल के मुसाफिर, हौसले की तरकस में मंजिल का वो तीर जिंदा रख,हार जाओ तुम जिंदगी में सब कुछ फिर भी जीतने का उम्मीद जिंदा रख..🤗"))
        motivationalShayriList.add(Shayari(315,"🏄रेस चाहे गाड़ी की हो या जिंदगी की जीतते वहीं लोग हैं जो समय पर गियर चेंज करते हैं..👑"))
        motivationalShayriList.add(Shayari(316,"🤴जो बिना ठोकर खाए मंजिल तक पहुंच जाते हैं उनके हाथ अक्सर अनुभव से खाली रह जाते हैं..🖤"))
        motivationalShayriList.add(Shayari(317,"सिर्फ सुकून ढूंढिए जरूरतें कभी ख़त्म नहीं होंगी..🖤"))
        motivationalShayriList.add(Shayari(318,"👀आँख से गिरे आंसू\n" +
                "और नज़रों से गिरे लोग.कभी नहीं उठा करते..💖"))
        motivationalShayriList.add(Shayari(319,"💔शीशा टूटने के बाद बिखर जाए वो ही बेहतर है,क्योंकि दरारे न जीने देती है और न ही \n" +
                "मरने देती है..💖"))
        motivationalShayriList.add(Shayari(320,"🦅अभी तो असली उड़ान बाकी है, परिंदे का इम्तिहान बाकी है, अभी अभी तो लांघा है समुंदर, अभी तो पूरा आसमान \n" +
                "बाकी है..⛅"))
        motivationalShayriList.add(Shayari(321,"🤴मैं वो खेल नहीं खेलता,\n" +
                "जिसमे जीतना फिक्स हो,क्योंकि जीतने का मजा तब हैं,जब हारने का रिस्क हो..👑"))

        motivationalShayariShowAdapter= ShayariDataShowAdpter(this,motivationalShayriList)
        binding.motivationalShowrecycleview.adapter=motivationalShayariShowAdapter
        binding.motivationalShowrecycleview.layoutManager= LinearLayoutManager(this)

        binding.backBtn.setOnClickListener {
            onBackPressed()
        }




    }
}