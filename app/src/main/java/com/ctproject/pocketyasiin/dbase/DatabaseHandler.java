package com.ctproject.pocketyasiin.dbase;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by farhan on 12/25/15.
 */
public class DatabaseHandler extends SQLiteOpenHelper {

    // Versi Database
    public static final int DATABASE_VERSION = 2;

    // Nama Database
    public static final String DATABASE_NAME = "PocketYasiin";

    // Nama Tabel
    public static final String TABLE_YASIN = "yasin";
    public static final String TABLE_KURSI = "kursi";
    public static final String TABLE_TAHLIL = "tahlil";
    public static final String TABLE_ASMAUL = "asmaul";
    public static final String TABLE_PENGATURAN = "pengaturan";

    // Tabel Yasin
    public static final String KEY_ID_YASIN = "id";
    public static final String KEY_ARAB_YASIN = "arab";
    public static final String KEY_LATIN_YASIN = "latin";
    public static final String KEY_ARTI_YASIN = "arti";

    // Tabel Kursi
    public static final String KEY_ID_KURSI = "id";
    public static final String KEY_ARAB_KURSI = "arab";
    public static final String KEY_LATIN_KURSI = "latin";
    public static final String KEY_ARTI_KURSI = "arti";

    // Tabel Tahlil
    public static final String KEY_ID_TAHLIL = "id";
    public static final String KEY_ARAB_TAHLIL = "arab";
    public static final String KEY_LATIN_TAHLIL = "latin";
    public static final String KEY_ARTI_TAHLIL = "arti";

    // Tabel Asmaul Husnah
    public static final String KEY_ID_ASMAUL = "id";
    public static final String KEY_ARAB_ASMAUL = "arab";
    public static final String KEY_LATIN_ASMAUL = "latin";
    public static final String KEY_ARTI_ASMAUL = "arti";
    public static final String KEY_AMAL_ASMAUL = "amal";

    // Tabel Pengaturan
    public static final String KEY_ID_PENGATURAN = "id";
    public static final String KEY_UKURAN_ARAB = "ukuranarab";
    public static final String KEY_UKURAN_LATIN = "ukuranlatin";
    public static final String KEY_UKURAN_ARTI = "ukuranarti";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_YASIN = "CREATE TABLE " + TABLE_YASIN + "("
                + KEY_ID_YASIN + " INTEGER PRIMARY KEY," + KEY_ARAB_YASIN + " TEXT,"
                + KEY_LATIN_YASIN + " TEXT," + KEY_ARTI_YASIN + " TEXT" + ")";
        String CREATE_TABLE_KURSI = "CREATE TABLE " + TABLE_KURSI + "("
                + KEY_ID_KURSI + " INTEGER PRIMARY KEY," + KEY_ARAB_KURSI + " TEXT,"
                + KEY_LATIN_KURSI + " TEXT," + KEY_ARTI_KURSI + " TEXT" + ")";
        String CREATE_TABLE_TAHLIL = "CREATE TABLE " + TABLE_TAHLIL + "("
                + KEY_ID_TAHLIL + " INTEGER PRIMARY KEY," + KEY_ARAB_TAHLIL + " TEXT,"
                + KEY_LATIN_TAHLIL + " TEXT," + KEY_ARTI_TAHLIL + " TEXT" + ")";
        String CREATE_TABLE_ASMAUL = "CREATE TABLE " + TABLE_ASMAUL + "("
                + KEY_ID_ASMAUL + " INTEGER PRIMARY KEY," + KEY_ARAB_ASMAUL + " TEXT,"
                + KEY_LATIN_ASMAUL + " TEXT," + KEY_ARTI_ASMAUL + " TEXT," + KEY_AMAL_ASMAUL + " TEXT" + ")";
        String CREATE_TABLE_PENGATURAN = "CREATE TABLE " + TABLE_PENGATURAN + "("
                + KEY_ID_PENGATURAN + " INTEGER PRIMARY KEY," + KEY_UKURAN_ARAB + " TEXT,"
                + KEY_UKURAN_LATIN + " TEXT," + KEY_UKURAN_ARTI + " TEXT" + ")";
        db.execSQL(CREATE_TABLE_YASIN);
        db.execSQL(CREATE_TABLE_KURSI);
        db.execSQL(CREATE_TABLE_TAHLIL);
        db.execSQL(CREATE_TABLE_ASMAUL);
        db.execSQL(CREATE_TABLE_PENGATURAN);

        ContentValues values = new ContentValues();

        //1
        values.put(KEY_ARAB_YASIN, "يسٓ  ﴿١﴾");
        values.put(KEY_LATIN_YASIN, "Ya Sin");
        values.put(KEY_ARTI_YASIN, "Ya Sin");
        db.insert(TABLE_YASIN, null, values);
        //2
        values.put(KEY_ARAB_YASIN, "وَٱلْقُرْءَانِ ٱلْحَكِيمِ ﴿٢﴾");
        values.put(KEY_LATIN_YASIN, "Wal Qur'aanil hakiimi");
        values.put(KEY_ARTI_YASIN, "Demi Al-Qur'an yang penuh hikmah,");
        db.insert(TABLE_YASIN, null, values);
        //3
        values.put(KEY_ARAB_YASIN, "إِنَّكَ لَمِنَ ٱلْمُرْسَلِينَ ﴿٣﴾");
        values.put(KEY_LATIN_YASIN, "Innaka laminal mursaliina");
        values.put(KEY_ARTI_YASIN, "sesungguhnya kamu salah seorang dari rasul-rasul,");
        db.insert(TABLE_YASIN, null, values);
        //4
        values.put(KEY_ARAB_YASIN, "عَلَىٰ صِرَ\u200Cٰطٍۢ مُّسْتَقِيمٍۢ ﴿٤﴾");
        values.put(KEY_LATIN_YASIN, "'Alaa sirathin mustaqiiminin");
        values.put(KEY_ARTI_YASIN, "(yang berada) diatas jalan yang lurus,");
        db.insert(TABLE_YASIN, null, values);
        //5
        values.put(KEY_ARAB_YASIN, "تَنزِيلَ ٱلْعَزِيزِ ٱلرَّحِيمِ ﴿٥﴾");
        values.put(KEY_LATIN_YASIN, "Tanziilal 'aziizir rahiimi");
        values.put(KEY_ARTI_YASIN, "(sebagai wahyu) yang diturunkan oleh Yang Maha Perkasa, lagi Maha Penyayang.");
        db.insert(TABLE_YASIN, null, values);
        //6
        values.put(KEY_ARAB_YASIN, "لِتُنذِرَ قَوْمًۭا مَّآ أُنذِرَ ءَابَآؤُهُمْ فَهُمْ غَـٰفِلُونَ ﴿٦﴾");
        values.put(KEY_LATIN_YASIN, "Litundzira qauman maa undzira aabaaa-uhum fahum ghaafiluuna");
        values.put(KEY_ARTI_YASIN, "agar kamu memberi peringatan kepada kaum yang bapak-bapak mereka belum pernah diberi peringatan, karena itu mereka lalai.");
        db.insert(TABLE_YASIN, null, values);
        //7
        values.put(KEY_ARAB_YASIN, "لَقَدْ حَقَّ ٱلْقَوْلُ عَلَىٰٓ أَكْثَرِهِمْ فَهُمْ لَا يُؤْمِنُونَ ﴿٧﴾");
        values.put(KEY_LATIN_YASIN, "Laqad haqqal qaulu 'alaa aktsa rihim fahum laa yu'minuuna");
        values.put(KEY_ARTI_YASIN, "Sesungguhnya telah pasti berlaku perkataan (ketentuan Allah) terhadap kebanyakan mereka, karena mereka tidak beriman.");
        db.insert(TABLE_YASIN, null, values);
        //8
        values.put(KEY_ARAB_YASIN, "إِنَّا جَعَلْنَا فِىٓ أَعْنَـٰقِهِمْ أَغْلَـٰلًۭا فَهِىَ إِلَى ٱلْأَذْقَانِ فَهُم مُّقْمَحُونَ ﴿٨﴾");
        values.put(KEY_LATIN_YASIN, "Innaa ja'alnaa fii a'naaqihim aghlaalan fahiya ilal adzqaani fahum muqmahuuna");
        values.put(KEY_ARTI_YASIN, "Sesungguhnya Kami telah memasang belenggu di leher mereka, lalu tangan mereka (diangkat) ke dagu, maka karena itu mereka tertengadah.");
        db.insert(TABLE_YASIN, null, values);
        //9
        values.put(KEY_ARAB_YASIN, "وَجَعَلْنَا مِنۢ بَيْنِ أَيْدِيهِمْ سَدًّۭا وَمِنْ خَلْفِهِمْ سَدًّۭا فَأَغْشَيْنَـٰهُمْ فَهُمْ لَا يُبْصِرُونَ ﴿٩﴾");
        values.put(KEY_LATIN_YASIN, "Waja-'alnaa mim baini aidiihim saddan wa min khal-fihim saddan fa aghsyainaahum fahum laa yubshiruuna");
        values.put(KEY_ARTI_YASIN, "Dan Kami adakan di hadapan mereka dinding dan di belakang mereka dinding (pula), dan Kami tutup (mata) mereka sehingga mereka tidak dapat melihat.");
        db.insert(TABLE_YASIN, null, values);
        //10
        values.put(KEY_ARAB_YASIN, "وَسَوَآءٌ عَلَيْهِمْ ءَأَنذَرْتَهُمْ أَمْ لَمْ تُنذِرْهُمْ لَا يُؤْمِنُونَ ﴿١٠﴾");
        values.put(KEY_LATIN_YASIN, "Wasawaa-un 'alaihim a-andzartahum amlam tundzirhum laa yu'minuuna");
        values.put(KEY_ARTI_YASIN, "Sama saja bagi mereka apakah kamu memberi peringatan kepada mereka ataukah kamu tidak memberi peringatan kepada mereka, mereka tidak akan beriman.");
        db.insert(TABLE_YASIN, null, values);
        //11
        values.put(KEY_ARAB_YASIN, "إِنَّمَا تُنذِرُ مَنِ ٱتَّبَعَ ٱلذِّكْرَ وَخَشِىَ ٱلرَّحْمَـٰنَ بِٱلْغَيْبِ ۖ فَبَشِّرْهُ بِمَغْفِرَةٍۢ وَأَجْرٍۢ كَرِيمٍ ﴿١١﴾");
        values.put(KEY_LATIN_YASIN, "Innamaa tundziru maittaba-adz dzikra wa khasyiar rahmaana bil ghaibi fabasysyirhu bi magfiratin wa ajrin kariimin");
        values.put(KEY_ARTI_YASIN, "Sesungguhnya kamu hanya memberi peringatan kepada orang-orang yang mau mengikuti peringatan dan yang takut kepada Tuhan Yang Maha Pemurah walaupun dia tidak melihat-Nya. Maka berilah mereka kabar gembira dengan ampunan dan pahala yang mulia.");
        db.insert(TABLE_YASIN, null, values);
        //12
        values.put(KEY_ARAB_YASIN, "إِنَّا نَحْنُ نُحْىِ ٱلْمَوْتَىٰ وَنَكْتُبُ مَا قَدَّمُوا۟ وَءَاثَـٰرَهُمْ ۚ وَكُلَّ شَىْءٍ أَحْصَيْنَـٰهُ فِىٓ إِمَامٍۢ مُّبِينٍۢ ﴿١٢﴾");
        values.put(KEY_LATIN_YASIN, "Innaa nahnu nuhyil-mauta wa naktubu maa qaddamuu wa aatsarahum, wa kulla syai'in ahshainaahu fii imaamim mubiin");
        values.put(KEY_ARTI_YASIN, "Sesungguhnya Kami menghidupkan orang-orang mati dan Kami menuliskan apa yang telah mereka kerjakan dan bekas-bekas yang mereka tinggalkan. Dan segala sesuatu Kami kumpulkan dalam Kitab Induk yang nyata (Lohmahfuz).");
        db.insert(TABLE_YASIN, null, values);
        //13
        values.put(KEY_ARAB_YASIN, "وَٱضْرِبْ لَهُم مَّثَلًا أَصْحَـٰبَ ٱلْقَرْيَةِ إِذْ جَآءَهَا ٱلْمُرْسَلُونَ ﴿١٣﴾");
        values.put(KEY_LATIN_YASIN, "Wadhrib lahum matsalan ash-haabal-qaryati idz jaaa'ahal-mursaluuna");
        values.put(KEY_ARTI_YASIN, "\"Dan buatlah bagi mereka suatu perumpamaan, yaitu penduduk suatu negeri ketika utusan-utusan datang kepada mereka,\"");
        db.insert(TABLE_YASIN, null, values);
        //14
        values.put(KEY_ARAB_YASIN, "إِذْ أَرْسَلْنَآ إِلَيْهِمُ ٱثْنَيْنِ فَكَذَّبُوهُمَا فَعَزَّزْنَا بِثَالِثٍۢ فَقَالُوٓا۟ إِنَّآ إِلَيْكُم مُّرْسَلُونَ ﴿١٤﴾");
        values.put(KEY_LATIN_YASIN, "Idz arsalna ilaihimuts naini fakadzdzabuuhuma fa 'azzaznaa bi tsalitsin faqaaluu innaa ilaikum mursaluuna");
        values.put(KEY_ARTI_YASIN, "\"(yaitu) ketika Kami mengutus kepada mereka dua orang utusan, lalu mereka mendustakan keduanya; kemudian Kami kuatkan dengan (utusan) yang ketiga, maka ketiga utusan itu berkata: \"\"Sesungguhnya kami adalah orang-orang yang diutus kepadamu\"\".\"");
        db.insert(TABLE_YASIN, null, values);
        //15
        values.put(KEY_ARAB_YASIN, "قَالُوا۟ مَآ أَنتُمْ إِلَّا بَشَرٌۭ مِّثْلُنَا وَمَآ أَنزَلَ ٱلرَّحْمَـٰنُ مِن شَىْءٍ إِنْ أَنتُمْ إِلَّا تَكْذِبُونَ ﴿١٥﴾");
        values.put(KEY_LATIN_YASIN, "Qaaluu maa antum illaa basyarun mitslunaa wamaa anzalar-rahmaanu min syai'in in antum illa takzibuuna");
        values.put(KEY_ARTI_YASIN, "\"Mereka menjawab: \"\"Kamu tidak lain hanyalah manusia seperti kami dan Allah Yang Maha Pemurah tidak menurunkan sesuatu pun, kamu tidak lain hanyalah pendusta belaka\"\".\"");
        db.insert(TABLE_YASIN, null, values);
        //16
        values.put(KEY_ARAB_YASIN, "قَالُوا۟ رَبُّنَا يَعْلَمُ إِنَّآ إِلَيْكُمْ لَمُرْسَلُونَ ﴿١٦﴾");
        values.put(KEY_LATIN_YASIN, "Qaaluu rabbunaa ya'lamu inna ilaikum la mursaluuna");
        values.put(KEY_ARTI_YASIN, "\"Mereka berkata: \"\"Tuhan kami mengetahui bahwa sesungguhnya kami adalah orang yang diutus kepada kamu.\"");
        db.insert(TABLE_YASIN, null, values);
        //17
        values.put(KEY_ARAB_YASIN, "وَمَا عَلَيْنَآ إِلَّا ٱلْبَلَـٰغُ ٱلْمُبِينُ ﴿١٧﴾");
        values.put(KEY_LATIN_YASIN, "Wa maa'alainaa illal-balaaghul mubiinu");
        values.put(KEY_ARTI_YASIN, "\"Dan kewajiban kami tidak lain hanyalah menyampaikan (perintah Allah) dengan jelas\"\".\"");
        db.insert(TABLE_YASIN, null, values);
        //18
        values.put(KEY_ARAB_YASIN, "قَالُوٓا۟ إِنَّا تَطَيَّرْنَا بِكُمْ ۖ لَئِن لَّمْ تَنتَهُوا۟ لَنَرْجُمَنَّكُمْ وَلَيَمَسَّنَّكُم مِّنَّا عَذَابٌ أَلِيمٌۭ ﴿١٨﴾");
        values.put(KEY_LATIN_YASIN, "Qaaluu inna tathay-yarnaa bikum la'il lam tantahu lanarjumannakum walayamas sannakum minna 'adzaabun aliimun");
        values.put(KEY_ARTI_YASIN, "\"Mereka menjawab: \"\"Sesungguhnya kami bernasib malang karena kamu, sesungguhnya jika kamu tidak berhenti (menyeru kami), niscaya kami akan merajam kamu dan kamu pasti akan mendapat siksa yang pedih dari kami\"\".\"");
        db.insert(TABLE_YASIN, null, values);
        //19
        values.put(KEY_ARAB_YASIN, "قَالُوا۟ طَـٰٓئِرُكُم مَّعَكُمْ ۚ أَئِن ذُكِّرْتُم ۚ بَلْ أَنتُمْ قَوْمٌۭ مُّسْرِفُونَ ﴿١٩﴾");
        values.put(KEY_LATIN_YASIN, "Qaaluu thaa'irukum ma-'akum, a-in dzukkirtum bal antum qaumun musrifuuna");
        values.put(KEY_ARTI_YASIN, "\"Utusan-utusan itu berkata: \"\"Kemalangan kamu itu adalah karena kamu sendiri. Apakah jika kamu diberi peringatan (kamu mengancam kami)? Sebenarnya kamu adalah kaum yang melampaui batas\"\".\"");
        db.insert(TABLE_YASIN, null, values);
        //20
        values.put(KEY_ARAB_YASIN, "وَجَآءَ مِنْ أَقْصَا ٱلْمَدِينَةِ رَجُلٌۭ يَسْعَىٰ قَالَ يَـٰقَوْمِ ٱتَّبِعُوا۟ ٱلْمُرْسَلِينَ ﴿٢٠﴾");
        values.put(KEY_LATIN_YASIN, "Wajaa'a min aqshal madiinati rajulun yas-'aa qaala yaa qaumit tabi'ul mursaliina");
        values.put(KEY_ARTI_YASIN, "\"Dan datanglah dari ujung kota, seorang laki-laki (Habib An Najjar) dengan bergegas-gegas ia berkata: \"\"Hai kaumku, ikutilah utusan-utusan itu,\"");
        db.insert(TABLE_YASIN, null, values);
        //21
        values.put(KEY_ARAB_YASIN, "ٱتَّبِعُوا۟ مَن لَّا يَسْـَٔلُكُمْ أَجْرًۭا وَهُم مُّهْتَدُونَ ﴿٢١﴾");
        values.put(KEY_LATIN_YASIN, "Ittabi-'uu man laa yas-'alukum ajran wahum muhtaduuna");
        values.put(KEY_ARTI_YASIN, "\"ikutilah orang yang tiada minta balasan kepadamu; dan mereka adalah orang-orang yang mendapat petunjuk.\"");
        db.insert(TABLE_YASIN, null, values);
        //22
        values.put(KEY_ARAB_YASIN, "وَمَا لِىَ لَآ أَعْبُدُ ٱلَّذِى فَطَرَنِى وَإِلَيْهِ تُرْجَعُونَ ﴿٢٢﴾");
        values.put(KEY_LATIN_YASIN, "Wa maa liya laa a'budul-ladzii fatharanii wa ilaihi turja'uuna");
        values.put(KEY_ARTI_YASIN, "Mengapa aku tidak menyembah (Tuhan) yang telah menciptakanku dan yang hanya kepada-Nya-lah kamu (semua) akan dikembalikan?");
        db.insert(TABLE_YASIN, null, values);
        //23
        values.put(KEY_ARAB_YASIN, "ءَأَتَّخِذُ مِن دُونِهِۦٓ ءَالِهَةً إِن يُرِدْنِ ٱلرَّحْمَـٰنُ بِضُرٍّۢ لَّا تُغْنِ عَنِّى شَفَـٰعَتُهُمْ شَيْـًۭٔا وَلَا يُنقِذُونِ ﴿٢٣﴾");
        values.put(KEY_LATIN_YASIN, "A-attakhidzu minduunihi aalihatan in yurudnirrahmaanu bidzurrin la tughnii 'anni syafa'atuhum syai'an walaa yunqidzuuna");
        values.put(KEY_ARTI_YASIN, "Mengapa aku akan menyembah tuhan-tuhan selain-Nya, jika (Allah) Yang Maha Pemurah menghendaki kemudaratan terhadapku, niscaya syafaat mereka tidak memberi manfaat sedikit pun bagi diriku dan mereka tidak (pula) dapat menyelamatkanku?");
        db.insert(TABLE_YASIN, null, values);
        //24
        values.put(KEY_ARAB_YASIN, "إِنِّىٓ إِذًۭا لَّفِى ضَلَـٰلٍۢ مُّبِينٍ ﴿٢٤﴾");
        values.put(KEY_LATIN_YASIN, "Inni idzan lafii dhalaalin mubiin");
        values.put(KEY_ARTI_YASIN, "Sesungguhnya aku kalau begitu pasti berada dalam kesesatan yang nyata.");
        db.insert(TABLE_YASIN, null, values);
        //25
        values.put(KEY_ARAB_YASIN, "إِنِّىٓ ءَامَنتُ بِرَبِّكُمْ فَٱسْمَعُونِ ﴿٢٥﴾");
        values.put(KEY_LATIN_YASIN, "Inni aamantu birabbikum fasma'uuni");
        values.put(KEY_ARTI_YASIN, "\"Sesungguhnya aku telah beriman kepada Tuhanmu; maka dengarkanlah (pengakuan keimanan) ku.\"");
        db.insert(TABLE_YASIN, null, values);
        //26
        values.put(KEY_ARAB_YASIN, "قِيلَ ٱدْخُلِ ٱلْجَنَّةَ ۖ قَالَ يَـٰلَيْتَ قَوْمِى يَعْلَمُونَ ﴿٢٦﴾");
        values.put(KEY_LATIN_YASIN, "Qiilad-khulil-jannata qaala yaa laita qaumii ya'lamuuna");
        values.put(KEY_ARTI_YASIN, "\"Dikatakan (kepadanya): \"\"Masuklah ke surga\"\". Ia berkata: \"\"Alangkah baiknya sekiranya kaumku mengetahui,\"");
        db.insert(TABLE_YASIN, null, values);
        //27
        values.put(KEY_ARAB_YASIN, "بِمَا غَفَرَ لِى رَبِّى وَجَعَلَنِى مِنَ ٱلْمُكْرَمِينَ ﴿٢٧﴾");
        values.put(KEY_LATIN_YASIN, "Bimaa ghafaralii rabbii waja-'alanii minal mukramiina");
        values.put(KEY_ARTI_YASIN, "\"apa yang menyebabkan Tuhanku memberi ampun kepadaku dan menjadikan aku termasuk orang-orang yang dimuliakan\"\".\"");
        db.insert(TABLE_YASIN, null, values);
        //28
        values.put(KEY_ARAB_YASIN, "وَمَآ أَنزَلْنَا عَلَىٰ قَوْمِهِۦ مِنۢ بَعْدِهِۦ مِن جُندٍۢ مِّنَ ٱلسَّمَآءِ وَمَا كُنَّا مُنزِلِينَ ﴿٢٨﴾");
        values.put(KEY_LATIN_YASIN, "Wa maa anzalna 'alaa qaumihii min ba'dihii min jundin minas-samaa'i wa maa kunna munziliina");
        values.put(KEY_ARTI_YASIN, "Dan kami tidak menurunkan kepada kaumnya sesudah dia (meninggal) suatu pasukan pun dari langit dan tidak layak Kami menurunkannya.");
        db.insert(TABLE_YASIN, null, values);
        //29
        values.put(KEY_ARAB_YASIN, "إِن كَانَتْ إِلَّا صَيْحَةًۭ وَ\u200Cٰحِدَةًۭ فَإِذَا هُمْ خَـٰمِدُونَ ﴿٢٩﴾");
        values.put(KEY_LATIN_YASIN, "In kaanat illaa shaihatan waahidatan fa idzaa hum khaamiduuna");
        values.put(KEY_ARTI_YASIN, "\"Tidak ada siksaan atas mereka melainkan satu teriakan suara saja; maka tiba-tiba mereka semuanya mati.\"");
        db.insert(TABLE_YASIN, null, values);
        //30
        values.put(KEY_ARAB_YASIN, "يَـٰحَسْرَةً عَلَى ٱلْعِبَادِ ۚ مَا يَأْتِيهِم مِّن رَّسُولٍ إِلَّا كَانُوا۟ بِهِۦ يَسْتَهْزِءُونَ ﴿٣٠﴾");
        values.put(KEY_LATIN_YASIN, "Ya hasratan 'alal-ibaadi maa ya'tiihim mir rasuulin illaa kaanuu bihi yastahzi'uuna");
        values.put(KEY_ARTI_YASIN, "Alangkah besarnya penyesalan terhadap hamba-hamba itu, tiada datang seorang rasul pun kepada mereka melainkan mereka selalu memperolok-olokkannya.");
        db.insert(TABLE_YASIN, null, values);
        //31
        values.put(KEY_ARAB_YASIN, "أَلَمْ يَرَوْا۟ كَمْ أَهْلَكْنَا قَبْلَهُم مِّنَ ٱلْقُرُونِ أَنَّهُمْ إِلَيْهِمْ لَا يَرْجِعُونَ ﴿٣١﴾");
        values.put(KEY_LATIN_YASIN, "Alam yarau kam ahlaknaa qablahum minal-quruuni annahum ilaihim laa yarji'uuna");
        values.put(KEY_ARTI_YASIN, "Tidakkah mereka mengetahui berapa banyaknya umat-umat sebelum mereka yang telah Kami binasakan, bahwasanya orang-orang (yang telah Kami binasakan) itu tiada kembali kepada mereka.");
        db.insert(TABLE_YASIN, null, values);
        //32
        values.put(KEY_ARAB_YASIN, "وَإِن كُلٌّۭ لَّمَّا جَمِيعٌۭ لَّدَيْنَا مُحْضَرُونَ ﴿٣٢﴾");
        values.put(KEY_LATIN_YASIN, "Wa in kullun lammaa jamii'un ladainaa mukhdharuuna");
        values.put(KEY_ARTI_YASIN, "Dan setiap mereka semuanya akan dikumpulkan lagi kepada Kami.");
        db.insert(TABLE_YASIN, null, values);
        //33
        values.put(KEY_ARAB_YASIN, "وَءَايَةٌۭ لَّهُمُ ٱلْأَرْضُ ٱلْمَيْتَةُ أَحْيَيْنَـٰهَا وَأَخْرَجْنَا مِنْهَا حَبًّۭا فَمِنْهُ يَأْكُلُونَ ﴿٣٣﴾");
        values.put(KEY_LATIN_YASIN, "Wa aayatun lahumul-ardlul maitatu ahyainaahaa wa akhrajnaa habban faminhu ya'kuluuna");
        values.put(KEY_ARTI_YASIN, "Dan suatu tanda (kekuasaan Allah yang besar) bagi mereka adalah bumi yang mati. Kami hidupkan bumi itu dan Kami keluarkan daripadanya biji-bijian, maka daripadanya mereka makan.");
        db.insert(TABLE_YASIN, null, values);
        //34
        values.put(KEY_ARAB_YASIN, "وَجَعَلْنَا فِيهَا جَنَّـٰتٍۢ مِّن نَّخِيلٍۢ وَأَعْنَـٰبٍۢ وَفَجَّرْنَا فِيهَا مِنَ ٱلْعُيُونِ ﴿٣٤﴾");
        values.put(KEY_LATIN_YASIN, "Waja'alnaa fiihaa jannatin min nakhiilin wa a'nabin wa fajjarnaa fiihaa minal'uyuuni");
        values.put(KEY_ARTI_YASIN, "Dan Kami jadikan padanya kebun-kebun kurma dan anggur dan Kami pancarkan padanya beberapa mata air,");
        db.insert(TABLE_YASIN, null, values);
        //35
        values.put(KEY_ARAB_YASIN, "لِيَأْكُلُوا۟ مِن ثَمَرِهِۦ وَمَا عَمِلَتْهُ أَيْدِيهِمْ ۖ أَفَلَا يَشْكُرُونَ ﴿٣٥﴾");
        values.put(KEY_LATIN_YASIN, "Liya'kuluu min tsamarihi wa maa 'amilat-hu aidiihim afalaa yasykuruuna");
        values.put(KEY_ARTI_YASIN, "supaya mereka dapat makan dari buahnya, dan dari apa yang diusahakan oleh tangan mereka. Maka mengapakah mereka tidak bersyukur?");
        db.insert(TABLE_YASIN, null, values);
        //36
        values.put(KEY_ARAB_YASIN, "سُبْحَـٰنَ ٱلَّذِى خَلَقَ ٱلْأَزْوَ\u200Cٰجَ كُلَّهَا مِمَّا تُنۢبِتُ ٱلْأَرْضُ وَمِنْ أَنفُسِهِمْ وَمِمَّا لَا يَعْلَمُونَ ﴿٣٦﴾");
        values.put(KEY_LATIN_YASIN, "Subhaanalladzi khalaqal-azwaaja kullahaa mimmaa tunbitul-ardhu wa min anfusihim wa mimmaa laa ya'lamuuna");
        values.put(KEY_ARTI_YASIN, "Maha Suci Tuhan yang telah menciptakan pasangan-pasangan semuanya, baik dari apa yang ditumbuhkan oleh bumi dan dari diri mereka maupun dari apa yang tidak mereka ketahui.");
        db.insert(TABLE_YASIN, null, values);
        //37
        values.put(KEY_ARAB_YASIN, "وَءَايَةٌۭ لَّهُمُ ٱلَّيْلُ نَسْلَخُ مِنْهُ ٱلنَّهَارَ فَإِذَا هُم مُّظْلِمُونَ ﴿٣٧﴾");
        values.put(KEY_LATIN_YASIN, "Wa aayatun lahumul lailu naslakhu minhun nahaara fa idzaahum muzhlimuuna");
        values.put(KEY_ARTI_YASIN, "\"Dan suatu tanda (kekuasaan Allah yang besar) bagi mereka adalah malam; Kami tanggalkan siang dari malam itu, maka dengan serta merta mereka berada dalam kegelapan,\"");
        db.insert(TABLE_YASIN, null, values);
        //38
        values.put(KEY_ARAB_YASIN, "وَٱلشَّمْسُ تَجْرِى لِمُسْتَقَرٍّۢ لَّهَا ۚ ذَ\u200Cٰلِكَ تَقْدِيرُ ٱلْعَزِيزِ ٱلْعَلِيمِ ﴿٣٨﴾");
        values.put(KEY_LATIN_YASIN, "Wasy-syamsu tajrii limustaqarrin lahaa dzaalika taqdiirul 'aziizil 'aliimi");
        values.put(KEY_ARTI_YASIN, "dan matahari berjalan di tempat peredarannya. Demikianlah ketetapan Yang Maha Perkasa lagi Maha Mengetahui.");
        db.insert(TABLE_YASIN, null, values);
        //39
        values.put(KEY_ARAB_YASIN, "وَٱلْقَمَرَ قَدَّرْنَـٰهُ مَنَازِلَ حَتَّىٰ عَادَ كَٱلْعُرْجُونِ ٱلْقَدِيمِ ﴿٣٩﴾");
        values.put(KEY_LATIN_YASIN, "Walqamara qaddarnaahu manaazila hatta 'aada kal urjuunil qadiimi");
        values.put(KEY_ARTI_YASIN, "Dan telah Kami tetapkan bagi bulan manzilah-manzilah, sehingga (setelah dia sampai ke manzilah yang terakhir) kembalilah dia sebagai bentuk tandan yang tua.");
        db.insert(TABLE_YASIN, null, values);
        //40
        values.put(KEY_ARAB_YASIN, "لَا ٱلشَّمْسُ يَنۢبَغِى لَهَآ أَن تُدْرِكَ ٱلْقَمَرَ وَلَا ٱلَّيْلُ سَابِقُ ٱلنَّهَارِ ۚ وَكُلٌّۭ فِى فَلَكٍۢ يَسْبَحُونَ ﴿٤٠﴾");
        values.put(KEY_LATIN_YASIN, "Lasy-syamsu yan baghii lahaa an tudrikal qamara wa lallailu saabiqun-nahar, wa kullun fi falakin yashbahuuna");
        values.put(KEY_ARTI_YASIN, "Tidaklah mungkin bagi matahari mendapatkan bulan dan malam pun tidak dapat mendahului siang. Dan masing-masing beredar pada garis edarnya.");
        db.insert(TABLE_YASIN, null, values);
        //41
        values.put(KEY_ARAB_YASIN, "وَءَايَةٌۭ لَّهُمْ أَنَّا حَمَلْنَا ذُرِّيَّتَهُمْ فِى ٱلْفُلْكِ ٱلْمَشْحُونِ ﴿٤١﴾");
        values.put(KEY_LATIN_YASIN, "Wa aayatun lahum annaa hamalnaa dzurriyyatahum filfulkil masyhuuni");
        values.put(KEY_ARTI_YASIN, "Dan suatu tanda (kebesaran Allah yang besar) bagi mereka adalah bahwa Kami angkut keturunan mereka dalam bahtera yang penuh muatan,");
        db.insert(TABLE_YASIN, null, values);
        //42
        values.put(KEY_ARAB_YASIN, "وَخَلَقْنَا لَهُم مِّن مِّثْلِهِۦ مَا يَرْكَبُونَ ﴿٤٢﴾");
        values.put(KEY_LATIN_YASIN, "Wa khalaqnaa lahum mim mitslihii maa yarkabuuna");
        values.put(KEY_ARTI_YASIN, "dan Kami ciptakan untuk mereka yang akan mereka kendarai seperti bahtera itu.");
        db.insert(TABLE_YASIN, null, values);
        //43
        values.put(KEY_ARAB_YASIN, "وَإِن نَّشَأْ نُغْرِقْهُمْ فَلَا صَرِيخَ لَهُمْ وَلَا هُمْ يُنقَذُونَ ﴿٤٣﴾");
        values.put(KEY_LATIN_YASIN, "Wa in nasya' nughriqhum falaa shariikha lahum wa laahum yunqadzuuna");
        values.put(KEY_ARTI_YASIN, "Dan jika Kami menghendaki niscaya Kami tenggelamkan mereka, maka tiadalah bagi mereka penolong dan tidak pula mereka diselamatkan.");
        db.insert(TABLE_YASIN, null, values);
        //44
        values.put(KEY_ARAB_YASIN, "إِلَّا رَحْمَةًۭ مِّنَّا وَمَتَـٰعًا إِلَىٰ حِينٍۢ ﴿٤٤﴾");
        values.put(KEY_LATIN_YASIN, "Illa rahmatan minnaa wa mataa'an ilaa-hiinin");
        values.put(KEY_ARTI_YASIN, "Tetapi (Kami selamatkan mereka) karena rahmat yang besar dari Kami dan untuk memberikan kesenangan hidup sampai kepada suatu ketika.");
        db.insert(TABLE_YASIN, null, values);
        //45
        values.put(KEY_ARAB_YASIN, "وَإِذَا قِيلَ لَهُمُ ٱتَّقُوا۟ مَا بَيْنَ أَيْدِيكُمْ وَمَا خَلْفَكُمْ لَعَلَّكُمْ تُرْحَمُونَ ﴿٤٥﴾");
        values.put(KEY_LATIN_YASIN, "Wa idzaa qiila lahumuttaquu maa baina aidiikum wa maa khalfakum la'allakum turhamuuna");
        values.put(KEY_ARTI_YASIN, "\"Dan apabila dikatakan kepada mereka: \"\"Takutlah kamu akan siksa yang di hadapanmu dan siksa yang akan datang supaya kamu mendapat rahmat\"\", (niscaya mereka berpaling).\"");
        db.insert(TABLE_YASIN, null, values);
        //46
        values.put(KEY_ARAB_YASIN, "وَمَا تَأْتِيهِم مِّنْ ءَايَةٍۢ مِّنْ ءَايَـٰتِ رَبِّهِمْ إِلَّا كَانُوا۟ عَنْهَا مُعْرِضِينَ ﴿٤٦﴾");
        values.put(KEY_LATIN_YASIN, "Wa maa ta'tiihim min aayatin min aayaati rabbihim illa kaanuu 'anha mu'ridhiina");
        values.put(KEY_ARTI_YASIN, "Dan sekali-kali tiada datang kepada mereka suatu tanda dari tanda-tanda kekuasaan Tuhan mereka, melainkan mereka selalu berpaling daripadanya.");
        db.insert(TABLE_YASIN, null, values);
        //47
        values.put(KEY_ARAB_YASIN, "وَإِذَا قِيلَ لَهُمْ أَنفِقُوا۟ مِمَّا رَزَقَكُمُ ٱللَّهُ قَالَ ٱلَّذِينَ كَفَرُوا۟ لِلَّذِينَ ءَامَنُوٓا۟ أَنُطْعِمُ مَن لَّوْ يَشَآءُ ٱللَّهُ أَطْعَمَهُۥٓ إِنْ أَنتُمْ إِلَّا فِى ضَلَـٰلٍۢ مُّبِينٍۢ ﴿٤٧﴾");
        values.put(KEY_LATIN_YASIN, "Wa idzaa qiila lahum anfiqu mimma razaqakumullahu qaalal-ladziina kafaruu lil ladziina aamanuu anuth'imu mal lau ya-sya'ullahu ath'amahu, in antum illa fii dhalaalim mubiinin");
        values.put(KEY_ARTI_YASIN, "\"Dan apabila dikatakan kepada mereka: \"\"Nafkahkanlah sebahagian dari rezeki yang diberikan Allah kepadamu\"\", maka orang-orang yang kafir itu berkata kepada orang-orang yang beriman: \"\"Apakah kami akan memberi makan kepada orang-orang yang jika Allah menghendaki tentulah Dia akan memberinya makan, tiadalah kamu melainkan dalam kesesatan yang nyata\"\".\"");
        db.insert(TABLE_YASIN, null, values);
        //48
        values.put(KEY_ARAB_YASIN, "وَيَقُولُونَ مَتَىٰ هَـٰذَا ٱلْوَعْدُ إِن كُنتُمْ صَـٰدِقِينَ ﴿٤٨﴾");
        values.put(KEY_LATIN_YASIN, "Wa yaquuluuna mataa haadzal wa'du in kuntum shaadiqiina");
        values.put(KEY_ARTI_YASIN, "\"Dan mereka berkata: \"\"Bilakah (terjadinya) janji ini (hari berbangkit) jika kamu adalah orang-orang yang benar?\"\"\"");
        db.insert(TABLE_YASIN, null, values);
        //49
        values.put(KEY_ARAB_YASIN, "مَا يَنظُرُونَ إِلَّا صَيْحَةًۭ وَ\u200Cٰحِدَةًۭ تَأْخُذُهُمْ وَهُمْ يَخِصِّمُونَ ﴿٤٩﴾");
        values.put(KEY_LATIN_YASIN, "Maa yanzhuruuna ilala shaihatan waahidatan ta'khudzuhum wahum yakhis simuuna");
        values.put(KEY_ARTI_YASIN, "Mereka tidak menunggu melainkan satu teriakan saja yang akan membinasakan mereka ketika mereka sedang bertengkar.");
        db.insert(TABLE_YASIN, null, values);
        //50
        values.put(KEY_ARAB_YASIN, "فَلَا يَسْتَطِيعُونَ تَوْصِيَةًۭ وَلَآ إِلَىٰٓ أَهْلِهِمْ يَرْجِعُونَ ﴿٥٠﴾");
        values.put(KEY_LATIN_YASIN, "Falaa yastathii'uuna taushiyatan wa laa ilaa ahlihim yarji'uuna");
        values.put(KEY_ARTI_YASIN, "Lalu mereka tidak kuasa membuat suatu wasiat pun dan tidak (pula) dapat kembali kepada keluarganya.");
        db.insert(TABLE_YASIN, null, values);
        //51
        values.put(KEY_ARAB_YASIN, "وَنُفِخَ فِى ٱلصُّورِ فَإِذَا هُم مِّنَ ٱلْأَجْدَاثِ إِلَىٰ رَبِّهِمْ يَنسِلُونَ ﴿٥١﴾");
        values.put(KEY_LATIN_YASIN, "Wa nufikha fish'shuuri fa idzaa hum minal-ajdaatsi ilaa rabbihim yansiluuna");
        values.put(KEY_ARTI_YASIN, "Dan ditiuplah sangkakala, maka tiba-tiba mereka ke luar dengan segera dari kuburnya (menuju) kepada Tuhan mereka.");
        db.insert(TABLE_YASIN, null, values);
        //52
        values.put(KEY_ARAB_YASIN, "قَالُوا۟ يَـٰوَيْلَنَا مَنۢ بَعَثَنَا مِن مَّرْقَدِنَا ۜ ۗ هَـٰذَا مَا وَعَدَ ٱلرَّحْمَـٰنُ وَصَدَقَ ٱلْمُرْسَلُونَ ﴿٥٢﴾");
        values.put(KEY_LATIN_YASIN, "Qaaluu ya wailanaa man ba'a tsanaa min marqadinaa haadzsa maa wa'adar-rahmaanu wa shadaqal mursaluuna");
        values.put(KEY_ARTI_YASIN, "\"Mereka berkata: \"\"Aduh celakalah kami! Siapakah yang membangkitkan kami dari tempat tidur kami (kubur)?\"\" Inilah yang dijanjikan (Tuhan) Yang Maha Pemurah dan benarlah Rasul-rasul (Nya).\"");
        db.insert(TABLE_YASIN, null, values);
        //53
        values.put(KEY_ARAB_YASIN, "إِن كَانَتْ إِلَّا صَيْحَةًۭ وَ\u200Cٰحِدَةًۭ فَإِذَا هُمْ جَمِيعٌۭ لَّدَيْنَا مُحْضَرُونَ ﴿٥٣﴾");
        values.put(KEY_LATIN_YASIN, "In kaanat illaa shaihatan waahidatan fa idzaa hum jamii'un ladainaa muhdharuuna");
        values.put(KEY_ARTI_YASIN, "Tidak adalah teriakan itu selain sekali teriakan saja, maka tiba-tiba mereka semua dikumpulkan kepada Kami.");
        db.insert(TABLE_YASIN, null, values);
        //54
        values.put(KEY_ARAB_YASIN, "فَٱلْيَوْمَ لَا تُظْلَمُ نَفْسٌۭ شَيْـًۭٔا وَلَا تُجْزَوْنَ إِلَّا مَا كُنتُمْ تَعْمَلُونَ ﴿٥٤﴾");
        values.put(KEY_LATIN_YASIN, "Falyauma laa tuzhlamu nafsun syai'an wa laa tujzauna illaa maa kuntum ta'maluuna");
        values.put(KEY_ARTI_YASIN, "Maka pada hari itu seseorang tidak akan dirugikan sedikit pun dan kamu tidak dibalasi, kecuali dengan apa yang telah kamu kerjakan.");
        db.insert(TABLE_YASIN, null, values);
        //55
        values.put(KEY_ARAB_YASIN, "إِنَّ أَصْحَـٰبَ ٱلْجَنَّةِ ٱلْيَوْمَ فِى شُغُلٍۢ فَـٰكِهُونَ ﴿٥٥﴾");
        values.put(KEY_LATIN_YASIN, "Inna ash-haabal jannatil yauma fii syughulin faakihuuna");
        values.put(KEY_ARTI_YASIN, "Sesungguhnya penghuni surga pada hari itu bersenang-senang dalam kesibukan (mereka).");
        db.insert(TABLE_YASIN, null, values);
        //56
        values.put(KEY_ARAB_YASIN, "هُمْ وَأَزْوَ\u200Cٰجُهُمْ فِى ظِلَـٰلٍ عَلَى ٱلْأَرَآئِكِ مُتَّكِـُٔونَ ﴿٥٦﴾");
        values.put(KEY_LATIN_YASIN, "Hum wa azwaajuhum fi dzilaa lin 'alal araa'iki muttaki'uuna");
        values.put(KEY_ARTI_YASIN, "Mereka dan istri-istri mereka berada dalam tempat yang teduh, bertelekan di atas dipan-dipan.");
        db.insert(TABLE_YASIN, null, values);
        //57
        values.put(KEY_ARAB_YASIN, "لَهُمْ فِيهَا فَـٰكِهَةٌۭ وَلَهُم مَّا يَدَّعُونَ ﴿٥٧﴾");
        values.put(KEY_LATIN_YASIN, "Lahum fiiha faakihatun wa lahum maa yadda'uuna");
        values.put(KEY_ARTI_YASIN, "Di surga itu mereka memperoleh buah-buahan dan memperoleh apa yang mereka minta.");
        db.insert(TABLE_YASIN, null, values);
        //58
        values.put(KEY_ARAB_YASIN, "سَلَـٰمٌۭ قَوْلًۭا مِّن رَّبٍّۢ رَّحِيمٍۢ ﴿٥٨﴾");
        values.put(KEY_LATIN_YASIN, "Salaamun qaulan min rabbir rahiimi");
        values.put(KEY_ARTI_YASIN, "\"(Kepada mereka dikatakan): \"\"Salam\"\", sebagai ucapan selamat dari Tuhan Yang Maha Penyayang.\"");
        db.insert(TABLE_YASIN, null, values);
        //59
        values.put(KEY_ARAB_YASIN, "وَٱمْتَـٰزُوا۟ ٱلْيَوْمَ أَيُّهَا ٱلْمُجْرِمُونَ ﴿٥٩﴾");
        values.put(KEY_LATIN_YASIN, "Wamtazul yauma ayyuhal mujrimuuna");
        values.put(KEY_ARTI_YASIN, "\"Dan (dikatakan kepada orang-orang kafir): \"\"Berpisahlah kamu (dari orang-orang mukmin) pada hari ini, hai orang-orang yang berbuat jahat.\"");
        db.insert(TABLE_YASIN, null, values);
        //60
        values.put(KEY_ARAB_YASIN, "أَلَمْ أَعْهَدْ إِلَيْكُمْ يَـٰبَنِىٓ ءَادَمَ أَن لَّا تَعْبُدُوا۟ ٱلشَّيْطَـٰنَ ۖ إِنَّهُۥ لَكُمْ عَدُوٌّۭ مُّبِينٌۭ");
        values.put(KEY_LATIN_YASIN, "Alam a'had ilaikum yaabanii aadama anla ta'budusy syaitaana innahuu lakum 'aduwwun mubiinun");
        values.put(KEY_ARTI_YASIN, "\"Bukankah Aku telah memerintahkan kepadamu hai Bani Adam supaya kamu tidak menyembah setan? Sesungguhnya setan itu adalah musuh yang nyata bagi kamu\"\",\"");
        db.insert(TABLE_YASIN, null, values);
        //61
        values.put(KEY_ARAB_YASIN, "وَأَنِ ٱعْبُدُونِى ۚ هَـٰذَا صِرَ\u200Cٰطٌۭ مُّسْتَقِيمٌۭ");
        values.put(KEY_LATIN_YASIN, "Wa ani' buduunii haadzaa shiraathun mustaqiimun");
        values.put(KEY_ARTI_YASIN, "dan hendaklah kamu menyembah-Ku. Inilah jalan yang lurus.");
        db.insert(TABLE_YASIN, null, values);
        //62
        values.put(KEY_ARAB_YASIN, "وَلَقَدْ أَضَلَّ مِنكُمْ جِبِلًّۭا كَثِيرًا ۖ أَفَلَمْ تَكُونُوا۟ تَعْقِلُونَ ﴿٦٢﴾");
        values.put(KEY_LATIN_YASIN, "Wa laqad adhalla minkum jibillan katsiran afalam takuunuu ta'qiluuna");
        values.put(KEY_ARTI_YASIN, "Sesungguhnya setan itu telah menyesatkan sebahagian besar di antaramu. Maka apakah kamu tidak memikirkan?");
        db.insert(TABLE_YASIN, null, values);
        //63
        values.put(KEY_ARAB_YASIN, "هَـٰذِهِۦ جَهَنَّمُ ٱلَّتِى كُنتُمْ تُوعَدُونَ ﴿٦٣﴾");
        values.put(KEY_LATIN_YASIN, "Haadzihii jahannamul-latii kuntum tuu'aduuna");
        values.put(KEY_ARTI_YASIN, "Inilah Jahanam yang dahulu kamu diancam (dengannya).");
        db.insert(TABLE_YASIN, null, values);
        //64
        values.put(KEY_ARAB_YASIN, "ٱصْلَوْهَا ٱلْيَوْمَ بِمَا كُنتُمْ تَكْفُرُونَ ﴿٦٤﴾");
        values.put(KEY_LATIN_YASIN, "Ishlauhal yauma bimaa kuntum takfuruuna");
        values.put(KEY_ARTI_YASIN, "Masuklah ke dalamnya pada hari ini disebabkan kamu dahulu mengingkarinya.");
        db.insert(TABLE_YASIN, null, values);
        //65
        values.put(KEY_ARAB_YASIN, "ٱلْيَوْمَ نَخْتِمُ عَلَىٰٓ أَفْوَ\u200Cٰهِهِمْ وَتُكَلِّمُنَآ أَيْدِيهِمْ وَتَشْهَدُ أَرْجُلُهُم بِمَا كَانُوا۟ يَكْسِبُونَ ﴿٦٥﴾");
        values.put(KEY_LATIN_YASIN, "Alyauma nakhtimu 'ala afwaa hihim wa tukallimunaa aidihim wa tasyhadu arjuluhum bimaa kaanuu yaksibuuna");
        values.put(KEY_ARTI_YASIN, "\"Pada hari ini Kami tutup mulut mereka; dan berkatalah kepada Kami tangan mereka dan memberi kesaksianlah kaki mereka terhadap apa yang dahulu mereka usahakan.\"");
        db.insert(TABLE_YASIN, null, values);
        //66
        values.put(KEY_ARAB_YASIN, "وَلَوْ نَشَآءُ لَطَمَسْنَا عَلَىٰٓ أَعْيُنِهِمْ فَٱسْتَبَقُوا۟ ٱلصِّرَ\u200Cٰطَ فَأَنَّىٰ يُبْصِرُونَ ﴿٦٦﴾");
        values.put(KEY_LATIN_YASIN, "Walau nasyaa'u lathamasnaa 'ala a'yunihim fastabaqush-shiraatha fa-annaa yubshiruuna");
        values.put(KEY_ARTI_YASIN, "\"Dan jikalau Kami menghendaki pastilah Kami hapuskan penglihatan mata mereka; lalu mereka berlomba-lomba (mencari) jalan. Maka betapakah mereka dapat melihat (nya).\"");
        db.insert(TABLE_YASIN, null, values);
        //67
        values.put(KEY_ARAB_YASIN, "وَلَوْ نَشَآءُ لَمَسَخْنَـٰهُمْ عَلَىٰ مَكَانَتِهِمْ فَمَا ٱسْتَطَـٰعُوا۟ مُضِيًّۭا وَلَا يَرْجِعُونَ ﴿٦٧﴾");
        values.put(KEY_LATIN_YASIN, "Wa lau nasyaa'u lamasyakhnaahum 'alaa makaanatihim famastathaa'u mudhiyan walaa yarji'uuna");
        values.put(KEY_ARTI_YASIN, "\"Dan jika Kami menghendaki pastilah Kami rubah mereka di tempat mereka berada; maka mereka tidak sanggup berjalan lagi dan tidak (pula) sanggup kembali.\"");
        db.insert(TABLE_YASIN, null, values);
        //68
        values.put(KEY_ARAB_YASIN, "وَمَن نُّعَمِّرْهُ نُنَكِّسْهُ فِى ٱلْخَلْقِ ۖ أَفَلَا يَعْقِلُونَ ﴿٦٨﴾");
        values.put(KEY_LATIN_YASIN, "Wa man nu-'ammirhu nunak-kishu fil-khalqi afalaa ya'qiluuna");
        values.put(KEY_ARTI_YASIN, "Dan barang siapa yang Kami panjangkan umurnya niscaya Kami kembalikan dia kepada kejadian (nya). Maka apakah mereka tidak memikirkan?");
        db.insert(TABLE_YASIN, null, values);
        //69
        values.put(KEY_ARAB_YASIN, "وَمَا عَلَّمْنَـٰهُ ٱلشِّعْرَ وَمَا يَنۢبَغِى لَهُۥٓ ۚ إِنْ هُوَ إِلَّا ذِكْرٌۭ وَقُرْءَانٌۭ مُّبِينٌۭ ﴿٦٩﴾");
        values.put(KEY_LATIN_YASIN, "Wa maa 'allamnahusy-syi'ra wa maa yanbaghii laahu in huwa ilala dzikrun wa qur'aanun mubiinun");
        values.put(KEY_ARTI_YASIN, "Dan Kami tidak mengajarkan syair kepadanya (Muhammad) dan bersyair itu tidaklah layak baginya. Al Qur'an itu tidak lain hanyalah pelajaran dan kitab yang memberi penerangan,");
        db.insert(TABLE_YASIN, null, values);
        //70
        values.put(KEY_ARAB_YASIN, "لِّيُنذِرَ مَن كَانَ حَيًّۭا وَيَحِقَّ ٱلْقَوْلُ عَلَى ٱلْكَـٰفِرِينَ ﴿٧٠﴾");
        values.put(KEY_LATIN_YASIN, "Liyundzira man kaana hayyan wayahiqqal qaulu 'alal-kaafiriina");
        values.put(KEY_ARTI_YASIN, "supaya dia (Muhammad) memberi peringatan kepada orang-orang yang hidup (hatinya) dan supaya pastilah (ketetapan azab) terhadap orang-orang kafir.");
        db.insert(TABLE_YASIN, null, values);
        //71
        values.put(KEY_ARAB_YASIN, "أَوَلَمْ يَرَوْا۟ أَنَّا خَلَقْنَا لَهُم مِّمَّا عَمِلَتْ أَيْدِينَآ أَنْعَـٰمًۭا فَهُمْ لَهَا مَـٰلِكُونَ ﴿٧١﴾");
        values.put(KEY_LATIN_YASIN, "Awalam yarau annaa khalaqnaa lahum mimmaa 'amilat aidiina an'aaman fahum lahaa maalikuuna");
        values.put(KEY_ARTI_YASIN, "Dan apakah mereka tidak melihat bahwa sesungguhnya Kami telah menciptakan binatang ternak untuk mereka yaitu sebahagian dari apa yang telah Kami ciptakan dengan kekuasaan Kami sendiri, lalu mereka menguasainya?");
        db.insert(TABLE_YASIN, null, values);
        //72
        values.put(KEY_ARAB_YASIN, "وَذَلَّلْنَـٰهَا لَهُمْ فَمِنْهَا رَكُوبُهُمْ وَمِنْهَا يَأْكُلُونَ ﴿٧٢﴾");
        values.put(KEY_LATIN_YASIN, "Wadzallalnaahaa lahum faminhaa rakuubuhum waminhaa ya'kuluuna");
        values.put(KEY_ARTI_YASIN, "Dan Kami tundukkan binatang-binatang itu untuk mereka, maka sebagiannya menjadi tunggangan mereka dan sebagiannya mereka makan.");
        db.insert(TABLE_YASIN, null, values);
        //73
        values.put(KEY_ARAB_YASIN, "وَلَهُمْ فِيهَا مَنَـٰفِعُ وَمَشَارِبُ ۖ أَفَلَا يَشْكُرُونَ ﴿٧٣﴾");
        values.put(KEY_LATIN_YASIN, "Walahum fiihaa manaa fi'u wa masyaaribu afalaa yasykuruuna");
        values.put(KEY_ARTI_YASIN, "Dan mereka memperoleh padanya manfaat-manfaat dan minuman. Maka mengapakah mereka tidak bersyukur?");
        db.insert(TABLE_YASIN, null, values);
        //74
        values.put(KEY_ARAB_YASIN, "وَٱتَّخَذُوا۟ مِن دُونِ ٱللَّهِ ءَالِهَةًۭ لَّعَلَّهُمْ يُنصَرُونَ ﴿٧٤﴾");
        values.put(KEY_LATIN_YASIN, "Wattakhadzuu min duunillahi aalihatan la'allahum yunsharuuna");
        values.put(KEY_ARTI_YASIN, "Mereka mengambil sembahan-sembahan selain Allah agar mereka mendapat pertolongan.");
        db.insert(TABLE_YASIN, null, values);
        //75
        values.put(KEY_ARAB_YASIN, "لَا يَسْتَطِيعُونَ نَصْرَهُمْ وَهُمْ لَهُمْ جُندٌۭ مُّحْضَرُونَ ﴿٧٥﴾");
        values.put(KEY_LATIN_YASIN, "Laa yastathii'uuna nashrahum wahum lahum jundun muhdharuuna");
        values.put(KEY_ARTI_YASIN, "\"Berhala-berhala itu tiada dapat menolong mereka; padahal berhala-berhala itu menjadi tentara yang disiapkan untuk menjaga mereka.\"");
        db.insert(TABLE_YASIN, null, values);
        //76
        values.put(KEY_ARAB_YASIN, "فَلَا يَحْزُنكَ قَوْلُهُمْ ۘ إِنَّا نَعْلَمُ مَا يُسِرُّونَ وَمَا يُعْلِنُونَ ﴿٧٦﴾");
        values.put(KEY_LATIN_YASIN, "Falaa yahzunka qauluhum inna na'lamu maa yusirruuna wa maa yu'linuuna");
        values.put(KEY_ARTI_YASIN, "Maka janganlah ucapan mereka menyedihkan kamu. Sesungguhnya Kami mengetahui apa yang mereka rahasiakan dan apa yang mereka nyatakan.");
        db.insert(TABLE_YASIN, null, values);
        //77
        values.put(KEY_ARAB_YASIN, "أَوَلَمْ يَرَ ٱلْإِنسَـٰنُ أَنَّا خَلَقْنَـٰهُ مِن نُّطْفَةٍۢ فَإِذَا هُوَ خَصِيمٌۭ مُّبِينٌۭ ﴿٧٧﴾");
        values.put(KEY_LATIN_YASIN, "A wa lam yaral-insanu anna khalaqnahu min nutfatin fa iza huwa khasimum mubin");
        values.put(KEY_ARTI_YASIN, "Dan apakah manusia tidak memperhatikan bahwa Kami menciptakannya dari setitik air (mani), maka tiba-tiba ia menjadi penantang yang nyata!");
        db.insert(TABLE_YASIN, null, values);
        //78
        values.put(KEY_ARAB_YASIN, "وَضَرَبَ لَنَا مَثَلًۭا وَنَسِىَ خَلْقَهُۥ ۖ قَالَ مَن يُحْىِ ٱلْعِظَـٰمَ وَهِىَ رَمِيمٌۭ ﴿٧٨﴾");
        values.put(KEY_LATIN_YASIN, "Wa daraba lana masalaw wa nasiya khalqah qala may yuhyil-izama wa hiya ramim");
        values.put(KEY_ARTI_YASIN, "\"Dan dia membuat perumpamaan bagi Kami; dan dia lupa kepada kejadiannya; ia berkata: \"\"Siapakah yang dapat menghidupkan tulang belulang, yang telah hancur luluh?\"\"\"");
        db.insert(TABLE_YASIN, null, values);
        //79
        values.put(KEY_ARAB_YASIN, "قُلْ يُحْيِيهَا ٱلَّذِىٓ أَنشَأَهَآ أَوَّلَ مَرَّةٍۢ ۖ وَهُوَ بِكُلِّ خَلْقٍ عَلِيمٌ ﴿٧٩﴾");
        values.put(KEY_LATIN_YASIN, "Qul yuhyiihal ladzi ansya'ahaa aw-wala marratin wahuwa bikulli khalqin 'aliimun");
        values.put(KEY_ARTI_YASIN, "\"Katakanlah: \"\"Ia akan dihidupkan oleh Tuhan yang menciptakannya kali yang pertama. Dan Dia Maha Mengetahui tentang segala makhluk,\"");
        db.insert(TABLE_YASIN, null, values);
        //80
        values.put(KEY_ARAB_YASIN, "ٱلَّذِى جَعَلَ لَكُم مِّنَ ٱلشَّجَرِ ٱلْأَخْضَرِ نَارًۭا فَإِذَآ أَنتُم مِّنْهُ تُوقِدُونَ ﴿٨٠﴾");
        values.put(KEY_LATIN_YASIN, "Alladzii ja'ala lakum minasy syajaril akhdari naaran fa idza antum minhu tuuqiduuna");
        values.put(KEY_ARTI_YASIN, "\"yaitu Tuhan yang menjadikan untukmu api dari kayu yang hijau, maka tiba-tiba kamu nyalakan (api) dari kayu itu.\"\"\"");
        db.insert(TABLE_YASIN, null, values);
        //81
        values.put(KEY_ARAB_YASIN, "أَوَلَيْسَ ٱلَّذِى خَلَقَ ٱلسَّمَـٰوَ\u200Cٰتِ وَٱلْأَرْضَ بِقَـٰدِرٍ عَلَىٰٓ أَن يَخْلُقَ مِثْلَهُم ۚ بَلَىٰ وَهُوَ ٱلْخَلَّـٰقُ ٱلْعَلِيمُ ﴿٨١﴾");
        values.put(KEY_LATIN_YASIN, "Awalaisal-ladzii khalaqas samaawaati wal ardha biqaadirin 'ala an-yakhluqa mitslahum balaa wahuwal khallaqul-'aliimu");
        values.put(KEY_ARTI_YASIN, "Dan tidakkah Tuhan yang menciptakan langit dan bumi itu berkuasa menciptakan kembali jasad-jasad mereka yang sudah hancur itu? Benar, Dia berkuasa. Dan Dialah Maha Pencipta lagi Maha Mengetahui.");
        db.insert(TABLE_YASIN, null, values);
        //82
        values.put(KEY_ARAB_YASIN, "إِنَّمَآ أَمْرُهُۥٓ إِذَآ أَرَادَ شَيْـًٔا أَن يَقُولَ لَهُۥ كُن فَيَكُونُ ﴿٨٢﴾");
        values.put(KEY_LATIN_YASIN, "Innamaa amruhuu idzaa araada syai-an an yaquula lahuu kun fayakuunu");
        values.put(KEY_ARTI_YASIN, "\"Sesungguhnya perintah-Nya apabila Dia menghendaki sesuatu hanyalah berkata kepadanya: \"\"Jadilah!\"\" maka terjadilah ia.\"");
        db.insert(TABLE_YASIN, null, values);
        //83
        values.put(KEY_ARAB_YASIN, "فَسُبْحَـٰنَ ٱلَّذِى بِيَدِهِۦ مَلَكُوتُ كُلِّ شَىْءٍۢ وَإِلَيْهِ تُرْجَعُونَ ﴿٨٣ ﴾");
        values.put(KEY_LATIN_YASIN, "Fasubhaanal ladzhii biyadihii malakuutu kulli syai'in wa ilaihi turja'uuna");
        values.put(KEY_ARTI_YASIN, "Maka Maha Suci (Allah) yang di tangan-Nya kekuasaan atas segala sesuatu dan kepada-Nya lah kamu dikembalikan.");
        db.insert(TABLE_YASIN, null, values);

        //Ayat Kursi
        values.put(KEY_ARAB_KURSI, "ٱللَّهُ لَآ إِلَٰهَ إِلَّا هُوَ ٱلْحَىُّ ٱلْقَيُّومُ ۚ لَا تَأْخُذُهُۥ سِنَةٌ وَلَا نَوْمٌ ۚ لَّهُۥ مَا فِى ٱلسَّمَٰوَٰتِ وَمَا فِى ٱلْأَرْضِ ۗ مَن ذَا ٱلَّذِى يَشْفَعُ عِندَهُۥٓ إِلَّا بِإِذْنِهِۦ ۚ يَعْلَمُ مَا بَيْنَ أَيْدِيهِمْ وَمَا خَلْفَهُمْ ۖ وَلَا يُحِيطُونَ بِشَىْءٍ مِّنْ عِلْمِهِۦٓ إِلَّا بِمَا شَآءَ ۚ وَسِعَ كُرْسِيُّهُ ٱلسَّمَٰوَٰتِ وَٱلْأَرْضَ ۖ وَلَا يَـُٔودُهُۥ حِفْظُهُمَا ۚ وَهُوَ ٱلْعَلِىُّ ٱلْعَظِيمُ");
        values.put(KEY_LATIN_KURSI, "Allaahu laa ilaaha illaa huwal hayyul qayyuum, laa ta-khudzuhuu sinatuw walaa nauum, lahuu maa fissamaawaati wamaa fil ardhi, man dzalladzii yasyfa'u 'indahuu illaa bi idznih, ya'lamu maa baina aydiihim wamaa khalfahum, walaa yuhiithuuna bisyai-inm min 'ilmihii ilaa bimaa syaa, wasi'a kursiyyuhus samaawaati wal ardhi, walaa ya-uuduhuu hifzhuhumaa, wahuwal 'aliyyul azhiim");
        values.put(KEY_ARTI_KURSI, "Allah tidak ada Tuhan melainkan Dia yang Maha Kekal lagi terus menerus mengurus makhlukNya, tidak mengantuk dan tidak tidur KepunyaanNya apa yang di langit dan di bumi. Siapakah yang dapat memberi syafa'at di sisi Allah tanpa izinNya? Allah mengetahui apa-apa yang di hadapan mereka dan di belakang meraka, dan mereka tidak mengetahui apa-apa dari ilmu Allah melainkan apa yang dikehendakiNya. Kursi Allah meliputi langit dan bumi, Dan Allah tidak merasa berat memelihara keduanya, dan Allah Maha Tinggi lagi Maha Besar.");
        db.insert(TABLE_KURSI, null, values);

        //Tahlil
        //1
        values.put(KEY_ARAB_TAHLIL, "اَعُوْذُبِاللهِ مِنَ الشَّيْطَانِ الرَّجِيْمِ بِسْمِ اللهِ الرَّحْمنِ الرَّحِيْمِ اَلْحَمْدُ ِللهِ رَبِّ الْعَالَمِيْنَ. حَمْدَ الشَّاكِرِيْنَ، حَمْدَالنَّاعِمِيْنَ، حَمْدًايُوَافِيْ نِعَمَه وَيُكَافِئُ مَزِيْدَه، يَارَبَّنَالَكَ الْحَمْدُ كَمَا يَنْبَغِيْ لِجَلاَلِ وَجْهِكَ وَعَظِيْمِ سُلْطَانِكَ. اَللهُمَّ صَلِّ وَسَلِّمْ عَلى سَيِّدِنَا مُحَمَّدٍ وَعَلى الِى سَيِّدِنَا مُحَمَّدٍ");
        values.put(KEY_LATIN_TAHLIL, "A'uudzu billahi minasy yaithonir radziim.Bismillaahir rahmaanirrahiim.Alhamdu lillaahi rabbil'aalamiin. Hamdasy syaakiriin, hamdan naa'imiin, hamday yuwaafii ni'amahuu wa yukaafi'u mazzidah, yaa rabbanaa lakalhamdu kamaa yan baghii lijalaali waj-hika wa 'azhiimi sulthonik. Allahumma shalli wa shallim 'alaa sayyidinaa muhammad, wa'alaa aali sayiidinaa muhammad.");
        values.put(KEY_ARTI_TAHLIL, "Aku berlindung kepada Allah dari godaan setan yang terkutuk Dengan menyebut nama Allah Yang Maha Pengasih lagi Maha Penyayang. Segala puji bagi Allah penguasa alam semesta, sebagaimana orang-orang yang bersyukur dan orang-orang yang mendapat banyak kenikmatan memuji-Nya. dengan pujian yang sepadan dan nikmat-Nya dan memungkinkan pertambahannya. Wahai Tuhan kami, pujian hanyalah untuk-Mu, sebagaimana yang layak akan kemuliaan Dzat-Mu dan keagungan kekuasaan-Mu. Ya Allah, limpahkanlah kesejahteraan dan keselamatan kepada Nabi Muhammad junjungan kami dan kepada keluarga beliau.");
        db.insert(TABLE_TAHLIL, null, values);
        //2
        values.put(KEY_ARAB_TAHLIL, "اَللهُمَّ تَقَبَّلْ وَاَوْصِلْ ثَوَابَ مَاقَرَأْنَاهُ مِنَ الْقُرْآنِ الْعَظِيْمِ وَمَا هَلَّلْنَا وَمَا سَبَّحْنَا وَمَااسْتَغْفَرْنَا وَمَا صَلَّيْنَا عَلى سَيِّدِنَا مُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ هَدِيَّةً وَاصِلَةً وَرَحْمَةً نَازِلَةً وَبَرَكَةً شَامِلَةً اِلَى حَضْرَةِ حَبِيْبِنَا وَشَفِيْعِنَا وَقُرَّةِ اَعْيُنِنَا سَيِّدِنَا وَمَوْلنَا مُحَمَّدٍ صَلَّى اللهُ عَلَيْهِ وَسَلَّمَ وَاِلَى جَمِيْعِ اِخْوَانِه مِنَ الْاَنْبِيَآءِ وَالْمُرْسَلِيْنَ وَالْاَوْلِيَآءِ وَالشُّهَدَآءِ وَالصَّالِحِيْنَ وَالصَّحَابَةِ وَالتَّابِعِيْنَ وَالْعُلَمَآءِ الْعَالِمِيْنَ وَالْمُصَنِّفِيْنَ الْمُخْلِصِيْنَ وَجَمِيْعِ الْمُجَاهِدِيْنَ فِى سَبِيْلِ اللهِ رَبِّ الْعَالَمِيْنَ وَالْمَلاَئِكَةِ الْمُقَرَّبِيْنَ خُصُوْصًا اِلَى سَيِّدِنَا الشَّيْخِ عَبْدِ الْقَادِرِ الْجَيْلاَنِيِّ");
        values.put(KEY_LATIN_TAHLIL, "Allaahumma taqobbal wa aushil tsawaba maa qoro'naahu minal qur'aanil 'azhiimi wamaa hallalnaa wa maa sabbahnaa wa mastaghfarnaa wa maa shollainaa 'alaa sayyidinaa muhammadin shollalloohu 'alaihi wa sallama hadiyyatan waashilatan wa rohmatan naazilatan wa barokatan syaamilatan ilaa hadhrotin habiibinaa wa syafii'inaa wa qurroti a'yuninaa sayyidinaa wa maulaanaa muhammadin shollallaahu 'alaihi wa sallam, wa ilaa jamii'i ikhwaanihii minal anbiyaa'i walmursaliina wal auliyaa'i wasy-syuhadaa'i wash-shoolihiina wash shohaabati wattaabi'iina wal 'ulamaa'il 'aamiliina wal mushonnifiinal mukhlishiina wa jamii'il mujaahidiina fii sabiilillaahi robbil'aalamiin, wa malaa'ikatil muqorrobiin, khushuushon ilaa sayyidinasy syaikh 'abdil qoodir aljailaani,");
        values.put(KEY_ARTI_TAHLIL, "Ya Allah, terimalah dan sampaikanlah pahala Al-Qur'an yang kami baca, tahlil kami, tasbih kami, istighfar kami dan shalawat kami kepada Nabi Muhammad SAW sebagai hadiah yang menjadi penyambung, sebagai rahmat yang turun dan sebagai berkah yang menyebar kepada kekasih kami, penolong kami dan buah hati kami, pemuka dan pemimpin kami, yaitu Nabi Muhammad SAW, juga kepada seluruh kawan-kawan beliau dari kalangan para Nabi dan Rasul, para wali, para syuhada', orang-orang shalih, para sahabat, para tabi'in, para ulama yang mengamalkan ilmunya, para pengarang yang ikhlas dan orang-orang yang berjihad di jalan Allah Tuhan semesta alam, serta para malaikat yang selalu beribadah, khususnya ditujukan kepada Syekh Abdul Qadir Jailani.");
        db.insert(TABLE_TAHLIL, null, values);
        //3
        values.put(KEY_ARAB_TAHLIL, "ثُمَّ اِلى جَمِيْعِ اَهْلِ الْقُبُوْرِ مِنَ الْمُسْلِمِيْنَ وَالْمُسْلِمَاتِ وَالْمُؤْمِنِيْنَ وَالْمُؤْمِنَاتِ مِنْ مَشَارِقِ اْلاَرْضِ اِلَى مَغَارِبِهَا بَرِّهَا وَبَحْرِهَا خُصُوْصًا اِلَى آبَآءِنَا وَاُمَّهَاتِنَا وَاَجْدَادِنَا وَجَدَّاتِنَا وَنَخُصُّ خُصُوْصًا مَنِ اجْتَمَعْنَاههُنَا بِسَبَبِه وَلِاَجْلِه");
        values.put(KEY_LATIN_TAHLIL, "Tshumma ilaa jamii'i ahlil qubuuri minal muslimiina walmuslimaati walmu'miniina walmu'minaati mim masyaariqil ardhi ilaa maghooribihaa barrihaa wabahrihaa khushushon ilaa aabaainaa wa-ummahaatinaa wa-ajdaadinaa wajaddaatinaa wanakhush-shu khushuuson manijtama'naa haahunaa bisababihii wali-ajlihii");
        values.put(KEY_ARTI_TAHLIL, "Kemudian kepada seluruh penghuni kubur dari kalangan orang-orang islam laki-laki dan perempuan, orang mukmin laki-laki dan perempuan, dari belahan bumi timur dan barat, di laut dan di darat, terutama keapda bapak-bapak dan ibu-ibu kami, kakek dan nenek kami, lebih utamakan lagi kepada orang yang menyebabkan kami berkumpul di sini.");
        db.insert(TABLE_TAHLIL, null, values);
        //4
        values.put(KEY_ARAB_TAHLIL, "اَللهُمَّ اغْفِرْلَهُمْ وَارْحَمْهُمْ وَعَافِهِمْ وَاعْفُ عَنْهُم");
        values.put(KEY_LATIN_TAHLIL, "Allaahummaghfir lahum warhamhum wa 'aafihim wa'fu 'anhum");
        values.put(KEY_ARTI_TAHLIL, "Ya Allah, ampunilah mereka, kasihanilah mereka, berilah mereka kesejahteraan dan maafkanlah mereka");
        db.insert(TABLE_TAHLIL, null, values);
        //5
        values.put(KEY_ARAB_TAHLIL, "اَللهُمَّ اَنْزِلِ الرَّحْمَةَ وَالْمَغْفِرَةَ عَلى اَهْلِ الْقُبُوْرِ مِنْ اَهْلِ لَآاِلهَ اِلاَّ اللهُ مُحَمَّدٌ رَسُوْلُ الل");
        values.put(KEY_LATIN_TAHLIL, "Allaahumma anzilir rohmata walmaghfirota 'alaa ahlilqubuuri min ahli laa ilaaha illallaahu muhammadur rasuulullaah");
        values.put(KEY_ARTI_TAHLIL, "Ya Allah, turunkanlah rahmat dan ampunan kepada ahli kubur yang selalu mengucapkan \"Laailaaha illallaah muhammadur rasuulullaah\" (Tidak ada Tuhan selain Allah, Muhammad adalah utusan Allah)");
        db.insert(TABLE_TAHLIL, null, values);
        //6
        values.put(KEY_ARAB_TAHLIL, "اَللهُمَّ اَرِنَاالْحَقَّ حَقًّا وَارْزُقْنَااتِّبَاعَهُ وَاَرِنَاالْبَاطِلَ بَاطِلاً وَارْزُقْنَااجْتِنَابَهُ");
        values.put(KEY_LATIN_TAHLIL, "Allaahumma arinal haqqo haqqon warzuqnat tibaa'ahu, wa arinal baathila baathilan warzuqnaj tinaabahu");
        values.put(KEY_ARTI_TAHLIL, "Ya Allah, tunjukanlah kepada kami kebenaran adalah suatu kebenaran dan anugerahilah kami untuk mengikkutinya dan tunjukkanlah kepada kami kebatilan adalah suatu kebatilan dan anugerahilah kami untuk menjauhinya.");
        db.insert(TABLE_TAHLIL, null, values);
        //7
        values.put(KEY_ARAB_TAHLIL, "رَبَّنَا اَتِنَا فِى الدُّنْيَا حَسَنَةً وَفِى اْلآخِرَةِ حَسَنَةً وَقِنَا عَذَابَ النَّارِ");
        values.put(KEY_LATIN_TAHLIL, "Robbanaa aatinaa fiddunyaa hasanah, wafil aakhiroti hasanah waqinaa 'adzaaban naar.");
        values.put(KEY_ARTI_TAHLIL, "Wahai Tuhan kami, berikanlah kami kebaikan didunia dan kebaikan di akhirat, serta jauhkanlah kami dari siksa api neraka");
        db.insert(TABLE_TAHLIL, null, values);
        //8
        values.put(KEY_ARAB_TAHLIL, "سُبْحَانَ رَبِّكَ رَبِّ الْعِزَّةِ عَمَّا يَصِفُوْنَ وَسَلاَمٌ عَلَى الْمُرْسَلِيْنَ وَالْحَمْدُ ِللهِ رَبِّ الْعَالَمِيْنَ");
        values.put(KEY_LATIN_TAHLIL, "Subhaana robbika robbil 'izzati 'ammaa yashifuun, wasalaamun 'alal mursaliina walhamdu lillaahi robbil 'aalamiin.");
        values.put(KEY_ARTI_TAHLIL, "Masa suci Tuhanmu, Tuham pemilik kemuliaan, dari sifat-sifat yang mereka (musuh-musuhNya) berikan. Keselamatan selalu tertuju kepada Rasul, dan segala puji bagi Allah penguasa alam semesta.");
        db.insert(TABLE_TAHLIL, null, values);

        //Asmaul Husna
        //1
        values.put(KEY_ARAB_ASMAUL, "الرحمن");
        values.put(KEY_LATIN_ASMAUL, "Ar Rahman");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pengasih");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //2
        values.put(KEY_ARAB_ASMAUL, "الرحيم");
        values.put(KEY_LATIN_ASMAUL, "Ar Rahiim");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Penyayang");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //3
        values.put(KEY_ARAB_ASMAUL, "الملك");
        values.put(KEY_LATIN_ASMAUL, "Al Malik");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Merajai/Memerintah");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //4
        values.put(KEY_ARAB_ASMAUL, "القدوس");
        values.put(KEY_LATIN_ASMAUL, "Al Quddus");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Suci");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //5
        values.put(KEY_ARAB_ASMAUL, "السلام");
        values.put(KEY_LATIN_ASMAUL, "As Salaam");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Memberi Kesejahteraan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //6
        values.put(KEY_ARAB_ASMAUL, "المؤمن");
        values.put(KEY_LATIN_ASMAUL, "Al Mu'min");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Memberi Keamanan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //7
        values.put(KEY_ARAB_ASMAUL, "المهيمن");
        values.put(KEY_LATIN_ASMAUL, "Al Muhaimin");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pemelihara");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //8
        values.put(KEY_ARAB_ASMAUL, "العزيز");
        values.put(KEY_LATIN_ASMAUL, "Al `Aziiz");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Perkasa");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //9
        values.put(KEY_ARAB_ASMAUL, "الجبار");
        values.put(KEY_LATIN_ASMAUL, "Al Jabbar");
        values.put(KEY_ARTI_ASMAUL, "Yang Memiliki Mutlak Kegagahan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //10
        values.put(KEY_ARAB_ASMAUL, "المتكبر");
        values.put(KEY_LATIN_ASMAUL, "Al Mutakabbir");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Megah, Yang Memiliki Kebesaran");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //11
        values.put(KEY_ARAB_ASMAUL, "الخالق");
        values.put(KEY_LATIN_ASMAUL, "Al Khaliq");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pencipta");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //12
        values.put(KEY_ARAB_ASMAUL, "البارئ");
        values.put(KEY_LATIN_ASMAUL, "Al Baari`");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Melepaskan (Membuat, Membentuk, Menyeimbangkan)");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //13
        values.put(KEY_ARAB_ASMAUL, "المصور");
        values.put(KEY_LATIN_ASMAUL, "Al Mushawwir");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Membentuk Rupa (makhluknya)");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //14
        values.put(KEY_ARAB_ASMAUL, "الغفار");
        values.put(KEY_LATIN_ASMAUL, "Al Ghaffaar");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pengampun");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //15
        values.put(KEY_ARAB_ASMAUL, "القهار");
        values.put(KEY_LATIN_ASMAUL, "Al Qahhaar");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Memaksa");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //16
        values.put(KEY_ARAB_ASMAUL, "الوهاب");
        values.put(KEY_LATIN_ASMAUL, "Al Wahhaab");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pemberi Karunia");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //17
        values.put(KEY_ARAB_ASMAUL, "الرزاق");
        values.put(KEY_LATIN_ASMAUL, "Ar Razzaaq");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pemberi Rezeki");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //18
        values.put(KEY_ARAB_ASMAUL, "\tالفتاح");
        values.put(KEY_LATIN_ASMAUL, "Al Fattaah");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pembuka Rahmat");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //19
        values.put(KEY_ARAB_ASMAUL, "\tالعليم");
        values.put(KEY_LATIN_ASMAUL, "Al `Aliim");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Mengetahui (Memiliki Ilmu)");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //20
        values.put(KEY_ARAB_ASMAUL, "القابض");
        values.put(KEY_LATIN_ASMAUL, "Al Qaabidh");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Menyempitkan (makhluknya)");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //21
        values.put(KEY_ARAB_ASMAUL, "الباسط");
        values.put(KEY_LATIN_ASMAUL, "Al Baasith");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Melapangkan (makhluknya)");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //22
        values.put(KEY_ARAB_ASMAUL, "الخافض");
        values.put(KEY_LATIN_ASMAUL, "Al Khaafidh");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Merendahkan (makhluknya)");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //23
        values.put(KEY_ARAB_ASMAUL, "الرافع");
        values.put(KEY_LATIN_ASMAUL, "Ar Raafi`");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Meninggikan (makhluknya)");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //24
        values.put(KEY_ARAB_ASMAUL, "المعز");
        values.put(KEY_LATIN_ASMAUL, "Al Mu`izz");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Memuliakan (makhluknya)");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //25
        values.put(KEY_ARAB_ASMAUL, "المذل");
        values.put(KEY_LATIN_ASMAUL, "Al Mudzil");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Menghinakan (makhluknya)");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //26
        values.put(KEY_ARAB_ASMAUL, "السميع");
        values.put(KEY_LATIN_ASMAUL, "Al Samii`");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Mendengar");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //27
        values.put(KEY_ARAB_ASMAUL, "البصير");
        values.put(KEY_LATIN_ASMAUL, "Al Bashiir");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Melihat");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //28
        values.put(KEY_ARAB_ASMAUL, "الحكم");
        values.put(KEY_LATIN_ASMAUL, "Al Hakam");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Menetapkan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //29
        values.put(KEY_ARAB_ASMAUL, "العدل");
        values.put(KEY_LATIN_ASMAUL, "Al `Adl");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Adil");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //30
        values.put(KEY_ARAB_ASMAUL, "اللطيف");
        values.put(KEY_LATIN_ASMAUL, "Al Lathiif");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Lembut");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //31
        values.put(KEY_ARAB_ASMAUL, "الخبير");
        values.put(KEY_LATIN_ASMAUL, "Al Khabiir");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Mengenal");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //32
        values.put(KEY_ARAB_ASMAUL, "الحليم");
        values.put(KEY_LATIN_ASMAUL, "Al Haliim");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Penyantun");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //33
        values.put(KEY_ARAB_ASMAUL, "العظيم");
        values.put(KEY_LATIN_ASMAUL, "Al `Azhiim");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Agung");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //34
        values.put(KEY_ARAB_ASMAUL, "الغفور");
        values.put(KEY_LATIN_ASMAUL, "Al Ghafuur");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Memberi Pengampunan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //35
        values.put(KEY_ARAB_ASMAUL, "الشكور");
        values.put(KEY_LATIN_ASMAUL, "As Syakuur");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pembalas Budi (Menghargai)");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //36
        values.put(KEY_ARAB_ASMAUL, "العلى");
        values.put(KEY_LATIN_ASMAUL, "Al `Aliy");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Tinggi");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //37
        values.put(KEY_ARAB_ASMAUL, "الكبير");
        values.put(KEY_LATIN_ASMAUL, "Al Kabiir");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Besar");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //38
        values.put(KEY_ARAB_ASMAUL, "الحفيظ");
        values.put(KEY_LATIN_ASMAUL, "Al Hafizh");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Memelihara");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //39
        values.put(KEY_ARAB_ASMAUL, "المقيت");
        values.put(KEY_LATIN_ASMAUL, "Al Muqiit");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pemberi Kecukupan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //40
        values.put(KEY_ARAB_ASMAUL, "الحسيب");
        values.put(KEY_LATIN_ASMAUL, "Al Hasiib");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Membuat Perhitungan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //41
        values.put(KEY_ARAB_ASMAUL, "الجليل");
        values.put(KEY_LATIN_ASMAUL, "Al Jaliil");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Luhur");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //42
        values.put(KEY_ARAB_ASMAUL, "\tالكريم");
        values.put(KEY_LATIN_ASMAUL, "Al Kariim");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pemurah");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //43
        values.put(KEY_ARAB_ASMAUL, "الرقيب");
        values.put(KEY_LATIN_ASMAUL, "Ar Raqiib");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Mengawasi");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //44
        values.put(KEY_ARAB_ASMAUL, "المجيب");
        values.put(KEY_LATIN_ASMAUL, "Al Mujiib");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Mengabulkan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //45
        values.put(KEY_ARAB_ASMAUL, "الواسع");
        values.put(KEY_LATIN_ASMAUL, "Al Waasi`");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Luas");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //46
        values.put(KEY_ARAB_ASMAUL, "الحكيم");
        values.put(KEY_LATIN_ASMAUL, "Al Hakiim");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Maka Bijaksana");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //47
        values.put(KEY_ARAB_ASMAUL, "الودود");
        values.put(KEY_LATIN_ASMAUL, "Al Waduud");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Mengasihi");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //48
        values.put(KEY_ARAB_ASMAUL, "المجيد");
        values.put(KEY_LATIN_ASMAUL, "Al Majiid");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Mulia");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //49
        values.put(KEY_ARAB_ASMAUL, "الباعث");
        values.put(KEY_LATIN_ASMAUL, "Al Baa`its");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Membangkitkan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //50
        values.put(KEY_ARAB_ASMAUL, "الشهيد");
        values.put(KEY_LATIN_ASMAUL, "As Syahiid");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Menyaksikan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //51
        values.put(KEY_ARAB_ASMAUL, "الحق");
        values.put(KEY_LATIN_ASMAUL, "Al Haqq");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Benar");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //52
        values.put(KEY_ARAB_ASMAUL, "الوكيل");
        values.put(KEY_LATIN_ASMAUL, "Al Wakiil");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Memelihara");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //53
        values.put(KEY_ARAB_ASMAUL, "القوى");
        values.put(KEY_LATIN_ASMAUL, "Al Qawiyyu");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Kuat");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //54
        values.put(KEY_ARAB_ASMAUL, "\tالمتين");
        values.put(KEY_LATIN_ASMAUL, "Al Matiin");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Kokoh");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //55
        values.put(KEY_ARAB_ASMAUL, "الولى");
        values.put(KEY_LATIN_ASMAUL, "Al Waliyy");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Melindungi");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //56
        values.put(KEY_ARAB_ASMAUL, "الحميد");
        values.put(KEY_LATIN_ASMAUL, "Al Hamiid");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Terpuji");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //57
        values.put(KEY_ARAB_ASMAUL, "المحصى");
        values.put(KEY_LATIN_ASMAUL, "Al Muhshii");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Mengalkulasi (Menghitung Segala Sesuatu)");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //58
        values.put(KEY_ARAB_ASMAUL, "المبدئ");
        values.put(KEY_LATIN_ASMAUL, "Al Mubdi`");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Memulai");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //59
        values.put(KEY_ARAB_ASMAUL, "المعيد");
        values.put(KEY_LATIN_ASMAUL, "Al Mu`iid");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Mengembalikan Kehidupan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //60
        values.put(KEY_ARAB_ASMAUL, "المحيى");
        values.put(KEY_LATIN_ASMAUL, "Al Muhyii");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Menghidupkan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //61
        values.put(KEY_ARAB_ASMAUL, "المميت");
        values.put(KEY_LATIN_ASMAUL, "Al Mumiitu");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Mematikan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //62
        values.put(KEY_ARAB_ASMAUL, "الحي");
        values.put(KEY_LATIN_ASMAUL, "Al Hayyu");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Hidup");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //63
        values.put(KEY_ARAB_ASMAUL, "القيوم");
        values.put(KEY_LATIN_ASMAUL, "Al Qayyuum");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Mandiri");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //64
        values.put(KEY_ARAB_ASMAUL, "الواجد");
        values.put(KEY_LATIN_ASMAUL, "Al Waajid");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Penemu");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //65
        values.put(KEY_ARAB_ASMAUL, "\tالماجد");
        values.put(KEY_LATIN_ASMAUL, "Al Maajid");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Mulia");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //66
        values.put(KEY_ARAB_ASMAUL, "الواحد");
        values.put(KEY_LATIN_ASMAUL, "Al Wahid");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Tunggal");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //67
        values.put(KEY_ARAB_ASMAUL, "الاحد");
        values.put(KEY_LATIN_ASMAUL, "Al Ahad");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Esa");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //68
        values.put(KEY_ARAB_ASMAUL, "الصمد");
        values.put(KEY_LATIN_ASMAUL, "As Shamad");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Dibutuhkan, Tempat Meminta");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //69
        values.put(KEY_ARAB_ASMAUL, "القادر");
        values.put(KEY_LATIN_ASMAUL, "Al Qaadir");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Menentukan, Maha Menyeimbangkan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //70
        values.put(KEY_ARAB_ASMAUL, "المقتدر");
        values.put(KEY_LATIN_ASMAUL, "Al Muqtadir");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Berkuasa");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //71
        values.put(KEY_ARAB_ASMAUL, "المقدم");
        values.put(KEY_LATIN_ASMAUL, "Al Muqaddim");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Mendahulukan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //72
        values.put(KEY_ARAB_ASMAUL, "المؤخر");
        values.put(KEY_LATIN_ASMAUL, "Al Mu`akkhir");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Mengakhirkan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //73
        values.put(KEY_ARAB_ASMAUL, "الأول");
        values.put(KEY_LATIN_ASMAUL, "Al Awwal");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Awal");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //74
        values.put(KEY_ARAB_ASMAUL, "الأخر");
        values.put(KEY_LATIN_ASMAUL, "Al Aakhir");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Akhir");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //75
        values.put(KEY_ARAB_ASMAUL, "الظاهر");
        values.put(KEY_LATIN_ASMAUL, "Az Zhaahir");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Nyata");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //76
        values.put(KEY_ARAB_ASMAUL, "الباطن");
        values.put(KEY_LATIN_ASMAUL, "Al Baathin");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Ghaib");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //77
        values.put(KEY_ARAB_ASMAUL, "الوالي");
        values.put(KEY_LATIN_ASMAUL, "Al Waali");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Memerintah");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //78
        values.put(KEY_ARAB_ASMAUL, "المتعالي");
        values.put(KEY_LATIN_ASMAUL, "Al Muta`aalii");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Tinggi");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //79
        values.put(KEY_ARAB_ASMAUL, "البر");
        values.put(KEY_LATIN_ASMAUL, "Al Barru");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Penderma (Maha Pemberi Kebajikan)");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //80
        values.put(KEY_ARAB_ASMAUL, "التواب");
        values.put(KEY_LATIN_ASMAUL, "At Tawwaab");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Penerima Tobat");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //81
        values.put(KEY_ARAB_ASMAUL, "المنتقم");
        values.put(KEY_LATIN_ASMAUL, "Al Muntaqim");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pemberi Balasan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //82
        values.put(KEY_ARAB_ASMAUL, "العفو");
        values.put(KEY_LATIN_ASMAUL, "Al Afuww");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pemaaf");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //83
        values.put(KEY_ARAB_ASMAUL, "\tالرؤوف");
        values.put(KEY_LATIN_ASMAUL, "Ar Ra`uuf");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pengasuh");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //84
        values.put(KEY_ARAB_ASMAUL, "مالك الملك");
        values.put(KEY_LATIN_ASMAUL, "Malikul Mulk");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Penguasa Kerajaan (Semesta)");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //85
        values.put(KEY_ARAB_ASMAUL, "ذو الجلال و الإكرام");
        values.put(KEY_LATIN_ASMAUL, "Dzul Jalaali Wal Ikraam");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pemilik Kebesaran dan Kemuliaan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //86
        values.put(KEY_ARAB_ASMAUL, "المقسط");
        values.put(KEY_LATIN_ASMAUL, "Al Muqsith");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pemberi Keadilan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //87
        values.put(KEY_ARAB_ASMAUL, "الجامع");
        values.put(KEY_LATIN_ASMAUL, "Al Jamii`");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Mengumpulkan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //88
        values.put(KEY_ARAB_ASMAUL, "الغنى");
        values.put(KEY_LATIN_ASMAUL, "Al Ghaniyy");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Kaya");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //89
        values.put(KEY_ARAB_ASMAUL, "\tالمغنى");
        values.put(KEY_LATIN_ASMAUL, "Al Mughnii");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pemberi Kekayaan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //90
        values.put(KEY_ARAB_ASMAUL, "المانع");
        values.put(KEY_LATIN_ASMAUL, "Al Maani");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Mencegah");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //91
        values.put(KEY_ARAB_ASMAUL, "\tالضار");
        values.put(KEY_LATIN_ASMAUL, "Ad Dhaar");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Penimpa Kemudharatan");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //92
        values.put(KEY_ARAB_ASMAUL, "النافع");
        values.put(KEY_LATIN_ASMAUL, "An Nafii`");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Memberi Manfaat");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //93
        values.put(KEY_ARAB_ASMAUL, "النور");
        values.put(KEY_LATIN_ASMAUL, "An Nuur");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Bercahaya (Menerangi, Memberi Cahaya)");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //94
        values.put(KEY_ARAB_ASMAUL, "الهادئ");
        values.put(KEY_LATIN_ASMAUL, "Al Haadii");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pemberi Petunjuk");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //95
        values.put(KEY_ARAB_ASMAUL, "\tالبديع");
        values.put(KEY_LATIN_ASMAUL, "Al Badii’");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pencipta Yang Tiada Bandingannya");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //96
        values.put(KEY_ARAB_ASMAUL, "الباقي");
        values.put(KEY_LATIN_ASMAUL, "Al Baaqii");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Kekal");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //97
        values.put(KEY_ARAB_ASMAUL, "الوارث");
        values.put(KEY_LATIN_ASMAUL, "Al Waarits");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pewaris");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //98
        values.put(KEY_ARAB_ASMAUL, "\tالرشيد");
        values.put(KEY_LATIN_ASMAUL, "Ar Rasyiid");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Pandai");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);
        //99
        values.put(KEY_ARAB_ASMAUL, "الصبور");
        values.put(KEY_LATIN_ASMAUL, "As Shabuur");
        values.put(KEY_ARTI_ASMAUL, "Yang Maha Sabar");
        values.put(KEY_AMAL_ASMAUL, "");
        db.insert(TABLE_ASMAUL, null, values);

        //Pengaturan ukuran font
        values.put(KEY_UKURAN_ARAB, "25");
        values.put(KEY_UKURAN_LATIN, "14");
        values.put(KEY_UKURAN_ARTI, "13");
        db.insert(TABLE_PENGATURAN, null, values);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_YASIN);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_KURSI);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TAHLIL);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ASMAUL);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PENGATURAN);

        // Create tables again
        onCreate(db);
    }

    public void hapusDBaseYasin() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_YASIN);
    }

    public void hapusDBaseKursi() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_KURSI);
    }

    public void hapusDBaseTahlil() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_TAHLIL);
    }

    public void hapusDBaseAsmaul() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_ASMAUL);
    }

    public void hapusDBasePengaturan() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_PENGATURAN);
    }

    /**
     * All CRUD(Create, Read, Update, Delete) Operations
     */

    // Adding new contact
    public void addYasin(Yasin yasin) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_ARAB_YASIN, yasin.getArab());
        values.put(KEY_LATIN_YASIN, yasin.getLatin());
        values.put(KEY_ARTI_YASIN, yasin.getArti());

        // Inserting Row
        db.insert(TABLE_YASIN, null, values);
        db.close(); // Closing database connection
    }
    public void addKursi(Kursi kursi) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_ARAB_KURSI, kursi.getArab());
        values.put(KEY_LATIN_KURSI, kursi.getLatin());
        values.put(KEY_ARTI_KURSI, kursi.getArti());

        // Inserting Row
        db.insert(TABLE_KURSI, null, values);
        db.close(); // Closing database connection
    }
    public void addTahlil(Tahlil tahlil) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_ARAB_TAHLIL, tahlil.getArab());
        values.put(KEY_LATIN_TAHLIL, tahlil.getLatin());
        values.put(KEY_ARTI_TAHLIL, tahlil.getArti());

        // Inserting Row
        db.insert(TABLE_TAHLIL, null, values);
        db.close(); // Closing database connection
    }
    public void addAsmaul(Asmaul asmaul) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_ARAB_ASMAUL, asmaul.getArab());
        values.put(KEY_LATIN_ASMAUL, asmaul.getLatin());
        values.put(KEY_ARTI_ASMAUL, asmaul.getArti());
        values.put(KEY_AMAL_ASMAUL, asmaul.getAmal());

        // Inserting Row
        db.insert(TABLE_ASMAUL, null, values);
        db.close(); // Closing database connection
    }
    public void addPengaturan(Pengaturan pengaturan) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_UKURAN_ARAB, pengaturan.getHurufArab());
        values.put(KEY_UKURAN_LATIN, pengaturan.getHurufLatin());
        values.put(KEY_UKURAN_ARTI, pengaturan.getHurufArti());

        // Inserting Row
        db.insert(TABLE_PENGATURAN, null, values);
        db.close(); // Closing database connection
    }

    // Getting single contact
    Yasin getYasin(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_YASIN, new String[]{KEY_ID_YASIN,
                        KEY_ARAB_YASIN, KEY_LATIN_YASIN, KEY_ARTI_YASIN}, KEY_ID_YASIN + "=?",
                new String[]{String.valueOf(id)}, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Yasin yasin = new Yasin(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2), cursor.getString(3));
        // return contact
        return yasin;
    }
    Kursi getKursi(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_KURSI, new String[]{KEY_ID_KURSI,
                        KEY_ARAB_KURSI, KEY_LATIN_KURSI, KEY_ARTI_KURSI}, KEY_ID_KURSI + "=?",
                new String[]{String.valueOf(id)}, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Kursi kursi = new Kursi(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2), cursor.getString(3));
        // return contact
        return kursi;
    }
    Tahlil getTahlil(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_TAHLIL, new String[]{KEY_ID_TAHLIL,
                        KEY_ARAB_TAHLIL, KEY_LATIN_TAHLIL, KEY_ARTI_TAHLIL}, KEY_ID_TAHLIL + "=?",
                new String[]{String.valueOf(id)}, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Tahlil tahlil = new Tahlil(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2), cursor.getString(3));
        // return contact
        return tahlil;
    }
    Asmaul getAsmaul(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_ASMAUL, new String[]{KEY_ID_ASMAUL,
                        KEY_ARAB_ASMAUL, KEY_LATIN_ASMAUL, KEY_ARTI_ASMAUL, KEY_AMAL_ASMAUL}, KEY_ID_ASMAUL + "=?",
                new String[]{String.valueOf(id)}, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Asmaul asmaul = new Asmaul(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2), cursor.getString(3), cursor.getString(4));
        // return contact
        return asmaul;
    }
    Pengaturan getPengaturan(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_PENGATURAN, new String[]{KEY_ID_PENGATURAN,
                        KEY_UKURAN_ARAB, KEY_UKURAN_LATIN, KEY_UKURAN_ARTI}, KEY_ID_PENGATURAN + "=?",
                new String[]{String.valueOf(id)}, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        Pengaturan pengaturan = new Pengaturan(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2), cursor.getString(3));
        // return contact
        return pengaturan;
    }

    // Getting All Contacts
    public List<Yasin> getAllYasins() {
        List<Yasin> yasinList = new ArrayList<Yasin>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_YASIN;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Yasin yasin = new Yasin();
                yasin.setID(Integer.parseInt(cursor.getString(0)));
                yasin.setArab(cursor.getString(1));
                yasin.setLatin(cursor.getString(2));
                yasin.setArti(cursor.getString(3));
                // Adding contact to list
                yasinList.add(yasin);
            } while (cursor.moveToNext());
        }

        // return contact list
        return yasinList;
    }
    public List<Kursi> getAllKursis() {
        List<Kursi> kursiList = new ArrayList<Kursi>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_KURSI;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Kursi kursi = new Kursi();
                kursi.setID(Integer.parseInt(cursor.getString(0)));
                kursi.setArab(cursor.getString(1));
                kursi.setLatin(cursor.getString(2));
                kursi.setArti(cursor.getString(3));
                // Adding contact to list
                kursiList.add(kursi);
            } while (cursor.moveToNext());
        }

        // return contact list
        return kursiList;
    }
    public List<Tahlil> getAllTahlils() {
        List<Tahlil> tahlilList = new ArrayList<Tahlil>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_TAHLIL;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Tahlil tahlil = new Tahlil();
                tahlil.setID(Integer.parseInt(cursor.getString(0)));
                tahlil.setArab(cursor.getString(1));
                tahlil.setLatin(cursor.getString(2));
                tahlil.setArti(cursor.getString(3));
                // Adding contact to list
                tahlilList.add(tahlil);
            } while (cursor.moveToNext());
        }

        // return contact list
        return tahlilList;
    }
    public List<Asmaul> getAllAsmauls() {
        List<Asmaul> asmaulList = new ArrayList<Asmaul>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_ASMAUL;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Asmaul asmaul = new Asmaul();
                asmaul.setID(Integer.parseInt(cursor.getString(0)));
                asmaul.setArab(cursor.getString(1));
                asmaul.setLatin(cursor.getString(2));
                asmaul.setArti(cursor.getString(3));
                asmaul.setAmal(cursor.getString(4));
                // Adding contact to list
                asmaulList.add(asmaul);
            } while (cursor.moveToNext());
        }

        // return contact list
        return asmaulList;
    }
    public List<Pengaturan> getAllPengaturans() {
        List<Pengaturan> pengaturanList = new ArrayList<Pengaturan>();
        // Select All Query
        String selectQuery = "SELECT  * FROM " + TABLE_PENGATURAN;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(selectQuery, null);

        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                Pengaturan pengaturan = new Pengaturan();
                pengaturan.setID(Integer.parseInt(cursor.getString(0)));
                pengaturan.setHurufArab(cursor.getString(1));
                pengaturan.setHurufLatin(cursor.getString(2));
                pengaturan.setHurufArti(cursor.getString(3));
                // Adding contact to list
                pengaturanList.add(pengaturan);
            } while (cursor.moveToNext());
        }

        // return contact list
        return pengaturanList;
    }

    // Updating single contact
    public int updateYasin(Yasin yasin) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_ARAB_YASIN, yasin.getArab());
        values.put(KEY_LATIN_YASIN, yasin.getLatin());
        values.put(KEY_ARTI_YASIN, yasin.getArti());

        // updating row
        return db.update(TABLE_YASIN, values, KEY_ID_YASIN + " = ?",
                new String[]{String.valueOf(yasin.getID())});
    }
    public int updateKursi(Kursi kursi) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_ARAB_KURSI, kursi.getArab());
        values.put(KEY_LATIN_KURSI, kursi.getLatin());
        values.put(KEY_ARTI_KURSI, kursi.getArti());

        // updating row
        return db.update(TABLE_KURSI, values, KEY_ID_KURSI + " = ?",
                new String[]{String.valueOf(kursi.getID())});
    }
    public int updateTahlil(Tahlil tahlil) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_ARAB_TAHLIL, tahlil.getArab());
        values.put(KEY_LATIN_TAHLIL, tahlil.getLatin());
        values.put(KEY_ARTI_TAHLIL, tahlil.getArti());

        // updating row
        return db.update(TABLE_TAHLIL, values, KEY_ID_TAHLIL + " = ?",
                new String[]{String.valueOf(tahlil.getID())});
    }
    public int updateAsmaul(Asmaul asmaul) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_ARAB_ASMAUL, asmaul.getArab());
        values.put(KEY_LATIN_ASMAUL, asmaul.getLatin());
        values.put(KEY_ARTI_ASMAUL, asmaul.getArti());
        values.put(KEY_AMAL_ASMAUL, asmaul.getAmal());

        // updating row
        return db.update(TABLE_ASMAUL, values, KEY_ID_ASMAUL + " = ?",
                new String[]{String.valueOf(asmaul.getID())});
    }
    public int updatePengaturan(Pengaturan pengaturan) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_UKURAN_ARAB, pengaturan.getHurufArab());
        values.put(KEY_UKURAN_LATIN, pengaturan.getHurufLatin());
        values.put(KEY_UKURAN_ARTI, pengaturan.getHurufArti());

        // updating row
        return db.update(TABLE_PENGATURAN, values, KEY_ID_PENGATURAN + " = ?",
                new String[]{String.valueOf(pengaturan.getID())});
    }

    // Deleting single contact
    public void deleteYasin(Yasin yasin) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_YASIN, KEY_ID_YASIN + " = ?",
                new String[]{String.valueOf(yasin.getID())});
        db.close();
    }
    public void deleteKursi(Kursi kursi) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_KURSI, KEY_ID_KURSI + " = ?",
                new String[]{String.valueOf(kursi.getID())});
        db.close();
    }
    public void deleteTahlil(Tahlil tahlil) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_TAHLIL, KEY_ID_TAHLIL + " = ?",
                new String[]{String.valueOf(tahlil.getID())});
        db.close();
    }
    public void deleteAsmaul(Asmaul asmaul) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_ASMAUL, KEY_ID_ASMAUL + " = ?",
                new String[]{String.valueOf(asmaul.getID())});
        db.close();
    }
    public void deletePengaturan(Pengaturan pengaturan) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_PENGATURAN, KEY_ID_PENGATURAN + " = ?",
                new String[]{String.valueOf(pengaturan.getID())});
        db.close();
    }

    // Getting contacts Count
    public int getYasinCount() {
        String countQuery = "SELECT  * FROM " + TABLE_YASIN;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }
    public int getKursiCount() {
        String countQuery = "SELECT  * FROM " + TABLE_YASIN;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }
    public int getTahlilCount() {
        String countQuery = "SELECT  * FROM " + TABLE_TAHLIL;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }
    public int getAsmaulCount() {
        String countQuery = "SELECT  * FROM " + TABLE_ASMAUL;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }
    public int getPengaturanCount() {
        String countQuery = "SELECT  * FROM " + TABLE_PENGATURAN;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        cursor.close();

        // return count
        return cursor.getCount();
    }
}
