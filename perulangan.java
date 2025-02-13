import java.util.Scanner;
public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan NIM : ");
        long nim = sc.nextLong();
        System.out.println("=======================");
        byte n = (byte) (nim % 100);
        System.out.println("n : " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 != 0) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }

}
