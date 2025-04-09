package jobsheet_7;
import java.util.Scanner;
public class MahasiswaDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah Mahasiswa : ");
        int jumMhs = sc.nextInt();
        sc.nextLine();
        System.out.println("---------------------------------------------------");
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07(jumMhs);
        for(int i=0; i < jumMhs; i++){
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan NIM     : ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Nama    : ");
            String nama = sc.nextLine();
            System.out.print("Masukkan Kelas   : ");
            String kelas = sc.nextLine();
            System.out.print("Masukkan IPK     : ");
            String dummy = sc.nextLine();
            double ipk = Double.parseDouble(dummy);
            System.out.println("-----------------------------");
            list.tambah(new Mahasiswa07(nim, nama, kelas, ipk));
        }
            list.tampil();
            System.out.println("----------------------------------------------");
            System.out.println("Pencarian data");
            System.out.println("----------------------------------------------");
            System.out.println("masukkan ipk mahasiswa yang dicari: ");
            System.out.print("IPK: ");
            String ipk = sc.nextLine();
            double cari = Double.parseDouble(ipk);
            
            System.out.println("menggunakan sequential searching");
            double posisi = list.sequentialSearching(cari);
            int pps = (int)posisi;
            list.tampilPosisi(cari, pps);
            list.tampilDataSearch(cari, pps);
            //System.out.println("-------------------------------");
            //System.out.println("menggunakan binary search");
            //System.out.println("-------------------------------");
            //double posisi2 =list.findBinarySearch(cari, 0, jumMhs-1);
            //int pss2= (int)posisi2;
            //list.tampilPosisi(cari, pss2);
            //list.tampilDataSearch(cari, pss2);
        sc.close();
    }
}
