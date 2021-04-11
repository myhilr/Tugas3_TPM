package com.MyApplication3.Tugas3;

import java.util.ArrayList;

public class Data {
    private static String[] image = new String[] {
        "https://cdn.eraspace.com/pub/media/wysiwyg/iphone-12-pro/LP_Product_1_Slice_2_3_Desember_2020_Pro.png",
        "https://cdn.eraspace.com/pub/media/wysiwyg/iPhone-12/LP_Product_1_Slice_1_3_Desember_2020_.png",
        "https://eraspace.com/pub/media/wysiwyg/ibox/iphone-SE/Product_iPhone_SE.png",
        "https://pngimg.com/uploads/iphone_11/iphone_11_PNG31.png",
        "https://pngimg.com/uploads/iphone_11/iphone_11_PNG38.png",
        "https://cdn.eraspace.com/pub/media/wysiwyg/ibox/iphone-xr/iphone-xr-bag2_26-min.png",
        "https://png2.cleanpng.com/sh/c08fc9f22ddfa0dd16ef559739a695b5/L0KzQYq3WMA4N5trfpH0aYP2gLBuTfFxeJ1qRdt5aHBxdX7Bk71uaakygeJxb37oPcn5TcUyOl5sep8AZETkcYPqhfIzbmk9UJCDOEO8RYSBUsE2PmY2T6Q9M0C6Q4S4TwBvbz==/kisspng-apple-iphone-xs-max-iphone-xr-512-gb-5d4aa2ceb2f888.8839538215651724307331.png",
        "https://cdn.eraspace.com/pub/media/wysiwyg/ibox/iphone-x/iphoneX3_11-min.png",
        "https://cdn.eraspace.com/pub/media/wysiwyg/ibox/iphone-8/iphone-delapan_13.png",
        "https://lh3.googleusercontent.com/proxy/BtZf1DHhpAlQ8vRVipoeM1AkaVlbzoraAMDHAAUtlPOF30HwwmuNdtyoQGbr-JzeuvOkuO9DTKpEX1FduqapZfYh1p2pc5kSyjEALSLcgovs7J7480Nmh4DArpAxyA-WVyH3M5LgF7CGyKU"
    };
    private static String[] series = new String[] {
        "iPhone 12 Pro",
        "iPhone 12",
        "iPhone SE (2nd generation)",
        "iPhone 11 Pro",
        "iPhone 11",
        "iPhone XR",
        "iPhone XS",
        "iPhone X",
        "iPhone 8",
        "iPhone 7"
    };

    private static String[] release = new String[] {
        "23 Oktober 2020",
        "23 Oktober 2020",
        "24 April 2020",
        "20 September 2019",
        "20 September 2019",
        "26 Oktober 2018",
        "21 September 2018",
        "3 November 2017",
        "22 September 2017",
        "16 September 2016"
    };

    public static String[] desc = new String[] {
        "Flagship dari Apple yang satu ini memang telah dinantikan kehadirannya, karena mengusung desain yang akhirnya lebih berbeda dari generasi-generasi sebelumnya. Walaupun belum hadir secara resmi, tak sedikit yang rela untuk membeli iPhone 12 Pro secara non-resmi, saking penginnya untuk memiliki lebih dulu.\n" +
                "\n" +
                "Yah nggak ada salahnya sih kalau memang budget-nya ada. Yang menjadi pertanyaan, seberapa jauh perbedaan antara flagship terbaru Apple di 2020 jika dibandingkan dengan seri iPhone 11 Pro? Jawabannya, tergantung dari bagaimana kamu menggunakan sebuah smartphone. Bisa terasa signifikan, bisa juga sama saja.",

        "Flagship dari Apple yang satu ini memang telah dinantikan kehadirannya, karena mengusung desain yang akhirnya lebih berbeda dari generasi-generasi sebelumnya. Walaupun belum hadir secara resmi, tak sedikit yang rela untuk membeli iPhone 12 Pro secara non-resmi, saking penginnya untuk memiliki lebih dulu.\n" +
                "\n" +
                "Yah nggak ada salahnya sih kalau memang budget-nya ada. Yang menjadi pertanyaan, seberapa jauh perbedaan antara flagship terbaru Apple di 2020 jika dibandingkan dengan seri iPhone 11 Pro? Jawabannya, tergantung dari bagaimana kamu menggunakan sebuah smartphone. Bisa terasa signifikan, bisa juga sama saja.",

        "iPhone SE 2020, smartphone teranyar keluaran Apple ini langsung membuat banyak orang kepincut.\n" +
                "\n" +
                "Oleh situs teknologi ternama, CNET, SE 2020 bahkan dinobatkan sebagai best budget phone untuk tahun ini.\n" +
                "\n" +
                "Ya, di negeri asalnya sana, Amerika 399 dollar AS atau setara Rp 6,3 jutaan untuk varian termurahnya.\n" +
                "\n" +
                "Harga tersebut bisa dibilang cukup terjangkau jika dibandingkan produk smartphone Apple lainnya. \n" +
                "\n" +
                "Dengan harga seperti itu, iPhone SE 2020 menawarkan ponsel yang dipersenjatai chipset cangggih setara dengan iPhone 11.",

        "Satu kata untuk menggambarkan kehadiran ponsel dari Apple, \"fenomenal\". Seperti apapun bentuk desain, fitur, dan spesifikasi yang ditawarkan, selalu menghadirkan banyak reaksi, positif maupun negatif.\n" +
                "\n" +
                "Reaksi positif jelas menjadi keuntungan tersendiri bagi produk ponsel Apple. Reaksi negatif yang hadir pun tidak terlalu berpengaruh. Karena, bagaimanapun reaksi pasar, produk ponsel dari Apple selalu dinantikan, termasuk perangkat bernama Apple iPhone 11 Pro.",

        "Dari tiga iPhone yang rilis pada tahun 2019 ini, iPhone 11 adalah varian yang paling seksi. Ia adalah lompatan besar sebagai suksesor iPhone XR. \n" +
                "Hal paling menarik dari iPhone 11 ada pada harganya. Dipatok 50 dollar AS lebih murah dibandingkan iPhone XR. Banderol yang lebih rendah, serta peningkatan fitur yang signifikan, menggambarkan upaya Apple agar iPhone 11 bisa diterima lebih banyak orang. Sementara penambahan nama \"Pro\" diberikan kepada iPhone yang lebih mewah di tahun ini.",

        "Tiga ponsel baru Apple yaitu iPhone XS, XS Max, dan XR akhirnya resmi menyambangi Indonesia hari ini, 14 Desember 2018. Kalau untuk iPhone XS dan XS Max, calon pembeli rasanya tidak perlu ragu untuk membeli karena memang diposisikan sebagai perangkat unggulan tahun ini. Namun, bagaimana dengan iPhone XR yang harga lebih murah? Apakah layak dibeli?\n" +
                "Bicara bagian desain, iPhone emang hampir tidak pernah mengecewakan. Walaupun bentuknnya sebenernya gitu-gitu saja, tapi kalau soal tampilan premium dengan material kaca serta didukung build quality solid dari rangka alumunium, iPhone XR sudah masuk kategori sangat baik. Sertifikasi tahan air juga tetap ada meskipun hanya IP67 yang masih satu tingkat di bawah IP68 pada XS dan XS Max.",

        "Kemunculan iPhone X di tahun 2017 lalu sempat menjadi kejutan tersendiri bagi para pecinta produk Apple, dikarenakan ponsel ini memiliki desain yang sangat elegan dan dilengkapi dengan layar yang lebih luas serta fitur menarik seperti FaceID yang mampu menggeser keberadaan TouchID. Sehingga pengguna tidak perlu lagi menggunakan fingerprint sensor untuk meng-unlock smartphone mereka.\n" +
                "\n" +
                "Tidak berhenti disitu, untuk memuaskan kebutuhan para pengguna iPhone, Apple kembali meluncurkan seri terbaru dari iPhone X yakni iPhone XS dan XS Max.",

        "Apa yang terbayang di pikiran Anda ketika mendengar nama iPhone X? Mahal, mewah, keren, ngiler, pengen jual ginjal. Apapun yang kita pikirkan tentang iPhone X tidak akan mengubah keadaan kalau ini adalah smartphone termahal sekaligus terunik yang pernah dirilis Apple.",

        "iPhone 8 merupakan salah satu produk Apple yang dirilis pada akhir tahun 2017, tepatnya bulan September 2017. Smartphone yang satu ini merupakan generasi penerus dari iPhone 7. Perihal spesifikasi dan fitur, smartphone ini hadir dengan beberapa teknologi terbaru yang lebih baik dari generasi sebelumnya. Namun, kualitas baterai yang dimiliki iPhone 8 ini tidak jauh berbeda dengan iPhone 7.\n" +
                "\n" +
                "Meski tidak sepopuleran produk Apple lainnya, iPhone 8 tentu masih menjadi smartphone yang layak untuk Anda miliki. Terlebih lagi, smartphone satu ini telah mengantongi seryifikat IP yang membuatnya dapat tahan terhadap debu dan air. Kelebihan satu ini tentu jarang Anda temukan pada brand smartphone lainnya.",

        "Selain sukses dengan jajaran iPhone seri X, Apple juga sempat mendulang kesuksesan dengan kehadiran duo iPhone seri 7 yang sempat menggebrak dunia smartphone dengan kemunculan kamera ganda berlensa telefoto yang mampu menghasilkan foto ala-ala kamera DSLR."
    };

    public static ArrayList<SetGet> getListData(){
        SetGet setGet = null;
        ArrayList<SetGet> list = new ArrayList<>();
        for(int i=0;i<image.length;i++){
            setGet = new SetGet();
            setGet.setImage(image[i]);
            setGet.setSeries(series[i]);
            setGet.setRelease(release[i]);
            setGet.setJudul(desc[i]);
            list.add((setGet));
        }
        return list;
    }

}
