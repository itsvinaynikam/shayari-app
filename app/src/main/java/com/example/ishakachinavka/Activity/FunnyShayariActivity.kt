package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.Model.Shayari
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivityFunnyShayariBinding

class FunnyShayariActivity : AppCompatActivity() {

    lateinit var binding: ActivityFunnyShayariBinding
    lateinit var funnyShayariShowAdapter: ShayariDataShowAdpter
    var funnyShayriList= mutableListOf<Shayari>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityFunnyShayariBinding.inflate(layoutInflater)
        setContentView(binding.root)

        funnyShayriList.add(Shayari(242,"😆ये कलयुग हैं साहब,यहाँ भीड़ को रश कहते हैं,और जो भीड़ में पसंद आ जाए,उसे क्रश कहते हैं…🥰"))
        funnyShayriList.add(Shayari(243,"अर्ज किया हैं वो डीपी दिखाकर गुमराह करेगी,\n" +
                "मगर तुम आधार कार्ड पर अड़े रहना..😆"))
        funnyShayriList.add(Shayari(244,"⏱️वक़्त के साथ सब बदल जाता हैं,\n" +
                "किसी जमाने में जिसे ठेंगा कहते थे,आज उसे लाइक कहते हैं…😂"))
        funnyShayriList.add(Shayari(245,"💞दिल और दिमाग एक ही जिद पर अड़े हैं,सबकुछ छोड़कर दोनों लड़की के\n" +
                " पीछे पड़े हैं..😂"))
        funnyShayriList.add(Shayari(246,"👰‍♀️लड़कियों ने जिंदगी भर हमे गम ही दिए,\n" +
                "जितने चाहे नंबर दिए वो सारे के सारे बंद दिए हैं..🤣"))
        funnyShayriList.add(Shayari(247,"🥺हैं भगवान थोड़ी महिमा तो दिखा दे,\n" +
                "जो रिप्लाई न करें उसके मोबाइल का डिस्प्ले उड़ा दे..😆"))
        funnyShayriList.add(Shayari(248,"जीवन में मिले हैं बहुत से धोखा,लेकिन कोई बात नहीं इट्स ओके..🥺😆"))
        funnyShayriList.add(Shayari(249,"🥰यहाँ हर एक आशिक की,कुछ यूँही हैं कहानी,मजनू चाहती लैला को,और लैला \n" +
                "किसी और कि दीवानी हैं..😍😂"))
        funnyShayriList.add(Shayari(250,"💔धोखा मिला मुझें प्यार में,\n" +
                "ज़िंदगी पूरी उदास हो गई,सोचा आग लगा देंगे इस दुनिया को,कमबख्त वैसे ही कॉलोनी में कोई दूसरी आ गई…👰‍♀️"))
        funnyShayriList.add(Shayari(251,"ब्लॉक करने से वो मजा कहा,\n" +
                "जो मैसेज देख अनदेखा करने में \n" +
                "मिलती हैं..👰‍♀️😂"))

        funnyShayriList.add(Shayari(252,"👰‍♀️जब तिरछी नजरों से उसने देखा,हम तो मदहोश ही हो गए,जब पता चला उनकी नजरें ही तिरछी हैं,हम तो पूरी \n" +
                "तरह बेहोश हो गए..😆😂"))
        funnyShayriList.add(Shayari(253,"जिसका कोई नहीं होता,उसका मोबाइल होता हैं,और जिसका मोबाइल होता,वो किसी इंसान का नहीं होता..😆"))
        funnyShayriList.add(Shayari(254,"😍मेरी प्रेम कहानी का क्या अजीब एंडिंग था,मेरी प्रेम कहानी का क्या अजीब एंडिंग था,मैंने प्रोपोज़ किआ SMS से,कमबख्त वह उसकी शादी तक पेंडिंग था..😆💔"))
        funnyShayriList.add(Shayari(255,"🤴मैंने पूछा उनसे, भुला दिया मुझको कैसे..? चुटकियाँ बजा के वो बोली,\n" +
                " ऐसे, ऐसे, ऐसे..🥺😂"))
        funnyShayriList.add(Shayari(256,"💞दिल की तमन्ना है कि तुझे पलकों पे बिठाऊँ पर तु 72 किलो की है दिल को \n" +
                "कैसे समझाऊं..😝"))
        funnyShayriList.add(Shayari(257,"👰‍♀️उनकी मुस्कान तो एक अदा है,जो उसे प्यार समझे वो सबसे बड़ा गधा है..😝"))
        funnyShayriList.add(Shayari(258,"मत ढूँढ़ो मुझे दुनिया की तन्हाई में ठंड बहुत है मैं यही हूँ अपनी रज़ाई में..😆"))
        funnyShayriList.add(Shayari(259,"👰‍♀️कुछ बोलूं तो इतराते बहुत हो,जानेमन तुम मुस्कुराते बहुत हो,मन करता है तुम्हे दावत पर बुलाऊँ,लेकिन जानेमन तुम\n" +
                " खाते बहुत हो..😝🤣"))
        funnyShayriList.add(Shayari(260,"इस दुनिया में लाखों लोग रहते हैं,कोई हँसता है तो कोई रोता है,पर सबसे सुखी वही होता है,जो शाम को दो पैग मार के सोता है..😂"))
        funnyShayriList.add(Shayari(261,"👀तुझसे कैसे नजर मिलाएं दिलबर जानी,तेरी दाई आँख कानी मेरी बाईं \n" +
                "आँख कानी..😝"))

        funnyShayriList.add(Shayari(262,"🤴मैंने कहा दिलरुबा उसने कहा पैसे दिखा मैं बोला पैसा नहीं है उसने कहा कैसे नहीं है में कहा बहुत महंगाई है उसने कहा जा फिर\n" +
                " तू मेरा भाई है।"))
        funnyShayriList.add(Shayari(263,"👰‍♀️लड़कियों से प्यार न करना क्योंकि ये दिखती हैं हीर की तरह,लगती हैं खीर की तरह िल में चुभती हैं तीर की तरह,और छोड़ देती हैं \n" +
                "फकीर की तरह..😝"))
        funnyShayriList.add(Shayari(264,"👫किस किस का नाम लें अपनी बरबादी में,बहुत लोग आये थे दुआएं देने शादी में..😆😂"))
        funnyShayriList.add(Shayari(265,"👰‍♀️आपकी स्माइल ने सारा सिस्टम हिला दिया,कोमा से जागे मरीज को परमानेंट सुला दिया..😝🤣"))
        funnyShayriList.add(Shayari(266,"🤴हम उसके इश्क में इस कदर चोट खाए हुए हैं,कल उसके बाप ने मारा था आज भाई आये हुए हैं..🤕🤭"))
        funnyShayriList.add(Shayari(267,"यारो मेरे मरने के बाद आँसू मत बहाना,ज़्यादा याद आए तो सीधे उपर ही चले आना..😂🤕"))
        funnyShayriList.add(Shayari(268,"👫तेरा प्यार पाने के लिए मैंने कितना इंतज़ार किया,और उस इंतज़ार में न जाने कितनों से प्यार किया..😉😍"))
        funnyShayriList.add(Shayari(259,"💞मेरा दिल भी ले गयी मेरा चैन भी ले गयी,हद हो गयी तब जब मैंने देखा,वो मेरा पाँच रूपये का पेन भी ले गयी..🤭"))
        funnyShayriList.add(Shayari(270,"🎼सीखा था Guitar जिसे पटाने के लिए अब आर्डर आया है,उसी की शादी में बजाने के लिए ..🤕😂"))
        funnyShayriList.add(Shayari(271,"😍मोहब्बत कर ली तुमसे बहुत सोचने के बाद,अब किसी को देखना नहीं तुम्हें देखने के बाद,\n" +
                "दुनिया छोड़ देंगे तुम्हें पाने के बाद,खुदा माफ करे इतना झूठ बोलने के बाद..😉😝"))
        funnyShayriList.add(Shayari(272,"😂इतनी हसीं, इतनी दिलकश,वो सबसे जुदा निकली,मैं मोहब्बत तो कर बैठा, पर वो शादीशुदा निकली…💔"))
        funnyShayriList.add(Shayari(273,"👫तुझे पाने के लिए कुछ भी कर सकता हूं\n" +
                "तेरे प्यार में जी और मर सकता हूं फिर भी तू नहीं मिली तो कोई गम नहीं यही फॉर्मूला दूसरी पे भी try कर सकता हूं..😉"))
        funnyShayriList.add(Shayari(274,"जिन्दगी में एक लड़की आई,\n" +
                "जिसका नाम था- दीक्षा..उसने ऐसा धोखा दिया किअब मांग रहा हूं भिक्षा..🤭🤕"))
        funnyShayriList.add(Shayari(275,"💞आप जिसके चक्कर में हो\n" +
                "वो किसी और के चक्कर में है यही प्रेम चक्र है,और जो इसमें पड़ गया वो घनचक्कर है…😍"))
        funnyShayriList.add(Shayari(276,"हम \uD83E\uDD28तेरे बिना❌ कही रह नहीं ❌पाते,\n" +
                "तुम नहीं ❌आते तो हम \uD83D\uDE01कोई और पटाते …\uD83D\uDE32"))
        funnyShayriList.add(Shayari(277,"👀गहरी आंखों के समंदर में उत्तर जाने दे,\n" +
                "प्यार का मुजरिम हूं मुझे दूब के मर जाने दें,बिल कितने तेरे फोन के भरे हैं मैने सोचता हूँ मांग लू पैसे मगर जाने दें..🤭😝"))
        funnyShayriList.add(Shayari(278,"💘प्यार कभी ना करना परदेसी से रोते रोते नैना थक जाएंगे प्यार करना पड़ोसी से रोज सुबह खिड़की से दर्शन हो जाएंगे..😂"))
        funnyShayriList.add(Shayari(279,"🥺अर्ज किया है आँखों में नमी थी,\n" +
                "और विटामिन की कमी थी,जिससे रात भर चैटिंग की वो, गर्लफ्रेंड की मम्मी थी..🥺😝"))
        funnyShayriList.add(Shayari(280,"🤴अये मेरे दोस्त मत करना इन हसीनाओं से मोहब्बत..💘;\n" +
                "वो आँखों और बातों से वार करती हैं:मैंने तेरी वाली की आँखों में देखा है;वो मुझसे भी प्यार करती है..😝"))
        funnyShayriList.add(Shayari(281,"👫ये दोस्त हर खुशी को तेरी तरफ मोड दु\n" +
                "तेरे लिए चाँद सितारे तक तोड दु सारी खुशियों के दरवाजे, तेरे लिए खोल दू इतना ठीक है या दो चार झुठ ओर बोल दु..🤭😂"))

        funnyShayariShowAdapter= ShayariDataShowAdpter(this,funnyShayriList)
        binding.funnyshayariShowrecycleview.adapter=funnyShayariShowAdapter
        binding.funnyshayariShowrecycleview.layoutManager= LinearLayoutManager(this)

        binding.backBtn.setOnClickListener {
            onBackPressed()
        }

    }
}