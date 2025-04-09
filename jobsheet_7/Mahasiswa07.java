package jobsheet_7;

public class Mahasiswa07 {
    String nama;
    String nim;
    String kelas;
    double ipk;
    public Mahasiswa07()  {
    }
    public Mahasiswa07 (String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        ipk = ip;
        kelas = kls;
    }
    void tampilkanInformasi () {
        System.out.println("Nama    : " + nama);
        System.out.println("NIM     : " + nim);
        System.out.println("Kelas   : " + kelas);
        System.out.println("IPK     : " + ipk);
    }
}