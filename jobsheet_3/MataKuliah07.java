package jobsheet_3;
import java.util.Scanner;
public class MataKuliah07 {
    public MataKuliah07 () {
    }
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah07(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void tambahData(Scanner sc) {
        System.out.print("Kode       : ");
        this.kode = sc.nextLine();
        System.out.print("Nama       : ");
        this.nama = sc.nextLine();
        System.out.print("Sks        : ");
        this.sks = sc.nextInt();
        System.out.print("Jumlah Jam : ");
        this.jumlahJam = sc.nextInt();
        sc.nextLine();
        System.out.println("-----------------------------");
    }
    public void cetakInfo() {
        System.out.println("Kode       : " + kode);
        System.out.println("Nama       : " + nama);
        System.out.println("Sks        : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
        System.out.println("-----------------------------");
    }
}
