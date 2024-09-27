public class ifElse {
    public static void main(String[] args) {

        //LOGICAL OPERATORS
        // && (AND)
        // || (OR)
        // == (sama dengan)
        // variable1.equals(variable2) --> membandingkan 2 string yang berbeda
        // bisa juga ditulis variable.equals("String ...") --> tanpa mengunakan variable

        String satu = "Satu";
        String dua = "Satu";
        System.out.println(satu == dua);        //jangan dibiasakan
        System.out.println(satu.equals(dua));   //biasakan pake ini
        System.out.println(satu.equals("Satu"));

        // != (tidak sama dengan)
        // > (lebih dari)
        // < (kurang dari)
        // >= (lebih dari sama dengan)
        // <= (kurang dari sama dengan)
        // ! (NOT) --> mengembalikan boolean yang berkebalikan

        boolean sudahMakan = false;
        System.out.println("Sudah makan? "+(!sudahMakan));

        // ^ (XOR) INI HAMPIR TIDAK PERNAH DIPAKE UNTUK PEMDAS
        

        //if else
        int nilai = 89;


        //style format 1 (Standard)
        if (nilai>80) { //cek jika nilai > 80
            System.out.println("Anda lulus"); //jika true
        } else {
            System.out.println("Anda gagal"); //jika false
        }

        //style format 2 
        if (nilai>80) 
        {
            System.out.println("Anda lulus");
        }
        else 
        {
            System.out.println("Anda gagal");
        }

        String genderOrang = "Perempuan";
        int umurOrang = 10;
        if (genderOrang.equals("Perempuan") && umurOrang >= 10) {   //kondisi gender harus Perempuan DAN umur harus >= 10 untuk true
            System.out.println("Harga tiket perempuan dewasa");
        } else if (genderOrang.equals("Permepuan")){                //kondisi gender harus Perempuan, tetapi umur < 10 untuk true
            System.out.println("Harga tiket perempuan anak-anak");
        } else {
            System.out.println("Belum tersedia");   //kondisi gender bukan Perempuan
        }

        double ipk = 3.5;
        double skm = 880;
        if (ipk >= 3.5 || skm>=890) {                   //salah satu kondisi ipk >= 3.5 ATAU skm >= 890 perlu terpenuhi untuk true
            System.out.println("Memenuhi syarat");
        } else {                                        //dialihkan ke else jika kondisi ipk >= 3.5 dan skm >= 890 DUA DUANYA FALSE
            System.out.println("Tidak memenuhi syarat");
        }


        //else if
        nilai = 60;
        if (nilai>80) {
            System.out.println("Anda dapat A");
        } else if (nilai>60) {
            System.out.println("Anda dapat B");
        } else {
            System.out.println("Anda dapat C");
        }

        //tanpa else --> masih bisa jalan. Jika tidak memerlukan output/perubahan/process jika kondisi tidak terpenuhi
        nilai = 80;
        if (nilai>=80) {
            System.out.println("Anda dapat A");
        } else if (nilai>=60) {
            System.out.println("Anda dapat B");
        } else if (nilai>=50) {
            System.out.println("Anda dapat C");
        }

        nilai = 99;
        if (nilai==100) {
            System.out.println("Nilai anda maksimal");
        }


        //menggabungkan operasi dalam kondisi IF
        if ((nilai+1)==100) {
            System.out.println("Nilai anda maksimal dengan bonus point");
        }

        System.out.println(nilai);


        // switch case
        int hari = 4;
        String abc = "c";

        switch (abc) { //bracket hanya sepasang untuk membungkus seluruh case-case pada switch case

            case "a": // sama saja if (abc == "a")
                System.out.println("alphabet pertama"); //Boleh lebih dari 1 baris kode
                //di sini boleh isi kode lain jika memenuhi abc == "a"
                break;

            case "b":  // sama saja else if (abc == "b")
                System.out.println("alphabet kedua");
                break;
                
            default: // sama aja else, tidak wajib ada jika tidak diperlukan output/perubahan untuk nilai yang di luar kondisi
                System.out.println("tidak ada di abc");
                break;

        }   


        // ternary operator
        int angkaBesar = 10;
        int angkaKecil = 20;

        if (angkaBesar>angkaKecil) {
            System.out.println("Angka lebih besar adalah "+angkaBesar);
        } else {
            System.out.println("Angka lebih besar adalah "+angkaKecil);
        }


        //INGAT!!! YANG [KIRI] ITU JIKA KONDISI TRUE : YANG [KANAN] ITU JIKA KONDISI FALSE
        int yangLebihBesar = (angkaBesar>angkaKecil)? angkaBesar : angkaKecil;
        System.out.println("Angka lebih besar adalah "+yangLebihBesar);


        //NESTED IF ELSE
        String warna = "Pink";
        int umur = 12;

        if (warna=="Pink") { //blok kode if else 1
            //spasi baris di sini hanya untuk mempermudah melihat nested if-else. Tidak perlu spasi

            if (umur>=20) {  //blok kode if else 2          --> terdapat blok if else dalam blok if else
                System.out.println("Perempuan dewasa");
            } else if (umur>=13) {
                System.out.println("Perempuan remaja");
            } else {
                System.out.println("Perempuan anak-anak");
            }


        } else if (warna=="Biru") { //blok kode if else 1
            if (umur>=20) {         //blok kode if else 2 
                System.out.println("Laki-laki dewasa");
            } else if (umur>=13) {
                System.out.println("Laki-laki remaja");
            } else {
                System.out.println("Laki-laki anak-anak");
            }
        }


        // ++variable
        // variable++
        // sama-sama artinya variable = variable + 1;

        int hey = 0;
        if (hey++ == 1) {
            System.out.println("ya nambah 1 weh");
        } else {
            System.out.println("0 lah kocak");
        }

        // PERBEDAAN ++variable DENGAN variable++
        //System.out.println(hey);


        //SHORTHAND OPERATORS
        // a+=b;
        // a = a + b;

        // a-=b;
        // a = a - b
        
        // a*=b;
        // a = a * b;

        // a/=b;
        // a = a / b;

        // a%=b;
        // a = a%b;

        int a = 10;
        int b = 12;
        if ((a%=b)>5) {
            System.out.println();
        }

        //menukar isi dari 2 variable
        a = 10;
        b = 20;

        int temp;
        temp = a;
        a = b; // a = 20
        b = temp; // b = 10

        // kenapa bukan pake a = b?

        System.out.println(a);

        // CHALLENGE: POIN KEAKTIFAN 1
        // BIKIN PROGRAM AGAR ANGKA A DAN B DIBANDINGKAN NILAINYA
        // A HARUS LEBIH BESAR DARIPADA B
        // TUKAR NILAINYA JIKA B>A
        // PRINT NILAI A DAN B

        //CHALLENGE: POIN KEAKTIFAN 2
        // BIKIN PROGRAM YANG MENGHITUNG JIKA PELANGGAN MENDAPATKAN DISKON
        // JIKA PEMBELIAN > 100, PELANGGAN DAPAT DISKON 10%
        // JIKA PEMBELIAN > 200, PELANGGAN DAPAT DISKON 20%
        // JIKA PEMBELIAN > 500, PELANGGAN DAPAT DISKON 50%
        // OUTPUT LANGSUNG JUMLAH TOTAL PEMBELIAN DENGAN DISKON
        // TETAP HARUS OUTPUT TOTAL PEMBELIAN MESKIPUN TIDAK DISKON
    }
}
