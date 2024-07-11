package com.example.info;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    List<Shahar>shaharList=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_2);
        loadData();


        int n=getIntent().getIntExtra("RAQAM",0);
        Shahar shahar=shaharList.get(n);
        TextView textView=findViewById(R.id.text1);
        textView.setText(shahar.getTextShahar());
        ImageView imageView=findViewById(R.id.image1);
        imageView.setImageResource(shahar.getImgId());
        findViewById(R.id.bu).setOnClickListener(v -> {
            finish();
        });
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        TextView textView1=findViewById(R.id.tr);
        textView1.setText(shahar.getTextDescroption());

    }
    private void loadData(){
        shaharList.add(new Shahar(R.drawable.img,"Registon","Dastlabki 1417–1420-yillarda Ulugʻbek madrasasi bunyod etilib, keyinchalik qarshisiga – maydonning sharqiy qismida Ulugʻbek xonaqosi (1424-yil), shimoliy qismiga Mirzoyi karvonsaroyi, janubiga Alika Koʻkaldosh juma masjidi (1430-yil) bunyod etilgan, yonida esa yogʻochdan xotamkori uslubida Masjidi Muqatta va Abusaid madrasasi qurilgan. 1420–1440-yillarida Registon hashamatli meʼmoriy ansamblga aylangan. XVII asrda Samarqand hokimi Yalangtoʻsh Bahodir vayrona holatdagi Ulugʻbek xonaqosi oʻrniga Sherdor madrasasini (1619–1635/36), Mirzoyi karvonsaroyi oʻrniga Tillakori masjidini (1646/47–1659/60) qurdirgan. Registon maydoni oʻzining rang-barang koshinkori bezaklari; naqshinkori peshtoqlari, ulkan gumbazlari bilan Markaziy Osiyo meʼmorchligining noyob yodgorligi hisoblanadi[2].\n" +
                "\n" +
                "Qadimiy Samarqand shahrining rasmiy markazi Registon maydoni boʻlib, bu yerda uchta madrasa qad koʻtargan: Ulugʻbek, Sherdor va Tillakori madrasalari. Registon – qadimiy ilm, taʼlim muassasalari joylashgan joy boʻlib, sharqdagi shahar qurilishi sanʼatining eng koʻzga koʻrinarli namunalaridan biri hisoblanadi. U haqda Temuriylar faxr bilan: „Kim bizning kuch-qudratimizga shubha qilsa, kelib biz qurgan binolarni koʻrsin“, deganlar. 2001-yilda bu uch madrasa UNESCOning butun dunyo yodgorliklari roʻyxatiga kiritilgan.\n" +
                "\n" +
                "\n" +
                "Registon maydoni- tarixda shaharning ilm-fan, siyosat va diniy markazi boʻlgan. „Registon“ soʻzi „qumloq joy“ degan maʼnoni anglatadi. Oʻrta asrlarda hamma katta shaharlarda markazlar „Registon“ deb atalar edi. Shu nomdagi maydonlar Buxoro, Shahrisabz va Toshkentda ham boʻlgan. Samarqanddagi maydon esa Markaziy Osiyodagi eng mahobatli va tahsinga sazovor maydonlardan biri edi. Bu maydonda bir necha ming yillik tarix mujassam. Amir Temur hukmronligi davrida Registon Samarqandning markaziga aylantirildi. Ulugʻbek davrida esa maydon bundan ham muhimroq ahamiyatga ega boʻldi. Zamonaviy Registon ansambli oʻzida Ulugʻbek, Sherdor va Tillakori madrasalarini mujassam etadi.\n" +
                "\n" +
                "Registonning janubiy tomonida xalq orasida „Childuxtar" +
                "on“ deb atalmish xonaqoh va maqbaralar joylashgan edi. Ularni Koʻchkunchixon qurdirgan edi va Tillakori madrasasiga qoʻsh qilib bunyod etilgan edi. U 1904-yilgi zilziladan soʻng xarobaga aylanib, 1910-yili butunlay buzilgan va oʻrni maydon boʻlib qolgan. 100 yil orasida oxirgi koʻrinishini olgan bu Registonni koʻrish ishtiyoqida butun dunyodan sayyohlar tashrif buyurishadi"));
        shaharList.add(new Shahar(R.drawable.img_1,"Amir Remur Maqbarasi","Goʻri Amir yoki Amir Temur maqbarasi (15-asr boshi – 1405-yil) – Samarqanddagi meʼmoriy yodgorlik. Xalq orasida Goʻri Amir yoki Goʼri Mir (Mir Sayyid Baraka) deb nomlanib kelinadi. Maqbaraga temuriylar sulolasiga mansub kishilar (Amir Temur, uning piri Mir Sayyid Baraka, oʻgʻillari Umarshayx, Mironshoh va Shohrux, nabiralari Muhammad Sulton, Ulugʻbek va boshqalar) dafn etilgan. Boburning taʼkidlashicha, dastlab Temurning nabirasi Muhammad Sulton Mirzo Samarqand qalʼasi yaqinida Toshqoʼrgʼon – tomonda Madrasa qurdirgan. Muhammad Sulton halok boʼlgach (1403), Amir Temur uning xotirasiga maqbara qurish haqida farmon beradi. Maqbara Madrasa hovlisining toʻriga bunyod etilgan.\n" +
                "\n" +
                "Tarixi\n" +
                "\n" +
                "Movarounnahr\n" +
                "1370 - 1405\tAmir Temur\n" +
                "1405 - 1447\tShohruh Mirzo\n" +
                "1447 - 1449\tMirzo Ulug'bek\n" +
                "1449 - 1450\tMirzo Abdullatif\n" +
                "1451 - 1469\tAbu Said\n" +
                "1469 - 1494\tSulton Ahmad\n" +
                "1494 - 1495\tSulton Mahmud\n" +
                "1495 - 1497\tBoysungʻur Mirzo\n" +
                "1498 - 1500\tSulton Ali Mirzo\n" +
                "1500 - 1512\tZahiriddin Muhammad Bobur\n" +
                "\n" +
                "1910 yil\n" +
                "\n" +
                "Rasm (Vasiliy Vereshchagin, 1870 yil)\n" +
                "Goʻri Amir Oʻrta Osiyo meʼmor-chiligining noyob asari sifatida eʼtirof etiladi. Maqbara qurilishi Amir Temur buyruʻgiga asosan 1403-yilda boshlanib, Mirzo Ulugʻbek davrida tugallangan hamda temuriylar xilxonasiga aylantirilgan.\n" +
                "\n" +
                "Maqbara, oʻrta asr Samarqandining janubiy-sharqiy qismida, Temurning nabirasi Muhammad Sulton tomonidan, XIV asrning oxirida bino qildirgan majmua qoshida tiklangan.\n" +
                "\n" +
                "Muhammad Sulton 1403-yilda Kichik Osiyo qirgʻoqlariga uzoq safardan qaytayotib, toʻsatdan vafot etadi. Shahzodaning jasadi Samarqandga keltirilib, ansamblning janubiy peshtoqidagi ayvon orqasidagi daxmaga dafn etiladi. Amir Temur shahzoda nomi bilan atalgan maqbara qurishni buyurdi. Shundan soʻng, kulbada sakkiz burchakli bino quriladi. Tarixchi Shoʻrqa Sharafiddin Ali Yazdiy binoni „baland gumbazi osmondek, devorlarining pastki qismi marmardan yasalgan, oltin va lapis lazuli bilan bezatilgan“ deb taʼriflaydi. Ammo Amir Temur maqbara qurilishini bu bilan tugatmaydi. U 1405-yilda erta vafot etgan va Muhammad Sulton jasadi yoniga dafn etilgan.\n" +
                "\n" +
                "Amir Temur vafotidan keyin taxt uchun oʻzaro urushlar boshlanib, maqbara qurilishiga toʻsqinlik qildi. Mamlakat faqat 1409-yilda tinchlandi. Amir Temurning oʻgʻli Shohruh Mirzo Hirotni poytaxt qildi. Mirzo Ulugʻbek Samarqandga hokim etib tayinlanadi. U mamlakatda madaniyat va qurilish ishlarini rivojlantirib yuboradi. Mirzo Ulugʻbek buyuk bobosiga hurmat yuzasidan sakkizyoqli maqbarani temuriylar avlodi dafn qilinadigan maqbaraga aylantiradi.\n" +
                "\n" +
                "Amir Temur Mirzo Ulugʻbekdan juda koʻp boylik meros qilib olgan. Olimlar, hunarmandlar, rassomlar uning ixtiyorida. U mamlakatda madaniyat va qurilish ishlarini olib boradi. Mirzo Ulugʻbek oʻzining buyuk bobosi sharafiga sakkiz burchakli maqbarani temuriylar avlodlari dafn etiladigan maqbaraga aylantirdi. Maqbara qurilishi tugallangach, Amir Temurning maʼnaviyat ustozi Mirsaid Barakiyning jasadi ushbu maqbaraga koʻchiriladi. Amir Temurning maʼnaviyati ustozi poyiga dafn etilgan. Ayrim maʼlumotlarga koʻra, bunday vasiyatnomani Amir Temurning oʻzi tuzgan. Binoning ichki qismi qayta bezatilgan, maqbara sahnasida kulbalar quriladi, atrofi nafis marmar bilan oʻraladi. Maqbaraga sharqiy tomondan 1424-yilda qurilgan koʻp gumbazli galereya orqali kirish mumkin.\n" +
                "\n" +
                "Maqbarada Amir Temurning oʻgʻillari Mironshoh va Shohrux ham dafn etilgan.\n" +
                "\n" +
                "Maqbaraning gʻarbiy va janubiy tomonlarida qad rostlash boshlangan, ammo qurilishi tugallanmagan ulkan binolar Mirzo Ulugʻbek hukmronligining soʻnggi yillariga toʻgʻri kelgan boʻlsa kerak.\n" +
                "\n" +
                "1449-yilda siyosiy inqiroz natijasida Mirzo Ulugʻbek vahshiylarcha oʻldirildi. Buyuk astronomning jasadi Goʻri Amir maqbarasiga dafn etiladi.\n" +
                "\n" +
                "Arxitekturasi\n" +
                "Baʼzi maʼlumotlarga koʻra, madrasa 20-asrda faoliyat koʻrsatgan, bizgacha faqat xonaqoning xarobalari saqlanib qolgan. XNUMX-yillardagi ijtimoiy-iqtisodiy inqiroz davrida tashlab ketilgan Muhammad Sulton madrasasi vayronaga aylangan.\n" +
                "\n" +
                "Muhammad Sulton madrasasi va xonqohi unutilganligi sababli Samarqand yodgorliklarini birinchi tadqiqotchilar uzoq vaqt davomida madrasa va xonqaning joylashishini aniqlay olmadilar. Va faqat yigirmanchi asrning oʻrtalaridan boshlab qadimiy yodgorliklarni chuqur va har tomonlama oʻrganish imkoniyati paydo boʻldi. Arxeologik qazishmalar natijasida vayron boʻlgan binolarning devor va poydevor qoldiqlari topildi. Arxitektura tadqiqot ishlari binoning ayrim qismlarining oʻlchamlarini, dizayni va pardozlashini chizishda aniqlash imkonini berdi. Yigʻilgan materiallar rejalashtirilgan restavratsiya ishlari uchun asos sifatida ishlatilgan. Butunlay vayron boʻlgan hovli devorlari tiklandi. Natijada arxitektura majmuasi binolarining qanday tartibda qulashini aniqlash mumkin boʻldi.\n" +
                "\n" +
                "Muhammad Sulton majmuasidan faqat peshtoqigina saqlangan. Bu peshtoq mohirlik bilan ishlangan boʻlib, koshinlar bilan devor fonida yaqqol koʻrinib turadi. Koshinlar orasiga binoni qurgan usta – Muhammad binni Mahmud Isfahoniyning nomi va „Dini jannat dili poklarnikidir“, deb jimjimador qilib yozib qoʻyilgan. gʻishtin ustunlar bezagida girih deb ataluvchi geometrik shakllarga asoslanib, nafis qilib ishlangan kompozitsiya asosiy oʻrinni egallaydi. Gumbazda jez, lojuvard va tillo suvlari ishlatilgan.\n" +
                "\n" +
                "Dastlab maqbaraga shimoliy eshikdan kirilgan. Mirzo Ulugʻbek tomonidan sharqiy eshik 1425-yilda ochilgan, chunki Mir Sayyid Barakaning bosh tomonlaridan kirishni Mirzo Ulugʻbek hurmatsizlik deb hisoblagan. 1868-yilda Chor Rossiyasi istilosi-yillarida maqbara darvozalari oʻgʻirlab ketilgan. Sohibqiron Amir Temur saroyi darvozalaridan biri Londonda, yana biri Ermitajda va uchinchi eshik esa Oʻzbekiston madaniyati va tarixi davlat muzeyi fondida saqlanmoqda. Hovlining sharq tomonidagi devor ortida Muhammad Sulton madrasasining qoldiqlari koʻrinib turadi. Chorsu hovlisining atrofiga ikki qavatli hujralar tushirgan.\n" +
                "\n" +
                "Madrasaning burchaklarida gumbazli darsxonalar boʻlgan. Maqbara devorlariga zangori, havo rang va oq sirli koshinlar qoplangan, bu koshinlar geometrik shaklda terilib, arabcha xat bitilib, ustalik bilan ishlangan. Meʼmor bir-biriga mos shakllardan foydalanib, binolarning katta sathlarini mohirlik bilan bezagan.\n" +
                "\n" +
                "Maqbaraning tashqi tomoni bunyod qilinganda uning gumbaziga katta ahamiyat berilgan. Gumbaz ostki qismining aylanasi 15 metr, balandligi 12,5 metr boʻlsada, uning ogʻirligi sezilmaydi. Gumbazning rang-barang qilib ishlanishi katta ahamiyatga ega. Gumbazda havo rang koʻproq ishlatilgani uchun bu rang gumbazning egri chiziqli qobirgʻalarida tovlanib, quyoshda charaqlab, guyo osmonga qadalib turadi. Gumbazning usti sirli koshinlar bilan qoplangan. Sharafalarida ham shunday koshinlardan hajmi bir-biriga mos qilib ishlangan chiroyli jimjimalar bor. Maqbaraning tashqi gumbazi yodgorlikning tashqi qiyofasi yanada salobatli boʻlishi uchun uning ustiga ikkinchi gumbaz oʻrnatilgan.\n" +
                "\n" +
                "Galereya zallarining shaklini devorlar qoldigʻidan, devorga ishlangan bezaklarni esa sharafa parchalaridan bilsa boʻladi. Inshootning qanchalik katta boʻlganligini uning gʻarb tomonida bitmay qolgan majmuaga qarab aniqlash mumkin. Katta zaldan uni toʻrt tomoniga qachonlardir qoʻyilgan toʻrtta ravogʻidan bittasigina saqlanib qolgan. Eni 10 metrlik ravoqning ikki tomonidan yoʻlak oʻtgan. Yoʻlakning shimol tomonidan qoʻsh gumbazli ikki qavatli binoga, janub tomondan esa galereyaga kiriladi. Goʻri Amir va dahmasiga shu galereyadan oʻtiladi. Demak, maqbara atrofi binolar bilan oʻralgan ekan.\n" +
                "\n" +
                "Muhammad Sulton xonaqohi va madrasasidan devor qoldiqlari va koshin parchalarigina saqlangan. Shu qoldiqlar asrlar boʻyi pinhon boʻlib kelgan inshoot sirini bilishga imkon berdi. Xonaqoh oʻrtasida katta gumbazli keng zal, zalning atrofida ikki qavatli, biridan ikkinchisiga oʻtiladigan xonalar boʻlgan, bu xonalarning baʼzilarida kishilar yashagan, baʼzilari qaznoq boʻlgan.\n" +
                "\n" +
                "Hovli atrofini oʻrab turgan devorlar ikki qavatli bezakli ravoqlarga boʻlingan. Hovlining tashqi burchaklarida toʻrt minoralar boʻlgan. Yuqoriga koʻtarilgan sari ingichkalashib borgan minora Registon maydonidagi Mirzo Ulugʻbek madrasasi minoralari kabi sharafa bilan bezatilgan. Minoraning asosi bilan tepasi orasidagi tafovut koshin plitalar terishda ustalik bilan bartaraf qilingan. Koshinlar har bir qatoriga bir xil miqdorda koshin plitalar terilgan holda, ular orasidagi choklar yuqoriga koʻtarilgan sari torayib boradi va tepasiga yetib tutashadi. Mirzo Ulugʻbek davrida maqbaraga kirish uchun qurilgan eshikning yoni va tepalari nafis bezatilgan. Ilgari eshik tepasida: „Bu shavkatli Amir Temurning qabri…“ deb yozilgan koshinli lavha boʻlgan (bu plita hozir Sankt-Peterburgdagi Davlat Ermitajida saqlanadi). Maqbaraga qator gumbazli galereyadan oʻtib kiriladi.\n" +
                "\n" +
                "Galereyadan oʻtib, Temuriylar maqbarasiga kiriladi. Maqbara gʻoyatda nafis bezatilgan. Devorning pastki qismida koʻkimtir shaffof oniks toshidan ishlangan izora bor. Oniksning choklari koʻkimtir toshlar terib bezatilgan. Maqbaraga rangdor oynalar solingan panjarali darchadan yorugʻlik tushadi. Shu oynalardan oʻtib tushgan quyosh nuridan maqbara ichi rang-barang tovlanib turadi.\n" +
                "\n" +
                "Maqbaraning oʻrtasiga oʻrnatilgan sagʻanalar ustida Temuriylarga bagʻishlangan yozuvlar bor. Shular orasida Amir Temurning qabri ustiga qoʻyilgan toʻq yashil rangli nefrit tosh diqqatni oʻziga jalb etadi. Mirzo Ulugʻbek 1425-yilda moʻgʻullar ustidan gʻalaba qozonganda qoʻlga kiritilgan oʻljalar ichida ikki boʻlak nefrit ham boʻlgan. Shu ikkala toshni yaxshilab ishlab, bir-biriga ulab, Amir Temur qabri ustiga quyilgan. 1740-yilda Eron shohi Nodirshoh Buxoro xonligini zabt etgan vaqtida (oʻsha vaqtda Samarqand Buxoro xonligiga qarar edi) Amir Temur qabri ustidagi toshni Mashhadga olib borishga buyruq bergan. Lekin, shakkok boʻlishdan choʻchigan Nodirshoh bu niyatidan qaytgan va oʻsha zamon uchun uzoq va qiyin boʻlgan safarlardan keyin toshni yana qaytadan joyiga keltirib qoʻydirgan.\n" +
                "\n" +
                "Maqbaraning sharq tomonidagi ravoqda pastga tushadigan zina bor. Bu zinadan maqbaraning ostki qavatidagi dahmaga tushiladi. Ostki qavatdagi binoning shipi oʻn ikki qirrali gumbaz qilib qiya ishlangan, ichki bezaklari juda sodda. Temuriylarga qoʻyilgan sagʻanalar yuqori qavatda qanday tartibda boʻlsa, bu yerda ham shu tartibda. Har qaysi qabr usti marmartosh bilan qoplangan.\n" +
                "\n" +
                "1994–1996-yillarda maqbarada katta hajmdagi taʼmirlash va tiklash ishlari amalga oshirildi.\n" +
                "\n" +
                "Bizgacha, asosan, peshtoqli darvozasi bor hovli va maqbara binosi saqlangan. Arxeologik tadqiqotlar natijasida maqbara hovlisining ikki yonidan Muhammad Sulton qurdirgan Madrasa va xonaqoh qoddiqlari topilgan. Madrasa va xonaqoh chorsi hovlining sharqiy va gʻarbiy tomonlarini egalla-gan. Maqbara tashqi koʻrinishini qurishda gumbazga katta ahamiyat berilgan. Gumbazning pastki qismining aylanasi 15 metr, balandligi 12,5 metr boʻlsa-da, ogʻirligi sezilmaydi. Buning sababi shundaki, 64 qovurgʻali gumbazning ogʻirligi chiroyli ishlangan kamar orqali mustahkam poydevor doirasiga tushadi. Gumbazning rang-barang dizayni katta ahamiyatga ega. Gumbazda koʻk rang koʻproq qoʻllanilganligi sababli, bu rang gumbazning qiyshiq qovurgʻalarida yaltirab, quyoshda xuddi osmonga qaragandek porlab turadi. Gumbazning tepasi sirli koshinlar bilan qoplangan.\n" +
                "\n" +
                "Ularning sharafiga, shuningdek, oʻlchamlari bir-biriga mos keladigan bunday plitkalardan chiroyli sukunatlar mavjud. Yodgorlik qiyofasini yanada mahobatli qilish uchun maqbaraning tashqi gumbazi ichki gumbazga oʻrnatilgan.\n" +
                "\n" +
                "Ziyoratxona oʻrtasidagi marmar panjara bilan oʻralgan murabba xazira sahniga qator qabrtoshlar qoʻyilgan. Yuqorisi (toʻri)da Amir Temurning harbiy yurish-larida unga hamroh boʻlgan va uning yuk-sak hurmatini qozongan Mir Sayyid Baraka sagʻanasi joylashgan. Sayyid Baraka qabrining oyoq tomoniga Amir Temurning oʻzi dafn qilingan. Uning uch tomonida Muhammad Sulton, Mironshoh, Umarshayx qabrlari bor. Keyinchalik bu yerga Temurning nabiralari va evara-larining qabr toshlari qatʼiy tartib-da joylashtirilgan. Temur sagʻanasiga qoʻyilgan koʻk nefrit qabrtoshini Ulugʻbek Moʻgʻulistonga qilgan yurishi vaqtida olib kelgan. Toshdagi lavhada Temurni ulugʻlaydigan soʻzlar, uning shajarasi hamda marsiyalar oʻymakori yozuvlarda bitilgan. Hamma sagʻanalar Ulugʻbek tomonidan yaxlit oʻyma mar-mar panjara bilan oʻralgan. Ziyoratxona-ning sharqiy qismidagi ravoqdan zina orqali ostki qavatidagi goʻrxonaga tu-shiladi. Goʻrxona sakkiz qirrali. Undagi sagʻanalar yuqrri qavatda qanday joylash-gan boʻlsa, bu yerda ham shu tartibda joy-lashgan. Ziyoratxonadagi qabrtoshlarning har biri yuksak sanʼat asaridir. Ziyorat-xona serhasham bezaklarga boy. Boʻrtma bezak kundallar zaminiga lojuvard rang gullar ishlangan. Izorasi yashil toshdan girix shaklida terilgan. Toʻrtta chuqur ravoqlardagi darchalarga oʻsha vaqtda rangli oyna oʻrnatilgan. Oltin va kumush qandillardagi shamlar yonganda ziyoratgoh ichkarisi ulugʻvor va afsonaviy tus ol-gan. Tashqarisi sirkor gʻishtchalar bilan bezatilgan. Gumbaz va uning poyidagi bezaklar, turli arabiy yozuvlar alohida koʻzga tashlanadi. Maqbara darchalarida yogʻochdan ishlangan nafis panjaralar, eshiklarida esa murakkab qoʻsh zaminli oʻymakor bezaklar boʻlgan. Maqbaraning gʻarbiy tomoniga baland peshtoq yon-dashgan. Taxminlarga koʻra bu peshtoq qoldiklari XVII asrga mansub.\n" +
                "\n" +
                "Majmuaning janubiy tomonidan qaralganda, uning muhim qismi Goʻri Amir maqbarasi tashqarisidan yaqqol koʻrinadi. Koʻp dumaloq, ulkan gumbazli silindrsimon doiralarni qoʻllab-quvvatlovchi sakkizburchak prizma binoning meʼmoriy kompozitsiyasining asosini tashkil qiladi. Maqbara devorlari geometrik naqshlar, arabcha xitlar va mahorat bilan ishlov berilgan koʻk, havodor va oq sirlangan koshinlar bilan qoplangan. Meʼmor oʻxshash shakllardan foydalangan holda binolarning katta qavatlarini mohirlik bilan bezatilgan.\n" +
                "\n" +
                "Maqbara hashamatli sakkiz qirrali asosda qurilgan boʻlib, uning tashqi bezaklari devorlariga marmar bitiklar bilan qoplangan boʻlib, ular orasida „subhanallohu bihamdih va subhanollohul azim va bihamdih“ duosi bitilgan, yaʼni kufiy yozuvida Alloh taologa hamd aytishdir.\n" +
                "\n"));
        shaharList.add(new Shahar(R.drawable.img_2,"Mirzo Ulug'bek Rastxonasi","Rasadxona bunyodkori Muhammad Taragʻay Ulugʻbek Amir Temurning nevarasidir. U bobosi vafotidan 11 yil avval, yaʼni, 1394-yilda tugʻilgan. Shahzodaning ustozlari yozuvchi va faylasuf Orif Ozariy va buyuk matematik Qozizoda Rumiy boʻlib, keyinchalik rasadxona faoliyatida ularning ham xizmatlari katta. Ulugʻbek bolaligida qobiliyatli va matematika faniga qiziqishi baland edi. 1409-yilda Samarqand hukmdori boʻlgan Ulugʻbek ilm-fanni rivojlantirishga harakat qildi va oradan 10 yil oʻtib oʻzining orzusi – rasadxona tashkil etishni amalga oshira boshladi. Ulugʻbek Qozizoda Rumiyni bu katta ishdagi maslahatchisi deb biladi. \"Ustoz koʻmagi va yordami bilan, – deb yozadi u – ilm bayrogʻini koʻtargan, haqiqat va izlanish yoʻlini koʻrsatgan buyuk olim Qozizoda Rumiy rasadxona tashkil etishga kirishdi.\n" +
                "\n" +
                "Rasadxona oʻziga xos turdagi bino boʻlib, uning qurilishida asosiy rol meʼmorga emas, balki binoga oʻrnatilgan asboblarning joylashuvi va hajmini aniqlagan olimlarga, yaʼni Ulugʻbek va Rumiyga tegishli boʻlgan. Aytish kerakki, ular qabul qilgan qarorlar oʻsha davr taqozosiga koʻra dadil qadamlar edi. Qurilish taxminan uch yil davom etdi. 1428—1429-yillarda rasadxona binosi tayyor holga keldi[1]. Asboblarni oʻrnatish va moslashtirish boshlandi. Buni Ulugʻbekning iltimosiga koʻra, koshonlik astronom va mohir matematik Jamshid al-Koshiy (1373—1430) amalga oshirdi.\n" +
                "\n" +
                "Rasadxonaning ilmiy dasturi kamida 30 yilga moʻljallangan (Saturnning orbital davri). Davlat ishlari Ulugʻbekning rasadxonada uzoq vaqt faoliyat yuritishiga imkon bermadi. Rasadxonaga 60 dan ortiq matematik va astronom taklif qilingan. Rasadxona tashkil etilgandan soʻng unga oʻn yil davomida Jamshid al-Koshiy rahbarlik qilgan. Uning vafotidan keyin bu lavozimni yetmish yoshli Qozizoda Rumiy egalladi. Ammo oradan olti yil oʻtib, 1436-yilda Rumiy ham vafot etadi. Shundan soʻng rasadxona boshqaruvi Ali Qushchi qoʻliga oʻtadi[2]. Samarqand rasadxonasi astronomlar va matematiklarning yangi kashfiyotlar topishda hamkorlik qiladigan maskani boʻlgan.\n" +
                "\n" +
                "Sovetlar hukmronligi davrida 1449-yilda Ulugʻbek oʻldirilganidan soʻng rasadxona faoliyati toʻxtab, bino diniy aqidaparastlar tomonidan vayron qilingani haqida xato maʼlumotlar berilgan[3]. Ulugʻbekdan soʻng rasadxona uning shogirdi Ali Qushchi rahbarligida yigirma yil faoliyat yuritgan. Faqat 1469-yilda Samarqand hukmdori Abu Said Gʻarbiy Eronga qarshi yurishda vafot etgach, olimlar obod Hirotga koʻcha boshlaydilar. Shunday qilib, Ali Qushchi shogirdlari bilan rasadxonani tashlab, Hirotga koʻchib oʻtishga majbur boʻladi. Hirotda Husayn Boyqaroning vaziri, sharqning atoqli shoiri va temuriylar Xurosonining davlat arbobi Alisher Navoiy[4] olimlar, mutafakkirlar, rassomlar, musiqachilar va shoirlarga homiylik va moddiy yordam koʻrsatgan. Tez orada samarqandlik astronom Ali Qushchi Konstantinopolga taklif qilindi. U yerda rasadxona ishlari faoliyatiga doir kitoblar nashr ettiradi. Ulugʻbek rasadxonasida tuzilgan astronomik jadvallar sharqda munosib shuhrat qozongan va uzoq vaqt davomida tengsizligicha qolgan. Yevropada ushbu jadvallar haqida maʼlumotlar birinchi marta 1650-yilda nashr etilgan.\n" +
                "\n" +
                "Rasadxona binosi Ulugʻbek vafotidan soʻng, uzoq yillar qad rostlab turgan, astronomik tadqiqotlar Samarqandda yana yetmish besh yil davom etgan[5][6]. XVI asr oxirida Samarqand aholisi rasadxona gʻishtlarini koʻchirib olganlar. Rasadxona arxitekturasining tafsilotlari topilmalari bunga dalildir.\n" +
                "\n" +
                "Qurilishi\n" +
                "Ulugʻbek rasadxonasi Nosiriddin at-Tusiy tomonidan ishlab chiqilgan Marogʻa rasadxonasining rejalari asosida qurilgan[7]. Rasadxona toʻgʻrisida Abu Tohirxoʻja shunday maʼlumot beradi:\n" +
                "\n" +
                "Madrasaga asos solinganidan to'rt yil keyin Mirzo Ulug'bek Qozizoda Rumiy, Mavlono G'iyosiddin Jamshid va Mavlono Muiniddin Koshoniylar bilan maslahatlashib, Ko'hak tepaligida Obi Rahmat arig'ining bo'yida rasadxona binosini qurdiradi. Uning atrofida esa baland hujralar barpo etadi[8][9].\n" +
                "\n" +
                "Ulugʻbek farmoyishi bilan 1428–1429-yilda Koʻhak (Choʻponota) tepaligida ulkan silindr shaklida bunyod etilgan; ayrim qoʻlyozmalar („Boburnoma“)ga koʻra, balandligi 30,4 m dan iborat 3 qavatli qilib qurilgan. Unda oʻndan ortiq turli astronomik qurilma va asboblar boʻlgan. Ulardan eng asosiysi radiusi 40,2 m li qoʻshaloq yoydan iborat kvadrant (yoki sekstantga yaqin) qurilma hisoblanadi. Kvadrantning jan. qismi yer ostida, qolgan qismi shim. tomonda yer sathidan 30 m cha balandda joylashgan. Asbob aylanasida bir gradus yoy 701,85 mm va bir minut yoy 11,53 mm ga toʻgʻri keladi. Ushbu qurilma juda koʻp qirrali edi. U ufqdan quyoshni, yulduz balandligini va boshqa sayyoralarni aniq oʻlchashi mumkin edi. Yilning davomiyligi, sayyoralar davri va tutilishlar ushbu qurilma bilan oʻlchandi. Ulugʻbekning sayyoralar oʻlchovlari bugungi oʻlchov bilan chambarchas bogʻliq boʻlib, bizga qurilmaning ajoyib aniqligini koʻrsatadi. Rasadxona oʻrta asrlarda asbob uskunasi jihatdan ham beqiyos boʻlgan. Asbob astronomiyaning asosiy doimiyliklari – ekvator va ekliptika orasidagi burchakni oʻlchash, yillik pretsessiya doimiysini, tropik yil davomiyligini va boshqa fundamental astronomik doimiyliklarni aniqlashga imkon bergan. Rasadxonada kichik oʻlchamli asboblar: armillyar sfera, 2, 4 va 7 halqadan iborat oʻlchov asboblari, triangula, quyosh hamda yulduz soatlari, asturlob va boshqalar boʻlgan. Bu ilmiy uskunalar yordamida Quyosh, Oy, sayyoralar va alohida yulduzlar kuzatilgan. Mirzo Ulugʻbekning eng yirik astronomik asari „Ziji Koʻragoniy“ rasadxonada yaratilgan. Uning qurilishi va keyingi ilmiy faoliyati Ulugʻbek taklifi bilan yigʻilgan qator mashhur olimlar Gʻiyosiddin Koshiy, Qozizoda Rumiy, Ali Qushchi va boshqalar nomi bilan bogʻliq.\n" +
                "\n" +
                "Bugun Ulugʻbek rasadxonasiga tashrif buyurgan odamlar marmar kvadrantning faqat poydevori va koʻmilgan qismini koʻrishlari mumkin[7]. Bular rasadxonadan olingan yagona asl qoldiqlardir. Rasadxonaning tanazzulga uchrashining katta qismi Ulugʻbekning taxminan 1449-yilda uning oʻgʻli Abdulatif tomonidan oʻldirilgani bilan bogʻliq boʻlishi mumkin[10].\n" +
                "\n" +
                "Meʼmorchiligi\n" +
                "Ulugʻbek rasadxonasi meʼmorchiligi oʻsha davrda qurilgan boshqa binolardan farq qilgan. Ulugʻbek unga yordam beradigan mohir meʼmorga muhtoj boʻlib, Qozizoda Rumiy bilan maslahatlashib, undan tajribali va mohir meʼmor topishni soʻraydi. Qozizoda Rumiy matematik va meʼmor Koshoniyni tavsiya qilgan. Inshootni qurishda Hulokuxon va Manguxon tomonidan barpo etilgan Marogʻa rasadxonasidan namuna olingan. Marogʻa rasadxonasi meʼmori Nosiriddin at-Tusiy chizmalaridan foydalanilgan[11]. Ulugʻbek rasadxonasi yerdan 21 metr balandlikdagi tepalik ustida qurilgan. Bino gʻishtdan qurilgan. Sekstantning radiusiga koʻra, bino anchagina baland boʻlishi kerak edi. Biroq binoning tepalik ustida baland qilib qurilishi uning qulash xavfini yuzaga keltirardi. Binokorlar sekstantning yarmini yer ostida qurish orqali bu muammoni hal qilishga muvaffaq boʻlishdi. Bu sekstantning oʻlchamini balandligi xavfli darajada baland boʻlmagan holda saqlashga imkon berdi[12]. Sekstant G'iyosiddin Jamshid boshchiligida o'rnatiladi. Samarqand sekstanti o'sha davrda Sharqda ma'lum bo'lgan sekstantlarning eng yirigi hisoblangan. Ali Qushchi uning balandligini Istanbuldagi mashhur Ayo Sofiya ibodatxonasining balandligiga (balandiligi 50 metr) qiyoslagan[13].\n" +
                "\n" +
                "Rasadxona uch qavatdan iborat boʻlib, birinchi qavatda xodimlar yashagan. Barcha kuzatuvlarni koʻzdan kechirish ikkinchi va uchinchi qavatlardan olib borilgan. Rasadxonaning tomi tekis boʻlib, asboblarni binoning tomi ustida ham ishlatish mumkin edi[12]. Soʻnggi yillarda rasadxonaning kirish qismi bir necha bor oʻzgartirilgan.\n" +
                "\n" +
                "2001-yilda\n" +
                "2001-yilda\n" +
                "\n" +
                " \n" +
                "2006-yilda\n" +
                "2006-yilda\n" +
                "\n" +
                " \n" +
                "2008-yilda\n" +
                "2008-yilda\n" +
                "\n" +
                " \n" +
                "2012-yilda\n" +
                "2012-yilda\n" +
                "\n" +
                " \n" +
                "2012-yilda\n" +
                "2012-yilda\n" +
                "\n" +
                "Qazishma ishlari\n" +
                "\n" +
                "Ulugʻbek rasadxonasining ichki koʻrinishi.\n" +
                "Mirzo Ulugʻbekning „Zij“ asari Yevropaga tarqalishi bilan uning rasadxonasiga boʻlgan qiziqish ham ortdi. Samarqandni koʻzdan kechirgan sayyohlar rasadxona oʻrnini topishga harakat qilganlar. Baʼzilar Tillakori madrasasining slindrsimon gumbazini rasadxona deb oʻylashgan. Chunki Tillakori madrasasi Samarqandning Registon maydonida, Ulugʻbek madrasasining yonginasida joylashgan edi. Movarounnahrga kelgan venger sharqshunosi Armeni Vamberi (1832-1913) ham savdogar sifatida 1863-yilda Samarqandga kelgan. U ham rasadxonani Ulugʻbek madrasasining ichida boʻlgan deb oʻylaydi. Rasadxona barpo etilgan joyni qidirish ishlariga rus olimlari bilan birga, 1873-yilda tuzilgan Toshkent rasadxonasi astronomlari ham qatnashganlar. Vasiliy Vyatkin yerga egalik qilish haqidagi XVII asrga oid hujjatni oʻrganib, rasadxona joylashgan yerning aniq tavsifini topgan. Rasadxona Samarqand shahridan 2 km uzoqlikda, Toshkent yoʻlining oʻng tarafida ekani maʼlum boʻlgan[14].\n" +
                "\n" +
                "Oʻrta va Sharqiy Osiyoni oʻrganish qoʻmitasi ozroq mablagʻ ajratgani hisobiga Vyatkin hududda qazishma ishlarini boshlab yuboradi. Ulugʻbek rasadxonasining arxeologik qoldiqlari 1908-yil V. L. Vyatkin rahbarligida olib borilgan qazilma ishlari natijasida topilgan[15]. Bu olamshumul voqea edi. Qoya ichi oʻyilib qilingan chuqurlikda turli jinslar bilan koʻmilib ketgan ikkita marmar aylana marmar yoy topilgan. Tozalsh ishlari natijasida meridianda oʻrnatilgan asbobning bir qismi topiladi. Vyatkin uni radiusi 40.2 metrli kavdrantning boʻlagi deb oʻylagandi va yanglishmadi[14].\n" +
                "\n" +
                "V.Vyatkin boshchiligidagi qazishma ishlarining keyingi bosqichi 1914-yilda boshlandi. Biroq, birinchi jahon urushi tufayli ishlar toʻxtab qoldi. Rasadxona buzib tashlangandan soʻng, faqat radiusi 23.8 metr boʻlgan tashqi slindrik devor qoldiqlari saqlanib qolgan. 1915-yilda asbobning qoldiqlarini saqlash maqsadida yuqorisida slindr shaklida gʻishtdan gumbaz ishlangan. Navbatdagi oʻrganish ishlari 1941-yilda boshlandi. Bu paytda Alisher Navoiy tavalludining 500 yilligi munosabati bilan oʻsha davrdagi memoriy yodgorliklarni tiklashga alohida eʼtibor qaratilgan edi. Keyinchalik boshlangan ikkinchi jahon urushi tadqiqot ishlarini yana 7 yilga toʻxtatib qoʻydi.\n" +
                "\n" +
                "1948-yilda Oʻzbekiston SSR Fanlar akademiyasi Tarix va arxeologiya instituti arxeologi Vasiliy Shishkin (1893–1966) boshchilik qilgan ekspeditsiya qazishma ishlarini nihoyasiga yetkazdi. Rasadxona poydevori va bino fragmenti tozalanib ochildi. Rasadxonani oʻrganish toʻgʻrisidagi toʻliq hisobot ekspeditsiya rahbari tomonidan eʼlon qilindi.\n" +
                "\n" +
                "Xususan, bu yerda diametri 48 m keladigan, qalinligi bir gʻisht boʻlgan aylanma devor borligi va uning markazida qoʻshaloq yoydan iborat ulkan bosh qurilmaning qoldiq qismlari aniqlangan. Uning katta zallari, turli katta – kichik xonalari boʻlgan. Boburning yozishicha, Ulugʻbek rasadxonasining sirti koshin va sirli parchinlar bilan bezatilgan. Rasadxona ichiga oʻrnatilgan juda katta asbob yordamida Quyosh, Oy, sayyora va yulduzlar katta aniqlik bilan oʻrganilgan. Rasadxonada kutubxona ham boʻlgan. Ichki devorda osmon tasviri, yulduzlar xaritasi, togʻ, dengiz, mamlakatlar belgilangan Yer shari tasviri ishlangan. Keyinchalik u qarovsiz qolib, XVI asrda vayron qilingan. Hozir Ulugʻbek rasadxonasidagi katta asbob – kvadratning yer ostida saqlangan qismi balandligi bilan 11 m keladi. 1964-yil Ulugʻbek rasadxonasi yonida Ulugʻbek muzeyi ochilgan. Ulugʻbek rasadxonasining asl koʻrinishi, ichki tuzilishi, bosh qurilmasi haqida Oʻzbekiston va chet el olimlari tomonidan tadqiqot ishlari olib borilmoqda."));
        shaharList.add(new Shahar(R.drawable.img_3,"Ichan qala","Vikipediya, ochiq ensiklopediya\n" +
                "Buxoro arki\n" +
                "\n" +
                "Umumiy maʼlumot\n" +
                "Turi\tark\n" +
                "Shahar\tBuxoro\n" +
                "Mamlakat\tO'zbekiston\n" +
                "Koordinatalar\t39/46/40/N/64/24/39/E\n" +
                "Balandligi\t20\n" +
                "Bino atrofidagi yerlar\t4 ga\n" +
                "Dizayn va konstruksiya\n" +
                "Quruvchi\tSiyovush\n" +
                "Vebsayt\n" +
                "http://bukhara-museum.narod.ru/\n" +
                " Buxoro arki Vikiomborda\n" +
                "Buxoro arki — Oʻzbekistonning Buxoro shahridagi qadimiy ark; atrofidagi maydon sathidan qariyb 20 metr balandlikda koʻtarilgan va taxminan 4 gektar maydonni egallagan monumental qal’a. Qalʼa Buxoroning eng qadimiy meʼmoriy va arxeologik yodgorligi hisoblanadi. Bu qal’a tepalikni tashkil etgan koʻp asrlik vayronagarchilik qatlamlariga ega shaharning eng qadimiy qismi hisoblanadi.\n" +
                "\n" +
                "O‘z vaqtida Registon maydoni ustida qad ko‘targan Ark buyuklik, qudrat va o‘tib bo‘lmaslik timsoli bo‘lgan. Ark devorlaridan birida bir vaqtlar Buxoro amirligidagi qudrat ramzi bo‘lgan katta charm qamchi osilgan.\n" +
                "\n" +
                "\n" +
                "Buxoro arki va uning oldidagi bozor. 1890-yillar\n" +
                "Arkning orqa yon tomonidan koʻrinishi\n" +
                "Arkning orqa yon tomonidan koʻrinishi\n" +
                "Buxoro arkining yon tomonidan koʻrinishi\n" +
                "Buxoro arkining yon tomonidan koʻrinishi\n" +
                "Arkning 1902-yildagi koʻrinishi\n" +
                "Arkning 1902-yildagi koʻrinishi\n" +
                "Buxoro arkining 1907-yildagi koʻrinishi\n" +
                "Buxoro arkining 1907-yildagi koʻrinishi\n" +
                "Tarixi\n" +
                "Ark dastlab milloddan avvalgi I asrda qurilgan. Arablar istilosiga qadar arkda shahar hokimlari — buxorxudotlar yashagan. Somoniylar davrida (IX—X asrlar) qayta qurilib devor va burjlar bilan mustahkamlangan. Qoraxoniylar davrida (XI—XII asrlar) va moʻgʻullar bosqinchiligi vaqtida (XIII asr) ark bir necha bor vayron qilingan.\n" +
                "\n" +
                "Hozirgi qiyofasi asosan Shayboniylar sulolasi davri (XVI asr)da shakllangan.\n" +
                "\n" +
                "1990-yilda arxeologlar tomonidan olib borilgan qazish ishlari natijasida Amir mehmonxonasi hisoblangan xonaqoh va uning atrofidagi hujralarning poydevorlari, hovli ichkarisidagi supa, toshnov, tazar, sandal va yaxxonalar ochildi. Hammom tuzilish jihatdan murakkabligi yer osti tazarlari umumiy bir tarmoqqa boʻysundirilganligi, shahar tashqarisidagi zahkashga qadar choʻzilganligi, toʻrt tomonidagi gulax (oʻtxona)lari doimiy ravishda bir xil issiqlik berib turishi, yaxxonada muzni to kech kuzgacha saqlay bilishganligi aniqlandi.\n" +
                "\n" +
                "Buxoroning 2500-yilligi munosabati bilan ark ichkarisidagi taxt joylashgan hovli taʼmirlanib, oʻz holiga keltirildi. Ark devorlari yangilandi. „Goʻriyon“ darvozasi qayta tiklandi va boshqa obodonlashtirish ishlari olib borildi. Yer sathidan 2,5-3 m chuqurlikda gumbazsimon yer osti yoʻli borligi aniqlangan. Arkda Buxoro davlat meʼmoriy-badiiy muzey qoʻriqxonasi joylashgan.\n" +
                "\n" +
                "Arxeologik qazishmalar va qayta tiklash ishlari\n" +
                "Buxoro Xalq Sovet Respublikasi davrida Arkning gʻarbiy devori qayta tiklangan[1]. Aleksandr Semyonov Ark tarixini yozishni maqsad qilgan „Tarix jamiyati“ deb nomlangan komissiya tuzilgani haqida xabar beradi[2].\n" +
                "\n" +
                "1970—1980-yillarda Arkda qisman arxeologik tadqiqotlar olib borilgan. Keng qamrovli arxeologik qazishmalar, ayniqsa, Arkning janubiy qismida va unga tutash hududlarda haligacha olib borilmagan. Arxeologlarning fikricha, aynan ular Buxoroning haqiqiy yoshi haqida aniqroq maʼlumot berib, Narshaxiyning Buxoroning yoshi X asrda 3000 yil bo‘lganligi haqidagi afsonaviy maʼlumotlarini rad etadi yoki tasdiqlaydi[3].\n" +
                "\n" +
                "1970—1974-yillarda Oʻzbekiston Fanlar akademiyasi akademigi Yahyo Gʻulomov boshchiligida tashkil etilgan maxsus arxeologik guruh tomonidan Arkda yirik statsionar qazishmalar olib borilgan. Qal’ada 120x100 m maydonda XVI—XX asr boshlariga oid ustki qatlamlar qazilgan[4].\n" +
                "\n" +
                "1979—1980-yillarda Buxoro arkini arxeologik oʻrganish tarixida birinchi marta stratigrafik chuqur (6x6 metr) materik qatlamiga chuqurroq borish imkonini berdi. Bu yerdagi madaniy qatlamlarning qalinligi 20 metrdan oshdi va bu qiymatning uchdan bir qismi yer ostida boʻlgan[4]. 13-15,5 metr, shuningdek, 16,5-18,5 metr chuqurlikda ikkita kuchli sinch devor qoldiqlari topilgan, ushbu ashyolar Arkning qadimgi mudofaa inshootlari tizimining bir qismi boʻlganligi taxmin qilingan. Birinchi devor 2,5-3 metr balandlikda saqlanib qolgan va u yerda eramizning IV—V asrlariga oid sopol material topilgan, ikkinchisi — 2-2,5 metr balandlikda — miloddan avvalgi IV—III asrlarga toʻgʻri keladi. Shubhasiz, bular Buxoroning qadimiy qal’a devori xarobalari bo‘lib, shahar shakllanishining eng muhim qismlaridan biri bo‘lgan[5].\n" +
                "\n" +
                "Ark qal’asi devorlarining toʻliq stratigrafik kesmasi ham amalga oshirildi. Arkning shimoliy qal’a devorining stratigrafik qismida E. G. Nekrasova tomonidan olingan arxeologik maʼlumotlarga koʻra, uning eng qadimgi devori balandligi 0,9-1,0 metr, qalinligi 0,7-0,75 metr boʻlgan bir necha qatlamli paxsa va paxsa bloklaridan iborat boʻlgan. Uning eng kengi 7,5 metr, eng kichigi 2,75 metr[6].\n" +
                "\n" +
                "Buxoroning 2500 yillik yubileyiga tayyorgarlik koʻrish doirasida Oʻzbekiston Respublikasi birinchi Prezidenti Islom Karimov tashabbusi va rahnamoligida (1990—2016) Arkni qayta tiklash ishlari olib borilgan [7].\n" +
                "\n" +
                "Meʼmorchiligi\n" +
                "Balandligi 20 m cha boʻlgan tepalik ustiga qurilgan arkning maydoni 4 ga, tarhi koʻpburchakli. Turli davrlarda devorlari tosh, pishiq va xom gʻisht, paxsalar bilan mustahkamlangan. Oʻpirilib tushgan joylari dastlab xom gishtdan, keyin pishiq gʻishtdan taʼmir etilgan.\n" +
                "\n" +
                "Koʻtarila boruvchi yoʻl orqali gʻarbdagi ulkan darvozadan (16-asr) ichkariga kiriladi (sharq tomonida ham ilgari darvoza boʻlgan). Darvozaxona peshtoqining ikki yon tomonidagi „guldasta“ va ular oraligʻidagi 3 qavatli bino yaxshi saqlangan. Ark ichkarisiga olib kiradigan uzun dalonyoʻlakning chap devorida 12 va oʻng devorida 13 taxmontokcha qilingan. Chap tomonidagi tokchalarning baʼzilarida obxonaga kiriladigan eshiklar bor. Guldasta (burj)lar tagida zax va dim yertoʻlalar boʻlgan.\n" +
                "\n" +
                "Dalonning oʻng tomonidagi oʻrta tokchasida afsonaviy qahramon Siyovush ruhiga Navroʻz bayramida chiroqlar yoqilgan. Amir sayisxona (otxona)siga ham shu yerdagi zinadan kirilgan. Dalondan chiqaverishda toʻpchi boshi (saroy qoʻriqchilari boshligʻi)ning mahkamasi, shu yerdagi ayvon tagida yertoʻla boʻlgan (bu binolar buzilib ketgan). Undan sal narida (gʻarbiy devor burchagida) peshayvonli jome masjid (saroy masjidi) qurilgan (18-asr oxiri). Masjid derazalari panjarali, devorlarining ichki tomonidagi naqshlar orasiga Qur’on oyatlari bitilgan. Peshayvon shipi murakkab girihdar bilan bezatilgan.\n" +
                "\n" +
                "Arkning shimoliy-gʻarbiy burchagida toʻpchi boshining uyi va taʼmir ishlari ustidan nazorat qiluvchi kishi turadigan xona boʻlgan. Masjidning sharq tomonida lar oqova suv quvurlarining qoldiqlari. Arkning gʻarbiy devoridan boshqa hamma devorlari, burchaklardagi minoralar buzilib ketgan. Darvozasi oldidagi Registon maydonida koʻpgina imoratlar boʻlgan. Uning gʻarbiy devoriga qaragan peshayvonga zambaraklar qoʻyilgan.\n" +
                "\n" +
                "Ark darvozasining chap tomonida lashkarboshi mehmonxonasi, shimolida esa qurolyarogʻlar tuzatiladigan ustaxona va aslahaxona (qoʻrxona) boʻlgan. Arkning shimoliy-sharqidagi „Childuxtaron“ maqbarasi, janubiy-gʻarbda „Battol Gʻoziy xonaqohi“, xos hammom qoldiqlari saqlangan."));
        shaharList.add(new Shahar(R.drawable.img_4,"Shohi Zinda Maqbarasi","Shohizinda — Samarqanddagi meʼmoriy yodgorlik (11—19-asrlar); Afrosiyob tepaligi jan.da joylashgan qabristondagi maqbaralardan hamda masjid, minora va madrasadan iborat ansambl.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Shohizinda meʼmoriy majmuasi Qoraxoniylar sulolasi tomonidan asos solingan.\n" +
                "\n" +
                "Ularning eng qadimiysi Qusam ibn Abbos maqbarasi boʻlib, xalq orasida Shohizinda (tirik shoh) nomi bilan mashhur. Ansambl bir-biri bilan yoʻlak orqali bogʻlangan 3 guruh binolardan iborat. Quyi guruhdagi inshootlar Ulugʻbek oʻgʻli nomidan qurdirgan Abdulaziz chortogʻi (1434—35), unga shim.dan Davlat qushbegi madrasasi (1812—13) tutash, uning qarshisidagi ayvonli masjid naqshlar bilan nafis bezatilgan. 40 bosqichli tik zinapoya oʻrtaligʻining chap tomonida ziyoratxona va goʻrxonadan iborat qoʻshgumbazli maqbara (15-asr) joylashgan.\n" +
                "\n" +
                "Oʻrta guruhdagi binolar: Amirzoda maqbarasi, Tugʻlu Tekin maqbarasi, Shirinbeka ogʻo maqbarasi, uning qarshisida Temurning boshqa singlisi Turkan ogʻo maqbarasi, 8 qirrali maqbara, Ali Nasafiy maqbarasi kabilar.\n" +
                "\n" +
                "Yuqori guruhdagi binolar: Ziyoratxona, uch qismdan iborat masjid, Xoja Ahmad maqbarasi, 1360—61 yillarda qurilgan maqbara, Tuman ogʻo majmuasi (1405—06), 2 ta nomsiz maqbara (14asr oxiri)ning kiraverish devorigina saqlangan. Shuningdek, Tamgʻoch Bugʻroxon madrasasi (11-asr), Amir Burunduq maqbarasi (14-asr oxiri) kabilardir. Ansambl tarkibidagi 20 dan ortiq inshootlar davlat muhofazasiga olingan. 19—20-asrlarda ansamblning yana bir necha binolari barpo etilgan. 18-asrda vayron boʻlgan zina oʻrnida 40 pogʻonali gʻishtin yangi zina qurilgan. Oʻzbekiston Respublikasi Vazirlar Mahkamasining 2004-yil 16-iyul qaroriga asosan Sh. yodgorlik majmuasida katta koʻlamdagi taʼmirlash va obodonlashtirish ishlari amalga oshirildi.\n" +
                "\n" +
                "Tarixi\n" +
                "Yetti iqlimga ayon Samarqanddagi aziz zotlar jasadi qoʻyilgan Shohi Zinda, ya’ni «Tirik-shoh» xonaqohi, oʻtmish ajdodlarimiz tarixi va taqdirida alohida oʻrin tutadi.\n" +
                "\n" +
                "Dastavval bu yerda XI asrdag Samarqanddagi ilk qoraxoniylar davrida qurilgan «tirikshoh»ning maqbarasi bor edi.[1] Keyinchalik xuddi shu yerga 1066-yili Tamgʻach Boʻgʻraxon madrasasi qurildi va unga tutash bir qator turkum majmua yuzaga keldi. XI—XII asrlarda serhasham bezatilgan boshqa maqbaralar vujudga kela boshladi. Arxeologlar ulardan bir nechtasini XIV asr inshootlarining gʻarb tamonidagi yoʻlakdan qazib topdilar. Ular bezaklari bilan Temur davri maqbaralaridan farq qilgan. Oʻsha davrda ham, Qusam ibn Abbos maqbarasi «muqqadas» hisoblanib ziyorat qilingan.\n" +
                "\n" +
                "U koʻhna Samarqandning janubiy qismida joylashgan boʻlib, Sharq musulmonlarining muqaddas ziyoratgohlaridandir. Bugungi kunda Afrosiyob nomi bilan mashhur hudud qariyb 220 ga yerni oʻz bagʻriga oladi. Shu ulugʻ zaminda paygʻambar avlodi Qusam ibn Abbos nomi bilan mashhur ziyoratgoh tarkib topdi.\n" +
                "\n" +
                "Shohi Zinda majmuasi XI asrda paydo boʻlgan va bu yerdagi 20 dan ziyod maqbarada 44 lavha bitilgan qabrotoshlardan iboratdir. Qariyb, toʻqqiz asrdirki, Oʻrta Osiyoning barcha shaharlari va dunyoning turli goʻshalaridan tashrif buyurayotgan sayyohlar bu muqaddas maskanni ziyorat qilib kelmoqdalar. Shohi Zinda majmuasi oʻziga xos yoʻlaklari va mahobatli binolari bilan sayyohlarni oʻziga maftun etadi.\n" +
                "\n" +
                "Samarqandddagi mashhur zotlar xonaqohi oʻziga xos va tengsizdir, u dovrugʻi olamga yoyilgan Misr ehromlari, Toj Mahal qolaversa yetti moʻjizaning biri desa boʻladigan maqbaralar turkumidir.\n" +
                "\n" +
                "Shohi Zinda maqbarasida Qoraxoniylar va Temuriylar hamda din arboblari va peshvolari dafn etilgan, u dastlab Samarqand din arboblari va hokimlari tomonidan XI asrda paygʻambar Muhammad (S.A.V)ning amakilarining oʻgʻli Qusam ibn Abbos sharafiga qurilgan. Qusam oʻz yaqinlari bilan Madinaga qaytayotganida Samarqandda vafot etganligi toʻgʻrisida ma’lumotlar bor. Ba’zi ma’lumotlarda Qusam ibn Abbos oʻlmagan u tirik gʻoyib boʻlgan deyiladi.\n" +
                "\n" +
                "XIII asrda moʻgʻul istilochilarining Samarqandga qilgan harbiy yurishlari, XI—XII asrga oid koʻplab inshootlarni, buzilib, xarobaga aylanishga sabab boʻldi. Qabriston XIV asrda qaytadan tiklana boshlandi.\n" +
                "\n" +
                "Amir Temur hukmronlik qilgan (1370—1405) davrda qurilish ishlari juda jadal sur’atda olib boriladi. Bu inshootlarning koʻpchiligi bizning davrimizgacha yetib kelgan. Turkum majmua Afrosiyobning shimolidan to janubga shaharning qoʻrgʻon devorigacha choʻzilgan.m\n" +
                "\n" +
                "Ba’zi dahmalar, XI—XII asrlarga oid maqbaralarning xarobalari ustiga quriladi. XV asr boshlarida binolar Xoʻja Axmad maqbarasidan Hazrati Xizr masjidiga boradigan yoʻl boʻylab quriladi. Temur davri me’morchiligi, bezak berishning yangi texnikalari bilan ya’ni, qirqma koshinlar bilan yanada boyitildi. Maqbaralar ikkitadan, tashqi va ichki gumbazli, baland silindr barabanli kilib quriladigan boʻldi.\n" +
                "\n" +
                "Shohi Zindada nodir va maftunkor imoratlar anchagina. Har bir maqbara bejirim qutichaga oʻxshaydi. Shohi Zinda moʻjizasi sahanalarning birini namuna tariqasida ajratib koʻrsatish mushkul. Chunki ularning hammasi betakrordir. Shohi Zinda me’morchilik majmuasi uch qismdan iborat qilib qurilgan. Shohi Zindaga ulkan oʻymakor darvozadan kiriladi. Peshtoq ravoqining gʻarbiy devorida, uni Abdulaziz Bahodir ibn Ulugʻbek tomonidan x. 1434—1435-yillarida bunyod etilgani yozilgan. Bu inshoot Shohi Zindaning qariyb toʻrt asr davomidagi shakllanish tarixida xotima boʻldi. Peshtoq nafis ishlangan.\n" +
                "\n" +
                "Oʻymakor eshik, 1911-yilda qurilgan, undagi naqshinkor bezak va yozuvlar kishini oʻziga tortadi. Eshikda quyidagi «Oʻlimdan oldin tavba qilmoqqa shoshilgin va Namozni oʻz vaqtida oʻqishni farz bilgin» soʻzlari yozilgan. Pastki qism tarkibiga masjid, mulozimxona hamda madrasa ham kiritilgan. Yozgi masjid ayvoni 1910-yil Samarqandlik usto Mahmud va Muhammad Siddiqlar qurishgan. Uning devorlari ganch naqshlari bilan bezatilgan. Pastki qismdagi yana ulugʻvor qoʻsh gumbazli bino tarixan oʻzida tabarruk zotlarning nomini mujassam etadi. Bu inshoot uzoq davr davomida, Ulugʻbekning ustozi Qozizoda Rumiy nomiga qurilganligi ta’kid etiladi. Buni toʻla isbotlash uchun 1979-yil 5-noyabr kuni ichkaridagi qabr ochib oʻrganildi. Haqiqatdan ham u yerdan ayol kishiga xos suyak qoldiqlari topildi. Antropolog Telman Xoʻjayevning aniqlashicha 30-35 yoshlar chamasidagi ayol suyaklari ekan. Maqbarani ichki gumbazlari naqshinkor qilib ishlangan, panellari esa olti qirrali koshinlar bilan bezatilgan. 1949—1952-yillarda maqbara tekshirildi va bosib yotgan tuproqdan tozalanib, qayta qurildi.\n" +
                "\n" +
                "Nihoyat tabarruk qirq sirli zina orqali majmuaning oʻrta qismiga koʻtariladi. Zinaning eni 5 gazni tashkil etadi."));
        shaharList.add(new Shahar(R.drawable.img_6,"Shohi Zinda Maqbarasi","Shohizinda — Samarqanddagi meʼmoriy yodgorlik (11—19-asrlar); Afrosiyob tepaligi jan.da joylashgan qabristondagi maqbaralardan hamda masjid, minora va madrasadan iborat ansambl.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Shohizinda meʼmoriy majmuasi Qoraxoniylar sulolasi tomonidan asos solingan.\n" +
                "\n" +
                "Ularning eng qadimiysi Qusam ibn Abbos maqbarasi boʻlib, xalq orasida Shohizinda (tirik shoh) nomi bilan mashhur. Ansambl bir-biri bilan yoʻlak orqali bogʻlangan 3 guruh binolardan iborat. Quyi guruhdagi inshootlar Ulugʻbek oʻgʻli nomidan qurdirgan Abdulaziz chortogʻi (1434—35), unga shim.dan Davlat qushbegi madrasasi (1812—13) tutash, uning qarshisidagi ayvonli masjid naqshlar bilan nafis bezatilgan. 40 bosqichli tik zinapoya oʻrtaligʻining chap tomonida ziyoratxona va goʻrxonadan iborat qoʻshgumbazli maqbara (15-asr) joylashgan.\n" +
                "\n" +
                "Oʻrta guruhdagi binolar: Amirzoda maqbarasi, Tugʻlu Tekin maqbarasi, Shirinbeka ogʻo maqbarasi, uning qarshisida Temurning boshqa singlisi Turkan ogʻo maqbarasi, 8 qirrali maqbara, Ali Nasafiy maqbarasi kabilar.\n" +
                "\n" +
                "Yuqori guruhdagi binolar: Ziyoratxona, uch qismdan iborat masjid, Xoja Ahmad maqbarasi, 1360—61 yillarda qurilgan maqbara, Tuman ogʻo majmuasi (1405—06), 2 ta nomsiz maqbara (14asr oxiri)ning kiraverish devorigina saqlangan. Shuningdek, Tamgʻoch Bugʻroxon madrasasi (11-asr), Amir Burunduq maqbarasi (14-asr oxiri) kabilardir. Ansambl tarkibidagi 20 dan ortiq inshootlar davlat muhofazasiga olingan. 19—20-asrlarda ansamblning yana bir necha binolari barpo etilgan. 18-asrda vayron boʻlgan zina oʻrnida 40 pogʻonali gʻishtin yangi zina qurilgan. Oʻzbekiston Respublikasi Vazirlar Mahkamasining 2004-yil 16-iyul qaroriga asosan Sh. yodgorlik majmuasida katta koʻlamdagi taʼmirlash va obodonlashtirish ishlari amalga oshirildi.\n" +
                "\n" +
                "Tarixi\n" +
                "Yetti iqlimga ayon Samarqanddagi aziz zotlar jasadi qoʻyilgan Shohi Zinda, ya’ni «Tirik-shoh» xonaqohi, oʻtmish ajdodlarimiz tarixi va taqdirida alohida oʻrin tutadi.\n" +
                "\n" +
                "Dastavval bu yerda XI asrdag Samarqanddagi ilk qoraxoniylar davrida qurilgan «tirikshoh»ning maqbarasi bor edi.[1] Keyinchalik xuddi shu yerga 1066-yili Tamgʻach Boʻgʻraxon madrasasi qurildi va unga tutash bir qator turkum majmua yuzaga keldi. XI—XII asrlarda serhasham bezatilgan boshqa maqbaralar vujudga kela boshladi. Arxeologlar ulardan bir nechtasini XIV asr inshootlarining gʻarb tamonidagi yoʻlakdan qazib topdilar. Ular bezaklari bilan Temur davri maqbaralaridan farq qilgan. Oʻsha davrda ham, Qusam ibn Abbos maqbarasi «muqqadas» hisoblanib ziyorat qilingan.\n" +
                "\n" +
                "U koʻhna Samarqandning janubiy qismida joylashgan boʻlib, Sharq musulmonlarining muqaddas ziyoratgohlaridandir. Bugungi kunda Afrosiyob nomi bilan mashhur hudud qariyb 220 ga yerni oʻz bagʻriga oladi. Shu ulugʻ zaminda paygʻambar avlodi Qusam ibn Abbos nomi bilan mashhur ziyoratgoh tarkib topdi.\n" +
                "\n" +
                "Shohi Zinda majmuasi XI asrda paydo boʻlgan va bu yerdagi 20 dan ziyod maqbarada 44 lavha bitilgan qabrotoshlardan iboratdir. Qariyb, toʻqqiz asrdirki, Oʻrta Osiyoning barcha shaharlari va dunyoning turli goʻshalaridan tashrif buyurayotgan sayyohlar bu muqaddas maskanni ziyorat qilib kelmoqdalar. Shohi Zinda majmuasi oʻziga xos yoʻlaklari va mahobatli binolari bilan sayyohlarni oʻziga maftun etadi.\n" +
                "\n" +
                "Samarqandddagi mashhur zotlar xonaqohi oʻziga xos va tengsizdir, u dovrugʻi olamga yoyilgan Misr ehromlari, Toj Mahal qolaversa yetti moʻjizaning biri desa boʻladigan maqbaralar turkumidir.\n" +
                "\n" +
                "Shohi Zinda maqbarasida Qoraxoniylar va Temuriylar hamda din arboblari va peshvolari dafn etilgan, u dastlab Samarqand din arboblari va hokimlari tomonidan XI asrda paygʻambar Muhammad (S.A.V)ning amakilarining oʻgʻli Qusam ibn Abbos sharafiga qurilgan. Qusam oʻz yaqinlari bilan Madinaga qaytayotganida Samarqandda vafot etganligi toʻgʻrisida ma’lumotlar bor. Ba’zi ma’lumotlarda Qusam ibn Abbos oʻlmagan u tirik gʻoyib boʻlgan deyiladi.\n" +
                "\n" +
                "XIII asrda moʻgʻul istilochilarining Samarqandga qilgan harbiy yurishlari, XI—XII asrga oid koʻplab inshootlarni, buzilib, xarobaga aylanishga sabab boʻldi. Qabriston XIV asrda qaytadan tiklana boshlandi.\n" +
                "\n" +
                "Amir Temur hukmronlik qilgan (1370—1405) davrda qurilish ishlari juda jadal sur’atda olib boriladi. Bu inshootlarning koʻpchiligi bizning davrimizgacha yetib kelgan. Turkum majmua Afrosiyobning shimolidan to janubga shaharning qoʻrgʻon devorigacha choʻzilgan.m\n" +
                "\n" +
                "Ba’zi dahmalar, XI—XII asrlarga oid maqbaralarning xarobalari ustiga quriladi. XV asr boshlarida binolar Xoʻja Axmad maqbarasidan Hazrati Xizr masjidiga boradigan yoʻl boʻylab quriladi. Temur davri me’morchiligi, bezak berishning yangi texnikalari bilan ya’ni, qirqma koshinlar bilan yanada boyitildi. Maqbaralar ikkitadan, tashqi va ichki gumbazli, baland silindr barabanli kilib quriladigan boʻldi.\n" +
                "\n" +
                "Shohi Zindada nodir va maftunkor imoratlar anchagina. Har bir maqbara bejirim qutichaga oʻxshaydi. Shohi Zinda moʻjizasi sahanalarning birini namuna tariqasida ajratib koʻrsatish mushkul. Chunki ularning hammasi betakrordir. Shohi Zinda me’morchilik majmuasi uch qismdan iborat qilib qurilgan. Shohi Zindaga ulkan oʻymakor darvozadan kiriladi. Peshtoq ravoqining gʻarbiy devorida, uni Abdulaziz Bahodir ibn Ulugʻbek tomonidan x. 1434—1435-yillarida bunyod etilgani yozilgan. Bu inshoot Shohi Zindaning qariyb toʻrt asr davomidagi shakllanish tarixida xotima boʻldi. Peshtoq nafis ishlangan.\n" +
                "\n" +
                "Oʻymakor eshik, 1911-yilda qurilgan, undagi naqshinkor bezak va yozuvlar kishini oʻziga tortadi. Eshikda quyidagi «Oʻlimdan oldin tavba qilmoqqa shoshilgin va Namozni oʻz vaqtida oʻqishni farz bilgin» soʻzlari yozilgan. Pastki qism tarkibiga masjid, mulozimxona hamda madrasa ham kiritilgan. Yozgi masjid ayvoni 1910-yil Samarqandlik usto Mahmud va Muhammad Siddiqlar qurishgan. Uning devorlari ganch naqshlari bilan bezatilgan. Pastki qismdagi yana ulugʻvor qoʻsh gumbazli bino tarixan oʻzida tabarruk zotlarning nomini mujassam etadi. Bu inshoot uzoq davr davomida, Ulugʻbekning ustozi Qozizoda Rumiy nomiga qurilganligi ta’kid etiladi. Buni toʻla isbotlash uchun 1979-yil 5-noyabr kuni ichkaridagi qabr ochib oʻrganildi. Haqiqatdan ham u yerdan ayol kishiga xos suyak qoldiqlari topildi. Antropolog Telman Xoʻjayevning aniqlashicha 30-35 yoshlar chamasidagi ayol suyaklari ekan. Maqbarani ichki gumbazlari naqshinkor qilib ishlangan, panellari esa olti qirrali koshinlar bilan bezatilgan. 1949—1952-yillarda maqbara tekshirildi va bosib yotgan tuproqdan tozalanib, qayta qurildi.\n" +
                "\n" +
                "Nihoyat tabarruk qirq sirli zina orqali majmuaning oʻrta qismiga koʻtariladi. Zinaning eni 5 gazni tashkil etadi."));
        shaharList.add(new Shahar(R.drawable.img_7,"Bibixonim Maqbarasi","Shohizinda — Samarqanddagi meʼmoriy yodgorlik (11—19-asrlar); Afrosiyob tepaligi jan.da joylashgan qabristondagi maqbaralardan hamda masjid, minora va madrasadan iborat ansambl.\n" +
                "\n" +
                "\n" +
                "\n" +
                "Shohizinda meʼmoriy majmuasi Qoraxoniylar sulolasi tomonidan asos solingan.\n" +
                "\n" +
                "Ularning eng qadimiysi Qusam ibn Abbos maqbarasi boʻlib, xalq orasida Shohizinda (tirik shoh) nomi bilan mashhur. Ansambl bir-biri bilan yoʻlak orqali bogʻlangan 3 guruh binolardan iborat. Quyi guruhdagi inshootlar Ulugʻbek oʻgʻli nomidan qurdirgan Abdulaziz chortogʻi (1434—35), unga shim.dan Davlat qushbegi madrasasi (1812—13) tutash, uning qarshisidagi ayvonli masjid naqshlar bilan nafis bezatilgan. 40 bosqichli tik zinapoya oʻrtaligʻining chap tomonida ziyoratxona va goʻrxonadan iborat qoʻshgumbazli maqbara (15-asr) joylashgan.\n" +
                "\n" +
                "Oʻrta guruhdagi binolar: Amirzoda maqbarasi, Tugʻlu Tekin maqbarasi, Shirinbeka ogʻo maqbarasi, uning qarshisida Temurning boshqa singlisi Turkan ogʻo maqbarasi, 8 qirrali maqbara, Ali Nasafiy maqbarasi kabilar.\n" +
                "\n" +
                "Yuqori guruhdagi binolar: Ziyoratxona, uch qismdan iborat masjid, Xoja Ahmad maqbarasi, 1360—61 yillarda qurilgan maqbara, Tuman ogʻo majmuasi (1405—06), 2 ta nomsiz maqbara (14asr oxiri)ning kiraverish devorigina saqlangan. Shuningdek, Tamgʻoch Bugʻroxon madrasasi (11-asr), Amir Burunduq maqbarasi (14-asr oxiri) kabilardir. Ansambl tarkibidagi 20 dan ortiq inshootlar davlat muhofazasiga olingan. 19—20-asrlarda ansamblning yana bir necha binolari barpo etilgan. 18-asrda vayron boʻlgan zina oʻrnida 40 pogʻonali gʻishtin yangi zina qurilgan. Oʻzbekiston Respublikasi Vazirlar Mahkamasining 2004-yil 16-iyul qaroriga asosan Sh. yodgorlik majmuasida katta koʻlamdagi taʼmirlash va obodonlashtirish ishlari amalga oshirildi.\n" +
                "\n" +
                "Tarixi\n" +
                "Yetti iqlimga ayon Samarqanddagi aziz zotlar jasadi qoʻyilgan Shohi Zinda, ya’ni «Tirik-shoh» xonaqohi, oʻtmish ajdodlarimiz tarixi va taqdirida alohida oʻrin tutadi.\n" +
                "\n" +
                "Dastavval bu yerda XI asrdag Samarqanddagi ilk qoraxoniylar davrida qurilgan «tirikshoh»ning maqbarasi bor edi.[1] Keyinchalik xuddi shu yerga 1066-yili Tamgʻach Boʻgʻraxon madrasasi qurildi va unga tutash bir qator turkum majmua yuzaga keldi. XI—XII asrlarda serhasham bezatilgan boshqa maqbaralar vujudga kela boshladi. Arxeologlar ulardan bir nechtasini XIV asr inshootlarining gʻarb tamonidagi yoʻlakdan qazib topdilar. Ular bezaklari bilan Temur davri maqbaralaridan farq qilgan. Oʻsha davrda ham, Qusam ibn Abbos maqbarasi «muqqadas» hisoblanib ziyorat qilingan.\n" +
                "\n" +
                "U koʻhna Samarqandning janubiy qismida joylashgan boʻlib, Sharq musulmonlarining muqaddas ziyoratgohlaridandir. Bugungi kunda Afrosiyob nomi bilan mashhur hudud qariyb 220 ga yerni oʻz bagʻriga oladi. Shu ulugʻ zaminda paygʻambar avlodi Qusam ibn Abbos nomi bilan mashhur ziyoratgoh tarkib topdi.\n" +
                "\n" +
                "Shohi Zinda majmuasi XI asrda paydo boʻlgan va bu yerdagi 20 dan ziyod maqbarada 44 lavha bitilgan qabrotoshlardan iboratdir. Qariyb, toʻqqiz asrdirki, Oʻrta Osiyoning barcha shaharlari va dunyoning turli goʻshalaridan tashrif buyurayotgan sayyohlar bu muqaddas maskanni ziyorat qilib kelmoqdalar. Shohi Zinda majmuasi oʻziga xos yoʻlaklari va mahobatli binolari bilan sayyohlarni oʻziga maftun etadi.\n" +
                "\n" +
                "Samarqandddagi mashhur zotlar xonaqohi oʻziga xos va tengsizdir, u dovrugʻi olamga yoyilgan Misr ehromlari, Toj Mahal qolaversa yetti moʻjizaning biri desa boʻladigan maqbaralar turkumidir.\n" +
                "\n" +
                "Shohi Zinda maqbarasida Qoraxoniylar va Temuriylar hamda din arboblari va peshvolari dafn etilgan, u dastlab Samarqand din arboblari va hokimlari tomonidan XI asrda paygʻambar Muhammad (S.A.V)ning amakilarining oʻgʻli Qusam ibn Abbos sharafiga qurilgan. Qusam oʻz yaqinlari bilan Madinaga qaytayotganida Samarqandda vafot etganligi toʻgʻrisida ma’lumotlar bor. Ba’zi ma’lumotlarda Qusam ibn Abbos oʻlmagan u tirik gʻoyib boʻlgan deyiladi.\n" +
                "\n" +
                "XIII asrda moʻgʻul istilochilarining Samarqandga qilgan harbiy yurishlari, XI—XII asrga oid koʻplab inshootlarni, buzilib, xarobaga aylanishga sabab boʻldi. Qabriston XIV asrda qaytadan tiklana boshlandi.\n" +
                "\n" +
                "Amir Temur hukmronlik qilgan (1370—1405) davrda qurilish ishlari juda jadal sur’atda olib boriladi. Bu inshootlarning koʻpchiligi bizning davrimizgacha yetib kelgan. Turkum majmua Afrosiyobning shimolidan to janubga shaharning qoʻrgʻon devorigacha choʻzilgan.m\n" +
                "\n" +
                "Ba’zi dahmalar, XI—XII asrlarga oid maqbaralarning xarobalari ustiga quriladi. XV asr boshlarida binolar Xoʻja Axmad maqbarasidan Hazrati Xizr masjidiga boradigan yoʻl boʻylab quriladi. Temur davri me’morchiligi, bezak berishning yangi texnikalari bilan ya’ni, qirqma koshinlar bilan yanada boyitildi. Maqbaralar ikkitadan, tashqi va ichki gumbazli, baland silindr barabanli kilib quriladigan boʻldi.\n" +
                "\n" +
                "Shohi Zindada nodir va maftunkor imoratlar anchagina. Har bir maqbara bejirim qutichaga oʻxshaydi. Shohi Zinda moʻjizasi sahanalarning birini namuna tariqasida ajratib koʻrsatish mushkul. Chunki ularning hammasi betakrordir. Shohi Zinda me’morchilik majmuasi uch qismdan iborat qilib qurilgan. Shohi Zindaga ulkan oʻymakor darvozadan kiriladi. Peshtoq ravoqining gʻarbiy devorida, uni Abdulaziz Bahodir ibn Ulugʻbek tomonidan x. 1434—1435-yillarida bunyod etilgani yozilgan. Bu inshoot Shohi Zindaning qariyb toʻrt asr davomidagi shakllanish tarixida xotima boʻldi. Peshtoq nafis ishlangan.\n" +
                "\n" +
                "Oʻymakor eshik, 1911-yilda qurilgan, undagi naqshinkor bezak va yozuvlar kishini oʻziga tortadi. Eshikda quyidagi «Oʻlimdan oldin tavba qilmoqqa shoshilgin va Namozni oʻz vaqtida oʻqishni farz bilgin» soʻzlari yozilgan. Pastki qism tarkibiga masjid, mulozimxona hamda madrasa ham kiritilgan. Yozgi masjid ayvoni 1910-yil Samarqandlik usto Mahmud va Muhammad Siddiqlar qurishgan. Uning devorlari ganch naqshlari bilan bezatilgan. Pastki qismdagi yana ulugʻvor qoʻsh gumbazli bino tarixan oʻzida tabarruk zotlarning nomini mujassam etadi. Bu inshoot uzoq davr davomida, Ulugʻbekning ustozi Qozizoda Rumiy nomiga qurilganligi ta’kid etiladi. Buni toʻla isbotlash uchun 1979-yil 5-noyabr kuni ichkaridagi qabr ochib oʻrganildi. Haqiqatdan ham u yerdan ayol kishiga xos suyak qoldiqlari topildi. Antropolog Telman Xoʻjayevning aniqlashicha 30-35 yoshlar chamasidagi ayol suyaklari ekan. Maqbarani ichki gumbazlari naqshinkor qilib ishlangan, panellari esa olti qirrali koshinlar bilan bezatilgan. 1949—1952-yillarda maqbara tekshirildi va bosib yotgan tuproqdan tozalanib, qayta qurildi.\n" +
                "\n" +
                "Nihoyat tabarruk qirq sirli zina orqali majmuaning oʻrta qismiga koʻtariladi. Zinaning eni 5 gazni tashkil etadi."));
        shaharList.add(new Shahar(R.drawable.img_8,"Imom al-Buxoriy Majumosi","Imom al-Buxoriy maqbarasi 26719Musulmon olamining taniqli muhaddislaridan biri Imom al-Buxoriy 810 yil 21-iyulda Buxoroda tavallud topgan, 870 yilda Samarqanddan 25 km uzoqda joylashgan Xartang qishlog'ida (Samarqand viloyatining hozirgi Chelak tumani) vafot etgan va o sha yerda dafn etilgan. Biroq, bu joy asrlar davomida qarovsiz holatda qolgan edi.O‘zbekiston mustaqillikka erishganidan so‘ng, majmua qayta tiklandi. 1997- yilning 29-apelida o‘zbekiston Respublikasi hukumatining “Imom al-Buxoriy tug‘ilgan kuninining hijriy-oy taqvimi bo‘yicha 1225 yilligini nishonlash” to‘g‘risidagi qarori qabul qilindi. Shu yilning noyabr oyida, YuNESKO ning bosh konferensiyasi 1998-yilda muhim sana-olim Ismoil al -Buxoriy tavalludining 1225 yilligining nishonlanishida qatnashish to‘g‘risida qaror qabul qiladi. Shu munosabat bilan, Imom al-Buxoriyning maqbarasida O‘rta Osiyonong me’moriy an’analariga ko‘ra bajarilgan yodgorlik majmuasi barpo etilgan edi. Yodgorlik uchun ajratilgan yerning umumiy maydoni 10 gektarni tashkil etadi. Majmua, Samarqand-Imom al Buxoriy avtotrassasiga tutashib ketadi (25 кm.)."));
        shaharList.add(new Shahar(R.drawable.img_9,"Labi haviz Majumosi", "Nodir Devonbegi xonaqohi\n" +
                "Joylashuvi\tBuxoro, Oʻzbekiston\n" +
                "Koordinatalar\t39/46/23/N/64/25/12/E\n" +
                "Qurilish boshlanishi\tXVI asr\n" +
                "Binolar\tKoʻkaldosh madrasasi • Nodir Devonbegi xonaqohi • Nodir Devonbegi madrasasi\n" +
                "MapWikimedia | © OpenStreetMap\n" +
                "Labihovuz majmuasi xaritada\n" +
                " Labihovuz ansambli Vikiomborda\n" +
                "Labihovuz (forscha: لب حوض læbi hawz]; tarjimasi „hovuz boʻyida, havza boʻyida“[1]) — Buxoro shahrining markaziy maydonlaridan biri, 16—17-asrlarda qurilgan meʼmoriy ansambl. Hudud Koʻkadosh madrasasi, Nodir devonbegi madrasasi va Nodir devonbegi xonaqohi binolaridan tashkil topgan. Ansamblning oʻlchamlari taxminan 150 dan 200 metrga teng[2].\n" +
                "\n" +
                "Oʻrta asrlarda Labihovuz gavjum savdo maydoni boʻlgan, bunga savdo gumbazlari (ulardan biri maydondan 200 m masofada joylashgan) asosiy savdo koʻchasiga yaqinligi va odamlarning haddan tashqari gavjumligi sabab boʻlgan.\n" +
                "\n" +
                "Tarixi\n" +
                "Labihovuzda saqlanib qolgan birinchi bino Koʻkaldosh madrasasidir. Madrasani 1569-yilda shayboniylar hukmdori Abdullaxon II qurishga buyruq bergan. 1619—1620-yillarda Imomqulixon qo‘l ostidagi vazir o‘zbek urug‘i vakili Arlat Nodir Devonbegi tashabbusi va mablag‘i bilan maydonda hovuz buzilib, Nodir devonbegi xonaqohi barpo etilgan. 1623-yilda oʻsha Nodir devonbegi karvonsaroy binosini qurib, soʻngra Devonbegi madrasasiga aylantirilgan.\n" +
                "\n" +
                "Shaharning koʻpgina tumanlari singari, Labihovuz ham qurigan, Ikkinchi jahon urushidan keyin ular uni oʻziga xos sport maydoniga aylantirgan — bu yerda voleybol va kurash boʻyicha musobaqalar oʻtkazilgan. Sovet davrida uyning yaqinida „Gastronom“, „Buxoro“ restorani, „Komsomolets“ kinoteatri bor edi. 20-asrning 50-yillarida „Gastronom“da yong‘in sodir bo‘lgan, do‘kon yonib ketgan, yaqin atrofdagi Shohrud arigʻida esa yong‘inni o‘chirish uchun suv yetarli bo‘lmagan. Ushbu voqeadan keyin shahar hokimiyati tomonidan 1950-yillarning oxirida inshoot perimetri boʻylab quvur yotqizildi\n" +
                "\n" +
                "Joylashuv va tartibi\n" +
                "\n" +
                "Buxorodagi Lyab-i Hauz majmuasining rejasi:\n" +
                "1 — Nodir devonbegi xonaqohi ; 2 — Labihovuz; 3 — Koʻkaldosh madrasasi; 4 — Devonbegi madrasasi; 5 — Xoʻja Nasriddin haykali\n" +
                "„Labihovuz“ ansambli Buxoro shahristonining janubi-sharqiy qismida, Buxoro markaziy savdo koʻchasiga yaqin joyda joylashgan. Labihovuz yaqinida Toqi Telpakfurushon va Nugay karvonsaroyi joylashgan.\n" +
                "\n" +
                "Hudud tartibsiz koʻpburchak shaklida boʻlib, uning sharqiy qismida Devonbegi madrasasi, gʻarbiy qismida Devonbegi xonaqohi joylashgan. Xoʻja Nasriddin haykali va xonaqoh oʻrtasida Labihovuz oʻrin olgan shimoli-sharqiy qismini salobatli Koʻkaldosh madrasasi egallaydi.\n" +
                "\n" +
                "Arxitekturasi\n" +
                "Devonbegi\n" +
                "Devonbegi[3] deb ataladigan hovuz sakkiz qirrali suv hovuzi boʻlib, oʻlchami 42 dan 36 m gacha, chuqurligi 5 m gacha keladi. Hovuz kanal tizimidan keladigan 4000 m3 dan ortiq suvni oʻz ichiga olishi mumkin edi, ammo hovuzga kiruvchi oqim mavjud emas boʻlmagan. Keyingi davrlarda uy favvoraga aylantirilgan.\n" +
                "\n" +
                "Koʻkaldosh madrasasi\n" +
                "Maydonning shimoliy qismida Koʻkaldosh madrasasi joylashgan. Bu maydondagi eng qadimgi bino boʻlib, u 1568—1569-yillarda qurilgan. Madrasa oʻlchami 86x69 m boʻlgan toʻgʻri burchakli bino boʻlib, masjid, xonaqoh va 160 hujrani oʻz ichiga oladi.\n" +
                "\n" +
                "Nodir devonbegi xonaqohi\n" +
                "Xonaqah 1619—1620-yillarda Labihovuz bilan bir vaqtda Nodir devonbegi, Imomqulixonning amakisi va vaziri tomonidan qurilgan. Xonaqohda oʻlchami kichik, xochsimon, gumbazli zal, uning atrofida hujralar joylashgan. Minoralar asosiy jabhaning chetlari boʻylab joylashgan, jabhaning oʻzi mozaika bilan bezatilgan va uning yon tomonlarida arab tili yozuvida yozilgan yozuvlar mavjud."));
        shaharList.add(new Shahar(R.drawable.img_10,"Mirzo Ulug'bek Maqbarasi","Amir Temur davridan boshlab Registon Samarqandning asosiy bozor maydoni va ijtimoiy markazi boʻlgan. Koʻplab savdo doʻkonlari, karvonsaroylar va yopiq savdo timlari boʻlib, ulardan eng kattasi Telpak-furushon timi boʻlgan. Temurning nabirasi Ulugʻbek davrida maydon koʻrinishi asta-sekin oʻzgara boshlaydi. Ulugʻbek Registonni qaytadan barpo etishni Markaziy Osiyodagi eng yirik islom universiteti qurilishidan boshlaydi.\n" +
                "\n" +
                "Registon maydonidagi madrasa qurilishining boshlanish sanasi nomaʼlum. Kirish qismidagi yozuv saqlangan: „820 (1417)-yil. Maʼlum boʻlsin: bu imorat dunyodagi joylarning eng zoʻr va eng balandi, sanʼat va ishdagi binolarning eng mukammali…“. Bu 1417-yilda madrasa binosi qurilishi tugallangan degan xulosaga kelish imkonini beradi. Movarounnahrda bunday inshootlarni qurish kamida 5-6 yil davom etgan[3] Asosiy ish 1420-yilda yakunlanganligi hisobga olinsa, qurilish 1415-yildan boshlangan deb taxmin qilish mumkin. Madrasa loyihasi muallifi amir Shohruh Kavom-ad-din Sheroziy hisoblanadi, biroq oʻrta asr tarixchisi, Ulugʻbekning zamondoshi Vosifiy meʼmorni Qozizoda ar-Rumiyning shogirdi Kamoliddin Muhandis deb maʼlumot beradi.\n" +
                "\n" +
                "Ulugʻbek madrasasi qurilishi tugallangach, XV asr musulmon Sharqidagi eng nufuzli universitetlardan biriga aylandi. Rivoyatlarga koʻra, bu yerda mashhur shoir, olim va faylasuf Abdurahmon Jomiy tahsil olgan. Madrasa tinglovchilari orasida naqshbandiya tariqatining shayxi Xoja Ahror va shoir Alisher Navoiy ham boʻlgan. Taʼlim muassasasida matematika, geometriya, mantiq, tabiiy fanlar, ilohiyot, falsafa boʻyicha maʼruzalar oʻqilgan. Ularni Qozizoda Rumiy, Jamshid Gʻiyosiddin Al-Koshiy, Al-Qushchi kabi mashhur olimlar, shuningdek, Ulugʻbekning oʻzi oʻqigan. Universitetning birinchi mudarrisi (rektori) etib chuqur ilmiy bilimlarga ega Mavlono Muhammad Havofiy tayinlanadi.\n" +
                "\n" +
                "1533-yilda Movarounnahrda shayboniy Ubaydullaxon hokimiyatga keldi va u tez orada oʻz davlatining poytaxtini Buxoroga koʻchirdi. Samarqand asta-sekin siyosiy markaz sifatida maqomini yoʻqotdi. Shunga qaramay, Ulugʻbek madrasasi Markaziy Osiyodagi eng yaxshi taʼlim muassasalaridan biri maqomini saqlab qolgan. Registon maydonida tubdan qayta qurishni amalga oshirgan Yalangtoʻsh Bahodir davrida madrasa binosi toʻliq taʼmirdan chiqarildi. Aynan uning nafis bezaklari Samarqand hokimi tomonidan qurilgan, keyinchalik Sherdor nomini olgan yangi madrasaga asos boʻlgan. Ashtarxoniylar sulolasidan boʻlgan soʻnggi Buxoro xoni Abulfayz hukmronligi davrida kechgan feodal urushlar va xalq gʻalayonlari davrida Ulugʻbek madrasasi koʻrinishiga katta zarar yetkazilgan. XVIII asrdagi samarqandlik tarixchi Abu Tohir Xoʻjaning yozishicha, shahar hokimi isyonchilar madrasaning baland devorlaridan uning qarorgohiga oʻt ochishi mumkinligidan qoʻrqib, binoning ikkinchi qavatini buzishni buyurgan.\n" +
                "\n" +
                "XIX asrning birinchi yarmida Ulugʻbek madrasasi kuchli zilzila (1817—1818) natijasida vayron boʻlgan[4].\n" +
                "\n" +
                "1897-yildagi zilzila „yaxshi saqlanib qolgan qismlar“ni vayronaga aylantirdi.\n" +
                "\n" +
                "Ulugʻbek madrasasini qayta tiklash 1920-yillarda boshlanib, yetmish yildan ortiq davom etdi. Birinchi bosqichda binoning shu davrgacha yetib kelgan qismlarini saqlab qolish boʻyicha shoshilinch ishlar amalga oshirildi. 1932-yilda meʼmorlar V. G. Shuxov va M. F. Mauer[5] loyihasiga koʻra, shimoli-sharqiy minorani toʻgʻrilash boʻyicha rekonstruksiya amalga oshirildi. Asosiy restavratsiya ishlari 1950—1960-yillarda amalga oshirildi. 1965-yilda muhandislar E. M. Handel va E. O. Nelle janubi-sharqiy minorani qaytadan tikladilar. 1990-yillarda ikkinchi qavatdagi hujralar qayta qurildi.\n" +
                "\n" +
                "XX asrning 60-yillarida akademik Ibrohim Moʻminov Oʻzbekiston SSR rahbari Sharof Rashidov koʻmagida Samarqanddagi oliy taʼlim – madrasa tizimi tarixini keng oʻrganish gʻoyasini ishlab chiqdi. Mirzo Ulugʻbek madrasasida taʼlim tizimini tiklash va 1970-yilda madrasaning 550 yilligini nishonlash rejalashtirilgan edi. Biroq bu tashabbus yuqori idoralar tomonidan qoʻllab-quvvatlanmadi. 2000-yilda, Oʻzbekiston mustaqillikka erishgandan keyingina akademik B.Valixoʻjayev bu gʻoyani boshqa formatda qayta tiklashga harakat qildi[6].\n" +
                "\n" +
                "1992-yilda Ulugʻbek yubileyiga bagʻishlangan yodgorlikda taʼmirlash va restavratsiya ishlari OʻzMIIPI restavratsiya loyihasi asosida amalga oshirildi. Loyiha doirasida ikkinchi qavatni toʻliq rekonstruksiya qilish, meʼmoriy keramika buyumlarini qayta tiklash hamda janubi-gʻarbiy xonalarda nuragan gips va stalaktitlarni almashtirish koʻzda tutilgan.\n" +
                "\n" +
                "Meʼmorchiligi\n" +
                "Ulugʻbek madrasasi oʻz davri talablariga toʻla mos ravishda musulmon qonunlari asosida qurilgan. Bu Markaziy Osiyo va Yaqin Sharqdagi maʼnaviy-maʼrifiy muassasaning klassik namunasidir. Ulugʻbek madrasasi 2 qavatli, toʻgʻri toʻrtburchak tarhli (56×81 m.). Bosh tarzi maydonga qaragan, mahobatli peshtoq mujassamotida keng toqili ravoq (balandligi 16,5 m.), uning 2 yonida guldastalar (balandligi 32 m.) bor. Ravoq tepasidagi yulduzli osmon aks etgan qanos bezaklari oʻziga xosdir. Guldasta tepasi muqarnas, sharafalar bilan yakunlangan. Peshtoq ravogʻi cheti morpech shaklida, tokchasidagi namoyonlar oʻziga xos uslubda pardozlangan. Peshtogʻi, guldastasi va tashqi devorlarida girih naqshining turli betakror namunalari aks etgan. Ganchkori panjaralar orqali xonaga yorugʻlik tushib turadi. Moviy va koʻk koshin hamda sopol gishtlar vositasida Samarqanddagi Ulugbek madrasas geometrik naqshlar bilan bezatilgan devor satqi yozuvlar bilan oʻzaro uygʻunlashib, koʻzga yaqqol tashlanib turadi. Peshtoq orqali chorsi hovli (30×30 m.)ga oʻtiladi. Hovli atrofi 2 qavatli hujralar (48 ta) bilan oʻralgan, har bir qujra qaznoq, yotoqxona, umumiy xonadan iborat. Madrasaning shimol va janub tarzlari oʻrtasida tashqi tomondan alohida peshtoqlar bor. Madrasaning 4 tomonini darsxona va ayvon egallagan. Masjid (22×8 m.) janubi sharqiy tomonga choʻzilgan. Tashqi toʻrtburchagida 4 ta baland minora bor. Xonaqoh va baʼzi hujralar ichkarisi naqshin bezaklar bilan pardozlangan. Bezaklari orasida kufiy va suls yozuvlari uchraydi. Vayron boʻlgan 2-qavati, qiyshaygan guldastasi, devorlaridagi koʻchib ketgan bezaklar qayta tiklangan (1936), Vladimir Shuxov va M. Mauerlar loyihasi asosida shimoli-sharqiy minorasi taʼmirlangan (1932). E. Gendel qiyshaygan minorani oʻz qoliga keltirgan (1965). Taʼmirlashda Umarov Akrom, Gʻafurov Shamsuddin, Quli Jalilov, I. Shermuhamedov, A. Quliyev kabi ustalar qatnashgan. Ulugʻbek madrasasi (Samarqand) meʼmoriy shakli, tuzilishi jihatidan Oʻrta Osiyo meʼmorligida shu turdagi binolar orasida eng mukammal yuksak sanʼat namunasi hisoblanadi."));
    }
}