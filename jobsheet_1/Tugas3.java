import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        String[] namaMataKuliah = new String[n];
        int[] SKS = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMata kuliah ke-" + (i + 1));

            System.out.print("Masukkan nama mata kuliah: ");
            namaMataKuliah[i] = scanner.nextLine();

            System.out.print("Masukkan jumlah SKS: ");
            SKS[i] = scanner.nextInt();

            System.out.print("Masukkan semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Masukkan hari kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Menampilkan seluruh jadwal kuliah");
            System.out.println("2. Menampilkan jadwal kuliah berdasarkan hari");
            System.out.println("3. Menampilkan jadwal kuliah berdasarkan semester");
            System.out.println("4. Mencari mata kuliah berdasarkan nama");
            System.out.println("5. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine(); 

            switch (opsi) {
                case 1:
                    tampilkanSeluruhJadwal(namaMataKuliah, SKS, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari yang ingin ditampilkan (Senin, Selasa, dst.): ");
                    String hari = scanner.nextLine();
                    tampilkanJadwalBerdasarkanHari(hari, namaMataKuliah, SKS, semester, hariKuliah);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int semesterInput = scanner.nextInt();
                    tampilkanJadwalBerdasarkanSemester(semesterInput, namaMataKuliah, SKS, semester, hariKuliah);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String namaCari = scanner.nextLine();
                    cariMataKuliah(namaCari, namaMataKuliah, SKS, semester, hariKuliah);
                    break;
                case 5:
                    System.out.println("Terima kasih, program selesai.");
                    scanner.close();
                    return;  
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih lagi.");
            }
        }
    }

    private static void tampilkanSeluruhJadwal(String[] namaMataKuliah, int[] SKS, int[] semester, String[] hariKuliah) {
        System.out.println("\n===== Seluruh Jadwal Kuliah =====");
        for (int i = 0; i < namaMataKuliah.length; i++) {
            System.out.println("Mata Kuliah: " + namaMataKuliah[i]);
            System.out.println("SKS: " + SKS[i]);
            System.out.println("Semester: " + semester[i]);
            System.out.println("Hari: " + hariKuliah[i]);
            System.out.println("----------------------------------");
        }
    }

    private static void tampilkanJadwalBerdasarkanHari(String hari, String[] namaMataKuliah, int[] SKS, int[] semester, String[] hariKuliah) {
        System.out.println("\n===== Jadwal Kuliah Hari " + hari + " =====");
        boolean ditemukan = false;
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (hariKuliah[i].equalsIgnoreCase(hari)) {
                System.out.println("Mata Kuliah: " + namaMataKuliah[i]);
                System.out.println("SKS: " + SKS[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Hari: " + hariKuliah[i]);
                System.out.println("----------------------------------");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada hari " + hari);
        }
    }

    private static void tampilkanJadwalBerdasarkanSemester(int semesterInput, String[] namaMataKuliah, int[] SKS, int[] semester, String[] hariKuliah) {
        System.out.println("\n===== Jadwal Kuliah Semester " + semesterInput + " =====");
        boolean ditemukan = false;
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (semester[i] == semesterInput) {
                System.out.println("Mata Kuliah: " + namaMataKuliah[i]);
                System.out.println("SKS: " + SKS[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Hari: " + hariKuliah[i]);
                System.out.println("----------------------------------");
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal kuliah pada semester " + semesterInput);
        }
    }

    private static void cariMataKuliah(String namaCari, String[] namaMataKuliah, int[] SKS, int[] semester, String[] hariKuliah) {
        System.out.println("\n===== Pencarian Mata Kuliah: " + namaCari + " =====");
        boolean ditemukan = false;
        for (int i = 0; i < namaMataKuliah.length; i++) {
            if (namaMataKuliah[i].equalsIgnoreCase(namaCari)) {
                System.out.println("Mata Kuliah: " + namaMataKuliah[i]);
                System.out.println("SKS: " + SKS[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Hari: " + hariKuliah[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah dengan nama " + namaCari + " tidak ditemukan.");
        }
    }
}
