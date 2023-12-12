package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.Model.Shayari
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivityRomaticshayriBinding
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds

class RomaticshayriActivity : AppCompatActivity() {

    lateinit var binding: ActivityRomaticshayriBinding
    lateinit var romaticShayariShowAdapter: ShayariDataShowAdpter
    var romticShayriList= mutableListOf<Shayari>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRomaticshayriBinding.inflate(layoutInflater)
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
                Toast.makeText(this@RomaticshayriActivity, "ads loaded", Toast.LENGTH_SHORT).show()
            }

            override fun onAdOpened() {
                super.onAdOpened()
            }
        }


        romticShayriList.add(Shayari(42,"💞 मैं दिनभर ना जाने कितनों चेहरों से रूबरू होता हूँ पर पता नहीं रात को ख्याल सिर्फ तुम्हारा ही क्यों आता है..👨‍👧"))
        romticShayriList.add(Shayari(43,"👩‍❤️‍‍👨प्यार वो है, जिसमे किसी के ‘मिलने’ की {_उम्मीद_} भी न हो..\n" +
                "फिर भी #इंतज़ार_उसी का हो…🖤\n" +
                "\n"))
        romticShayriList.add(Shayari(44,"🤔इश्क़ है या इबादत अब कुछ समझ नही आता,\n" +
                "एक खूबसूरत ख्याल हो तुम..🧚‍♂️ ,\n" +
                "जो दिल से नही जाता..💝"))
        romticShayriList.add(Shayari(45,"👰‍♀️अपना प्यारा सा एक एहसास दे दो,\n" +
                "दिल में छोटी सी ही सही पर जगह ख़ास दे दो..🤞,\n" +
                "हमे प्यार है तुमसे ज़िन्दगी से ज्यादा,\n" +
                "बना के हमे अपना ज़िन्दगी को एक ख़ुशी का साथ दे दो..👫"))
        romticShayriList.add(Shayari(46,"🖤ए #_लकीरें ये #_किस्मत ये #नसीब सब “फरेब” के #आइने है,\n" +
                "हाथों में तेरा हाथ होने से ही मुकम्मत ज़िन्दगी के मायने है…👫"))
        romticShayriList.add(Shayari(47,"💞सीने से लगा के तुमको ये कहना है,\n" +
                "में बस तुम्हारा हु और अब तेरा हो के रहना है..🤴"))
        romticShayriList.add(Shayari(48,"🤴हम उनकी हर बात मानते हैं\n" +
                "लेकिन उससे पहले..\n" +
                "आधा-एक घँटे बहस करना फ़र्ज़ समझते हैं..😅"))
        romticShayriList.add(Shayari(49,"👰‍♀️तुम को जान से प्यारा बना लिया,\n" +
                "दिल का सुकून आंख का तारा बना दिया✨,\n" +
                "अब तुम साथ दो या न दो ये तुम्हारी मर्ज़ी,\n" +
                "हमने तो तुम्हे ज़िन्दगी का सहारा बना लिया..🥰"))
        romticShayriList.add(Shayari(50,"😘मोहब्बत उस “शक्स” से नही होती जिसके साथ रहा जाए,\n" +
                "मोहब्बत तो उससे होती है #जिसके_बिना रहा न जाए…🥰"))
        romticShayriList.add(Shayari(51,"💝प्यार वो नही जिसमे ATTITUDE और EGO हो,\n" +
                "प्यार तो वो है जिसमें एक “रूठने”\n" +
                "मे EXPERT हो तो दूसरा मनाने में PERFECT हो..🥰"))
        romticShayriList.add(Shayari(52,"👫एक अच्छा #_RELATIONSHIP वही होता हैं,\n" +
                "जिसमे #_EGO नही सिर्फ #_PYAAR होता हैं..💝"))
        romticShayriList.add(Shayari(53,"👂सुना है तुम ज़िद्दी बहुत हो,\n" +
                "मुझे भी अपनी जिद्द बना लो..😅"))
        romticShayriList.add(Shayari(54,"😏हल्की हल्की सी #हंसी ,साफ़ इशारा भी नहीं..!\n" +
                "जान भी ले गए और #जान से मारा भी नहीं..🖤"))
        romticShayriList.add(Shayari(55,"👰‍♀️तुम दूर रहो या पास,\n" +
                "बस अपनी सलामती बताया करो.\n" +
                "जब भी नजरे ढूंढे तुम्हे,\n" +
                "तुम Online आ जाया करो..👩"))
        romticShayriList.add(Shayari(56,"👂सुन पगली तेरा दिल भी धडकेगा,\n" +
                "तेरी आँख भी फड़केगी,\n" +
                "अपनी ऐसी आदत डालूँगा के,\n" +
                "हर पल मुझसे मिलने के लिए तडपेगी..😍"))

        romticShayriList.add(Shayari(57,"🖤ना जिकर करो मेरी अदा के बारे मे,\n" +
                "हम भी जानते है सब कुछ वफा के बारे मे,\n" +
                "सुना है वो भी मोहब्बत का शौक रखते है,\n" +
                "जिन्हे खबर ही नही कुछ वफा के बारे मे..🖤"))
        romticShayriList.add(Shayari(58,"🥰समेट लो इन नाजुक पलों को,\n" +
                "न जाने ये लम्हे कल हो ना हो,\n" +
                "चाहे हो भी ये लम्हे,\n" +
                "क्या मालूम शामिल उन पलों में हम हो ना हो..😏"))
        romticShayriList.add(Shayari(59,"👰‍♀️आप खुद नही जानते आप कितने प्यारे हो,\n" +
                "जान हो हमारी पर जान से प्यारे हो,\n" +
                "दुरियों के होने से कोई फर्क नही पडता,\n" +
                "आप कल भी हमारे थे और आज भी हमारे हो..🤴"))

        romticShayriList.add(Shayari(60,"💔दर्द को बेचकर ख़ुशी खरीद लुंगी,\n" +
                "सपनों को बेचकर ज़िन्दगी खरीद लुंगी,\n" +
                "होगा इम्तिहान तो देखेगी दुनिया,\n" +
                "खुद को बेच कर आप की ख़ुशी खरीद लुंगी..🤴"))
        romticShayriList.add(Shayari(61,"🥰प्यार उसे करो जो तुमसे प्यार करे,\n" +
                "खुद से भी ज्यादा तुम पर ऐतबार करे,\n" +
                "तुम बस एक बार कहो की रुको दो पल,\n" +
                "और वो उन दो पलों\n" +
                "के लिए पुरी जिंदगी इंतज़ार करे..🖤"))
        romticShayriList.add(Shayari(62,"👩रुठने का हक आप रखते है,\n" +
                "तो मनाने की चाहत हम रखते है,\n" +
                "आपके होठों पे मुस्कुराहट यु ही बनी रहे,\n" +
                "ये ही दुआ रब से हम रोज करते है..😍"))
        romticShayriList.add(Shayari(63,"🧚‍♀️वो मेरे लिए कुछ खास हैं यार,\n" +
                "जिनके लौट आने कि आस हैं यार,\n" +
                "वो नजरो से दूर हैं तो क्या हुआ,\n" +
                "उनके दिल की धड़कन मेरे पास है यार..💞"))
        romticShayriList.add(Shayari(64,"💝इश्क़ ऐसा करो की धड़कन में बस जाये,\n" +
                "सांसे भी लो तो खुशबु ऊसी की आये,\n" +
                "प्यार का नशा आँखों पे छाये,\n" +
                "बात कोई भी हो पर नाम उसी का आये..👩‍❤️🤴‍"))
        romticShayriList.add(Shayari(65,"👥लोग कहते है के इश्क़ इतना मत करो,\n" +
                "के सर पे सवार हो जाए,\n" +
                "हम कहते है के इश्क़ इतना करो,\n" +
                "के पत्थर दिल को भी तुमसे प्यार हो जाए..😍"))
        romticShayriList.add(Shayari(66,"💞खुदा प्यार सबको देता है,\n" +
                "दिल भी सबको देता है,\n" +
                "दिल में बसने वाला भी सबको देता है,\n" +
                "पर, दिल को समझने वाला\n" +
                "नसीब वालो को ही देता है..💝"))
        romticShayriList.add(Shayari(67,"👫आप जैसे फ्रेंड हमे खास लगते हैं,\n" +
                "इस लिए हम आप से इक आस रखते हैं,\n" +
                "न जाने कब आ जाये आप का मेसज,\n" +
                "इस लिए मोबाइल दिल के पास रखते हैं..🖤"))
        romticShayriList.add(Shayari(68,"👁️👁️देख मेरे प्यार कि गहराईयों में,\n" +
                "सोच मेरे बारे में रात कि तन्हाईयो में,\n" +
                "अगर हो जाये मेरी चाहत का यकीन,\n" +
                "तो पाओगे मुझे अपनी परछाईयो में.🤴"))
        romticShayriList.add(Shayari(69,"🖤दुर रह कर करीब रहने की आदत है,\n" +
                "याद बनकर आँखों से बहने की आदत है ,\n" +
                "करीब ना होते हुए भी करीब पाओगे,\n" +
                "मुझे एहसास बनकर रहने की आदत है..🤴"))
        romticShayriList.add(Shayari(70,"😥जब आप किसी से रूठ कर\n" +
                "नफरत से बात करो,\n" +
                "और वो उसका जवाब मोहब्बत से दे,\n" +
                "तो समझ जाना के वो आपको\n" +
                "खुद से ज्यादा प्यार करता है..🧚‍♀️"))
        romticShayriList.add(Shayari(71,"🏡घर नहीं पूरा गांव सजेगा, 👰‍♀️जब तेरे नाम के पीछे Surname हमारा लगेगा..🧚‍♂️"))
        romticShayriList.add(Shayari(72,"🌍दुनिया में मोहब्बत इसलिये बरकरार है..💞, क्यूँकि इकतरफ़ा प्यार आज भी वफ़ादार है..🖤"))
        romticShayriList.add(Shayari(73,"🌙चाँद को भी मिल गई चाँदनी, ✨अब सितारों का क्या होगा, अगर मोहब्बत एक से ही करली, तो बाकी हज़ारों का क्या होगा..😘"))
        romticShayriList.add(Shayari(74,"👰‍♀️जो लड़की आपकी बात सुन कर, आपको पागल कहती है ना वही आपसे सच्चा प्यार करती है..😅"))
        romticShayriList.add(Shayari(75,"💞जाने ऐसी क्या बात है ‘इश्क़’ में? लोग मरते है, मगर फिर भी करते है..🖤"))
        romticShayriList.add(Shayari(76,"💞इश्क करो तो मुस्कुरा कर,💔 किसी को धोखा न दो अपना बना कर, करलो याद जब तक जिन्दा हैं, फिर न कहना चले गये दिल में यादे बसा कर..💔"))
        romticShayriList.add(Shayari(77,"👁️👁️आँखों में आंसुओं की लकीर बन गई, जैसी चाहिए थी वैसी तकदीर बन गई, हमने तो सिर्फ रेत में उंगलियाँ घुमाई थी, गौर से देखा तो आपकी तस्वीर बन गई..👰‍♀️"))
        romticShayriList.add(Shayari(78,"👩जरा सी बदमाश जरा सी नादान है तू, लेकिन ये भी सच है की मेरी जान है तू..😍"))
        romticShayriList.add(Shayari(79,"😥गम ने हंसने ना दिया, जमाने ने रोने ना दिया, नींद आई तो तेरी याद ने, सोने न दिया..💔"))
        romticShayriList.add(Shayari(80,"🧚‍♀️जिस शख्स की गलती, ‘गलती’ ना लगे, किताब-ऐ-इश्क में उसे ‘आशिक कहते है..😍😘"))


        romaticShayariShowAdapter= ShayariDataShowAdpter(this,romticShayriList)
        binding.romaticshyariShowrecycleview.adapter=romaticShayariShowAdapter
        binding.romaticshyariShowrecycleview.layoutManager= LinearLayoutManager(this)

        binding.backBtn.setOnClickListener {
            onBackPressed()
        }

    }
}