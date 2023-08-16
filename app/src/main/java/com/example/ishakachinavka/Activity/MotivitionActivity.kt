package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivityMotivitionBinding

class MotivitionActivity : AppCompatActivity() {

    lateinit var binding: ActivityMotivitionBinding
    lateinit var motivationalShayariShowAdapter: ShayariDataShowAdpter
    var motivationalShayriList= mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
                binding= ActivityMotivitionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        motivationalShayriList.add("🥺दर्द, गम, डर जो भी है बस तेरे अंदर हैं,\n" +
                "खुद के बनाये पिंजरे से निकल कर देख,तू भी एक सिकंदर हैं..🤴")
        motivationalShayriList.add("🖤यही जज्बा रहा तो मुश्किलों का हल भी निकलेगा,जमीं बंजर हुई तो क्या वहीं से जल भी निकलेगा,ना हो मायूस ना घबरा अंधेरों से मेरे साथी,इन्हीं रातों के दामन से सुनहरा कल भी निकलेगा.💛")
        motivationalShayriList.add("👑 जित और हार आपकी सोच पर निर्भर करती हैं,\n" +
                "मान लो तो हार होगी और ठान लो तो जित होगी.🤴")
        motivationalShayriList.add("🖤न कोई कठिनाई न कोई तकलीफ, तो क्या मज़ा है जीने में, बड़े बड़े तूफान थम जाते है, जब आग लगी हो सीने में 🔥")
        motivationalShayriList.add("💖जीवन में गिरना भी अच्छा है,औकात का पता चलता है,बढ़ते हैं जब हाथ उठाने को,तो अपनों का पता चलता है..👫")
        motivationalShayriList.add("😐लाखों ठोकरों के बाद भी संभालता रहूँगा\n" +
                "गिरकर फिर से उठूंगा और चलता रहूँगा..🤴")
        motivationalShayriList.add("☘️पतझड़ हुए बिना पेड़ों पर नए पत्ते नहीं आते,\n" +
                "कठिनाई और संघर्ष सहे बिना अच्छे दिन नही आते..🥺")
        motivationalShayriList.add("सपनों को पाने के लिए समझदार नहीं\n" +
                "पागल बनना पड़ता है..🤑")
        motivationalShayriList.add("🤴शक ना कर मेरी हिम्मत पर,\n" +
                "मैं ख्वाब बुन लेता हूँ टूटे धागों को जोड़कर..💛")
        motivationalShayriList.add("🏊‍♂️पानी में गिरने से किसी की मृत्यु नहीं होती,\n" +
                "मृत्यु तभी होती है जब तैरना नहीं आता,परिस्थितियां कभी समस्या नहीं बनती,समस्या तभी बनती है जब उनसे निपटना नहीं आता..🖤")
        motivationalShayriList.add("🖤ज़िन्दगी में अगर बुरा वक़्त नहीं आता\n" +
                "तो अपनों में छुपे हुए गैर और गैरों में छुपे हुए अपनो ंका कभी पता न चलता..👫")


        motivationalShayriList.add("😡क्रोध के समय थोड़ा रुक जाएं,\n" +
                "और गलती के समय थोड़ा झुक जाएं,तो दुनिया की सब समस्याएं हल हो जाएगी..💖")
        motivationalShayriList.add("🤴तकदीर भी बदलेगी, तस्वीर भी बदलेगी! तू हिम्मत ना हार मेरे दोस्त, तेरे हाथों की लकीरें भी बदलेगी..🖤")
        motivationalShayriList.add("🖤कठिन रास्तों से कभी ना घबराएं क्योंकि कठिन रास्ते हमेशा खूबसूरत मंजिल की ओर लेकर जाते हैं..💖")
        motivationalShayriList.add("नींद से इतना भी प्यार न करो कि मंज़िल भी ख्वाब बन जाए..💛")
        motivationalShayriList.add("🥺दयालु बनो कमजोर नहीं, ज्ञानी बनो अहंकारी नहीं..☺️")
        motivationalShayriList.add("बड़ी मंजिल के राहगीर छोटे दिल \n" +
                "नहीं रखते...💛")
        motivationalShayriList.add("💘अगर जिंदगी में कुछ अलग करना चाहते हो तो भीड़ का हिस्सा कभी मत बनो क्योंकि भीड़ साहस तो देता है\n" +
                " मगर पहचान छिन लेता है..🖤")
        motivationalShayriList.add("🕧हर वक़्त जीतने का जज्बा होना चाहिए, क्यूंकि किस्मत बदले न बदले पर समय ज़रूर बदलता है..💖")
        motivationalShayriList.add("🖤मोती कभी भी किनारे पे खुद नहीं आते, उन्हें पाने के लिए समुन्दर में \n" +
                "उतरना ही पड़ता है..🏊‍♂️")
        motivationalShayriList.add("🥺हार तो वो सबक है जो आपको बेहतर होने का मौका देगी..🤴")
        motivationalShayriList.add("☺️हमेशा खुशियों में इन्वेस्ट करो. जितनी ज्यादा खुशियां बटोरोगे उतना ही अच्छा महसूस करोगे..💛")
        motivationalShayriList.add("😝जीवन में हमेशा मुस्कुराने की वजह नहीं मिलती। लेकिन आपकी मुस्कान, दूसरों के मुस्कुराने की वजह जरुर होती है..☺️")
        motivationalShayriList.add("🏞️बेशक हर दिन अच्छा नहीं होता, लेकिन हर दिन कुछ ना कुछ अच्छा जरूर होता है..💖")

        motivationalShayriList.add("🪄खुद पर विश्वास करना एक जादू जैसा है, अगर आप ये कर सकते हो तो कुछ भी कर सकते हो..💖")
        motivationalShayriList.add("अपने लक्ष्य पर नज़र और अपनी मेहनत पर विश्वास रखो..💛")
        motivationalShayriList.add("🌇हर सूर्यास्त हमारा एक दिन कम तो जरूर करता है लेकिन हर सूर्यौदय हमारे जीवन में आशा की एक नई किरण \n" +
                "लेकर आता है..💛")
        motivationalShayriList.add("शौंक भले कितने ही ऊँचे रखो लेकिन जिम्मेदारी से बढ़कर नहीं..🖤")
        motivationalShayriList.add("💖कभी-कभी आप अपनी खुद की ताकत का एहसास नहीं करते हैं जब तक कि आप अपनी सबसे बड़ी कमजोरी का सामना \n" +
                "नहीं करते..💛💖")
        motivationalShayriList.add("“🤴अच्छा दिखने के लिए नहीं, किन्तु अच्छा बनने के लिए जिओ..🤗”")
        motivationalShayriList.add("🏄जीवन में तूफान का आना भी ज़रूरी हैं क्यूंकि तभी हमें पता चलता है कि कौन हाथ पकड़ साथ चलता है  और कौन साथ छोड़कर जाता है..👫")

        motivationalShayriList.add("💖सफलता इसमें नहीं है कि आप कितने बड़े सपने देखते हैं, बल्कि सफलता इस बात में है कि आप अपने छोटे से छोटे सपने को भी कितने जुनून से पूरा करते हैं..🖤")
        motivationalShayriList.add("💖ए मंजिल के मुसाफिर, हौसले की तरकस में मंजिल का वो तीर जिंदा रख,हार जाओ तुम जिंदगी में सब कुछ फिर भी जीतने का उम्मीद जिंदा रख..🤗")
        motivationalShayriList.add("🏄रेस चाहे गाड़ी की हो या जिंदगी की जीतते वहीं लोग हैं जो समय पर गियर चेंज करते हैं..👑")
        motivationalShayriList.add("🤴जो बिना ठोकर खाए मंजिल तक पहुंच जाते हैं उनके हाथ अक्सर अनुभव से खाली रह जाते हैं..🖤")
        motivationalShayriList.add("सिर्फ सुकून ढूंढिए जरूरतें कभी ख़त्म नहीं होंगी..🖤")
        motivationalShayriList.add("👀आँख से गिरे आंसू\n" +
                "और नज़रों से गिरे लोग.कभी नहीं उठा करते..💖")
        motivationalShayriList.add("💔शीशा टूटने के बाद बिखर जाए वो ही बेहतर है,क्योंकि दरारे न जीने देती है और न ही \n" +
                "मरने देती है..💖")
        motivationalShayriList.add("🦅अभी तो असली उड़ान बाकी है, परिंदे का इम्तिहान बाकी है, अभी अभी तो लांघा है समुंदर, अभी तो पूरा आसमान \n" +
                "बाकी है..⛅")
        motivationalShayriList.add("🤴मैं वो खेल नहीं खेलता,\n" +
                "जिसमे जीतना फिक्स हो,क्योंकि जीतने का मजा तब हैं,जब हारने का रिस्क हो..👑")


        motivationalShayariShowAdapter= ShayariDataShowAdpter(this,motivationalShayriList)
        binding.motivationalShowrecycleview.adapter=motivationalShayariShowAdapter
        binding.motivationalShowrecycleview.layoutManager= LinearLayoutManager(this)



    }
}