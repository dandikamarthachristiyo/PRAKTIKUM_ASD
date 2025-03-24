package jobsheet_6;
import java.util.Scanner;
public class MahasiswaDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi07 list = new MahasiswaBerprestasi07();
        for(int i=0; i < 5; i++){
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
            Mahasiswa07 mahasiswa = new Mahasiswa07(nim, nama, kelas, ipk);
            list.tambah(mahasiswa);
        }
        //Mahasiswa07 m1 = new Mahasiswa07("123", "Zidan", "2A", 3.2);
        //Mahasiswa07 m2 = new Mahasiswa07("124", "Ayu", "2A", 3.5);
        //Mahasiswa07 m3 = new Mahasiswa07("125", "Sofi", "2A", 3.1);
        //Mahasiswa07 m4 = new Mahasiswa07("126", "Sita", "2A", 3.9);
        //Mahasiswa07 m5 = new Mahasiswa07("127", "Miki", "2A", 3.7);

        //System.out.println("Data mahasiswa sebelum sorting: ");
        //list.tampil();

        //System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        //list.bubbleSort();
        //list.tampil();

        //System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC)");
        //list.selectionSort();
        //list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
        sc.close();
    }
}
