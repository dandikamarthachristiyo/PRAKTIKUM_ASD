import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        String[] KOTA = {
            "BANTEN", 
            "JAKARTA",   
            "BANDUNG",     
            "CIREBON",    
            "BOGOR",   
            "PEKALONGAN",   
            "SEMARANG", 
            "SURABAYA",   
            "MALANG",  
            "TEGAL"      
        };

        System.out.println("Tabel Kode Plat Mobil dan Kota:");
        System.out.println("------------------------------------------------");
        System.out.println("| Kode Plat |      Kota        |");
        System.out.println("------------------------------------------------");

        for (int i = 0; i < KODE.length; i++) {
            System.out.printf("|     %c     | %-15s |\n", KODE[i], KOTA[i]);
        }
        System.out.println("------------------------------------------------");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode plat mobil : ");
        char inputKode = scanner.next().charAt(0);

        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (Character.toUpperCase(inputKode) == KODE[i]) {
                System.out.println("Kode plat " + inputKode + " berpasangan dengan kota: " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
        
        scanner.close();
    }
}
