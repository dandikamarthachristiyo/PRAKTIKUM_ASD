import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] matakuliah = {
            "Pancasila",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Keselamatan dan Kesehatan Kerja"
        };
        double[] nilaiAngka = new double[8];
        String[] nilaiHuruf = new String[8];
        double[] bobotNilai = new double[8];
        double totalBobot = 0;

        System.out.println("=======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("=======================");
        for (int i = 0; i < matakuliah.length; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + matakuliah[i] + ": ");
            nilaiAngka[i] = input.nextDouble();

            if (nilaiAngka[i] >= 80 && nilaiAngka[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.50;
            } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.00;
            } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.50;
            } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.00;
            } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.00;
            } else if (nilaiAngka[i] >= 0 && nilaiAngka[i] <= 39) {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.00;
            }
            totalBobot += bobotNilai[i];
        }

        System.out.println("=======================");
        System.out.println("\nHasil Konversi Nilai:");
        System.out.println("=======================");
        System.out.printf("%-40s %-15s %-10s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < matakuliah.length; i++) {
            System.out.printf("%-40s %-15.2f %-10s %-15.2f\n", 
                matakuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }
        double ip = totalBobot / matakuliah.length;
        System.out.println("\nIP : " + String.format("%.2f", ip));
        input.close();
    }
}
