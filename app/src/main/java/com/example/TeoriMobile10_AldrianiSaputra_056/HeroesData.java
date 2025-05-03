package com.example.TeoriMobile10_AldrianiSaputra_056;

import com.example.TeoriMobile10_AldrianiSaputra_056.R;

import java.util.ArrayList;
public class HeroesData {

    private static String[] heroNames = {
            "It Ends With Us - Colleen Hoover",
            "Moonlight Kiss - Annalise Grey",
            "Fourth Wing Gold Foil - Rebecca Yarros",
            "Laut Bercerita - Leila S. Chudori",
            "The Museum of the LOST & FOUND - Leila Sales",
            "Bulan - Tere Liye",
            "Bumi - Tere Liye",
            "Komet Minor - Tere Liye"
    };


    private static String[] heroDetails = {
            "Mengisahkan Lily Bloom, seorang perempuan mandiri yang memulai hidup baru di Boston dan membuka toko bunga impiannya. Ia jatuh cinta pada Ryle Kincaid, seorang dokter bedah tampan dengan masa lalu kelam. Namun, saat hubungan mereka diuji oleh rahasia dan luka lama, muncul kembali Atlas Corrigan, cinta pertamanya yang pernah menyelamatkan hidupnya. Lily dihadapkan pada pilihan sulit antara cinta, luka, dan keberanian untuk melindungi dirinya sendiri.",
            "Lucas Brent Lockwood adalah alpha werewolf yang tidak pernah benar-benar merasa menjadi bagian dari dua dunia—dunia manusia dan dunia supranatural. Dalam 'Moonlight Kiss', ia bertemu Luna, gadis manusia yang memiliki ikatan misterius dengannya. Saat rahasia masa lalu terbongkar dan bahaya mengintai dari klan saingan, Lucas harus memilih antara takdirnya sebagai pemimpin dan perasaannya yang tumbuh untuk Luna. Kisah ini memadukan aksi, cinta, dan dilema identitas dalam suasana romantis malam penuh cahaya bulan.",
            "Violet Sorrengail seharusnya menjadi seorang sarjana di dunia sastra, namun ia justru dipaksa ibunya untuk masuk Akademi Militer Basgiath, tempat para calon penunggang naga dilatih. Dalam dunia penuh kompetisi mematikan dan politik sihir, Violet harus bertahan hidup, membuktikan bahwa dirinya mampu, dan menjalin ikatan dengan naga yang bisa membunuhnya kapan saja. Ketika kekuatan dan cinta datang bersamaan, Violet harus menentukan apa yang layak diperjuangkan dan apa yang harus dikorbankan.",
            "Biru Laut, mahasiswa cerdas dan aktivis idealis tahun 1998, tiba-tiba menghilang setelah ditangkap oleh aparat. Dalam 'Laut Bercerita', kisahnya disampaikan dari sudut pandang adiknya, Asmara Jati, yang mencoba menemukan keberadaan kakaknya di tengah kebungkaman dan ketakutan masyarakat. Novel ini adalah pengingat akan perjuangan, kehilangan, dan pentingnya mengingat sejarah kelam bangsa agar tak terulang kembali.",
            "Vanessa, gadis kecil berusia 11 tahun, mendirikan sebuah 'museum' rahasia dari benda-benda yang ditinggalkan sahabatnya yang hilang. Setiap benda menjadi pengingat akan kenangan dan petunjuk untuk memahami perasaan kehilangan. Dalam perjalanannya, Vanessa belajar bahwa kehilangan tidak selalu berarti akhir, melainkan awal dari pemahaman yang lebih dalam tentang harapan, keberanian, dan cinta yang tak pernah benar-benar hilang.",
            "Dalam lanjutan kisah Raib, Seli, dan Ali, mereka menjelajah dunia Klan Matahari yang jauh lebih panas dan keras dari dunia sebelumnya. Misi mereka adalah menemukan kunci untuk menghentikan ancaman yang dapat menghancurkan semua klan. Di tengah konflik politik, kejahatan tersembunyi, dan tantangan yang semakin berat, ketiganya belajar tentang kepercayaan, pengorbanan, dan arti persahabatan sejati.",
            "Raib, gadis SMA yang memiliki kekuatan menghilang, menemukan dirinya berasal dari dunia paralel bernama Klan Bulan. Bersama dua sahabatnya, Seli dan Ali, ia memulai perjalanan penuh bahaya melintasi berbagai dunia dengan misi untuk melindungi keseimbangan antara klan. Perjalanan ini membuka rahasia keluarganya dan membuat Raib sadar bahwa takdirnya jauh lebih besar dari yang pernah ia bayangkan.",
            "Komet Minor adalah pertanda kehancuran bagi dunia Klan. Raib, Seli, dan Ali kini menghadapi ujian terakhir dalam petualangan epik mereka. Dalam peperangan terbesar antar dunia, mereka harus menggunakan semua kekuatan, pengetahuan, dan keberanian yang telah mereka kumpulkan. Persahabatan mereka diuji satu kali lagi, dan mereka harus memutuskan seberapa besar yang rela mereka korbankan demi kedamaian seluruh Klan."
    };




    private static int[] heroesImages = {
            R.drawable.buku1,
            R.drawable.buku2,
            R.drawable.buku3,
            R.drawable.buku4,
            R.drawable.buku5,
            R.drawable.buku6,
            R.drawable.buku7,
            R.drawable.buku8
    };

    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setDetail(heroDetails[position]);
            hero.setPhoto(heroesImages[position]);
            list.add(hero);
        }
        return list;
    }
}
