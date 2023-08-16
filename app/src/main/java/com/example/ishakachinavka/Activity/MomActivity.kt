package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivityMomBinding

class MomActivity : AppCompatActivity() {
    lateinit var binding: ActivityMomBinding

    lateinit var momShayariShowAdapter: ShayariDataShowAdpter
    var momShayriList= mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMomBinding.inflate(layoutInflater)
        setContentView(binding.root)

        momShayriList.add(" हजारों गम हो फिर भी मैं खुशी से फूल जाता हूं,\n" +
                "जब हस्ती है मेरी मां मैं हर गम भूल जाता हूं!")
        momShayriList.add("हालातों के आगे जब साथ ना जुदा होती है,\n" +
                "पहचान लेती है ख़ामोशी में हर दर्द वह सिर्फ मां होती है!")
        momShayriList.add("किसी भी मुश्किल का अब किसी को हल नहीं मिलता,\n" +
                "शायद अब घर से कोई मां के पैर छूकर नहीं निकलता।")
        momShayriList.add("मुसीबतों ने मुझे काले बादल की तरह घेर लिया,\n" +
                "जब कोई राह नजर नहीं आई तो मां याद आई।")
        momShayriList.add("मां तुम्हारे पास आता हूं तो सांसें भीग जाती है,\n" +
                "मोहब्बत इतनी मिलती है की आंखें भीग जाती है।")
        momShayriList.add("मां वो सितारा है जिसकी गोद में जाने के लिए हर कोई तरसता है,\n" +
                "जो मां को नहीं पूछते वो जिंदगी भर जन्नत को तरसता है।")
        momShayriList.add("जिसके होने से मैं खुद को मुक्कम्मल मानता हूँ,\n" +
                "मैं खुदा से पहले मेरी माँ को जानता हूँ।")
        momShayriList.add("सर पर जो हाथ फेरे तो हिम्मत मिल जाये,\n" +
                "माँ एक बार मुस्कुरा दे तो जन्नत मिल जाये।")
        momShayriList.add("उसके रहते जीवन में कभी कोई गम नहीं होता,\n" +
                "दुनिया साथ दे या ना दे पर माँ का प्यार कभी कम नहीं होता.")
        momShayriList.add("घुटनों से रेंगते – रेंगते कब पैरो पर खड़ा हो गया,\n" +
                "माँ तेरी ममता की छाँव में न जाने कब बड़ा हो गया.")

        momShayriList.add("हर घड़ी दौलत कमाने में इस तरह मशरूफ रहा मैं,\n" +
                "पास बैठी अनमोल मां को भूल गया मैं।")
        momShayriList.add("सीधा साधा भोला भाला मैं ही सब से सच्चा हूँ,\n" +
                "कितना भी हो जाऊं बड़ा माँ आज भी तेरा बच्चा हूँ।")
        momShayriList.add("माँ पहले आँसू आते थे तो तुम याद आती थी,\n" +
                "आज तुम याद आती हो और आँसू निकल आते है।")
        momShayriList.add("हर रिश्ते में मिलावट देखी,\n" +
                "कच्चे रंगो की सजावट देखी,लेकिन सालों साल देखा है मां को उसके चेहरे पर ना कभी थकावट देखी,ना ममता में कभी मिलावट देखें!")
        momShayriList.add("जब कभी मेरा मन उदास होता है,\n" +
                "तब तेरा चेहरा आसपास होता है,तब मिलता है सुकून और विश्वास,माँ ! तेरा आशीर्वाद का अहसास होता है।")
        momShayriList.add("कैसे भुला दू मैं अपने पहले प्यार को कैसे तोड़ दू उस की ऐतबार को,\n" +
                "सारा जीवन उस की चरणों मे अर्पण कर दू छोड़ दू माँ की खातिर इस संसार को ।।")
        momShayriList.add("किसी ने रोजा रखा किसी ने उपवास रखा,\n" +
                "कुबूल उसका हुआ जिसने अपने माँ-बाप को अपने पास रखा….!!")
        momShayriList.add("लबों पे उसके कभी बददुआ नहीं होती,\n" +
                "बस एक माँ है जो मुझसे खफा नहीं होती.\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67")
        momShayriList.add("इस तरह मेरे गुनाहों को वो धो देती है,\n" +
                "माँ बहुत ग़ुस्से में होती है तो रो देती है।")
        momShayriList.add("माँ कर देती है पर गिनाती नहीं है,\n" +
                "वो सह लेती है पर सुनाती नहीं है।")

        momShayriList.add("सख्त राहों में भी आसान सफ़र लगता है,\n" +
                "ये मेरी माँ की दुआओं का असर लगता है।")
        momShayriList.add("एक हस्ती है जो जान है मेरी,\n" +
                "जो जान से भी बढ़ कर शान हे मेरी,रब हुक्म दे तो कर दू सजदा उसे,क्यूँ की वो कोई और नही माँ है मेरी")
        momShayriList.add("ए माँ तेरा मुस्कुराता चेहरा ही\n" +
                "मेरे दिल का सुकून होता है।")
        momShayriList.add("हालातो के आगे जब साथ न जुबा होती है,\n" +
                "पहचान लेती है ख़ामोशी मे हर दर्द वो सिर्फ “माँ” होती है !!!")
        momShayriList.add("बिन कहे आँखों में सब पढ़ लेती है,\n" +
                "बिन कहे जो गलती माफ़ कर दे वो माँ है।")
        momShayriList.add("जन्नत का हर लम्हा दीदार किया था,\n" +
                "माँ ने गोद में उठा कर जब प्यार किया था.\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67")
        momShayriList.add("मुझे तुमसे बेहद मोहब्बत है माँ\n" +
                "तू जन्नत से भी खूबसूरत है माँ\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67")
        momShayriList.add("माँ को याद कर लेता हूँ,\n" +
                "जब भी खुद को अकेला पाता हूँ,")
        momShayriList.add("क्या चाहिए कितना बाकी है\n" +
                "सुकून पाने के लिए\n" +
                "माँ से बात ही काफी है\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67")
        momShayriList.add("जो सब पर कृपा करे उसे ईश्वर कहते है,\n" +
                "जो ईश्वर को भी जन्म दें उसे मां कहते है।")

        momShayriList.add("जब-जब कागज पर लिखा मैंने माँ का नाम,\n" +
                "कलम अदब से बोल उठी हो गये चारों धाम।")
        momShayriList.add("हर गली, हर शहर, हर देश-विदेश देखा,\n" +
                "लेकिन मां तेरे जैसा प्यार कहीं नहीं देखा।")
        momShayriList.add("मेरी दुनिया में इतनी जो शौहरत है\n" +
                "मेरी माँ की बदौलत है ऐ ऊपर वाले और क्या देगा तु मेरे लिये तो मेरी माँ ही मेरी सबसे बड़ी दौलत है\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67")
        momShayriList.add("चलती फिरती आँखों से अजां देखी है\n" +
                "मैंने जन्नत तो नहीं देखी\n" +
                "लेकिन माँ देखी है\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67")
        momShayriList.add("किसी को घर मिला हिस्से में या कोई दुकाँ आयी,\n" +
                "मैं घर में सबसे छोटा था मेरे हिस्से में माँ आयी।")
        momShayriList.add("न तेरे हिस्से आयी न मेरे हिस्से आयी,\n" +
                "माँ जिसके जीवन में आयी उसने जन्नत पायी।")
        momShayriList.add("जो रुला कर मना ले वो पापा है,\n" +
                "और जो रुला कर ख़ुद भी रोये वो मां है..!\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67")
        momShayriList.add("सारे जहां में नहीं मिलता बेशुमार इतना,\n" +
                "सुकून मिलता है मां के प्यार में जितना\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67")
        momShayriList.add("इस जीवन में सबसे बड़ा माँ का ही प्यार है\n" +
                "वही मंदिर वही पूजा और वही सारा संसार है\n" +
                "\uD83D\uDC69\u200D\uD83D\uDC67❤\uD83D\uDC69\u200D\uD83D\uDC67")
        momShayriList.add("जो शिक्षा का ज्ञान दे उसे शिक्षक कहते है,\n" +
                "और जो खुशियों का वरदान दे उसे मां कहते है।")




        momShayariShowAdapter= ShayariDataShowAdpter(this,momShayriList)
        binding.maaShowrecycleview.adapter=momShayariShowAdapter
        binding.maaShowrecycleview.layoutManager= LinearLayoutManager(this)

    }
}