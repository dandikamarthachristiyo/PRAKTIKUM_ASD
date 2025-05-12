package jobsheet_9;
import java.util.Scanner;
public class SuratDemo07 {
    public static void main(String[] args) {
        StackSurat07 stack = new StackSurat07(3);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("===================================");
            System.out.println("          MENU UTAMA              ");
            System.out.println("===================================");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.println("===================================");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
            System.out.println();
            switch (pilih) {
                case 1:
                    System.out.print("ID Surat          : ");
                    String idSurat = sc.nextLine();
                    System.out.print("Nama Mahasiswa    : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas             : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (I/S)  : ");
                    char izin = sc.next().charAt(0);
                    System.out.print("Durasi            : ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    Surat07 surat = new Surat07(idSurat, nama, kelas, izin, durasi);
                    stack.push(surat);
                    System.out.printf("Surat %s berhasil dikumpulkan\n", surat.namaMahasiswa);
                    break;
                case 2:
                    Surat07 verifikasi = stack.peek();
                    if (verifikasi != null) {
                        System.out.println("Memverifikasi surat dari " + verifikasi.namaMahasiswa);
                        System.out.print("Verifikasi? (Ya/Tidak) : ");
                        String verif = sc.nextLine();
                        if (verif.equalsIgnoreCase("ya")) {
                            System.out.printf("Surat dari %s telah diverifikasi.\n", verifikasi.namaMahasiswa);
                            stack.pop();
                        }
                    }
                    break;
                case 3:
                    Surat07 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat Izin terakhir dikumpulkan oleh " + lihat.namaMahasiswa);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String cariMhs = sc.nextLine();
                    boolean ditemukan = false;
                    for (int i = stack.top; i >= 0; i--) {
                        if (stack.stack[i].namaMahasiswa.equalsIgnoreCase(cariMhs)) {
                            System.out.println("Surat Ditemukan");
                            System.out.println("ID Surat\tNama Mahasiswa\tKelas\tJenis Izin\tDurasi");
                            System.out.println(stack.stack[i].idSurat + "\t\t" + stack.stack[i].namaMahasiswa + "\t\t" + stack.stack[i].kelas + "\t" + stack.stack[i].jenisIzin + "\t\t" + stack.stack[i].durasi);
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Surat tidak ditemukan!");
                    }
                    break;
                case 0:
                    System.out.println("Terimakasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 0);
        sc.close();
    }
}
