package com.example.ishakachinavka.Activity

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivityBewafashayariBinding

class BewafashayariActivity : AppCompatActivity() {

    lateinit var binding: ActivityBewafashayariBinding
    lateinit var bewafaShayariShowAdapter: ShayariDataShowAdpter
    var bewafaShayriList= mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBewafashayariBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bewafaShayriList.add("💞हम इश्क़ में वफ़ा करते करते बेहाल हो गए,और वो बेवफाई करके भी खुशहाल हो गए..👰‍♀️")
        bewafaShayriList.add("👫उसने दोस्ती का ऐसा सिला दिया,अपने मतलब के लिए उसने,मेरी दोस्ती को भुला दिया..☹️")
        bewafaShayriList.add("👰‍♀️जिससे हमने Bewafai पायी,वो हमसे वफ़ा की उम्मीद करते हैं,दिल पर जख़्म देके, निशान शरीर पर ढूंढ़ते हैं..🖤")
        bewafaShayriList.add("🤴अभी पास है तो ठोकर मारकर bewafa बना देते हो,जब दूर हो जाएंगे, तो प्यार जाताओगे..💛")
        bewafaShayriList.add("🤴मैंने अपनी ज़िन्दगी के रस्ते बदल दिए हैं अब जो हमारे साथ खड़े हैं, वही \n" +
                "हमारे साथ चलेंगे..👫")
        bewafaShayriList.add("🤴हमने ये सोचा वो वापिस आए हमारी मोहब्बत के लिए..💞,\n" +
                "मगर वो बेवफा वापिस आए सिर्फ अपने काम के लिए..☹️")
        bewafaShayriList.add("💔दूरी और बेरुखी का जब उनसे जवाब माँगा गया ,तो हमें Bewafa बना के हमसे रिश्ता तोड़ने का जवाब दिया..🖤")
        bewafaShayriList.add("😶हम गम, तन्हाई और जुदाई से मरते रहे और वो बेवफा बनके चुप बैठे रहे..👰‍♀️")
        bewafaShayriList.add("🖤टूटे हुए प्याले में जाम नहीं आता इश्क में मरीज को आराम नहीं आता\n" +
                " ये बेवफा दिल तोड़ने से पहले ये सोच तो लिया होताके टुटा हुआ \n" +
                "दिल किसी के काम नहीं आता..💔")
        bewafaShayriList.add("👫अब दोस्तो के दिलो में,दोस्ती के फूल नहीं खिलते,दिल में नफ़रत लिए \n" +
                "हसकर मिलते हैं..🖤")

        bewafaShayriList.add("🤐रूक जाती है सारी शिकायतें इन होंठो तक आकर जब मासूमियत से वो कहते है अब मैंने क्या किया..👰‍♀️")
        bewafaShayriList.add("🌇आदी रात को फिर उसकी यादों ने मुझे घेर लिया, आज फिर उसके खत पढ़के दर्दों को छेड़ लिया..🥺")
        bewafaShayriList.add("👰‍♀️तेरी बेवफाई से टूट गए थे हम,जिंदगी से रूठ गए थे हम,जीने की कोई वजह बची नहीं अब ,बस तेरी यादों के \n" +
                "सहारे जी रहे है हम.👰‍♀️")
        bewafaShayriList.add("🌃इन्तहा हो गयी इंतज़ार की,आयी ना कुछ खबर मेरे यार की,ये हमें है यकीन बेवफा वो नहीं,फिर वजह क्या हुई \n" +
                "इंतज़ार की..🖤")
        bewafaShayriList.add("🤴हमको दिल से भी निकाला गया, फिर शहर से भी,हमको पत्थर से भी मारा गया, \n" +
                "और जहर से भी..😶")
        bewafaShayriList.add("👰‍♀️तेरी बेवफाई का गम तो नहीं,मगर तू बेवफा है दुःख ये भी कम नहीं..🥺")
        bewafaShayriList.add("💔जहाँ से जी ना लगे तुम वहीं बिछड़ जाना,मगर खुदा के लिए बेवफाई ना करना..🖤")
        bewafaShayriList.add("💞बेवफा तो वो खुद हैं,पर इल्ज़ाम किसी और को देते हैं,पहले नाम था मेरा उनके लबों पर,अब वो नाम किसी और का लेते हैं..👫")
        bewafaShayriList.add("👰‍♀️कुछ न मिला तो तेरा ही नाम लिखूंगा,ओ बेवफा मैं तुझी पर सारे इल्जाम \n" +
                "लिखूंगा..📝")
        bewafaShayriList.add("💘इश्क करने का नतीजा दुनिया मे हमने बुरा देखा,जिनसे वादा था वफा का उन्हें भी हमने बेवफा देखा..🖤")

        bewafaShayriList.add("⛈️बादलों ने गरजना छोड़ दिया,बारिशों ने बरसना छोड़ दिया,आप तो हमको भूल गएइ सीलिए हमने भी आपके लिए तरसना छोड़ दिया..💞")
        bewafaShayriList.add("👰‍♀️तेरा दिया हुआ जख्म मेरे काम आ गया,भरी महफिल में मैंने बेवफा कहा,और सब के लबो पे तेरा नाम आ गया..🥺💔")
        bewafaShayriList.add("👩जिनसे थे मेरे नैन मिले,बन गए थे जिन्दगी के सिलसिले,इतना प्यार करने के बाद भी,सनम मेरे बेवफा निकले..💔")
        bewafaShayriList.add("💞मुहब्बत में क्यों बेवफाई होती है,सुना था प्यार में गहराई होती है..💘,टूट कर चाहने वाले के नसीब में,क्यों सिर्फ फिर तन्हाई होती है..💛")
        bewafaShayriList.add("👰‍♀️वो बेवफ़ा है तो क्या मत कहो बुरा उसको कि जो हुआ सो हुआ ख़ुश रखे ख़ुदा उसको..💘")
        bewafaShayriList.add("💛सर झुकाओगे तो पत्थर देवता हो जाएगा इतना मत चाहो उसे वो बेवफ़ा\n" +
                " हो जाएगा..💙")
        bewafaShayriList.add("🥺काम आ सकीं न अपनी वफ़ाएँ तो क्या करें उस बेवफ़ा को भूल न जाएँ\n" +
                " तो क्या करें..👩")
        bewafaShayriList.add("👰‍♀️उसे भी साथ रखता, और 👩तुझे भी अपना बना लेता अगर मैं चाहता, तो दिल में कोई चोर दरवाज़ा बना लेता..💞")
        bewafaShayriList.add("💘इजहार ए इश्क कहां जरूरी था मेरे लिए बस तेरे दीदार से ही शाम सुकून थी \n" +
                "मेरे लिए..💛")
        bewafaShayriList.add("🤴मेरी तो दुनिया ही उजड़ गई जबसे तु मुझसे बिछड़ गई..👰‍♀️💔")

        bewafaShayriList.add("🖤मोहब्बत ना सही प्यार तो किया करो साथ नहीं दे सकते तो कम से कम बात तो किया करो..💞")
        bewafaShayriList.add("💛एक दिन मैं अपनी तरफ से आखरी कोशिश करूंगा फिर उसके बाद मैं तुझे पलटकर भी नहीं देखूंगा..🖤")
        bewafaShayriList.add("💞नादान दिल अक्सर सुनता था जिसकी बातो को अब वो बेवफा शख्स बहुत याद आता रातो को..🌇")
        bewafaShayriList.add("👰‍♀️बेवफा लोगों को भूलना अगर आसान होता तो ए दिल तेरा हम पर बहुत बड़ा एहसान होता..🥺💔")
        bewafaShayriList.add("👰‍♀️तू तो बेवफा है बेवफाई करके चला जाएगा मसला वफादार ओं का है वह टूटा हुआ दिल लेकर किधर जाएगा..💔")
        bewafaShayriList.add("👰‍♀️जो भूल गया उस बेवफा को क्या याद करें आगे लम्हे बुला रहे हैं आओ मिलकर उनसे बात करें..🥰")
        bewafaShayriList.add("📝आज मैं तुझे आखरी बार लिखूंगा और खुदा कसम तुझे बेवफाओं में बेशुमार कर दूंगा..🖤")
        bewafaShayriList.add("🤴मेरी वफाओं का हसीन सिला दिया तूने किसी और की खातिर मुझे भुला दिया तूने..🥺")
        bewafaShayriList.add("💞कारोबार ए-मोहब्बत में बहुत खूब कमाया है तूने बेवफा कहकर आज वफा को डुबाया है तूने..👰‍♀️💔")
        bewafaShayriList.add("💔जाने क्यों लोग झूठा प्यार किया करते हैं वफा का नाम लेकर बेवफाई पर मरते हैं..🖤")

        bewafaShayariShowAdapter= ShayariDataShowAdpter(this,bewafaShayriList)
        binding.bewafashyariShowrecycleview.adapter=bewafaShayariShowAdapter
        binding.bewafashyariShowrecycleview.layoutManager= LinearLayoutManager(this)


    }
}