package com.example.ishakachinavka.Activity

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.Model.Shayari
import com.example.ishakachinavka.databinding.ActivityShowShayariBinding
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds


class ShowShayariActivity : AppCompatActivity() {

    lateinit var binding: ActivityShowShayariBinding
    lateinit var shayariShowAdapter:ShayariDataShowAdpter
     var loveShayriList= mutableListOf<Shayari>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityShowShayariBinding.inflate(layoutInflater)
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
                Toast.makeText(this@ShowShayariActivity, "ads loaded", Toast.LENGTH_SHORT).show()
            }

            override fun onAdOpened() {
                super.onAdOpened()
            }
        }




        loveShayriList.add(
            Shayari(1,"💖याद ऐसे करो की हद्द न हो,\n" +
                    "भरोसा इतना करो कि शक न हो,\n" +
                    "इंतज़ार इतना करो कि कोई वक़्त न हो,\n" +
                    "प्यार ऐसे करो की कभी नफरत न हो…😍💖"))
        loveShayriList.add(Shayari(2,"पागल सा बच्चा हूँ,\n" +
                "  मगर दिल का सच्चा हूँ,\n" +
                "थोड़ा सा आवारा हूँ,\n" +
                "  मगर तेरा ही तो दीवाना हूँ..🤩"))
        loveShayriList.add(Shayari(3,"जिंदगी गुजर जाए पर प्यार कम ना हो,\n" +
                " याद हमे रखना चाहे पास हम ना हो," +
                "    कयामत तक चलता रहे ये प्यार का सफर हमारा, \n" +
                " दुवा करो रब से कभी ये रिश्ता खतम ना हो ।..💝"))
        loveShayriList.add(Shayari(4," 🖤 ख्वाहिश इतनी है कि कुछ ऐसा मेरे नसीब में हो, \n" +
                "      वक्त चाहे जैसा भी हो बस तू मेरे करीब हो ।..👫"))
        loveShayriList.add(Shayari(5,"👫 हर कदम हर पल हम आपके साथ है,\n" +
                " भले ही आपसे दूर सही, लेकिन आपके पास हैं..👨‍👧, \n" +
                "जिंदगी में हम कभी आपके हो या न हों, लेकिन हमे आपकी कमी का हर पल एहसास हैं.."))
        loveShayriList.add(Shayari(6,"👫 आपकी इश्क की एक नज़र चाहिए यह दिल हैं बेघर इसे एक घर चाहिए,\n" +
                " यूँ साथ चलते रहो, ऐ सनम, यह इश्क़ हमें उम्र भर चाहिए.!..💝"))

        loveShayriList.add(Shayari(7,"दिल के सागर में लहरें उठाया ना करो, ख्वाब बनकर नींद चुराया न करो, \n" +
                "बहुत चोट लगती है मेरे दिल को, तुम ख्वाबों में आकर यूं तड़पाया न करो।..🖤"))
        loveShayriList.add(Shayari(8,"तेरे बगैर इस जिंदगी की हमें जरूरत नहीं..❤️ तेरे सिवा किसी और की हमें चाहत नहीं...❤️\n" +
                " तुम ही रहोगे हमेशा मेरे दिल में...❤️तुम्हारे सिवा किसी और को मेरे इस दिल में आने की इजाजत नहीं...❤️"))
        loveShayriList.add(Shayari(9,"🧚‍♀️छुपा लूं तुझको अपनी बाँहों में इस कदर कि हवा भी गुजरने की इजाज़त मांगे । मदहोश हो जाऊं तेरे प्यार में इस कदर कि होश भी आने की इजाज़त मांगे।..🧚‍♂️"))
        loveShayriList.add(Shayari(10," उनके ख्वाब देख कर ख्याल बदल जाते हैं, उनकी लाल होठों को देखकर मुस्कान बदल जाते हैं, हम उनकी तारीफ क्या करें, जिनके चेहरे देखकर हमारी सारी खुशियां वापस आ जाती है ।❤️"))
        loveShayriList.add(Shayari(11,"❤️ " +
                "ये लकीरें ये नसीब ये किस्मत, सब फ़रेब के आईनें हैं, हाथों में तेरा हाथ होने से ही, मुकम्मल ज़िंदगी के मायने हैं। ❤️"))
        loveShayriList.add(Shayari(12,"मेरी हर खुशी हर बात तेरी है, साँसो में छुपी ये धड़कन तेरी है, दो पल भी नहीं रहा जाता मुझसे अब तेरे बिना, मेरे इन धड़कनो की धड़कती हर आवाज तेरी है..👸"))
        loveShayriList.add(Shayari(13,"🤩दीवाना हूँ तेरा मुझे इंकार तो नही, कैसे मैं कह दूँ मुझे तुझसे प्यार नही, कुछ शरारत तो तेरी निगाहों की भी थी, में अकेला इसका गुनहगार तो नही..🖤"))
        loveShayriList.add(Shayari(14,"अपनी हर एक सांसो में महकता पाया है मैंने तुझे..👸, अपनी हर एक ख्वाब में सिर्फ तेरा ही चेहरा नजर आता है मुझे क्यों न करें हम याद तुम्हें जब खुदा ने हमारे लिए बनाया है तुझे..🧚‍♀️"))
        loveShayriList.add(Shayari(15,"👩‍❤️‍👩चलो आज हम दोनों मिलकर मोहब्बत पर कोई किताब लिखते हैं तुम इश्क लिखकर शुरुआत करो हम कबूल है कहकर पूरा करते हैं..📝"))
        loveShayriList.add(Shayari(16,"💝 इश्क़ है या इबादत, अब कुछ “समझ” नहीं आता, एक खूबसूरत “ख्याल” हो तुम, जो \"दिल\" से नहीं जाता”..🖤"))
        loveShayriList.add(Shayari(17,"👰‍♀️जो कभी भूला ही नहीं वो ख्याल हों तुम, मेरी जिंदगी के सभी सवालों का जवाब हो तुम ..💝"))
        loveShayriList.add(Shayari(18,"💞 दिल के पास आपका घर बना लिया, ख्वाबों में अपने आपको बसा लिया, मत पूछो हमसे, कितना चाहते हैं हम आपको , आपकी हर खता को हमने अपना मुकद्दर बना लिया..🤴"))
        loveShayriList.add(Shayari(19,"🤴तुम्हारा ना होते हुए भी सिर्फ तुम्हारा ही होना, इश्क है !  तुमसे दूर रहकर भी तुम्हारे ही करीब रहना इश्क है…💞 उम्मीदें टूट जाने पर भी सिर्फ तुम से ही उम्मीद करना, इश्क है तुम पर मरते हुए सिर्फ तुम्हारे लिए ही जीना  इश्क है ।"))
        loveShayriList.add(Shayari(20,"🖤जिंदगी की राहों मे, रास्ते बदल जाते हैं, वक़्त की आँधी मे इंसान बदल जाते हैं, हम सोचते हैं आपको इतना याद ना करें, लेकिन आँख बंद करते ही आप याद आ जाते हैं👰‍♀️"))
        loveShayriList.add(Shayari(21,"🧚‍♀️तुम ही मेरी मोहब्बत तुम ही जीने की वजह बन गये, तुम ही मेरी मंजिल और तुम ही मेरी राह बन गए..🤴"))
        loveShayriList.add(Shayari(22,"👁️👁️तेरी आँखों में जो संवर जाये , वो ख्वाब हूँ मैं !!  तेरे नाम पे जो लूट जाये वो प्यार हूँ मैं 🤩!!  नज़र उठा कर देख तो लो एक बार, ऐ सनम… पल-पल आती तेरी यादों से बहुत परेशांन सा हूँ मैं..😥"))
        loveShayriList.add(Shayari(23,"👫 तेरा साथ है तो मुझे क्या कमी है, तेरी हर मुस्कान से मिली मुझे खुशी है !! मुस्कुराते रहना इसी तरह हुमेशा ..! क्योंकि तेरी इस मुस्कान में ही मेरी जान बसी है..💞"))
        loveShayriList.add(Shayari(24,"इस क़दर चाहेंगे हम तुमको कि जिंदगी में कोई गम न होगा..💔! तुम लाख रूठो हमसे पर हमारा प्यार तुम्हारे लिए कभी कम न होगा..💝"))
        loveShayriList.add(Shayari(25,"💔मेरे दिल के हर पन्ने पर लिखा है सिर्फ तेरा नाम ! पढ़ लेना तुम भी उन पन्नों को जिसे लिखने में गुजरती मेरी सुबह-शाम..📝"))
        loveShayriList.add(Shayari(26,"👰‍♀️काश तुम पुछो मुझसे क्या चाहिए.. मैं पकडूं हाथ तुम्हारा कहुं मुझे सिर्फ एक तेरा साथ चाहिए..👫"))
        loveShayriList.add(Shayari(27,"🧚‍♀️तुम्हें देखा जब से जीने की वजह मिल गई । जिंदगी ये मेरी जैसे जन्नत बन गई..💞। तुमसे मिलने के बाद ऐसा लगा मुझे खुदा से मांगी दुआ कबूल हो गई..💝"))
        loveShayriList.add(Shayari(28,"👰‍♀️खुशबू तेरी मुझे महका जाती है, तेरी हर बात मुझे बहका जाती है..🤩, सांसो को बहुत देर लगती है आने में हर सांस से पहली तेरी याद आ जाती है..😥"))
        loveShayriList.add(Shayari(29,"🧚‍♂️तेरी मुस्कान हमारी कमजोरी है, कह न पाना हमारी मजबूरी है..😥 तुम क्यों नहीं समझते हमारी ख़ामोशी को क्या इस खामोशी को जुबां देना जरूरी है..💔"))
        loveShayriList.add(Shayari(30,"🖤तेरे इश्क़ में, में इस तरह नीलाम हो जाऊं , आख़री हो 👰‍♀️ तेरी बोली और में तेरे नाम हो जाऊं..👰‍♂️!!"))
        loveShayriList.add(Shayari(31,"🧚‍♀️ना हम तुम्हे खोना चाहते हैं ना तुम्हारी याद में रोना चाहते है । जब तक है मेरी जिंदगी तुम्हारे साथ सिर्फ जीना चाहते है..👫"))
        loveShayriList.add(Shayari(32,"💝कुछ लोग प्यार कहते हैं , कुछ आशिकी कहते हैं तो कुछ लोग उसे बंदगी कहते हैं । 👫मगर जिसके साथ हम मोहब्बत करते है हम उसे अपनी जिंदगी कहते हैं..💞"))
        loveShayriList.add(Shayari(33,"🧚‍♂️ना तमन्ना है हजारो की , ना चाहत है सितारों की..✨ , बस तुम जैसा मिल जाओ तो क्या जरूरत है हजारों की..👰‍♀️"))
        loveShayriList.add(Shayari(34,"नजरो का क्या कसुर जो दिल्लगी तुम से हो गई ..🧚‍♀️ तुम हो ही इतने प्यारे ... कि मुहब्बत तुमसे हो गई ..🤩"))
        loveShayriList.add(Shayari(35,"🧚‍♂️ में हरदम बस एक ही दुआ करता हूं उस ईश्वर से , कोई ना चुराए उसकी खुशी जिसकी में फिकर करता हूं..🧚‍♀️"))
        loveShayriList.add(Shayari(36,"द💝िल से प्यार करते हैं तुझे , दिल से निभाएंगे..🤞, तुम बेफिक्र रहो मेरी जान जब तक ज़िंदा है सिर्फ तुमको ही चाहेंगे..🖤"))
        loveShayriList.add(Shayari(37,"⛅मुझे तो न कोई आसमान चाहिए, मुझे तो न कोई जहा चाहिए तू तो सितारों की एक महफिल है । उस पूरी महफ़िल में मुझे बस एक तू चाहिए..👰‍♀️"))
        loveShayriList.add(Shayari(38,"चाहें कितने ही खफा होते हो तुम हमसे..💔, मगर पास होते हो तो सब अच्छा लगता है , बाकी सारी कायनात लगती है झूठी सी , बस एक तुम्हारा प्यार सच्चा लगता है..👫"))
        loveShayriList.add(Shayari(39,"💞मीठी  - मीठी यादों पलकों पे सजा लेना 👫एक साथ गुज़ारे हुए पल को दिल में बसा लेना नज़र ना आऊं हकीकत में अगर मुस्कुरा कर मुझे अपने सपनो में बुला लेना..😍"))
        loveShayriList.add(Shayari(40,"😏माना की हम लड़ते बहुत है , मगर प्यार भी तुमसे बेहिसाब करते है..😍, हमारे गुस्से से नाराज़ न हो जाना , क्योंकि गुस्सा ऊपर से और प्यार दिल से करते है..👩‍❤️‍💋‍👨"))
        loveShayriList.add(Shayari(41,"‍😍💞मेरी चाहत को अपनी मोहब्बत बना के तो देख, 🧚‍♂️मेरी हंसी को अपने होठों पे सजा के तो देख । 💝ये मोहब्बत तो एक हसीन तोहफ़ा है कभी इस मोहब्बत को मोहब्बत की तरह निभाकर तो देख..🖤"))

       shayariShowAdapter= ShayariDataShowAdpter(this,loveShayriList)
        binding.shyariShowrecycleview.adapter=shayariShowAdapter
        binding.shyariShowrecycleview.layoutManager=LinearLayoutManager(this)

        binding.backBtn.setOnClickListener {
            onBackPressed()
        }

    }
}