package jobsheet_10;
import java.util.Scanner;
public class LayananKRS07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS07 krs = new AntrianKRS07(10, 30);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Cek Antrian Kosong");
            System.out.println("2. Cek Antrian Penuh");
            System.out.println("3. Mengosongkan Antrian");
            System.out.println("4. Menambah Antrian");
            System.out.println("5. Memproses 2 Antrian KRS");
            System.out.println("6. Menampilkan Semua Antrian");
            System.out.println("7. Menampilkan 2 Antrian Terdepan");
            System.out.println("8. Menampilkan Antrian Terakhir");
            System.out.println("9. Cetak Jumlah Antrian");
            System.out.println("10. Cetak Jumlah Yang Sudah Melakukan KRS");
            System.out.println("11. Cetak Jumlah Yang Belum Melakukan KRS");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();
            switch (pilihan) {
                case 1:
                    if (krs.IsEmpty()) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Antrian tidak kosong.");                       
                    }
                    break;
                case 2:
                    if (krs.IsFull()) {
                        System.out.println("Antrian sudah penuh.");
                    } else {
                        System.out.println("Antrian belum penuh.");
                    }
                    break;
                case 3:
                    krs.clear();
                    break;
                case 4:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa07 mhs = new Mahasiswa07(nim, nama, prodi, kelas);
                    krs.tambahAntrian(mhs);
                    break;
                case 5:
                    Mahasiswa07[] dilayani = krs.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Memproses mahasiswa:");
                        for (Mahasiswa07 m : dilayani) {
                            m.tampilkanData();
                        }
                    }
                    break;
                case 6:
                    krs.tampilkanSemua();
                    break;
                case 7:
                    krs.lihatTerdepan();
                    break;
                case 8:
                    krs.lihatAkhir();
                    break;
                case 9:
                    System.out.println("Jumlah Mahasiswa dalam antrian: " + krs.getJumlahAntrian());
                    break;
                case 10:
                    System.out.println("Jumlah Mahasiswa yang sudah melakukan KRS: " + krs.getJumlahKRS());
                    break;
                case 11:
                    System.out.println("Jumlah Mahasiswa yang belum melakukan KRS: " + krs.getSisaKRS()); 
                    break;
                case 0: 
                    System.out.println("Terimakasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}
