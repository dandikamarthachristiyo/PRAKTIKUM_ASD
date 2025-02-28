package jobsheet_3;
import java.util.Scanner;
public class DosenDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Dosen : ");
        int jmldsn = sc.nextInt();
        sc.nextLine();
        Dosen07 [] arrayOfDosen = new Dosen07[jmldsn];
        
        for (int i = 0; i < jmldsn; i++) {
            
            arrayOfDosen[i] = new Dosen07();
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode           : ");
            arrayOfDosen[i].kode = sc.nextLine();
            System.out.print("Nama           : ");
            arrayOfDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin  : ");
            String dummy = sc.nextLine();
            arrayOfDosen[i].jenisKelamin = dummy.equalsIgnoreCase("Pria");
            System.out.print("Usia           : " );
            arrayOfDosen[i].usia = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------------");
        }
        //int index = 1;
        //for (Dosen07 dosen : arrayOfDosen) { 
        //    System.out.println("Data Dosen ke-" + index);
        //    System.out.println("Kode           : " + dosen.kode);
        //    System.out.println("Nama           : " + dosen.nama);
        //    System.out.println("Jenis Kelamin  : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
        //    System.out.println("Usia           : " + dosen.usia);
        //    System.out.println("-----------------------------");
        //    index++;
        //}
        DataDosen07 dataDosen = new DataDosen07();
        dataDosen.dataSemuaDosen(arrayOfDosen); 
        System.out.println();   
        System.out.println("-------------------------------");
        dataDosen.jumlahDosenPerJeniskelamin(arrayOfDosen);
        System.out.println("-------------------------------");
        dataDosen.rerataUsiaDosen(arrayOfDosen);
        System.out.println("-------------------------------");
        System.out.println();
        dataDosen.infoDosenPalingTua(arrayOfDosen);
        System.out.println();
        dataDosen.infoDosenPalingMuda(arrayOfDosen);
    }
}
