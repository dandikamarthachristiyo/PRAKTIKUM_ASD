package jobsheet_3;
import java.util.Scanner;
public class MataKuliahDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Jumlah Matakuliah : ");
        int jmlmtk = sc.nextInt();
        MataKuliah07[] arrayOfMataKuliah07 = new MataKuliah07[jmlmtk];

        for(int i=0; i < jmlmtk; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah07[i] = new MataKuliah07();
            arrayOfMataKuliah07[i].tambahData(sc);
        }
        for (int i = 0; i < jmlmtk; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMataKuliah07[i].cetakInfo();
        }

    }
}
