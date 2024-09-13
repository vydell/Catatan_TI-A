import java.util.Scanner;

public class hitungjam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah_detik = input.nextInt();
        int jam = jumlah_detik / 3600; // --> 0
        int menit = (jumlah_detik%3600)/60; //--> 14
        int detik_sisa = (jumlah_detik%3600)%60;

        int angkaSatuDua = 2345;
        int angka_satu_dua = 5678;
        
        angkaSatuDua = 9803;
        
        System.out.printf("%02d:%02d:%02d",jam,menit,detik_sisa);
    }
}