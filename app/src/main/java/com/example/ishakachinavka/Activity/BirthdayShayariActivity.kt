package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivityBirthdayShayariBinding

class BirthdayShayariActivity : AppCompatActivity() {

    lateinit var binding: ActivityBirthdayShayariBinding

    lateinit var birthadayShowAdapter: ShayariDataShowAdpter
    var birthdayShayriList= mutableListOf<String>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBirthdayShayariBinding.inflate(layoutInflater)
        setContentView(binding.root)

        birthdayShayriList.add("रोशनी लेकर आया\n" +
                "और चिड़िया ने गाना गाया\n" +
                "फूलों ने हंस हस कर बोला\n" +
                "मुबारक हो तुम्हारा जन्मदिन आया।")
        birthdayShayriList.add("तमन्ना करते हो आप जिन खुशियों की,\n" +
                "वह खुशियां आपके क़दमों में हो,\n" +
                "भगवान आपको वह सब हक़ीक़त में दे,\n" +
                "जो सोचा आपने सपनों में हो!")
        birthdayShayriList.add("जन्मदिन के शुभ अवसर पर\n" +
                "भेंट करू क्या उपहार तुम्हे\n" +
                "बस इसे ही स्वीकार कर लेना\n" +
                "लाखों लाखों प्यार तुम्हे\n" +
                "जन्मदिन की हार्दिक शुभकामनाये!!!")
        birthdayShayriList.add("God बुरी नज़र से बचाए आप को,\n" +
                "चाँद सितारों से सजाए आप को,\n" +
                "गम क्या होता है ये आप भूल ही जाओ,\n" +
                "खुदा ज़िन्दगी मे इतना हँसाए आप को…\n" +
                "।जन्मदिन की बधाई।।")
        birthdayShayriList.add("आशाओं के दीप जले\n" +
                "आशीर्वाद उपहार मिले\n" +
                "जन्मदिन है तुम्हारा\n" +
                "शुभकामनाओं संग खूब प्यार मिले\n" +
                "जन्मदिन मुबारक हो")
        birthdayShayriList.add("हर लम्हा आपके चहरे पे मुस्कान रहे,\n" +
                "हर ग़म से आप अन्जान रहे,खुशीराम के साथ महक उठे आपकी जिंदगी,हमेशा आपके पास वो इंसान रहे…")
        birthdayShayriList.add("तमाम उम्र तुम्हे ज़िन्दगी का प्यार मिले,\n" +
                "खुदा करे ये ख़ुशी तुमको बार बार मिले,\n" +
                "तुम्हे जन्मदिन की ढेर सारी शुभकामनाएं।")
        birthdayShayriList.add("आज ही के दिन\n" +
                "एक चाँद उतर के आया था\n" +
                "ऊपर वाले ने बड़ी फुर्सत से\n" +
                "मेरे प्यार बनाया था\n" +
                "जन्मदिन मुबारक हो")
        birthdayShayriList.add("चाँद की तरह तू जगमगाए,\n" +
                "पंछियों की तरह गुनगुनाये,\n" +
                "तेरे जन्मदिन पर दुआ करते हैं,\n" +
                "तू जो चाहे वो तुझे मिल जाये।\n" +
                "Happy Birthday")
        birthdayShayriList.add("सितारों से आगे भी कोई जहां होगा,\n" +
                "जहां के सारे नजारों कि कसम –\n" +
                "आपसे प्यारा वहां भी ना होगा…\n" +
                "\uD83C\uDF82*Happy Birthday*\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81")

        birthdayShayriList.add("खुद भी नाचेंगे \u200D तुमको \u200D भी नचायेंगे\n" +
                "बड़ी धूम धाम से तुम्हारा बर्थड़े बनायेंगे\n" +
                "गिफ्ट में मांगो अगर जान हमारी तो आपकी \u200D कसम हसँ कर कुरबाँ हो जायेगें\n" +
                "Happy Wala Birthday")
        birthdayShayriList.add("यही दुवा करता हूँ खुदा से,\n" +
                "आपकी ज़िंदगी में कोई गम न हो,जन्मदिन पर मिले हज़ारों खुशियां,चाहे उनमें शामिल हम न हो,जन्मदिन की हार्दिक शुभकामनाएं!!")
        birthdayShayriList.add("दीपक में अगर नूर ना होता,\n" +
                "तन्हा दिल इतना मजबूर ना होता,\n" +
                "हम आपको खुद बर्थडे विश करने आते,\n" +
                "अगर आपका आशियाना इतनी दूर ना होता।")
        birthdayShayriList.add("आ तेरी उम्र में लिख दूँ \uD83C\uDF19✨चाँद-सितारों\uD83C\uDF19✨ से,\n" +
                "तेरा जन्मदिन मनाऊँ फूलों से बहारों से…\n" +
                "हर एक खूबसूरती दुनिया \uD83C\uDF0E से मैं ले आउ,\n" +
                "सजाऊ में ये महेफिल हर हसिन नजारों से…\n" +
                "\uD83C\uDF80\uD83C\uDF81जन्मदिन की ढेर सारी शुभकामनायें…\uD83C\uDF82\uD83C\uDF82")
        birthdayShayriList.add("ये दुआ \uD83D\uDE4F है आपके जन्मदिन पे हमारी,\n" +
                "ना तूटे कभी दोस्ती हमारी,\n" +
                "सारी जिंदगी देंगे खुशियाँ आपको…\n" +
                "और वो खुशियाँ होगी प्यारी प्यारी…\uD83D\uDE0A\n" +
                "\uD83C\uDF82Happy Birthday to you my Best Friend…\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81")
        birthdayShayriList.add("आसमान की बुलंदियों पर नाम हो आपका,\n" +
                "चाँद की धरती पर मुकाम हो आपका,\n" +
                "हम तो रहते है छोटी सी दुनियाँ \uD83C\uDF0E में,\n" +
                "पर खुदा करे सारा जहाँ हो आपका…\n" +
                "~ Happy Birthday\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81")
        birthdayShayriList.add("हर किसी को बताने आए हम,\n" +
                "दुआ के साथ उपहार भी लाए हम,\n" +
                "कबूल करो इस दोस्त का नजराना,\n" +
                "आपको जन्मदिन की बधाई देने आए हम।")
        birthdayShayriList.add("मुस्कान आपके होंटो से कहीं जाये नही,\n" +
                "आँसू आपके पलकों पे कभी आये नहीं,\n" +
                "पूरा हो आपका हर ख्वाब,\n" +
                "और जो बूरा ना हो वो ख्बाव कभी आये नही…")
        birthdayShayriList.add()
        birthdayShayriList.add()

        birthdayShayriList.add("फूलों ने कहा खुश्बू से\n" +
                "खुश्बू ने कहा बादल से\n" +
                "बादल ने कहा लहरों से\n" +
                "लहरों ने कहा सूरज से\n" +
                "और बाद में हमने कहा आपकों दिल से\n" +
                "हैप्पी बर्थडे टू यू!!")
        birthdayShayriList.add("एक तुम हो कि कितने अच्छे हो,\n" +
                "एक तुम हो कि कितने प्यारे हो,\n" +
                "एक तुम हो कि कितने सच्चे हो और,\n" +
                "एक हम हैं कि झूठ पर झूठ बोले जा रहे हैं\n" +
                "हैप्पी बर्थडे टू यू")
        birthdayShayriList.add("तुम्हारे जन्मदिन पर ये दुआ है हमारी\n" +
                "जितने हों चाँद तारे उतनी उम्र तुम्हारी।\n" +
                "जन्मदिन मुबारक हो।")
        birthdayShayriList.add("ख़ुशी से बीते हर दिन,\n" +
                "हर सुहानी रात हो,\n" +
                "जिस तरफ आपके कदम पड़े,\n" +
                "वहा फूलो की बरसात हो.\n" +
                "शुभ जन्मदिन हो आपका हमेशा!!")
        birthdayShayriList.add("फूलों सा महकता रहे हमेशा जीवन आपका\n" +
                "खुशियां चूमे कदम आपके\n" +
                "बहुत सारा प्यार और आशीर्वाद हमारा\n" +
                "जन्मदिन की हार्दिक शुभकामनाएं")
        birthdayShayriList.add("#शुभ दिन ये आये आपके #जीवन में हज़ार बार;\n" +
                "और हम आपको #जन्मदिन #मुबारक कहते रहें हर बार।\n" +
                "#जन्मदिन मुबारक ।\uD83C\uDF82")
        birthdayShayriList.add("फूल खिलखिला उठे हैं पहाड़ों में,\n" +
                "परियाँ गा रही है मंगल बहारों में,\n" +
                "सुनने में आया है की आज है जन्मदिन उसका\n" +
                "जो एक है, लाखों-करोड़ों और हजारों में।")
        birthdayShayriList.add("न आसमान से टपकाये गए हो,\n" +
                "न ऊपर से गिराए गए हो,\n" +
                "आज कल कहाँ मिलते हैं आप जैसे लोग,\n" +
                "आप तो आर्डर देकर बनवाये गए हो।")
        birthdayShayriList.add("खुदा बुरी नज़र से बचाये आप को,\n" +
                "चाँद सितारे से सजाये आप को,\n" +
                "गम क्या होता है ये आप भूल ही जाओ,\n" +
                "खुदा ज़िन्दगी में इतना हसए आपको।")
        birthdayShayriList.add("उस दिन खुदा ने भी जश्न मनाया होगा,\n" +
                "जिस दिन आपको अपने हाथिओं से बनाया होगा,\n" +
                "उसने भी बहाये होंगे आंसू,\n" +
                "जिस दिन आपको यहाँ भेज के खुद को अकेला पाया होगा।")

        birthdayShayriList.add("हर रास्ता सरल हो,\n" +
                "हर रास्ते पे खुशियाँ हो,\n" +
                "हर दिन खुबसूरत हो,\n" +
                "यही हर दिन मेरी दुआ हो,\n" +
                "ऎसा तुम्हारा हर जन्मदिन हो।")
        birthdayShayriList.add("इतनी सी मेरी दुआ \uD83D\uDE4F क़बूल हो जाये,\n" +
                "“की तेरी हर दुआ \uD83D\uDE4F क़बूल हो जाये,\n" +
                "“तुझे मिले जन्मदिन पर लाखों ख़ुशियाँ,\n" +
                "“और जो तुम चाहो रब से,\n" +
                "“वो पल भर में मंज़ूर हो जाये,\uD83D\uDE4F\n" +
                "•~:”Happy Birthday”:~•\uD83C\uDF82")
        birthdayShayriList.add("ऐ खुदा, एक मन्नत है हमारी,\n" +
                "मेरी जान जन्नत है हमारी,\n" +
                "चाहे हम हो ना हो साथ उनके,\n" +
                "पर खुशियाँ मिले उनको प्यारी प्यारी !\n" +
                "जन्मदिन की शुभकामनाएं।")
        birthdayShayriList.add()
        birthdayShayriList.add()
        birthdayShayriList.add()
        birthdayShayriList.add()
        birthdayShayriList.add("तमन्नाओं से भरी हो जिंदगी, ख्वाहिशों से भरा हो हर पल…\n" +
                "दामन भी छोटा लगने लगे, इतनी खुशियाँ दे आपको आने वाला कल…\n" +
                "जन्मदिन की शुभकामनायें…\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81")
        birthdayShayriList.add("#Life का हर #Goal रहे आपका #Clear,\n" +
                "तुम #Success पाओ Without any #Fear\n" +
                "हर पल जियो Without any #Tear,\n" +
                "Enjoy your day my #Dear,\n" +
                "\uD83C\uDF82HAPPY BIRTHDAY\uD83C\uDF82\uD83C\uDF80\uD83C\uDF81")
        birthdayShayriList.add("हर घड़ी तुम्हारा साथ निभाऊ\n" +
                "हज़ार जन्म तुम्हारे साथ पाऊ\n" +
                "सदा खुश रहे जोड़ी हमारी\n" +
                "हर जन्मदिन तुम्हारे साथ मनाउ")












        birthadayShowAdapter= ShayariDataShowAdpter(this,birthdayShayriList)
        binding.birhdayshayariShowrecycleview.adapter=birthadayShowAdapter
        binding.birhdayshayariShowrecycleview.layoutManager= LinearLayoutManager(this)

    }
}