package com.example.com.smileplants;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Locale;

public class C00Search extends AppCompatActivity {

    // Declare Variables
    ListView list;
    //ListViewAdapter adapter;
    EditText editsearch;
    String[] rank;
    String[] country;
    String[] population;
    int[] flag;
   // ArrayList<WorldPopulation> arraylist = new ArrayList<WorldPopulation>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c00_search);


        // Generate sample data
        rank = new String[] { "  gunting", " kaca", " papan luncur air", " kertas", " arnab", " kotak", " kamera"
                , " mee", " sewa kerata", " kain kotor", " perjalanan"," gula-gula"," roti" ," saiz"
                ," kecurian"," sampah","  botol","  hadiah"," kamu"," mainan "," mengayuh basikal"," penjual bunga"
                ," penjual daging"," sendirian"," kurang upaya"," perapi"," rasa mual",
                "  hiburan","  haba"," harga"," kepeningan"," bekerja"," ukiran"," senang"," perak"," mata wang",
                " wang tunai"," sunyi","surat","hidung ","meletak ","basikal","mencium"," aku"," pagi","petang ","coklat","sampul surat ",
                "sos ","tulang ruruk","membeli"," rantai","muzik ","doktor "," bunga ","menyelam ","cerah ","paha ","pokok ",
                "daun bawang"," rebus ","lucu","jalan ","cawan ","pengeluaran"," kacang soya","gua "," peguam ","gaya","cirit-birit",
                "luat ","tenis ","wang kertas","bank "," biasa ","perniagaan","burung","susu","pelancong ","duduk ","bosan ",
                "brokoli ","syarikat ","kolam","kad kredit ","bir","negara ","asrama ","istana ","sakit perut "," pos ","bahan cuci "
                ,"sayur-sayuran ","pengurus "," ruam","peta "," hujun ","mandi ","bertentangan ","bertaruh "," jururawat ","matahari",
                " lada ","rehat ","bebas "," gigi ","bolo sepak "," api ","lampu isyarat "," isteri","restoran ","gambar ","wayang ",
                "bahasa ","motorsikal "," lebih ","gembira","gelap "," sakit","puncak ","racun ","ubat gigi ","sejuk","agar-agar"
                ," troli "," kereta sewa ","keretapi ","kereta ","kasut "," harga ","selamat jalan ","kerongkong ","kecil "," losen "
                ," penyakit anemia "," kuil","hari"," hari jadi ","berenang","cermin mata","kotor"," tempat ","khabar baik  ","barangan",
                " bising ","buku "," tingkap ","dapur","duit syiling ","cincin ","pangsapuri ","sedap ","udara ","bangunan","kemalangan"



        };

        country = new String[] { " กรรไกร", " กระจก ", " กระดานโต้คลื่น",
                "กระดาษ", " กระท่อม", " กล่อง", " กล้องถ่ายรูป", " ก๋วยเตี๋ยว",
                "การเช่ารถ", " การซักรีด"," การเดินทาง"," ขนม,ลูกอม"," ขนมปัง" ," ขนาด"
                ," ขโมย"," ขยะ"," ขวด"," ของขวัญ"," ขอบคุณ"," ของเล่น"," ขี่จักรยาน"
                ," คนขายดอกไม้"," คนขายเนื้อ"," คนเดียว,โดดเดี่ยว"," คนพิการ",
                " ครีมนวดผม"," คลื่นไส้"," ความบันเทิง"," ความร้อน"," ค่าใช้จ่าย"," ง่วงซึม"," งาน"," งานแกะสลัก"
                ," ง่าย สบายๆ"," เงิน(แร่ธาตุ)"," เงินตรา"," เงินสด"," เงียบ" ,"จดหมาย","จมูก","จอดรถ","จักรยาน"
                ,"จูบ","ฉัน,ผม","ช่วงเช้า","ช่วงเย็น ","ช็อกโกแลต","ซองจดหมาย","ซอส","ซี่โครง","ซื้อ ","โซ่","ดนตรี","ด๊อกเตอร์",
                "ดอกไม้","ดำน้ำ","แดดแรง ","ต้นขา","ต้นไม้","ต้นหอม","ต้ม","ตลก","ถนน ทาง","ถ้วย","ถอนเงิน","ถั่วเหลือง"
                ,"ถ้ำ","ทนาย","ทรงผม","ท้องเสีย ","ทะเล","เทนนิส","ธนบัตร","ธนาคาร","ธรรมดา","ธุรกิจ","นก ","นม"
                ,"นักท่องเที่ยว ","นั่ง","น่าเบื่อ","บล็อคโคลี่ ","บริษัท ","บ่อน้ำ","บัตรเครดิต","เบียร์ ","ประเทศ ","ประหยัด"
                ,"ปราสาท","ปวดท้อง ","ไปรษณีย์","ผงซักฟอก","ผัก ","ผู้จัดการ ","ผื่นคัน ","แผนที่","ฝน","ฝักบัวอาบน้ำ","ฝั่งตรงข้าม",
                "พนัน ","พยาบาล","พระอาทิตย์ ","พริกไทย ","พักผ่อน","ฟรี ไม่เสียหายค่าใช้จ่าย","ฟัน","ฟุตบอล","ไฟ ","ไฟจราจร "
                ,"ภรรยา","ภัตตาคาร ","ภาพถ่าย ","ภาพยนตร์ ","ภาษา","มอเตอร์ไซค์ ","มากขึ้น","มีความสุข","มืด ","ไม่สบาย",
                "ยอดเขา ","ยาพิษ","ยาสีฟัน","เย็น ","เยลลี่","รถเข็น ","รถเช่า","รถไฟ","รถยนต์","รองเท้า ","ราคา","ลาก่อน"
                ,"ลำคอ","เล็ก","โลชั่น ","โลหิตจาง ","วัด ","วัน ","วันเกิด ","ว่ายน้ำ ","แว่นตา","สกปรก","สถานที่ ","สบายดี ","สินค้า","เสียงดัง ",
                "หนังสือ","หน้าต่าง","ห้องครัว","เหรียญ","แหวน ","อพาร์ทเมนต์ ","อร่อย ","อากาศ","อาคาร","อุบัติเหตุ "

        };

        population = new String[] { "  ฆูนติง", " กาจา",
                " ปาปัน ลูนจูร์ อายัร", " เกอร์ตัส", " อัรนับ", " กอต๊อก ",
                " คาเมรา", " มี", " เซวา เกอ-ราตา", " กายน์ กอตอร์",
                " เปอร์จาลันนัน"," ฆูลอ ฆูลอ" ," โรตี" ," ไซส์"," เกอ-จูรียัน "," ซัมปะห์"," บอตอล"
                ," ฮาดียะห์"," กามู"," มัยนัน" ," เมอ-งูายูห์ บาสิกัล"," เปินจูวัล บูงา"," เปินจูวัล ดาฆิง"
                ," ซืนดีรียัน"," กูรัง อูปายา"," เปอ ราปี"," ราซา มูวัล"
                ," ฮีบูรัน"," ฮาบา"," ฮัรฆา"," เกอ-เปอนีงัน"," เบอ-เกอร์จา"," อูกีรัน"," เซอ-นัง"," เปรัก",
                " มาตา วัง"," วังตูนัย"," ซูยี","ซูรัต","ฮีดูง","เมอ-ลือต๊อก","บาสิกัล "," มึนจียูม","อากู","ปาฆี","เปอ-ตัง",
                "ช็อกกลัต","ซัมปูบ ซูรัต","ซอส","ตูลัง รูสูก","มึมเบอลี","รันตัย","มิวสิก","ด๊อกเตอร์"," บูงา","เมอเยอลัม",
                "เจอราฮ์","ปาฮา"," ปอก๊อก"," ดาวน์ บาวัง","รือบูส","ลูจู","จาลัน","จาวัน","เปองือลูวารัน","กาจัง โซยา"
                ," ฆูวา"," เปอ-ฆูวัม","กายา","จิริต-บีริต","ลาวต์"," เทนิส","วัง เกอร์ตัส","บังก์","บียาซา","เปอร์เนียฆาอัน",
                "บูรูง","ซูซู"," เปอ-ลันจง","ดูดุก","บอซัน","บรอคคอลี่","ชารีกัต","กอลัม","การ์ด เครดิต","บิร","เนอ-ฆารา"
                ,"อัสรามา","อิสตาน่า","ซากิต เปอ-รูต","โพส","บาฮัน จูจี","ซายู-ซายูรัน","เปอ-งูรูส","รูวัม","เปอ-ตา","ฮูจัน"," มันดี"
                ,"เบอร์ตึนตางัน","เบอร์ตารูห์","จูรูราวัต","มาตาฮารี","ลาดา"," เรฮัต","เบบัส ","ฆีฆี","บอลา เซปัก","อาปี","ลัมปู อีชารัต",
                "อิสเตอ-รี","เรสโตเรนท์","กัมบา","วายัง","บาฮาซา","มอเตอร์สิกัล","ลือบิห์"," กึมบีรา","เกอ-ลัป","ซากิต"," ปูนจ๊อก",
                "ราจูน","อูบัต ฆีฆี","เซอจูก","อาฆา อาฆา","ทรอลี"," เกอ-เรตา เสวา","เกอ-เรตาปี","เกอ-เรตา","กาสูต","ฮัรฆา",
                " เซอลามัตจาลัน"," เกอรงกง"," เกอจิล","โลเช่น","เปอยากิตอาเนเมีย","กูอิล","ฮารี","ฮารี จาดี"," เบอรือนัง","เจอร์มิน มาตา"
                ,"กอตอร์","ตึมปัต","คาบา บายก์","บารางัน","บีซิง","บูกู","ติงกัป"," ดาปูร์","ดูวิต ชีลิง","จินจิน","ปังซาปูรี","เซอดัป","อูดารา"
                ,"บางูนัน","เกอมาลางัน"


        };

        /*flag = new int[] { R.drawable.z1, R.drawable.z2,
                R.drawable.z3, R.drawable.z4,
                R.drawable.z5, R.drawable.z6, R.drawable.z7,
                R.drawable.z8, R.drawable.z10, R.drawable.z11, R.drawable.z12
                , R.drawable.z13, R.drawable.z14, R.drawable.z15, R.drawable.z16
                , R.drawable.z17, R.drawable.z18, R.drawable.z19, R.drawable.z20, R.drawable.z21
                , R.drawable.z22, R.drawable.z23, R.drawable.z24, R.drawable.z25, R.drawable.z26
                , R.drawable.z27, R.drawable.z28, R.drawable.z29, R.drawable.z30, R.drawable.z31
                , R.drawable.z32, R.drawable.z33, R.drawable.z34, R.drawable.z35
                , R.drawable.z36, R.drawable.z37, R.drawable.z38, R.drawable.z39,R.drawable.zz1
                , R.drawable.zz2, R.drawable.zz3, R.drawable.zz4, R.drawable.zz5
                , R.drawable.zz6, R.drawable.zz7, R.drawable.zz8, R.drawable.zz9,R.drawable.z40, R.drawable.z41, R.drawable.z42
                , R.drawable.z43, R.drawable.z44, R.drawable.z45, R.drawable.z46, R.drawable.z47
                , R.drawable.z48, R.drawable.z49, R.drawable.z50, R.drawable.z51
                , R.drawable.z52, R.drawable.z53, R.drawable.z54, R.drawable.z55,R.drawable.z56
                , R.drawable.z57, R.drawable.z58, R.drawable.z59, R.drawable.z60
                , R.drawable.z61, R.drawable.z62, R.drawable.z63, R.drawable.z64,R.drawable.z65
                , R.drawable.z67, R.drawable.z68, R.drawable.z69, R.drawable.z70
                , R.drawable.z71, R.drawable.z72, R.drawable.z73, R.drawable.z74, R.drawable.z75, R.drawable.z76
                , R.drawable.z77, R.drawable.z78, R.drawable.z79, R.drawable.z80, R.drawable.z81
                , R.drawable.z82, R.drawable.z83, R.drawable.z84, R.drawable.z85, R.drawable.z86
                , R.drawable.z87, R.drawable.z88, R.drawable.z89, R.drawable.z90, R.drawable.z91
                , R.drawable.z92, R.drawable.z93, R.drawable.z94, R.drawable.z95, R.drawable.z96
                , R.drawable.z97, R.drawable.z98, R.drawable.z99, R.drawable.z100, R.drawable.z101
                , R.drawable.z102, R.drawable.z103, R.drawable.z104, R.drawable.z105, R.drawable.z106
                , R.drawable.z107, R.drawable.z108, R.drawable.z109, R.drawable.z110, R.drawable.z111
                , R.drawable.z112, R.drawable.z113, R.drawable.z114, R.drawable.z115, R.drawable.z116
                , R.drawable.z117, R.drawable.z118, R.drawable.z119, R.drawable.z120, R.drawable.z121
                , R.drawable.z122, R.drawable.z123, R.drawable.z124, R.drawable.z125, R.drawable.z126
                , R.drawable.z127, R.drawable.z128, R.drawable.z129, R.drawable.z130, R.drawable.z131
                , R.drawable.z132, R.drawable.z133, R.drawable.z134, R.drawable.z135, R.drawable.z136
                , R.drawable.z137, R.drawable.z138, R.drawable.z141, R.drawable.z142, R.drawable.z143
                , R.drawable.z144, R.drawable.z145, R.drawable.z146, R.drawable.z147, R.drawable.z148
                , R.drawable.z149, R.drawable.z150
        };*/

        // Locate the ListView in listview_main.xml
        list = (ListView) findViewById(R.id.listview);

      /*  for (int i = 0; i < rank.length; i++)
        {
            WorldPopulation wp = new WorldPopulation(rank[i], country[i], population[i], flag[i]);
            // Binds all strings into an array
            arraylist.add(wp);
        }*/

        // Pass results to ListViewAdapter Class
       // adapter = new ListViewAdapter(this, arraylist);

        // Binds the Adapter to the ListView
     //  list.setAdapter(adapter);

        // Locate the EditText in listview_main.xml
        editsearch = (EditText) findViewById(R.id.search);

        // Capture Text in EditText
        editsearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
                String text = editsearch.getText().toString().toLowerCase(Locale.getDefault());
               // adapter.filter(text);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1,
                                          int arg2, int arg3) {
                // TODO Auto-generated method stub
            }

            @Override
            public void onTextChanged(CharSequence arg0, int arg1, int arg2,
                                      int arg3) {
                // TODO Auto-generated method stub
            }
        });

    }
}
