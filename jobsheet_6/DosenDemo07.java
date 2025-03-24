package jobsheet_6;
import java.util.Scanner;
public class DosenDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen07 list = new DataDosen07();
        System.out.print("Masukkan jumlah dosen(1 - 10!) : ");
        int jmlDsn = sc.nextInt();
        sc.nextLine();
        System.out.println("---------------------------------------------------");
        for (int i=0; i<jmlDsn; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode           : ");
            String kode = sc.nextLine();
            System.out.print("Nama           : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin  : ");
            String jk = sc.nextLine();
            boolean jenisKelamin = jk.equalsIgnoreCase("Pria");
            System.out.print("Usia           : " );
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------------");
            Dosen07 dosen = new Dosen07(kode, nama, jenisKelamin, usia);
            list.tambah(dosen);
        }
        System.out.println("Data dosen sebelum sorting: ");
        list.tampil();

        System.out.println("Data dosen yang sudah terurut menggunakan BUBBLE SORT (ASC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data dosen yang sudah terurut menggunakan SELECTION SORT (DESC)");
        list.selectionSort();
        list.tampil();

        System.out.println("Data dosen yang sudah terurut menggunakan INSERTION SORT (DESC)");
        list.insertionSort();
        list.tampil();
        sc.close();
    }
}
