package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.Model.Shayari
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivityBirthdayShayariBinding
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds

class BirthdayShayariActivity : AppCompatActivity() {

    lateinit var binding: ActivityBirthdayShayariBinding
    lateinit var birthadayShowAdapter: ShayariDataShowAdpter
    var birthdayShayriList= mutableListOf<Shayari>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBirthdayShayariBinding.inflate(layoutInflater)
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
                Toast.makeText(this@BirthdayShayariActivity, "ads loaded", Toast.LENGTH_SHORT).show()
            }

            override fun onAdOpened() {
                super.onAdOpened()
            }
        }

        birthdayShayriList.add(
            Shayari(362,"🎆रोशनी लेकर आया\n" +
                    "और चिड़िया ने गाना गाया\n" +
                    "फूलों ने हंस हस कर बोला\n" +
                    "मुबारक हो तुम्हारा जन्मदिन आया..🎁")
        )
        birthdayShayriList.add(
            Shayari(363,"तमन्ना करते हो आप जिन खुशियों की,\n" +
                    "वह खुशियां आपके क़दमों में हो,\n" +
                    "भगवान आपको वह सब हक़ीक़त में दे,\n" +
                    "जो सोचा आपने सपनों में हो..🥰"))
        birthdayShayriList.add(Shayari(364,"🍰 जन्मदिन के शुभ अवसर पर\n" +
                "भेंट करू क्या उपहार तुम्हे\n" +
                "बस इसे ही स्वीकार कर लेना\n" +
                "लाखों लाखों प्यार तुम्हे\n" +
                "जन्मदिन की हार्दिक शुभकामनाये..❣️"))
        birthdayShayriList.add(Shayari(365,"🙏God बुरी नज़र से बचाए आप को,\n" +
                "चाँद सितारों से सजाए आप को,\n" +
                "गम क्या होता है ये आप भूल ही जाओ,\n" +
                "खुदा ज़िन्दगी मे इतना हँसाए आप को…🥰\n" +
                "।जन्मदिन की बधाई।।"))
        birthdayShayriList.add(Shayari(366,"🧨आशाओं के दीप जले आशीर्वाद उपहार मिले जन्मदिन है तुम्हारा शुभकामनाओं संग खूब प्यार मिले..❣️\n" +
                "जन्मदिन मुबारक हो"))
        birthdayShayriList.add(Shayari(367,"😇हर लम्हा आपके चहरे पे मुस्कान रहे,\n" +
                "हर ग़म से आप अन्जान रहे,खुशीराम के साथ महक उठे आपकी जिंदगी,हमेशा आपके पास वो इंसान रहे…💖"))
        birthdayShayriList.add(
            Shayari(368,"तमाम उम्र तुम्हे ज़िन्दगी का प्यार मिले,खुदा करे ये ख़ुशी तुमको बार बार मिले,\n" +
                    "तुम्हे जन्मदिन की ढेर सारी शुभकामनाएं..💝"))
        birthdayShayriList.add(
            Shayari(369,"🌙आज ही के दिन एक चाँद उतर के आया था ऊपर वाले ने बड़ी फुर्सत से मेरे प्यार बनाया था\n" +
                    "🍰जन्मदिन मुबारक हो..🎁"))
        birthdayShayriList.add(Shayari(370,"🌙चाँद की तरह तू जगमगाए,पंछियों की तरह गुनगुनाये,तेरे जन्मदिन पर दुआ करते हैं,तू जो चाहे वो तुझे मिल जाये।\n" +
                "🎆Happy Birthday..🍰"))
        birthdayShayriList.add(Shayari(371,"सितारों से आगे भी कोई जहां होगा,\n" +
                "जहां के सारे नजारों कि कसम –\n" +
                "आपसे प्यारा वहां भी ना होगा…\n" +
                "\uD83C\uDF82*Happy Birthday*\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81"))

        birthdayShayriList.add(Shayari(372,"🕺खुद भी नाचेंगे \u200D तुमको \u200D भी नचायेंगे\n" +
                "बड़ी धूम धाम से तुम्हारा बर्थड़े बनायेंगे\n" +
                "गिफ्ट में मांगो अगर जान हमारी तो आपकी \u200D कसम हसँ कर कुरबाँ हो जायेगें\n" +
                "\uD83C\uDF82Happy Wala Birthday\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81"))
        birthdayShayriList.add(Shayari(373,"यही दुवा करता हूँ खुदा से,आपकी ज़िंदगी में कोई गम न हो,जन्मदिन पर मिले हज़ारों खुशियां,चाहे उनमें शामिल हम न हो,\n" +
                "🍰जन्मदिन की हार्दिक शुभकामनाएं..😇"))
        birthdayShayriList.add(Shayari(374,"🎆दीपक में अगर नूर ना होता,\n" +
                "तन्हा दिल इतना मजबूर ना होता,\n" +
                "हम आपको खुद बर्थडे विश करने आते,\n" +
                "अगर आपका आशियाना इतनी दूर ना होता..🥰"))
        birthdayShayriList.add(Shayari(375,"आ तेरी उम्र में लिख दूँ चाँद-सितारों✨ से,तेरा जन्मदिन मनाऊँ फूलों से बहारों से हर एक खूबसूरती दुनिया \uD83C\uDF0E से मैं ले आउ,सजाऊ में ये महेफिल हर हसिन नजारों से…\n" +
                "\uD83C\uDF80\uD83C\uDF81जन्मदिन की ढेर सारी शुभकामनायें…🎁"))
        birthdayShayriList.add(Shayari(376,"ये दुआ \uD83D\uDE4F है आपके जन्मदिन पे हमारी,ना तूटे कभी दोस्ती हमारी,सारी जिंदगी देंगे खुशियाँ आपको और वो खुशियाँ होगी प्यारी प्यारी…\uD83D\uDE0A\n" +
                "\uD83C\uDF82Happy Birthday to you my Best Friend…\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81"))
        birthdayShayriList.add(Shayari(377,"आसमान की बुलंदियों पर नाम हो आपका,\n" +
                "चाँद की धरती पर मुकाम हो आपका,\n" +
                "हम तो रहते है छोटी सी दुनियाँ \uD83C\uDF0E में,\n" +
                "पर खुदा करे सारा जहाँ हो आपका…\n" +
                "~ Happy Birthday\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81"))
        birthdayShayriList.add(Shayari(378,"हर किसी को बताने आए हम,\n" +
                "दुआ के साथ उपहार भी लाए हम,\n" +
                "कबूल करो इस दोस्त का नजराना,\n" +
                "आपको जन्मदिन की बधाई देने आए हम।\n" +
                "~ Happy Birthday\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81"))
        birthdayShayriList.add(Shayari(379,"😇मुस्कान आपके होंटो से कहीं जाये नही,आँसू आपके पलकों पे कभी आये नहीं,पूरा हो आपका हर ख्वाब,और जो बूरा ना हो वो ख्बाव कभी आये नही…🥰"))
        birthdayShayriList.add(Shayari(380,"🌹गुलाब खिलते रहे ज़िंदगी की राह् में, हँसी चमकती रहे आप कि निगाह में खुशी कि लहर मिलें हर कदम पर आपको, देता हे\n" +
                " ये दिल दुआ बार – बार आपको. \n" +
                "🍰जन्मदिन कि शुभ्कामना..🎁💝"))
        birthdayShayriList.add(Shayari(381,"💝हर राह आसान हो, हर राह पे खुशिया हो, हर दिन ख़ूबसूरत हो, ऐसा ही पूरा जीवन हो,यही हर दिन मेरी दुआ हो, ऐसा ही तुम्हारा हर जन्मदिन हो..🥰"))

        birthdayShayriList.add(Shayari(382,"💐फूलों ने कहा खुश्बू से खुश्बू ने कहा बादल से बादल ने कहा लहरों से लहरों ने कहा सूरज सेऔर बाद में हमने कहा आपकों दिल से\n" +
                "🎁🍰हैप्पी बर्थडे टू यू..💝"))
        birthdayShayriList.add(Shayari(383,"👸एक तुम हो कि कितने अच्छे हो,\n" +
                "एक तुम हो कि कितने प्यारे हो..🥰,\n" +
                "एक तुम हो कि कितने सच्चे हो और,\n" +
                "एक हम हैं कि झूठ पर झूठ बोले जा रहे हैं\n" +
                "हैप्पी बर्थडे टू यू..🍰"))
        birthdayShayriList.add(Shayari(384,"👸तुम्हारे जन्मदिन पर ये दुआ है हमारी\n" +
                "जितने हों चाँद तारे उतनी उम्र तुम्हारी..🥰\n" +
                "🍰जन्मदिन मुबारक हो..💖🎁"))
        birthdayShayriList.add(Shayari(385,"🥰ख़ुशी से बीते हर दिन,\n" +
                "हर सुहानी रात हो,\n" +
                "जिस तरफ आपके कदम पड़े,\n" +
                "वहा फूलो की बरसात हो..💐🌹\n" +
                "शुभ जन्मदिन हो आपका हमेशा..🎁💖"))
        birthdayShayriList.add(Shayari(386,"💐🌹फूलों सा महकता रहे हमेशा जीवन आपका खुशियां चूमे कदम आपके बहुत सारा प्यार और आशीर्वाद हमारा\n" +
                "💝जन्मदिन की हार्दिक शुभकामनाएं..😇"))
        birthdayShayriList.add(Shayari(387,"#शुभ दिन ये आये आपके #जीवन में हज़ार बार और हम आपको #जन्मदिन #मुबारक कहते रहें हर बार।\n" +
                "#जन्मदिन मुबारक ।\uD83C\uDF82"))
        birthdayShayriList.add(Shayari(388,"💐फूल खिलखिला उठे हैं पहाड़ों में,परियाँ गा रही है मंगल बहारों में,सुनने में आया है की आज है जन्मदिन उसका जो एक है, लाखों-करोड़ों और हजारों में..🌹💝"))
        birthdayShayriList.add(Shayari(389,"🌥️न आसमान से टपकाये गए हो,\n" +
                "न ऊपर से गिराए गए हो,\n" +
                "आज कल कहाँ मिलते हैं आप जैसे लोग,\n" +
                "आप तो आर्डर देकर बनवाये गए हो..🎁🥰"))
        birthdayShayriList.add(Shayari(390,"खुदा बुरी नज़र से बचाये आप को,\n" +
                "💫चाँद सितारे से सजाये आप को,\n" +
                "गम क्या होता है ये आप भूल ही जाओ,\n" +
                "खुदा ज़िन्दगी में इतना हसए आपको..😇"))
        birthdayShayriList.add(Shayari(391,"उस दिन खुदा ने भी जश्न मनाया होगा,\n" +
                "जिस दिन आपको अपने हाथिओं से बनाया होगा,\n" +
                "उसने भी बहाये होंगे आंसू,\n" +
                "जिस दिन आपको यहाँ भेज के खुद को अकेला पाया होगा..💝"))

        birthdayShayriList.add(Shayari(392,"हर रास्ता सरल हो,हर रास्ते पे खुशियाँ हो,हर दिन खुबसूरत हो,यही हर दिन मेरी दुआ हो,ऎसा तुम्हारा हर जन्मदिन हो..🎁"))
        birthdayShayriList.add(Shayari(393,"इतनी सी मेरी दुआ \uD83D\uDE4F क़बूल हो जाये,“की तेरी हर दुआ \uD83D\uDE4F क़बूल हो जाये,“तुझे मिले जन्मदिन पर लाखों ख़ुशियाँ,“और जो तुम चाहो रब से,“वो पल भर में मंज़ूर हो जाये,\uD83D\uDE4F\n" +
                "•~:”Happy Birthday”:~•\uD83C\uDF82"))
        birthdayShayriList.add(Shayari(394,"💫ऐ खुदा, एक मन्नत है हमारी,\n" +
                "👸मेरी जान जन्नत है हमारी,\n" +
                "चाहे हम हो ना हो साथ उनके,\n" +
                "पर खुशियाँ मिले उनको प्यारी प्यारी..🥰\n" +
                "🍰जन्मदिन की शुभकामनाएं..🎁"))
        birthdayShayriList.add(Shayari(395,"❣️हर दिन से प्यारा लगता है हमें ये ख़ास दिन,हम जिसे बिताना नहीं चाहते आप बिन,वैसे तो दिल देता है सदा ही दुआ आपको,फिर भी कहते है मुबारक हो जन्मदिन आपको…💝🥰"))
        birthdayShayriList.add(Shayari(396,"🍰🎁बार बार यह दिन आये, बार बार यह दिल गाये, तू जिए हज़ारो साल, यह है मेरी आरज़ू,\n" +
                "हैप्पी बर्थडे टु यू …🍰 \n" +
                "हैप्पी बर्थडे टु यू..🥰🍰"))
        birthdayShayriList.add(Shayari(397,"😇तमन्नाओं से भरी हो जिंदगी, ख्वाहिशो से भरा हो हर पल, दामन भी छोटा लगने लगे, इतनी खुशिया दे आपको आनेवाला कल…💖\n" +
                " Happy Birthday Friend..🎁"))
        birthdayShayriList.add(Shayari(398,"💖गुल को गुलशन मुबारक, शायर को शायरी मुबारक, चाँद को चांदनी मुबारक, आशिक़ को उसकी मेहबूबा मुबारक, हमारी तरफ से आप को जन्मदिन मुबारक…🎁🥰"))
        birthdayShayriList.add(
            Shayari(399,"तमन्नाओं से भरी हो जिंदगी, \n" +
                    "ख्वाहिशों से भरा हो हर पल…❣️\n" +
                    "दामन भी छोटा लगने लगे..🥰\n" +
                    "इतनी खुशियाँ दे आपको आने वाला कल…👸🥰\n" +
                    "जन्मदिन की शुभकामनायें…\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81"))
        birthdayShayriList.add(Shayari(400,"#Life का हर #Goal रहे आपका #Clear,\n" +
                "तुम #Success पाओ Without any #Fear\n" +
                "हर पल जियो Without any #Tear,\n" +
                "Enjoy your day my #Dear,\n" +
                "\uD83C\uDF82HAPPY BIRTHDAY\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81"))
        birthdayShayriList.add(Shayari(401,"👫हर घड़ी तुम्हारा साथ निभाऊ\n" +
                "हज़ार जन्म तुम्हारे साथ पाऊ..❣️\n" +
                "सदा खुश रहे जोड़ी हमारी..💝🥰\n" +
                "🍰हर जन्मदिन तुम्हारे साथ मनाउ..🎁💝"))

        birthadayShowAdapter= ShayariDataShowAdpter(this,birthdayShayriList)
        binding.birhdayshayariShowrecycleview.adapter=birthadayShowAdapter
        binding.birhdayshayariShowrecycleview.layoutManager= LinearLayoutManager(this)

        binding.backBtn.setOnClickListener {
            onBackPressed()
        }


    }
}