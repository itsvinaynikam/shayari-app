package com.example.ishakachinavka.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ishakachinavka.Adapter.ShayariDataShowAdpter
import com.example.ishakachinavka.Model.Shayari
import com.example.ishakachinavka.R
import com.example.ishakachinavka.databinding.ActivityIshakachiNaukaBinding

class IshakachiNaukaActivity : AppCompatActivity() {


    lateinit var binding:ActivityIshakachiNaukaBinding

    lateinit var ishakachiNaukaShayariShowAdapter: ShayariDataShowAdpter
    var ishakachiNaukaShayriList= mutableListOf<Shayari>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityIshakachiNaukaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        ishakachiNaukaShayriList.add(Shayari(443,"\uD83D\uDD25जलेगा तू \uD83D\uDC78भी जलेगा..\n" +
                "      Afsoss करे या \n" +
                "  ना करे...❣️\n" +
                "  \uD83D\uDCAF याद तो तू जरूर करेगा.....\uD83D\uDC94"))
        ishakachiNaukaShayriList.add(Shayari(444,"काश तू बादला ना होता..\uD83D\uDC70\n" +
                "           तो कितना अच्छा होता..\uD83D\uDC94"))
        ishakachiNaukaShayriList.add(Shayari(445,"\uD83D\uDC94हा हम हार गये आपसे...\uD83D\uDC70\uD83C\uDFFC\u200D♀\n" +
                "   क्यू की...\n" +
                "\uD83D\uDC78\uD83C\uDFFBखुद से ज्यादा प्यार कर बैठे थे तुमसे...❣️"))

        ishakachiNaukaShayriList.add(Shayari(446,"\uD83D\uDDA4ना बोलायच आणि नाही त्रास करुण घेयाचा\n" +
                "फक्त लक्षात ठेवायचं...\n" +
                " \uD83D\uDC65कुनी,कधी केव्हा फक्त स्वता:च विचार केलं..! \n" +
                "⏳क्युकी ए वक्त का खेल जनाब यहा बारी बारी से बारी सबकी आती है.."))

        ishakachiNaukaShayriList.add(Shayari(447,"\uD83D\uDC78\uD83C\uDFFBकौन हैं जो\uD83E\uDD34 हमे दुआ वो मैं मांग रहा हैं..\n" +
                " \uD83D\uDC78\uD83C\uDFFBना तुम Zindagii मैं आ रही हो और नाही   मुझे किसी का होने दे रही हो...\uD83D\uDE09"))
        ishakachiNaukaShayriList.add(Shayari(448,"\uD83E\uDD7Aजान चली जाती थी जिसके जाने से\uD83D\uDC78 वो  किसी और कि होके भी जला  ना सकी हमें..\n" +
                "\uD83D\uDE07 जो भी करना खुद के खुशी के वास्ते करना...❣️\n आपको किसी और के साथ देख हम जले बस ये गलत फेमी मत पालना....\uD83E\uDD19"))
        ishakachiNaukaShayriList.add(Shayari(449,"\uD83D\uDE07आपण फक्त त्यालाच महत्व देतो जो अपल्याला महत्व देतो..❣️\n" +
                "  बाकी\n" +
                " \uD83D\uDC78तुज्या गालावरची गुलाबी आणि तुमच्या नावातली  \uD83D\uDCB8श्रीमंती हमारे लिये मायने नहीं रखती..\uD83D\uDDA4"))
        ishakachiNaukaShayriList.add(Shayari(450,"\uD83D\uDE0EAttitude दिखाने नही\uD83D\uDC70 Pagli आपका   दिलं चूराने आये है...!   \uD83E\uDE84✨\n" +
                "\uD83D\uDE09 अब यु ना पूछो कौन हो आप? हम  वही आपके Ashiq पुराने है.. ❣️"))
        ishakachiNaukaShayriList.add(Shayari(451,"\uD83D\uDC70अस वाटत की तु रोज स्वप्नात यावीस ❤️\u200D\uD83D\uDD25\n" +
                "हकीकत में ना तो ना सही...\n" +
                "स्वप्नात तरी माझी व्हावीस...\uD83D\uDDA4"))
        ishakachiNaukaShayriList.add(Shayari(452,"\uD83D\uDC42हमने सूना \uD83D\uDC70 आपके भी इश्क का मजाक हुआ..\uD83D\uDC94\n" +
                "यह खबर सूनके हमे बडा सुकून मिला..\uD83D\uDE06"))

        ishakachiNaukaShayriList.add(Shayari(453,"\uD83D\uDC70जीसे हम पाना चाहते हैं..!\n" +
                "वो हमारा होना नही चाहता..\uD83D\uDC94"))
        ishakachiNaukaShayriList.add(Shayari(454,"\uD83D\uDD25जल तू सिर्फ जल ..\uD83D\uDC70\n" +
                "क्युकी तू जलेगी तो इस दिलं को थंडक मिलेगी..\uD83D\uDE08"))
        ishakachiNaukaShayriList.add(Shayari(455,"❣️आज कल हर रोज आप हमारे सपनो मैं आ सी रही हो ..\uD83D\uDC70\n" +
                "लगता हैं इस दील को अपसे फिर मोहब्बत सी हो रही..\uD83D\uDE0D"))
        ishakachiNaukaShayriList.add(Shayari(456,"\uD83D\uDE08अपने Attitude से बडकर\n" +
                "      हमारे लिये कूछ नही..\n" +
                "  \uD83D\uDC70 तू भी नहीं..❌\n" +
                " और तेरा\n" +
                "जुठा प्यार भी नहीं..\uD83D\uDC94"))
        ishakachiNaukaShayriList.add(Shayari(457,"\uD83D\uDC70Pagli हम Ashiq हैं..\uD83D\uDE0D\n" +
                " और\n" +
                "\uD83D\uDE09Ashiq अकसर दील की बात्ते किया करते है.. \uD83D\uDE0D"))
        ishakachiNaukaShayriList.add(Shayari(458,"💙Thank You So Much वेडू ..\uD83D\uDC70\n" +
                "अगर\n" +
                "तुम छोड ना जाते...💔\n" +
                "तो हम बदल ना पाते \uD83D\uDE08"))
     /*   ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())

        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())
        ishakachiNaukaShayriList.add(Shayari())*/



        ishakachiNaukaShayariShowAdapter= ShayariDataShowAdpter(this,ishakachiNaukaShayriList)
        binding.ishakchinaukashayariShowrecycleview.adapter=ishakachiNaukaShayariShowAdapter
        binding.ishakchinaukashayariShowrecycleview.layoutManager= LinearLayoutManager(this)


        binding.backBtn.setOnClickListener {
            onBackPressed()
        }
    }
}