package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.Model.Shayari
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivityMomBinding
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds

class MomActivity : AppCompatActivity() {
    lateinit var binding: ActivityMomBinding

    lateinit var momShayariShowAdapter: ShayariDataShowAdpter
    var momShayriList= mutableListOf<Shayari>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMomBinding.inflate(layoutInflater)
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
                Toast.makeText(this@MomActivity, "ads loaded", Toast.LENGTH_SHORT).show()
            }

            override fun onAdOpened() {
                super.onAdOpened()
            }
        }

        momShayriList.add(Shayari(322,"🖤हजारों गम हो फिर भी मैं खुशी से फूल जाता हूं,जब हस्ती है मेरी मां मैं हर गम भूल जाता हूं..👩‍👦"))
        momShayriList.add(Shayari(323,"हालातों के आगे जब साथ ना जुदा होती है,पहचान लेती है ख़ामोशी में हर दर्द वह सिर्फ मां होती है..💖"))
        momShayriList.add(Shayari(324,"किसी भी मुश्किल का अब किसी को हल नहीं मिलता,शायद अब घर से कोई मां के पैर छूकर नहीं निकलता..💛"))
        momShayriList.add(Shayari(325,"🖤मुसीबतों ने मुझे काले बादल की तरह घेर लिया,जब कोई राह नजर नहीं आई तो मां याद आई..🤱"))
        momShayriList.add(Shayari(326,"🤱मां तुम्हारे पास आता हूं तो सांसें भीग जाती है,मोहब्बत इतनी मिलती है की आंखें भीग जाती है..🥺"))
        momShayriList.add(Shayari(327,"🤱मां वो सितारा है जिसकी गोद में जाने के लिए हर कोई तरसता है,जो मां को नहीं पूछते वो जिंदगी भर जन्नत को तरसता है..💖"))
        momShayriList.add(Shayari(328,"👩‍👦जिसके होने से मैं खुद को मुक्कम्मल मानता हूँ,मैं खुदा से पहले मेरी माँ को जानता हूँ..🤱"))
        momShayriList.add(Shayari(329,"सर पर जो हाथ फेरे तो हिम्मत मिल जाये,माँ एक बार मुस्कुरा दे तो जन्नत मिल जाये..❣️"))
        momShayriList.add(Shayari(330,"उसके रहते जीवन में कभी कोई गम नहीं होता,\n" +
                "दुनिया साथ दे या ना दे पर माँ का प्यार कभी कम नहीं होता...💛"))
        momShayriList.add(Shayari(331,"👨घुटनों से रेंगते – रेंगते कब पैरो पर खड़ा हो गया,माँ तेरी ममता की छाँव में न जाने कब बड़ा हो गया..🤴"))

        momShayriList.add(Shayari(332,"हर घड़ी दौलत कमाने में इस तरह मशरूफ रहा मैं,पास बैठी अनमोल मां को भूल गया मैं..🥺"))
        momShayriList.add(Shayari(333,"सीधा साधा भोला भाला मैं ही सब से सच्चा हूँ,\n" +
                "कितना भी हो जाऊं बड़ा माँ आज भी तेरा बच्चा हूँ..👨"))
        momShayriList.add(Shayari(334,"माँ पहले आँसू आते थे तो तुम याद आती थी,आज तुम याद आती हो और आँसू निकल आते है..🥺"))
        momShayriList.add(Shayari(335,"🖤हर रिश्ते में मिलावट देखी,कच्चे रंगो की सजावट देखी,लेकिन सालों साल देखा है मां को उसके चेहरे पर ना कभी थकावट देखी,ना ममता में कभी मिलावट देखें..❣️"))
        momShayriList.add(Shayari(336,"🥺जब कभी मेरा मन उदास होता है,\n" +
                "तब तेरा चेहरा आसपास होता है,तब मिलता है सुकून और विश्वास,माँ ! तेरा आशीर्वाद का अहसास होता है..🤱"))
        momShayriList.add(Shayari(337,"कैसे भुला दू मैं अपने पहले प्यार को कैसे तोड़ दू उस की ऐतबार को,\n" +
                "सारा जीवन उस की चरणों मे अर्पण कर दू छोड़ दू माँ की खातिर इस संसार को..💖"))
        momShayriList.add(Shayari(338,"किसी ने रोजा रखा किसी ने उपवास रखा,\n" +
                "कुबूल उसका हुआ जिसने अपने माँ-बाप को अपने पास रखा..💖"))
        momShayriList.add(Shayari(339,"लबों पे उसके कभी बददुआ नहीं होती,\n" +
                "बस एक माँ है जो मुझसे खफा नहीं होती.\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67"))
        momShayriList.add(Shayari(340,"इस तरह मेरे गुनाहों को वो धो देती है,माँ बहुत ग़ुस्से में होती है तो रो देती है.\uD83D\uDC69\u200D\uD83D\uDC67"))
        momShayriList.add(Shayari(341,"\uD83D\uDC69\u200D\uD83D\uDC67माँ कर देती है पर गिनाती नहीं है,वो सह लेती है पर सुनाती नहीं है।"))

        momShayriList.add(Shayari(342,"❣️सख्त राहों में भी आसान सफ़र लगता है,ये मेरी माँ की दुआओं का असर लगता है..🤱"))
        momShayriList.add(Shayari(343,"एक हस्ती है जो जान है मेरी,\n" +
                "जो जान से भी बढ़ कर शान हे मेरी,रब हुक्म दे तो कर दू सजदा उसे,क्यूँ की वो कोई और नही माँ है मेरी\uD83D\uDC69\u200D\uD83D\uDC67"))
        momShayriList.add(Shayari(344,"ए माँ तेरा मुस्कुराता चेहरा ही मेरे दिल का सुकून होता है..🤱"))
        momShayriList.add(Shayari(345,"हालातो के आगे जब साथ न जुबा होती है,\n" +
                "पहचान लेती है ख़ामोशी मे हर दर्द वो सिर्फ “माँ” होती है..\uD83D\uDC69\u200D\uD83D\uDC67"))
        momShayriList.add(Shayari(346,"बिन कहे आँखों में सब पढ़ लेती है,बिन कहे जो गलती माफ़ कर दे वो माँ है..🖤"))
        momShayriList.add(Shayari(347,"जन्नत का हर लम्हा दीदार किया था,माँ ने गोद में उठा कर जब प्यार किया था.\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67"))
        momShayriList.add(Shayari(348,"मुझे तुमसे बेहद मोहब्बत है माँ\n" +
                "तू जन्नत से भी खूबसूरत है माँ\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67"))
        momShayriList.add(Shayari(349,"माँ को याद कर लेता हूँ,\n" +
                "जब भी खुद को अकेला पाता हूँ..🤱"))
        momShayriList.add(Shayari(350,"क्या चाहिए कितना बाकी है सुकून पाने के लिए माँ से बात ही काफी है\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67"))
        momShayriList.add(Shayari(351,"जो सब पर कृपा करे उसे ईश्वर कहते है,जो ईश्वर को भी जन्म दें उसे मां कहते है..\uD83D\uDC69\u200D\uD83D\uDC67"))

        momShayriList.add(Shayari(352,"जब-जब कागज पर लिखा मैंने माँ का नाम,कलम अदब से बोल उठी हो गये चारों धाम..💖"))
        momShayriList.add(Shayari(353,"हर गली, हर शहर, हर देश-विदेश देखा,लेकिन मां तेरे जैसा प्यार कहीं नहीं देखा..🤱"))
        momShayriList.add(Shayari(354,"मेरी दुनिया में इतनी जो शौहरत है\n" +
                "मेरी माँ की बदौलत है ऐ ऊपर वाले और क्या देगा तु मेरे लिये तो मेरी माँ ही मेरी सबसे बड़ी दौलत है\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67"))
        momShayriList.add(Shayari(355,"चलती फिरती आँखों से अजां देखी है\n" +
                "मैंने जन्नत तो नहीं देखी\n" +
                "लेकिन माँ देखी है\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67"))
        momShayriList.add(Shayari(356,"किसी को घर मिला हिस्से में या कोई दुकाँ आयी,मैं घर में सबसे छोटा था मेरे हिस्से में माँ आयी..\uD83D\uDC69\u200D\uD83D\uDC67"))
        momShayriList.add(Shayari(357,"न तेरे हिस्से आयी न मेरे हिस्से आयी,\n" +
                "माँ जिसके जीवन में आयी उसने जन्नत पायी..❣️"))
        momShayriList.add(Shayari(358,"जो रुला कर मना ले वो पापा है,\n" +
                "और जो रुला कर ख़ुद भी रोये वो मां है..!\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67"))
        momShayriList.add(Shayari(359,"सारे जहां में नहीं मिलता बेशुमार इतना,\n" +
                "सुकून मिलता है मां के प्यार में जितना\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67"))
        momShayriList.add(Shayari(360,"इस जीवन में सबसे बड़ा माँ का ही प्यार है\n" +
                "वही मंदिर वही पूजा और वही सारा संसार है\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67"))
        momShayriList.add(Shayari(361,"जो शिक्षा का ज्ञान दे उसे शिक्षक कहते है,और जो खुशियों का वरदान दे \n" +
                "उसे मां कहते है..\uD83D\uDC69\u200D\uD83D\uDC67"))


        momShayariShowAdapter= ShayariDataShowAdpter(this,momShayriList)
        binding.maaShowrecycleview.adapter=momShayariShowAdapter
        binding.maaShowrecycleview.layoutManager= LinearLayoutManager(this)

        binding.backBtn.setOnClickListener {
            onBackPressed()
        }


    }
}