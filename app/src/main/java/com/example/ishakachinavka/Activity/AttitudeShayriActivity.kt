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

        attitudeShayriList.add(Shayari("😎गुरूर है हमे अपने किरदार पर अगर कोई तुमसा  नहीं तो कोही हमसा भी कहा..🤙 "))
        attitudeShayriList.add(Shayari("😆भाड़ में जाये लोग ओर,लोगो की बातें,हम वैसे ही जियेंगे,जैसे हम है चाहते..😎"))
        attitudeShayriList.add(Shayari("🖤वो जिगर ही नहीं,जिसमे दम न हो,बेटा अगर तू बदमाश है,तो हम भी कम नहीं…😈"))
        attitudeShayriList.add(Shayari("📲अब न रिप्लाई चाहिए,न ही तेरा साथ,तू प्लीज अपना ध्यान रख,मुझे नही करनी तुझसे बात…😆🤙"))
        attitudeShayriList.add(Shayari("😈ना ज्यादा न कम,जैसे आपकी सोच,\n" + "वैसे हम…😎"))
        attitudeShayriList.add(
            Shayari("👂सुन बे मेरी एक ही आदत है,\n" +
                    "मैं मस्ती में चूर रहता हूं,\n" +
                    "और 🧚‍♀️ लड़कियों से दूर रहता हूं..😆"))
        attitudeShayriList.add(
            Shayari("😎वापस आ गए है,अब भोकाल मचाएंगे,\n" +
                    "बेटा जितना तूने सोच रखा है,\n" +
                    "उससे भी आगे जाएंगे..🔥"))
        attitudeShayriList.add(
            Shayari("🏠खाली घर को लोग\n" +
                    "भूतिया समझते है..\n" +
                    "ज्यादा शरीफ हो जाओ\n" +
                    "तो लोग चु..या समझते है..🤙"))
        attitudeShayriList.add(
            Shayari("🧔जबसे हम लोगो के असली\n" +
                    "रंग पहचानने लगे है,\n" +
                    "तब से लोग हमें अपना दुश्मन\n" +
                    "मानने लगे है..👿"))
        attitudeShayriList.add(Shayari("💔टूटा हूँ मगर हारा नही हूँ अकेला हूँ मगर बेसहारा नही हूँ…🖤"))
        attitudeShayriList.add(Shayari("🖤इश्क़ किया है तो दर्द सहना सिख नहीं तो \nऔकात में रहना सीख..🤙"))
        attitudeShayriList.add(
            Shayari("⏰मैं वक़्त की पहियो को धीरे से तेज चलते देखा है," +
                    "तू गैरो की बात करता है,\n" +
                    "मैंने 🧚‍♀️अपनो को बदलते देखा है..🖤"))
        attitudeShayriList.add(Shayari("🧑बेटा तू चुगली करना छोड़ दे हम उँगली करना छोड़ देंगे..😡"))
        attitudeShayriList.add(
            Shayari("😎मुझे इस दुनिया से कोई हमदर्दी नही है।\n" +
                    "हम अपनी धुन में चलने वाले परिंदे हैं..🦅"))
        attitudeShayriList.add(
            Shayari("नही जानते तो जान जाओगे,\n" +
                    "बहुत बुरा हूँ मैं,\n" +
                    "वक़्त आने पर पहचान जाओगें…👿"))
        attitudeShayriList.add(Shayari("🧑‍🦳पहले पंडित को अपनी राशि दिखाना,बाद में \nहमे अपनी बदमाशी दिखाना…🤙"))
        attitudeShayriList.add(
            Shayari("🤠हमसे दुश्मनी तेरी एक ख्वाब है\n" +
                    "अभी तेरी औकात नही\n" +
                    "   ये मेरा जवाब है…🔥"))
        attitudeShayriList.add(
            Shayari("😠खुद से गिरे थे,खुद से उठेंगे,\n" +
                    "अब न किसी का हाथ चाहिए,\n" +
                    "न किसी का साथ…👩🏼‍🤝‍👨🏻"))
        attitudeShayriList.add(Shayari("🤴मुझे समझना इतना आसान नहीं,गहरा समुंद हूँ खुला आसमान नहीं…⛅"))
        attitudeShayriList.add(
            Shayari("कोशिश तो सबकी जारी है\n" +
                    "⏰वक़्त बताएगा कौन किस पर भारी है..🤴"))
        attitudeShayriList.add(
            Shayari("👑ना सिर पर ताज है\n" +
                    "ना ये सिर ताज का मोहताज है…🤴"))
        attitudeShayriList.add(
            Shayari("😶अकेले है मुझें कोई गम नही,\n" +
                    "जहाँ इज्जत नही वहाँ हम नहीं…🤠🤙"))
        attitudeShayriList.add(Shayari("🖤जिस दौर से हम गुजरे है ना बेटा,अगर तुम गुजरे होते,तो गुजर गए होते..😈"))
        attitudeShayriList.add(
            Shayari("🤴हम नही पहचानते उनको,\n" +
                    "दौलत का घमंड होता जिनको…🤑"))
        attitudeShayriList.add(Shayari("😉जीवन में कुछ करना हैं न,तो लड़की के होठों पर नहीं,हज़ार के नोटों पर ध्यान दो..🤑"))
        attitudeShayriList.add(
            Shayari("👂हम ऐसे वेसे बातो में ध्यान नहीं देते,\n" +
                    "बेटा बाप है तुम्हारे बेवजह ज्ञान नही देते…😉🤙"))
        attitudeShayriList.add(
            Shayari("🖤हो सके तो समझना,वरना गलत समझ,\n" +
                    "मुझे भूल जाना…😆"))
        attitudeShayriList.add(
            Shayari("😈ज़िद समझना हैं तो ज़िद ही सही पर आत्मसम्मान से बढ़ कर\n" +
                    "कुछ भी नही..🤙"))
        attitudeShayriList.add(
            Shayari("🤴पढ़ते क्या हो आँखों में मेरी कहानी,\n" +
                    "Attitude में रहना तो आदत है मेरी पुरानी..😎"))
        attitudeShayriList.add(Shayari("🌍हम दुनिया से अलग नहीं,हमारी दुनिया ही अलग है..🖤"))
        attitudeShayriList.add(
            Shayari("💙शराफत की दुनिया का किस्सा ही खत्म\n" +
                    "अब जैसी दुनिया वैसे हम😈"))
        attitudeShayriList.add(
            Shayari("👸तेरे Attitude से लोग जलते होंगे,\n" +
                    "मगर मेरे Attitude पर तो लोग मरते है🤴"))
        attitudeShayriList.add(
            Shayari("👸🔥तुम जलन बरकरार रखना,\n" +
                    "हम जलवे बरकरार रखेंगे..😆"))
        attitudeShayriList.add(
            Shayari("😎चर्चे हमेशा उन्ही के हुआ करते हैं,\n" +
                    "जिनके अंदाज़ अलग हुआ करते हैं..🤴"))
        attitudeShayriList.add(
            Shayari("😆अंदाज थोड़ा अलग रखता हूं,\n" +
                    "शायद इसीलए में लोगों को गलत लगता हूं..😉"))
        attitudeShayriList.add(
            Shayari("👸तेरी Ego तो दो दिन की कहानी है,\n" +
                    "But मेरी अक्कड़ तो खानदानी है..😆😎"))
        attitudeShayriList.add(
            Shayari("😎Attitude दिखाना मेरी एक बीमारी है,\n" +
                    "इसे ठीक करने के लिए ज़रूरत तुम्हारी है..👸"))
        attitudeShayriList.add(
            Shayari("👥रहते हैं आस-पास ही लेकिन साथ नहीं होते,\n" +
                    "कुछ लोग जलते हैं मुझसे बस खाक नहीं होते..🔥😈"))
        attitudeShayriList.add(
            Shayari("🤴जिनके मिज़ाज़ दुनिया से अलग होते है,\n" +
                    "महफ़िलो में चर्चे उनके गज़ब होते है..😆😎"))
        attitudeShayriList.add(
            Shayari("👑राज तो हमारा हर जगह पे है,\n" +
                    "पसंद करने वालों के दिल में और\n" +
                    "नापसंद करने वालों के दिमाग में..🖤🤙"))
        attitudeShayriList.add(
            Shayari("😎कुछ सही तो कुछ खराब कहते हैं,\n" +
                    "लोग हमें बिगड़ा हुआ नवाब कहते हैं😆🤴"))


        attitudeShayariShowAdapter= ShayariDataShowAdpter(this,attitudeShayriList)
        binding.attitudeshyariShowrecycleview.adapter=attitudeShayariShowAdapter
        binding.attitudeshyariShowrecycleview.layoutManager= LinearLayoutManager(this)

        binding.backBtn.setOnClickListener {
            onBackPressed()
        }

    }
}