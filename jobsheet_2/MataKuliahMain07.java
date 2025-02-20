public class MataKuliahMain07 {
    public static void main(String[] args) {
        MataKuliah07 mk1 = new MataKuliah07();
        mk1.kodeMk = "123";
        mk1.nama = "Praktikum ASD";
        mk1.sks = 3;
        mk1.jumlahJam = 6;
        
        mk1.tampilkanInformasi();
        System.out.println();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangJam(9);
        System.out.println();
        mk1.tampilkanInformasi();
        System.out.println();

        MataKuliah07 mk2 = new MataKuliah07("012", "Aljabar Linear", 2, 4);
        mk2.tampilkanInformasi();
        System.out.println();
        mk2.kurangJam(2);
        mk2.tampilkanInformasi();
    } 
}
