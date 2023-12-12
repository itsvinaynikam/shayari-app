package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.Model.Shayari
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivityBrokenShayariBinding
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds

class BrokenShayariActivity : AppCompatActivity() {

    lateinit var binding: ActivityBrokenShayariBinding
    lateinit var brokenShayariShowAdapter: ShayariDataShowAdpter
    var brokenShayriList= mutableListOf<Shayari>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBrokenShayariBinding.inflate(layoutInflater)
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
                Toast.makeText(this@BrokenShayariActivity, "ads loaded", Toast.LENGTH_SHORT).show()
            }

            override fun onAdOpened() {
                super.onAdOpened()
            }
        }

        brokenShayriList.add(
            Shayari(122,"👫अगर पसंद नहीं मेरा साथ तोह दूर हो जाओ,\n" +
                    "यूँ हर रोज बिजी होने का बहाना मत बनाओ..😥"))
        brokenShayriList.add(Shayari(123,"👩‍अनजाने में ही सही,एक नेक काम करते रहे,उनको करते रहे आबाद,\n" +
                "खुद को बर्बाद करते रहे..\uD83D\uDC68"))
        brokenShayriList.add(Shayari(124,"🖤लोग प्यार में बड़ी बड़ी बातें करते हैं,और फिर एक दिन छोड़ कर चले जाते हैं..💔"))
        brokenShayriList.add(Shayari(125,"जो पूछो तुम मैं न बताऊं ऐसे तो हालात नहीं,\n" +
                "एक छोटा सा दिल टूटा है और तो कोई बात नहीं ..💔"))
        brokenShayriList.add(Shayari(126,"👸ये न कह मोहब्बत मिलना किस्मत की बात है,\n" +
                "क्योंकि मेरी बर्बादी में तेरा भी हाथ है..😥"))
        brokenShayriList.add(Shayari(127,"🤴हम न पा सके तुझे मुद्दतो चाहने के बाद,और किसी ने 👸तुझे अपना बना लिया,\n" +
                "चन्द रस्मे निभाने के बाद..💙"))
        brokenShayriList.add(Shayari(128,"💔मेरे टूटे हुए दिल को तुम कैसे जोड़ दोगे,\n" +
                "मुरझाए हुए फूल को तुम कैसे खिलापाओगे..👸"))
        brokenShayriList.add(Shayari(129,"🖤दिल की क्या बिसात थी निगाह-ए-जमाल में,इक आइना था टूट गया देख-भाल में..💔"))
        brokenShayriList.add(Shayari(130,"खुदा कभी किसी पे फिदा न करे,\n" +
                "अगर करे भी तो कभी कयामत तक जुदा न करे..💛"))
        brokenShayriList.add(Shayari(131,"👸एक साँस भी पुरी नहीं होती,तेरे ख्यालों के बिना,तुमने ये कैसे सोचा कि,हम जिदंगी गुजार देगे तेरे बिना..💙"))
        brokenShayriList.add(Shayari(132,"💛दिल मे आरजू के दिये जलते रहेगे,आँखों से मोती निकलते रहेगे,तुम शमा बन कर दिल में रोशनी करो,\n" +
                "हम मोम की तरह पिघलते रहेंगे..🖤"))
        brokenShayriList.add(Shayari(133,"हमे दिल में बसाया था तो साथ निभाया क्यों नही,\n" +
                "जब नजरे मिलाई थी हमसे तो नजर में बसाया क्यों नही,\n" +
                "तूने तो हमसे जिंदगी भर साथ निभाने का वादा किया था,\n" +
                "तो छोड़ कर जाने से पहले एक बार बताया क्यों नही।"))
        brokenShayriList.add(Shayari(134,"🤴मेरे ख्यालो में सिर्फ तुम हो तुम्हे कैसे भुला दूँ,इस दिल की धड़कन हो सिर्फ तुम,\n" +
                "तुम्हे कैसे निकाल दूँ..😥"))
        brokenShayriList.add(Shayari(135,"💔सच कहो तो उन्हें ख्वाब लगता है,और शिकवा करो तो उन्हें मज़ाक लगता है,\n" +
                "हम कितनी शिद्दत से उन्हें याद करते है,और एक वो हैं जिन्हें ये सब इत्तेफाक लगता है..🖤"))
        brokenShayriList.add(Shayari(136,"🥺ख्वाइशें तमाम पिघलने लगी है,फिर से एक और शाम ढलने लगी है,\n" +
                "उनसे मुलाकात के इंतज़ार में बैठे है,अब ये जिद भी तो हद से गुजर ने लगी है..💛"))
        brokenShayriList.add(Shayari(137,"👸तुम हमे क्यों इतना दर्द देते हो,जब जी में आये तब रुला देते हो,\n" +
                "लफ़्ज़ों में तीखा पन और नजरो में बेरुखी,ये कैसा इश्क है जो तुम हमसे करते हो..🖤"))
        brokenShayriList.add(Shayari(138,"👸तुझे दर्द देने का शौक था बहुत,हमे भी दर्द सहने का शौक था बहुत..🥺"))
        brokenShayriList.add(Shayari(139,"👨🏻‍🤝‍👨🏽बीच सफर में तुम हमसे अलविदा कह गये,पहले अपना बनाया फिर पराया कर गये,\n" +
                "जब जिंदगी की जरूरत सी बन गये,तभी वो हमसे किनारा कर गये..💔"))
        brokenShayriList.add(Shayari(140,"👥न जाने वो कोन है जो बिन बुलाये आता है,\n" +
                "मेरे ख्याल से तेरा ख्याल ही होगा जो मुझे सताता है..🥺"))
        brokenShayriList.add(Shayari(141,"👦झूठ कहूँ तो बहुत कुछ है मेरे पास,सच कहूँ तो कुछ नही सिवा तेरे मेरे पास..💛"))
        brokenShayriList.add(Shayari(142,"👸तेरे लिए लड़ लिए सबसे,लेकिन 🤴हम हार गये अपने नसीब से..💙"))
        brokenShayriList.add(Shayari(143,"दो पल को ही सही पर मेरी तन्हाइयो में खो जाओ..💕,मैं तेरा और तुम मेरी दो पल के लिए हो जाओ।"))
        brokenShayriList.add(Shayari(144,"💔मेरे दिल को तोड़ कर वो किसी और की बाहों में सो गया\n" +
                "कितनी आसान से वेबफाई का नाम मजबूरी हो गया👩🏿‍🥺‍👨🏽"))
        brokenShayriList.add(Shayari(145,"💙अब छोड़ो वफाओ के किस्से ये तो न जाने कितनो का रोना है,\n" +
                "पहले कोन था साथ हमारे और अब कोन अपना होना है..👩🏿‍🤝‍👨🏽"))
        brokenShayriList.add(Shayari(146,"👸कोई मरतो नही जाता इश्क-ए-जुदाई में,\n" +
                "लेकिन जी भी तो नही पाता है जिंदगी की तन्हाई में..💔"))
        brokenShayriList.add(Shayari(147,"🖤हर घड़ी इस जिंदगी को आज़माया है हमने,इस जिंदगी में सिर्फ गम पाया है हमने,\n" +
                "जिस ने हमारी कभी कदर ही न जानी,उस वेबफा को इस दिल में बसाया है हमने..💕"))
        brokenShayriList.add(Shayari(148,"💕इस इश्क की किताब से,बस दो ही सबक याद हुए,\n" +
                "कुछ तुम जैसे आबाद हुए,कुछ हम जैसे बर्बाद हुए..💔"))
        brokenShayriList.add(Shayari(149,"🤴हम खुश हैं कम से कम कोई हमारी बात तो करता है,\n" +
                "वो बुरा कहता है तो क्या, कम से कम कोई याद तो करता है।..💛"))
        brokenShayriList.add(Shayari(150,"🥺मुझे दिल से यूँ पुकारा न करो,यूँ आँखों से हमे इशारा न करो,दूर हूँ तुझसे मजबूरी है मेरी,यूँ तन्हाइयों में मुझे तड़पाया न करो..🤴"))
        brokenShayriList.add(Shayari(151,"👰‍♀️जिसने हमको चाहा उसे हम चाह न सके,\n" +
                "और जिसको हमने चाहा उसको हम पा न सके..💔"))
        brokenShayriList.add(Shayari(152,"👰‍♀️ऐसा नही है मेरे दिल में तेरी तस्वीर नही है,\n" +
                "पर शायद मेरे हाथो में ही तेरे नाम की लकीर नही है..🖤"))
        brokenShayriList.add(Shayari(153,"👫हमारे रिश्तों के सब सपने टूट गए,\n" +
                "उनकी यादों में खुद को हम खो गए..🥺"))
        brokenShayriList.add(Shayari(154,"प्यार मोहब्बत तो सब करते है,इसको खोने से भी सब डरते है,\n" +
                "हम तो न प्यार करते है न मोहब्बत करते है,हमतो बस 👰‍♀️आपकी एक मुस्कुराहट पाने को तरसते है..💕"))
        brokenShayriList.add(Shayari(155,"💙 प्यार हर किसी को जीना सिखा देता है,\n" +
                "वफ़ा के नाम पर मरना सिखा देता है,प्यार नही किया तो करके देखो,ये हर दर्द सहना सिखा देता है..🖤"))
        brokenShayriList.add(Shayari(156,"🤴हम दुआएं करेंगे उनपर एतवार रखना,न कोई हमसे कभी सवाल रखना,\n अगर दिल में चाहत हो हमे खुश देखने की,बस 👰‍♀️हमेशा मुस्कुराना और अपना ख्याल रखना..💕"))
        brokenShayriList.add(Shayari(157,"🥺हर बात में आँसू बहाया नही करते,हर बात दिल की हर किसी से कहा नही करते,\n" +
                "ये नमक का शहर है,इसलिए ज़ख्म यहाँ हर किसी को दिखाया नही करते..🖤"))
        brokenShayriList.add(Shayari(158,"💙मंजिल भी उसकी थी, रास्ता भी उसका था,एक मैं ही अकेला था, बाकि सारा काफिला भी उसका था,\n" +
                "एक साथ चलने की सोच भी उसकी थी,और बाद में रास्ता बदलने का फैसला भी उसी का था..💔"    ))
        brokenShayriList.add(Shayari(159,"👦अपने सारे सपने तोड़कर बैठे हैं,दिल के अरमान छोड़कर बैठे हैं,न कीजिये हमसे वफा की बातें,अभी तो दिल के टुकड़े जोड़कर बैठे हैं..💔"))
        brokenShayriList.add(Shayari(160,"💔कुछ सपने बुरे वक़्त ने तोड़ दिए,\n" +
                "और कुछ हमने देखने ही छोड़ दिए..🖤"))
        brokenShayriList.add(Shayari(161,"🌙वो चांद सा हर रात चमकता रहा,\n" +
                "मैं तारा सा एक रात टूट गया..🌠"))

        brokenShayariShowAdapter= ShayariDataShowAdpter(this,brokenShayriList)
        binding.brokenhyariShowrecycleview.adapter=brokenShayariShowAdapter
        binding.brokenhyariShowrecycleview.layoutManager= LinearLayoutManager(this)

        binding.backBtn.setOnClickListener {
            onBackPressed()
        }

    }


}