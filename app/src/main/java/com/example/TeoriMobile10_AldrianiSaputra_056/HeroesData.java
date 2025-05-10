package com.example.TeoriMobile10_AldrianiSaputra_056;

import com.example.TeoriMobile10_AldrianiSaputra_056.R;

import java.util.ArrayList;
public class HeroesData {

    private static String[] heroNames = {
            "It Ends With Us",
            "Moonlight Kiss",
            "Fourth Wing Gold Foil",
            "Laut Bercerita",
            "The Museum of the LOST & FOUND",
            "Bulan",
            "Bumi",
            "Komet Minor",
            "The Rose Bargain",
            "A Dark and Drowning Tide",
            "How to Kill a King",
            "Alice in Neverland",
            "Pater Pan in Wonderland",
            "This Spells Trouble"

    };

    private static int[] heroesImages = {
            R.drawable.buku1,
            R.drawable.buku2,
            R.drawable.buku3,
            R.drawable.buku4,
            R.drawable.buku5,
            R.drawable.buku6,
            R.drawable.buku7,
            R.drawable.buku8,
            R.drawable.buku9,
            R.drawable.buku10,
            R.drawable.buku11,
            R.drawable.buku12,
            R.drawable.buku13,
            R.drawable.buku14,
    };

    private static String[] heroAuthors = {
            "Colleen Hoover", "Annalise Grey", "Rebecca Yarros", "Leila S. Chudori", "Leila Sales",
            "Tere Liye", "Tere Liye", "Tere Liye", "Shasa Peyton Smith", "Allison Saft",
            "Stephanie Seed", "Jeni Conrad", "Jeni Conrad","Madison Martin"
    };

    private static String[] heroGenres = {
            "Romance", "Fantasy Romance", "Fantasy", "Historical Fiction", "Middle Grade",
            "Fantasy", "Fantasy", "Fantasy", "Enemies to Lovers", "Dark Fantasy",
            "Dark Royal", "Fantasy", "Fantasy Adventure","Fantasy"
    };

    private static String[] heroYears = {
            "2016", "2022", "2023", "2017", "2017",
            "2015", "2014", "2018", "2022", "2023",
            "2023", "2021", "2021","2020"
    };

    private static String[] heroDetails = {
            "Mengisahkan Lily Bloom, seorang perempuan mandiri yang memulai hidup baru di Boston dan membuka toko bunga impiannya. Ia jatuh cinta pada Ryle Kincaid, seorang dokter bedah tampan dengan masa lalu kelam. Namun, saat hubungan mereka diuji oleh rahasia dan luka lama, muncul kembali Atlas Corrigan, cinta pertamanya yang pernah menyelamatkan hidupnya. Lily dihadapkan pada pilihan sulit antara cinta, luka, dan keberanian untuk melindungi dirinya sendiri.",
            "Lucas Brent Lockwood adalah alpha werewolf yang tidak pernah benar-benar merasa menjadi bagian dari dua dunia—dunia manusia dan dunia supranatural. Dalam 'Moonlight Kiss', ia bertemu Luna, gadis manusia yang memiliki ikatan misterius dengannya. Saat rahasia masa lalu terbongkar dan bahaya mengintai dari klan saingan, Lucas harus memilih antara takdirnya sebagai pemimpin dan perasaannya yang tumbuh untuk Luna. Kisah ini memadukan aksi, cinta, dan dilema identitas dalam suasana romantis malam penuh cahaya bulan.",
            "Violet Sorrengail seharusnya menjadi seorang sarjana di dunia sastra, namun ia justru dipaksa ibunya untuk masuk Akademi Militer Basgiath, tempat para calon penunggang naga dilatih. Dalam dunia penuh kompetisi mematikan dan politik sihir, Violet harus bertahan hidup, membuktikan bahwa dirinya mampu, dan menjalin ikatan dengan naga yang bisa membunuhnya kapan saja. Ketika kekuatan dan cinta datang bersamaan, Violet harus menentukan apa yang layak diperjuangkan dan apa yang harus dikorbankan.",
            "Biru Laut, mahasiswa cerdas dan aktivis idealis tahun 1998, tiba-tiba menghilang setelah ditangkap oleh aparat. Dalam 'Laut Bercerita', kisahnya disampaikan dari sudut pandang adiknya, Asmara Jati, yang mencoba menemukan keberadaan kakaknya di tengah kebungkaman dan ketakutan masyarakat. Novel ini adalah pengingat akan perjuangan, kehilangan, dan pentingnya mengingat sejarah kelam bangsa agar tak terulang kembali.",
            "Vanessa, gadis kecil berusia 11 tahun, mendirikan sebuah 'museum' rahasia dari benda-benda yang ditinggalkan sahabatnya yang hilang. Setiap benda menjadi pengingat akan kenangan dan petunjuk untuk memahami perasaan kehilangan. Dalam perjalanannya, Vanessa belajar bahwa kehilangan tidak selalu berarti akhir, melainkan awal dari pemahaman yang lebih dalam tentang harapan, keberanian, dan cinta yang tak pernah benar-benar hilang.",
            "Dalam lanjutan kisah Raib, Seli, dan Ali, mereka menjelajah dunia Klan Matahari yang jauh lebih panas dan keras dari dunia sebelumnya. Misi mereka adalah menemukan kunci untuk menghentikan ancaman yang dapat menghancurkan semua klan. Di tengah konflik politik, kejahatan tersembunyi, dan tantangan yang semakin berat, ketiganya belajar tentang kepercayaan, pengorbanan, dan arti persahabatan sejati.",
            "Raib, gadis SMA yang memiliki kekuatan menghilang, menemukan dirinya berasal dari dunia paralel bernama Klan Bulan. Bersama dua sahabatnya, Seli dan Ali, ia memulai perjalanan penuh bahaya melintasi berbagai dunia dengan misi untuk melindungi keseimbangan antara klan. Perjalanan ini membuka rahasia keluarganya dan membuat Raib sadar bahwa takdirnya jauh lebih besar dari yang pernah ia bayangkan.",
            "Komet Minor adalah pertanda kehancuran bagi dunia Klan. Raib, Seli, dan Ali kini menghadapi ujian terakhir dalam petualangan epik mereka. Dalam peperangan terbesar antar dunia, mereka harus menggunakan semua kekuatan, pengetahuan, dan keberanian yang telah mereka kumpulkan. Persahabatan mereka diuji satu kali lagi, dan mereka harus memutuskan seberapa besar yang rela mereka korbankan demi kedamaian seluruh Klan.",
            "Ketika Lily mendapati dirinya terjebak dalam pernikahan palsu demi menyelamatkan bisnis keluarga, ia tidak menyangka bahwa pria yang harus ia nikahi adalah musuh masa kecilnya, Theo. Namun di balik kebencian lama, muncul percikan yang tidak bisa diabaikan. 'The Rose Bargain' adalah kisah tentang cinta yang tumbuh dari kebencian, kesepakatan yang membawa perubahan, dan perjuangan untuk saling memahami di tengah badai kesalahpahaman.",
            "Saat ombak membawa puing kapal ke pesisir desa terpencil, Evie menemukan dirinya terlibat dalam misteri yang lebih dalam dari sekadar laut. Dalam 'A Dark and Drowning Tide', Evie menyadari bahwa darah bangsawan yang mengalir di tubuhnya membawa kutukan kuno yang membangkitkan makhluk-makhluk kelam dari laut. Untuk menyelamatkan desanya dan dirinya sendiri, Evie harus menghadapi masa lalu keluarganya dan rahasia yang telah terkubur dalam gelapnya air pasang.",
            "Seorang putri muda yang tak pernah mengenal dunia luar, Alethea dilatih sejak kecil untuk menjadi alat pembunuh dalam istana. Namun, ketika ia mendapatkan kesempatan untuk merebut kebebasannya, Alethea merancang misi membunuh sang raja—ayahnya sendiri. 'How to Kill a King' adalah kisah penuh intrik istana, pengkhianatan, dan tekad seorang gadis yang memilih menjadi penguasa atas takdirnya sendiri.",
            "Alice selalu merasa tidak cocok di dunianya—hingga suatu malam ia tersesat ke dunia aneh bernama Neverland, tempat mimpi dan mimpi buruk bercampur jadi satu. Dalam petualangannya, ia bertemu Peter Pan, pemimpin pemberontak yang mencoba menyelamatkan dunia itu dari kehancuran. 'Alice in Neverland' adalah perpaduan gelap dan ajaib dari dua dunia dongeng yang berubah jadi medan perang antara harapan dan ketakutan.",
            "Ketika Peter Pan jatuh ke dalam portal ajaib yang menghubungkannya dengan Wonderland, ia harus bekerja sama dengan Alice untuk melawan Ratu Merah dan Kapten Hook yang kini bersatu demi menguasai kedua dunia. 'Peter Pan in Wonderland' adalah kisah petualangan epik yang mempertemukan dua legenda klasik dalam peperangan antara kekacauan dan keseimbangan, dengan twist tak terduga di setiap belokan cerita.",
            "Ketika Peter Pan jatuh ke dalam portal ajaib yang menghubungkannya dengan Wonderland, ia harus bekerja sama dengan Alice untuk melawan Ratu Merah dan Kapten Hook yang kini bersatu demi menguasai kedua dunia. 'Peter Pan in Wonderland' adalah kisah petualangan epik yang mempertemukan dua legenda klasik dalam peperangan antara kekacauan dan keseimbangan, dengan twist tak terduga di setiap belokan cerita."
    };
    static ArrayList<Hero> getListData() {
        ArrayList<Hero> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++) {
            Hero hero = new Hero();
            hero.setName(heroNames[position]);
            hero.setPhoto(heroesImages[position]);
            hero.setAuthor(heroAuthors[position]);
            hero.setGenre(heroGenres[position]);
            hero.setYear(heroYears[position]);
            hero.setDetail(heroDetails[position]);
            list.add(hero);
        }
        return list;
    }
}
