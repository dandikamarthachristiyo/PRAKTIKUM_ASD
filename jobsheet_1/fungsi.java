import java.util.Scanner;

public class fungsi {

    static final int AGLOMENA_PRICE = 75000;
    static final int KELADI_PRICE = 50000;
    static final int ALOCASIA_PRICE = 60000;
    static final int MAWAR_PRICE = 10000;

    static String[] plantTypes = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    
    public static void main(String[] args) {
        int cabang = 4;
        int plantCount = plantTypes.length;

        int[][] stokBunga = new int[cabang][plantCount];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan data stok untuk setiap cabang RoyalGarden:");
        
        for (int i = 0; i < cabang; i++) {
            System.out.println("\nCabang RoyalGarden " + (i + 1) + ":");
            for (int j = 0; j < plantCount; j++) {
                System.out.print("Stok " + plantTypes[j] + ": ");
                stokBunga[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nData stok bunga di RoyalGarden:");
        displayStokBunga(stokBunga, cabang, plantCount);

        int[] penguranganStok = {-1, -2, 0, -5};
        reduceStokBunga(stokBunga, cabang, penguranganStok);

        System.out.println("\nData stok bunga setelah pengurangan:");
        displayStokBunga(stokBunga, cabang, plantCount);

        System.out.println("\nPendapatan setiap cabang jika semua bunga habis terjual:");
        displayPendapatan(stokBunga, cabang);
        
        System.out.println("\nJumlah stok setiap jenis bunga pada setiap cabang:");
        displayJumlahStokPerJenis(stokBunga, cabang);
        
        scanner.close();
    }
    public static void displayStokBunga(int[][] stokBunga, int cabang, int plantCount) {
        System.out.printf("%-20s", "");  
        for (String plant : plantTypes) {
            System.out.printf("%-12s", plant);
        }
        System.out.println();

        for (int i = 0; i < cabang; i++) {
            System.out.printf("RoyalGarden %-2d", i + 1);
            for (int j = 0; j < plantCount; j++) {
                System.out.printf("%-12d", stokBunga[i][j]);
            }
            System.out.println();
        }
    }
    public static void reduceStokBunga(int[][] stokBunga, int cabang, int[] penguranganStok) {
        for (int i = 0; i < cabang; i++) {
            for (int j = 0; j < penguranganStok.length; j++) {
                stokBunga[i][j] += penguranganStok[j];
                if (stokBunga[i][j] < 0) {
                    stokBunga[i][j] = 0; 
                }
            }
        }
    }
    public static void displayPendapatan(int[][] stokBunga, int cabang) {
        for (int i = 0; i < cabang; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < plantTypes.length; j++) {
                int harga = 0;
                switch (j) {
                    case 0: harga = AGLOMENA_PRICE; break;
                    case 1: harga = KELADI_PRICE; break;
                    case 2: harga = ALOCASIA_PRICE; break;
                    case 3: harga = MAWAR_PRICE; break;
                }
                totalPendapatan += stokBunga[i][j] * harga;
            }
            System.out.printf("Pendapatan RoyalGarden %-2d: Rp %,d%n", i + 1, totalPendapatan); 
        }
    }
    public static void displayJumlahStokPerJenis(int[][] stokBunga, int cabang) {
        System.out.printf("%-15s", "Jenis Bunga"); 
        System.out.printf("%-15s%n", "Total Stok");  
        for (int j = 0; j < plantTypes.length; j++) {
            int totalStok = 0;
            for (int i = 0; i < cabang; i++) {
                totalStok += stokBunga[i][j];
            }
            System.out.printf("%-15s %-15d%n", plantTypes[j], totalStok); 
        }
    }
}
