package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivitySadShayariBinding

class SadShayariActivity : AppCompatActivity() {

    lateinit var binding: ActivitySadShayariBinding

    lateinit var sadShayariShowAdapter: ShayariDataShowAdpter
    var sadShayriList= mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySadShayariBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sadShayriList.add("👰‍♀️अब तो वही सबसे ज्यादा रुलाने लगे हैं हमें, जो कभी कहते थे रोते तुम हो और तकलीफ हमें होती है.🥺")
        sadShayriList.add("🥺नाराज हुई बैठी है शायद वो हम से , लोग जिसे क़िस्मत कहते है..🖤")
        sadShayriList.add("🥲आँसू आजाते है रोने से पहले , 💔ख्वाब टूट जाते है सोने से पहले । लोग कहते है मोहब्बत गुनाह है ,काश कोई रोक लेते हमें गुनाह करने से पहले..💙")
        sadShayriList.add("☺️चेहरे पर एक और चेहरा लगाना पड़ता है , में ठीक हूं कह कर मुस्कुराना भी पड़ता है..🥲")
        sadShayriList.add("👨🏻‍🤝‍👨🏽जिसने भी दिया है एक कतरा भी साथ हमारा अगर जिंदगी रही तो समंदर लौटाएंगे उसे...🤴")
        sadShayriList.add("🖤किस्मत ने ऐसा जुल्म किया हम पर , की शौक करने की उम्र में सब्र करना \n" +
                "सीख लिया हमने..💔")
        sadShayriList.add("अज़ीज़ इतना ही रक्खो कि जी सँभल जाए अब इस क़दर भी न चाहो कि दम \n" +
                " निकल जाए..💔")
        sadShayriList.add("👫कुछ रिश्ते आजकल उस रास्ते पर जा रहे हैं,\n" + "न साथ छोड़ रहे हैं,और न ही साथ निभा पा रहे हैं…🖤")
        sadShayriList.add("💙 शिकायत नहीं ज़िंदगी से,की तेरे साथ नहीं,बस तू खुश रहना यार,अपनी तो कोई बात नहीं..🥺")
        sadShayriList.add("👰‍♀️अब न करेंगे,तुमसे कोई सवाल,काफी हक़ जताने लगे थे तुमपर,माफ \n" +
                "करना यार..😔")
        sadShayriList.add("🥺अजीब हैं मेरा अकेलापन न तो खुश हूँ,न ही उदास हूँ,बस खाली हूँ और\n" +
                " खामोश हूँ..😔")
        sadShayriList.add("👫रहना चाहते थे साथ तुम्हारे,पर इस जमाने ने रहने न दिया,कभी वक़्त की खामोशी में खामोश रहे,तो कभी उनकी खामोशी ने\n" +
                " कुछ कहना न दिया…🤐")
        sadShayriList.add("🤴न अपने साथ हूँ,ना तेरे पास हूँ,बस कुछ दिनों से,बस युही उदास हूँ..🥲")
        sadShayriList.add("👰‍♀️छोड़ दिया हमने लोगों का पीछा करना,जिससे जितनी मोहब्बत की,उसने उतना \n" +
                "ही गिरा हुआ समझा..💘")
        sadShayriList.add("🥺लोग कहते हैं दुख बुरा होता हैं,जब कभी भी आता हैं रुलाकर चला जाता हैं,हम कहते हैं दुख अच्छा होता हैं,जब कभी भी आता हैं,अपनो का पता चल जाता हैं..👫")
        sadShayriList.add("👩एक वो हैं जो अपनी मर्ज़ी से बात करते हैं और एक हम हैं जो उनकी मर्ज़ी का इंतज़ार करते हैं..😔")
        sadShayriList.add("👰‍♀️जिसका मिलना किस्मत में नहीं होती,\n" +
                "उससे मोहब्बत भी बेइंतहा होती हैं..💙")
        sadShayriList.add("💞वो दिन नही वो रात नहीं,वो पहले जैसे जज्बात नहीं,होने को तो हो जाती हैं बात उनसे,मगर बातों में भी पहले जैसे \n" +
                "बात नहीं…🥲")
        sadShayriList.add("👫हो सके तो दोस्ती कर लेना,\n" +
                "पर दिल किसी से कभी न लगाना..💔")
        sadShayriList.add("😶आज हम तरस रहे हैं तुम्हारे लिए,कल तुम तरसोगे हमारे लिए…🤴")
        sadShayriList.add(" ☹️बुरा नहीं हूँ मैं,अपनी कुछ कहानी हैं,टूट चुका हूँ मैं,अपनो की ही \n" +
                "मेहरबानी हैं…💔")
        sadShayriList.add("🖤 मैं चाहता हूँ कि एक ऐसा हादसा हो मेरे साथ,जिसमें भूल जाऊ वो ज़िंदगी,\n" +
                "जो गुज़ारी हैं तेरे साथ..👫")
        sadShayriList.add("🥲आज परेशान हूँ तो,कल आराम भी आएगा,खुदा तो मेरा भी हैं,आखिर कब तक \n" +
                "मुझकों रुलाएगा।..☺️")
        sadShayriList.add("☹️कभी पीठ पीछे कोई बात चले तो डरना मत,क्योंकि बात तो उनकी ही होती हैं,जिनमें कोई बात होती हैं..🤴")
        sadShayriList.add("👰‍♀️किसी के आने और जाने से,जीवन नही बदलता,बस जीने का अंदाज़ \n" +
                "बदल जाता हैं..🤴")
        sadShayriList.add("🖤पत्थर की एक कमी हैं, की वो पिघलता नहीं, लेकिन उसकी एक खूबी हैंजो कभी \n" +
                "बदलता नहीं हैं..💞")
        sadShayriList.add("☺️हम कहाँ औरों में अपनी खुशी तलाश करते हैं,हम तुम्हें देखकर सारे दर्द नजर \n" +
                "अंदाज करते हैं…💙")
        sadShayriList.add("☹️क्या मालूम था की दिल यूँही बिखर जाएगा,टूट जाएगा आईना,और दिल बिखर जाएगा…💔")
        sadShayriList.add("🦅जब भी तुम्हारा हौसला, आसमान की ऊँचाई तक पहुँच जाएगा, कोई न कोई तुम्हारे \n" +
                "पंख काटने जरूर आएगा…🖤")
        sadShayriList.add("👰‍♀️पहला प्यार हुआ तो ऐसे इंसान से हुआ,जिसे भूलना बस में नहींऔर पाना किस्मत में नहीं..🖤" )
        sadShayriList.add("☹️थक  चुका हूँ अपने आपकों साबित करते करते,अच्छा हैं तुमनें पराया \n" +
                "समझ लिया..😶")
        sadShayriList.add("💞सच्चा प्यार केवल दो पल के लिए ही होता हैं,पर जख्म सालों के लिए दे \n" +
                "जाता हैं..💔")
        sadShayriList.add("🖤बुरा वक्त भी कमाल का हैं, जी कहने वाले भी,तू कहने लगते जाते हैं…🖤")
        sadShayriList.add("मतकर इतना यकीन मुझपर,मैं तो खुदको भी धोखे में रखता हूँ..🖤")
        sadShayriList.add("💙कौन हूँ मैं ऐ ज़िंदगी,मुझे तू ये बता,थक गया हूँ अपना,पता ढूंढते ढूंढते…🥲")
        sadShayriList.add("👰‍♀️कभी मिले फुरसत,तो हमें जरूर बताना,वो कौन सी मोहब्बत थी,जिसे हम\n" +
                " तुम्हे दे ना सके..💔")
        sadShayriList.add("तेरे बदलने का दुःख नहीं हैं मुझकों,हम तो अपने यकीन पर शर्मिंदा हैं..🥲")
        sadShayriList.add("💔बहुत दर्द देती हैं उनकी यादें,सो जाऊ तो जगा देती यादें,और जग जाऊ तो रुला देती..☹️")
        sadShayriList.add("🖤मोहब्बत में हम उन्हें हारे हैं,जो कहते थे बस हम तुम्हारे हैं…💞")
        sadShayriList.add("☹️हमेशा मैं ही क्यों डरु तुझको खोने से,कभी तू भी डरे मेरे न होने से...💔")

        sadShayariShowAdapter= ShayariDataShowAdpter(this,sadShayriList)
        binding.sadshahyariShowrecycleview.adapter=sadShayariShowAdapter
        binding.sadshahyariShowrecycleview.layoutManager= LinearLayoutManager(this)

        binding.backBtn.setOnClickListener {
            onBackPressed()
        }




    }
}