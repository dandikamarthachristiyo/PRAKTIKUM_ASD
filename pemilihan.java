import java.util.Scanner;
public class pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("=======================");
        System.out.print("Masukkan Nilai Tugas : ");
        byte tugas = sc.nextByte();
        System.out.print("Masukkan Nilai KUIS : ");
        byte kuis = sc.nextByte();
        System.out.print("Masukkan Nilai UTS : ");
        byte uts = sc.nextByte();
        System.out.print("Masukkan Nilai UAS : ");
        byte uas = sc.nextByte();
        System.out.println("=======================");
        System.out.println("=======================");
        if (tugas > 100 || kuis > 100 || uts > 100 || uas > 100) {
            System.out.println("Nilai Tidak Valid");            
        } else {
            double nilaiAkhir = (tugas + kuis + uts + uas)/4;            
            System.out.println("nilai akhir : " + nilaiAkhir);
            if ((nilaiAkhir > 80) && (nilaiAkhir <= 100)) {
                System.out.println("Nilai huruf = A");
            } else if ((nilaiAkhir > 73) && (nilaiAkhir <= 80)) {
                System.out.println("Nilai huruf = B+");
            } else if ((nilaiAkhir > 65) && (nilaiAkhir <= 73)) {
                System.out.println("Nilai huruf = B");
            } else if ((nilaiAkhir > 60) && (nilaiAkhir <= 65)) {
                System.out.println("Nilai huruf = C+");
            } else if ((nilaiAkhir > 50) && (nilaiAkhir <= 60)) {
                System.out.println("Nilai huruf = C");
            } else if ((nilaiAkhir > 39) && (nilaiAkhir <= 50)) {
                System.out.println("Nilai huruf = D");
            } else if ((nilaiAkhir > 0) && (nilaiAkhir <= 39)) {
                System.out.println("Nilai huruf = E");    
            }
            System.out.println("=======================");
            System.out.println("=======================");
            if (nilaiAkhir > 49 && nilaiAkhir <= 100) {
                System.out.println("SELAMAT ANDA LULUS");
            } else {
                System.out.println("ANDA TIDAK LULUS");
            }
            
        }
        System.out.println("=======================");
        System.out.println("=======================");
        sc.close();
    }
}