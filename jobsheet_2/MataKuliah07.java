public class MataKuliah07 {
    public MataKuliah07() {
    }
    public MataKuliah07 (String kdMk, String nm, int s, int jlJm) {
        kodeMk = kdMk;
        nama = nm;
        sks = s;
        jumlahJam = jlJm;
    }

    String kodeMk;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi () {
        System.out.println("Kode MK     : " + kodeMk);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
    }
    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah di ubah! menjadi " + sks);
    }
    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Panambahan jam berhasil! menjadi " + jumlahJam + " jam");
    }
    void kurangJam(int minusJam) {
        if (jumlahJam < minusJam) {
            System.out.println("Pengurangan jam tidak dapat di lakukan!");
        } else {
            jumlahJam -= minusJam;
            System.out.println("Pengurangan jam berhasil! menjadi " + jumlahJam + " jam");
        }
    }
}