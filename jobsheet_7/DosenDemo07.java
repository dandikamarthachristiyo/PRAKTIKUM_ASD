package jobsheet_7;
import java.util.Scanner;
public class DosenDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen : ");
        int jmlDsn = sc.nextInt();
        sc.nextLine();
        System.out.println("---------------------------------------------------");
        DataDosen07 list = new DataDosen07(jmlDsn);
        for (int i = 0; i < jmlDsn; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode           : ");
            String kode = sc.nextLine();
            System.out.print("Nama           : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin  : ");
            String jk = sc.nextLine();
            boolean jenisKelamin = jk.equalsIgnoreCase("Pria");
            System.out.print("Usia           : ");
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------------");
            list.tambah(new Dosen07(kode, nama, jenisKelamin, usia));
        }
        System.out.println("----------------------------------------------");
        System.out.println("Pencarian data dosen");
        System.out.println("----------------------------------------------");
        System.out.print("Masukkan nama dosen yang dicari: ");
        String namaDosen = sc.nextLine();
        int posisiNama = list.PencarianDataSequential07(namaDosen);
        if (posisiNama > 1) {
            System.out.println("Peringatan! Terdapat " + posisiNama + " dosen dengan nama '" + namaDosen + "'");
        }
        list.tampilDataSearchNama(namaDosen);

        System.out.println("----------------------------------------------");
        System.out.println("Pencarian data dosen");
        System.out.println("----------------------------------------------");
        System.out.print("Masukkan usia dosen yang dicari: ");
        int usiaDosen = sc.nextInt();
        sc.nextLine();
        list.bubbleSort();
        int jumlahDosenDenganUsia = list.PencarianDataBinary07(usiaDosen, 0, jmlDsn - 1);
        if (jumlahDosenDenganUsia > 1) { 
            System.out.println("Peringatan! Terdapat " + jumlahDosenDenganUsia + " dosen dengan usia " + usiaDosen);
        }
        list.tampilDataSearchUsia(usiaDosen);
        sc.close();
    }
}
