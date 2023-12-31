package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.Model.Shayari
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivityGoodMoringBinding
import com.google.android.gms.ads.AdListener
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.LoadAdError
import com.google.android.gms.ads.MobileAds

class GoodMoringActivity : AppCompatActivity() {

    lateinit var binding: ActivityGoodMoringBinding

    lateinit var goodmoringShowAdapter: ShayariDataShowAdpter
    var goodmorningShayriList= mutableListOf<Shayari>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGoodMoringBinding.inflate(layoutInflater)
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
                Toast.makeText(this@GoodMoringActivity, "ads loaded", Toast.LENGTH_SHORT).show()
            }

            override fun onAdOpened() {
                super.onAdOpened()
            }
        }

        goodmorningShayriList.add(
            Shayari(402,"❣️जन्नत की महलों में हो महल आपका,\n" +
                    "ख्वाबो की वादी में हो शहर आपका,\n" +
                    "सितारो के आंगन में हो घर आपका,\n" +
                    "दुआ है सबसे खूबसूरत हो \n" +
                    "हर दिन आपका..💝"))
        goodmorningShayriList.add(Shayari(403,"🌠ठंडी हवा ले कर आया है ये पैगाम हमारा,\n" +
                "जल्दी से उठ जाओ, ख़ुशी से भरा रहे आज का ये दिन हमारा!!\n" +
                "Good Morning Dear..🥰❣️"))
        goodmorningShayriList.add(Shayari(404,"🌹ताज़ी हवा में फूलों की महक हो,\n" +
                "🌞पहली किरण में चिडियों की चहक हो,\n" +
                "जब भी खोलो तुम अपनी पलकें,\n" +
                "उन पलकों में बस खुशियों की झलक हो..🥰💖"))
        goodmorningShayriList.add(Shayari(405,"👂हमें ने सुना है कि किसी को गुड मोर्निंग कहा तो,उनकी सुबह बहुत अच्छी गुजरती है,पर हमने ये दिल से महसूस किया किआपको गुड मोर्निंग कहते हैं तो हमारा दिन अच्छा गुजरता हैं\n" +
                "Good Morning..💝"))
        goodmorningShayriList.add(Shayari(406,"❣️दिल ने कहा कोई याद कर रहा है, मैंने सोचा दिल मज़ाक कर रहा है, फिर आईं हिचकी मैंने सोचा,\n" +
                "अपना ही कोई मैसेज का इंतज़ार कर रहा है.😇🥰"))
        goodmorningShayriList.add(Shayari(407,"🌷फूलों की शुरुवात कली से होती है जिंदगी की शुरुआत प्यार से होती है प्यार की शुरुआत अपनों से होती है और अपनों की शुरुआत आपको याद करने से होती है सुप्रभात.🌄"))
        goodmorningShayriList.add(Shayari(408,"😇मुस्कुराहट का कोई मोल नही होता है, रिश्तों का कोई तोल नही होता है, इंसान तो मिल जातें है हमे हर मोड़ पर, लेकिन हर कोई आप की तरह अनमोल नही होता है..👩🏼‍🤝‍👨🏼"))
        goodmorningShayriList.add(Shayari(409,"👀पलके झुका कर सलाम करते हैं, हम तह दिल से आपके लिए दुआ करते हैं, कुबूल हो तो बस मुस्कुरा देना, \n" +
                "हम ये प्यारा सा दिन आपके नाम करते हैं..🥰"))
        goodmorningShayriList.add(Shayari(410,"❣️आजाद रहिए विचारों से लेकिन \n" +
                "बंदे रहिए संस्कारों से..😇\n" +
                "🌷सुप्रभात.❣️🌹"))
        goodmorningShayriList.add(Shayari(411,"🌄सुबह-सुबह आपकी यादों का साथ हो,🕊️मीठी-मीठी परिंदों की आवाज़ हो,आपके चेहरे पर हमेशा मुस्कुराहट हो,और हमारी ज़िन्दगी में सिर्फ आपका साथ हो..🥰👫"))
        goodmorningShayriList.add(Shayari(412,"❣️जीवन में जब कुछ बड़ा मिल जाए तो छोटे को कभी मत भूलना क्योंकि जहां सुई का काम हो वहां तलवार काम नहीं करती \n" +
                "💐सुप्रभात..😇"))
        goodmorningShayriList.add(Shayari(413,"🌷फूल खिलने का वक्त हो गया है, सूरज निकलने का वक्त हो गया है, मीठी नींद से जागो मेरे दोस्त, क्योंकि सपनों को हकीकत करने में बदलने का वक्त हो गया है \n" +
                "सुप्रभात..😇🌄"))
        goodmorningShayriList.add(Shayari(414,"😇इस दुनिया में अच्छे सभी होते हैं बस पहचान बुरे वक्त में होती है\n" +
                " सुप्रभात..🌄🖤"))
        goodmorningShayriList.add(Shayari(415,"⌚बदल जाओ वक्त के साथ या फिर वक्त बदलना शिवम मजबूरियों को मत कोसो हर हाल में चलना सीखो..❣️\n" +
                "सुप्रभात..🙏🌄"))
        goodmorningShayriList.add(
            Shayari(416,"👫कोई तुम्हे तुम्हारी मंजिल से दूर कर दे यह इतनी आसान बात नहीं हैं मेहनत करो और तोड़ दो ताला\n" +
                    "ये सपने हैं तुम्हारे, किसी की जायदाद नहीं हैं..❣️"))
        goodmorningShayriList.add(
            Shayari(417,"🌄सुबह-सुबह ये कलियां सब खिल जाती हैं,\n" +
                    "हमे तो तेरी यादों की गलियां मिल जाती हैं..👫,\n" +
                    "तुझसे मुलाकात तो हमारी कभी होती नही,\n" +
                    "लेकिन सूरज की पहली किरण के साथ एक आस तो मिल जाती है..🥰"))
        goodmorningShayriList.add(
            Shayari(418,"🌄हर सुबह एक वादा कीजिए अपना भी हंसते हुए गुजारा कीजिए\n" +
                    "सुप्रभात.🙏❣️"))
        goodmorningShayriList.add(
            Shayari(419,"🌄रोज सुबह उठकर ऊपर वाले का नाम लिया करो,रोज सुबह ताज़ा हवा का जाम लिया करो,रोज सुबह अपना मोबाईल थाम लिया करो,रोज सुबह मोबाइल पर\n" +
                    " हमसे प्यारा सा पैगाम\n" +
                    "    लिया करो..❣️😇"))
        goodmorningShayriList.add(Shayari(420,"🥰आप हर सुबह मुस्कुराते रहो,\n" +
                "आप हर शाम गुनगुनाते रहो,\n" +
                "हम तो खुदा से यही दुआ करते हैं,\n" +
                "आप जिससे भी मिलो आप उसकी यादों में रहो..💖"))
        goodmorningShayriList.add(Shayari(421,"🖤ज़िन्दगी का अनुभव थोड़ा कच्चा है,\n" +
                "जितना समय गुज़र गया.. अच्छा है,\n" +
                "अपना घरौंदा ख़ुशी से चहके सदा,\n" +
                "हम बड़े हो गए पर दिल तो बच्चा है..❣️\n" +
                "🙏शुभ प्रभात..💖🥰"))
        goodmorningShayriList.add(Shayari(422,"🏕️जरा इस सुबह की रौनक तो देखो,\n" +
                "उसकी दिल मे बसी तस्वीर को तो देखो..🥰"))
        goodmorningShayriList.add(Shayari(423,"🙏प्रतिदिन की गई छोटी सी कोशिश एक दिन बड़ा परिणाम लेती है..❣️\n" +
                " सुप्रभात..🌄🙏"))
        goodmorningShayriList.add(Shayari(424,"🌅आने वाले कल का वेदर करने के लिए आपको अपने हाथ से लड़ना होगा\n" +
                "सुप्रभात..🙏😇"))
        goodmorningShayriList.add(Shayari(425,"💧पानी की बूंदे फूलों को भिगा रही हैं ठंडी ले रहे हैं ताजगी जगा रही हैं हो जाइए आप भी इनमें शामिल एक कार्य सुबह\n" +
                " आपको जगा रही है\n" +
                "सुप्रभात..🌄💐"))
        goodmorningShayriList.add(Shayari(426,"मुश्किलें इंसान को मजबूर नहीं बल्कि उनके इरादों को मजबूत बना देती है\n" +
                "सुप्रभात.\uD83C\uDF04\uD83D\uDE4F"))
        goodmorningShayriList.add(
            Shayari(427,"🖤अगर आप आज रुक जाते हैं तो आप का आज तक का सारा संघर्ष बर्बाद हो जाता है\n" +
                    "सुप्रभात.\uD83D\uDE4F\uD83D\uDE07"))

        goodmorningShayriList.add(Shayari(428,"🌆वो सुहानी शाम गुज़र गई और महकती सुबह आ गई,\n" +
                "दिल ज़ोरों से धड़का और तुम्हारी याद आ गई..👫"))
        goodmorningShayriList.add(Shayari(429,"🌅हर सुबह आपको सताना प्यारा लगता है,\n" +
                "सोये हुए को नींद से जगाना अच्छा लगता है,\n" +
                "जब भी किसी की याद आती है तो,\n" +
                "उसको भी अपनी याद दिलाना अच्छा लगता है\n" +
                "Good Morning🌄❣️"))
        goodmorningShayriList.add(Shayari(430,"🌞सूरज के बिना सुबह नहीं होती,\n" +
                "✨चाँद के बिना रात नहीं होती,\n" +
                "⛈️बादल के बिना बरसात नहीं होती,और आपकी याद के बिना दोस्त.🤝,\n" +
                "दिन की शुरुआत नहीं होती।\n" +
                "शुभ प्रभात..🥰🌅"))


        goodmorningShayriList.add(Shayari(431,"🌼ये खूबसूरत फिज़ाओ में फूलों की खुशबू हो,\n" +
                "सुबह की किरण में पंछियों की आवाज हो,\n" +
                "कभी भी खोलो अपनी ये निगाहे,\n" +
                "इनमें सिर्फ खुशियों का ही राज हो..🥰❣️ "))
        goodmorningShayriList.add(Shayari(432,"🌞खिलखिलाती सुबह ताजगी से भरा सवेरा है,🌼फूलों और बहारों ने आपके लिए रंग बिखेरा है,सुबह कह रही है जाग जाओ आपकी मुस्कुराहट के बिना सब अधूरा है\n" +
                "🌄सुप्रभात..🌼🙏"))
        goodmorningShayriList.add(Shayari(433, "🥰खूबसूरत स्वीट सी नींद के बाद,\n" +
                "रात के कुछ सुनहरे लम्हों के बाद,\n" +
                "सुबह के कुछ हसीन सपनों के साथ,जिन्दगी में कुछ प्यारे अपनों के साथ..👩🏼‍🤝‍👨🏼,\n" +
                "आपको हमारी और से\n" +
                "Good Morning..🥰🙏"))

        goodmorningShayriList.add(Shayari(434,"🌄ये दुनिया सुबह सवेरे चलने लगती है,\n" +
                "हमे तो तेरी याद आने लगती है,\n" +
                "दुनिया की हर खुशी हो तेरे दामन में,\n" +
                "मेरे होठों से बस यही दुआ आने लगती है..💝"))
        goodmorningShayriList.add(Shayari(435,"🌞सुबह के सूरज की पहली किरण दिल को छू जाती है, महकते फूलों की महक दिल मे जादू जगा जाती है..🌼🥰"))
        goodmorningShayriList.add(Shayari(436,"🌅सुबह की हर धूप कुछ याद दिलाती है,\n" +
                "हर महकती खुशबू एक जादू जगाती है,\n" +
                "कितनी भी व्यस्त क्यूँ ना हो ये जिंदगी,\n" +
                "सुबह सुबह अपनों की याद आ ही जाती है!!\n" +
                "सुप्रभात..🌄🙏"))
        goodmorningShayriList.add(Shayari(437,"✨सितारों में आपकी तस्वीर नज़र आती है,\n" +
                "खोजती है निग़ाहें उस चेहरे को,\n" +
                "याद में जिसकी सुबह हो जाती है..🥰\n" +
                "💐Good Morning🌅"))


        goodmorningShayriList.add(Shayari(438,"🕐वक्त और समझ किस्मत वालों को ही \n" +
                "मिलती है,\n" +
                "क्यूंकि वक़्त हो तो समझ नहीं आता,\n" +
                "और समझ आता है तो वक़्त नहीं होता..🖤"))
        goodmorningShayriList.add(Shayari(439,"👀आपकी आँखों को जगा दिया हमने,\n" +
                "गुड मॉर्निंग का फ़र्ज़ अदा किया हमने..🌄,\n" +
                "मत सोचना की सोये हुए हैं हम..,\n" +
                "आज आपसे पहले आपको याद किया हमने!!\n" +
                "💐Good Morning..🙏🥰"))
        goodmorningShayriList.add(Shayari(440,"👫वादा किया है तो निभायेगे,\n" +
                "सूरज की किरण बनकर तेरी छत पर आयेगे..🌤️,\n" +
                "हम हैं तो जुदाई का गम कैसा,\n" +
                "तेरी हर सुबह को फूलों से सजायेगे..💐\n" +
                "💖HAPPY GOOD MORNING..💐🥰"))
        goodmorningShayriList.add(Shayari(441,"🌄नयी सुबह, खुशियों का घेरा,\n" +
                "🌤️सूरज की किरणें, चिड़ियों का बसेरा,\n" +
                "ऊपर से आपका ये खिलता हुआ चेहरा..🥰,\n" +
                "🥰मुबारक हो आपको ये सुहाना सवेरा..🌄"))
        goodmorningShayriList.add(Shayari(442,"“🙏वक्रतुण्ड महाकाय सुर्य कोटि समप्रभ,\n" +
                "निर्विघ्नं कुरु मे देव सर्वकार्येषु सर्वदा ll\n" +
                "*गणपती बाप्पा मोरया..🙏 *\n" +
                "*मंगलमुर्ती मोरया..🙏*\n" +
                "“शुभ-प्रभात” “शुभ-दिन..🙏💖"))
        goodmoringShowAdapter= ShayariDataShowAdpter(this,goodmorningShayriList)
        binding.goodmorningShowrecycleview.adapter=goodmoringShowAdapter
        binding.goodmorningShowrecycleview.layoutManager= LinearLayoutManager(this)

        binding.backBtn.setOnClickListener {
            onBackPressed()
        }

    }
}