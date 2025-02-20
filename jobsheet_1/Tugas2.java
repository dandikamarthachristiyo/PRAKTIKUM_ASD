import java.util.Scanner;

public class Tugas2 {

    public static double hitungVolume(double sisi) {
        return (sisi * sisi * sisi); 
    }
    public static double hitungLuasPermukaan(double sisi) {
        return (6 * sisi * sisi); 
    }
    public static double hitungKeliling(double sisi) {
        return (12 * sisi);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan = 0;
        while (true) {
            System.out.println("=======================");
            System.out.println("Program Menghitung Kubus");
            System.out.println("=======================");
            System.out.println("1. Menghitung Volume Kubus");
            System.out.println("2. Menghitung Luas Permukaan Kubus");
            System.out.println("3. Menghitung Keliling Kubus");
            System.out.print("Pilih menu (1-3): ");
            pilihan = scanner.nextInt();
            if (pilihan >= 1 && pilihan <= 3) {
                break;
            } else {
                System.out.println("Pilihan tidak valid, silakan pilih antara 1 sampai 3.");
            }

        }
        System.out.print("Masukkan panjang sisi kubus: ");
        double sisi = scanner.nextDouble();
        System.out.println("=======================");
        switch (pilihan) {
            case 1:
                double volume = hitungVolume(sisi);
                System.out.println("Volume kubus adalah: " + volume);
                break;
            case 2:
                double luasPermukaan = hitungLuasPermukaan(sisi);
                System.out.println("Luas permukaan kubus adalah: " + luasPermukaan);
                break;
            case 3:
                double keliling = hitungKeliling(sisi);
                System.out.println("Keliling kubus adalah: " + keliling);
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                break;
        }

        scanner.close();
    }
}
