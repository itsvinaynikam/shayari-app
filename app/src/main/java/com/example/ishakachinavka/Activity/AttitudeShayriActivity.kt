package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.Model.Shayari
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivityAttitudeShayriBinding

class AttitudeShayriActivity : AppCompatActivity() {
    lateinit var binding: ActivityAttitudeShayriBinding
    lateinit var attitudeShayariShowAdapter: ShayariDataShowAdpter
    var attitudeShayriList= mutableListOf<Shayari>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAttitudeShayriBinding.inflate(layoutInflater)
        setContentView(binding.root)

        attitudeShayriList.add(Shayari(81,"😎गुरूर है हमे अपने किरदार पर अगर कोई तुमसा  नहीं तो कोही हमसा भी कहा..🤙 "))
        attitudeShayriList.add(Shayari(82,"😆भाड़ में जाये लोग ओर,लोगो की बातें,हम वैसे ही जियेंगे,जैसे हम है चाहते..😎"))
        attitudeShayriList.add(Shayari(83,"🖤वो जिगर ही नहीं,जिसमे दम न हो,बेटा अगर तू बदमाश है,तो हम भी कम नहीं…😈"))
        attitudeShayriList.add(Shayari(84,"📲अब न रिप्लाई चाहिए,न ही तेरा साथ,तू प्लीज अपना ध्यान रख,मुझे नही करनी तुझसे बात…😆🤙"))
        attitudeShayriList.add(Shayari(85,"😈ना ज्यादा न कम,जैसे आपकी सोच,\n" + "वैसे हम…😎"))
        attitudeShayriList.add(
            Shayari(86,"👂सुन बे मेरी एक ही आदत है,\n" +
                    "मैं मस्ती में चूर रहता हूं,\n" +
                    "और 🧚‍♀️ लड़कियों से दूर रहता हूं..😆"))
        attitudeShayriList.add(
            Shayari(87,"😎वापस आ गए है,अब भोकाल मचाएंगे,\n" +
                    "बेटा जितना तूने सोच रखा है,\n" +
                    "उससे भी आगे जाएंगे..🔥"))
        attitudeShayriList.add(
            Shayari(88,"🏠खाली घर को लोग\n" +
                    "भूतिया समझते है..\n" +
                    "ज्यादा शरीफ हो जाओ\n" +
                    "तो लोग चु..या समझते है..🤙"))
        attitudeShayriList.add(
            Shayari(89,"🧔जबसे हम लोगो के असली\n" +
                    "रंग पहचानने लगे है,\n" +
                    "तब से लोग हमें अपना दुश्मन\n" +
                    "मानने लगे है..👿"))
        attitudeShayriList.add(Shayari(90,"💔टूटा हूँ मगर हारा नही हूँ अकेला हूँ मगर बेसहारा नही हूँ…🖤"))
        attitudeShayriList.add(Shayari(91,"🖤इश्क़ किया है तो दर्द सहना सिख नहीं तो \nऔकात में रहना सीख..🤙"))
        attitudeShayriList.add(
            Shayari(92,"⏰मैं वक़्त की पहियो को धीरे से तेज चलते देखा है," +
                    "तू गैरो की बात करता है,\n" +
                    "मैंने 🧚‍♀️अपनो को बदलते देखा है..🖤"))
        attitudeShayriList.add(Shayari(93,"🧑बेटा तू चुगली करना छोड़ दे हम उँगली करना छोड़ देंगे..😡"))
        attitudeShayriList.add(
            Shayari(94,"😎मुझे इस दुनिया से कोई हमदर्दी नही है।\n" +
                    "हम अपनी धुन में चलने वाले परिंदे हैं..🦅"))
        attitudeShayriList.add(
            Shayari(95,"नही जानते तो जान जाओगे,\n" +
                    "बहुत बुरा हूँ मैं,\n" +
                    "वक़्त आने पर पहचान जाओगें…👿"))
        attitudeShayriList.add(Shayari(96,"🧑‍🦳पहले पंडित को अपनी राशि दिखाना,बाद में \nहमे अपनी बदमाशी दिखाना…🤙"))
        attitudeShayriList.add(
            Shayari(97,"🤠हमसे दुश्मनी तेरी एक ख्वाब है\n" +
                    "अभी तेरी औकात नही\n" +
                    "   ये मेरा जवाब है…🔥"))
        attitudeShayriList.add(
            Shayari(98,"😠खुद से गिरे थे,खुद से उठेंगे,\n" +
                    "अब न किसी का हाथ चाहिए,\n" +
                    "न किसी का साथ…👩🏼‍🤝‍👨🏻"))
        attitudeShayriList.add(Shayari(99,"🤴मुझे समझना इतना आसान नहीं,गहरा समुंद हूँ खुला आसमान नहीं…⛅"))
        attitudeShayriList.add(
            Shayari(100,"कोशिश तो सबकी जारी है\n" +
                    "⏰वक़्त बताएगा कौन किस पर भारी है..🤴"))
        attitudeShayriList.add(
            Shayari(101,"👑ना सिर पर ताज है\n" +
                    "ना ये सिर ताज का मोहताज है…🤴"))
        attitudeShayriList.add(
            Shayari(102,"😶अकेले है मुझें कोई गम नही,\n" +
                    "जहाँ इज्जत नही वहाँ हम नहीं…🤠🤙"))
        attitudeShayriList.add(Shayari(103,"🖤जिस दौर से हम गुजरे है ना बेटा,अगर तुम गुजरे होते,तो गुजर गए होते..😈"))
        attitudeShayriList.add(
            Shayari(104,"🤴हम नही पहचानते उनको,\n" +
                    "दौलत का घमंड होता जिनको…🤑"))
        attitudeShayriList.add(Shayari(105,"😉जीवन में कुछ करना हैं न,तो लड़की के होठों पर नहीं,हज़ार के नोटों पर ध्यान दो..🤑"))
        attitudeShayriList.add(
            Shayari(106,"👂हम ऐसे वेसे बातो में ध्यान नहीं देते,\n" +
                    "बेटा बाप है तुम्हारे बेवजह ज्ञान नही देते…😉🤙"))
        attitudeShayriList.add(
            Shayari(107,"🖤हो सके तो समझना,वरना गलत समझ,\n" +
                    "मुझे भूल जाना…😆"))
        attitudeShayriList.add(
            Shayari(108,"😈ज़िद समझना हैं तो ज़िद ही सही पर आत्मसम्मान से बढ़ कर\n" +
                    "कुछ भी नही..🤙"))
        attitudeShayriList.add(
            Shayari(109,"🤴पढ़ते क्या हो आँखों में मेरी कहानी,\n" +
                    "Attitude में रहना तो आदत है मेरी पुरानी..😎"))
        attitudeShayriList.add(Shayari(110,"🌍हम दुनिया से अलग नहीं,हमारी दुनिया ही अलग है..🖤"))
        attitudeShayriList.add(
            Shayari(111,"💙शराफत की दुनिया का किस्सा ही खत्म\n" +
                    "अब जैसी दुनिया वैसे हम😈"))
        attitudeShayriList.add(
            Shayari(112,"👸तेरे Attitude से लोग जलते होंगे,\n" +
                    "मगर मेरे Attitude पर तो लोग मरते है🤴"))
        attitudeShayriList.add(
            Shayari(113,"👸🔥तुम जलन बरकरार रखना,\n" +
                    "हम जलवे बरकरार रखेंगे..😆"))
        attitudeShayriList.add(
            Shayari(114,"😎चर्चे हमेशा उन्ही के हुआ करते हैं,\n" +
                    "जिनके अंदाज़ अलग हुआ करते हैं..🤴"))
        attitudeShayriList.add(
            Shayari(115,"😆अंदाज थोड़ा अलग रखता हूं,\n" +
                    "शायद इसीलए में लोगों को गलत लगता हूं..😉"))
        attitudeShayriList.add(
            Shayari(116,"👸तेरी Ego तो दो दिन की कहानी है,\n" +
                    "But मेरी अक्कड़ तो खानदानी है..😆😎"))
        attitudeShayriList.add(
            Shayari(117,"😎Attitude दिखाना मेरी एक बीमारी है,\n" +
                    "इसे ठीक करने के लिए ज़रूरत तुम्हारी है..👸"))
        attitudeShayriList.add(
            Shayari(118,"👥रहते हैं आस-पास ही लेकिन साथ नहीं होते,\n" +
                    "कुछ लोग जलते हैं मुझसे बस खाक नहीं होते..🔥😈"))
        attitudeShayriList.add(
            Shayari(119,"🤴जिनके मिज़ाज़ दुनिया से अलग होते है,\n" +
                    "महफ़िलो में चर्चे उनके गज़ब होते है..😆😎"))
        attitudeShayriList.add(
            Shayari(120,"👑राज तो हमारा हर जगह पे है,\n" +
                    "पसंद करने वालों के दिल में और\n" +
                    "नापसंद करने वालों के दिमाग में..🖤🤙"))
        attitudeShayriList.add(
            Shayari(121,"😎कुछ सही तो कुछ खराब कहते हैं,\n" +
                    "लोग हमें बिगड़ा हुआ नवाब कहते हैं😆🤴"))


        attitudeShayariShowAdapter= ShayariDataShowAdpter(this,attitudeShayriList)
        binding.attitudeshyariShowrecycleview.adapter=attitudeShayariShowAdapter
        binding.attitudeshyariShowrecycleview.layoutManager= LinearLayoutManager(this)

        binding.backBtn.setOnClickListener {
            onBackPressed()
        }

    }
}