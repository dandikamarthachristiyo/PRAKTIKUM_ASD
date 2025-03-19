package jobsheet_5;
import java.util.Scanner;
public class MainFaktorial07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input.nextInt();

        Faktorial07 fk = new Faktorial07();
        System.out.println("Nilai faktorial " +nilai+" menggunakan BF: " +fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " +nilai+" menggunakan DC: " +fk.faktorialDC(nilai));
    }
}
