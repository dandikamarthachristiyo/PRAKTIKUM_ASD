package jobsheet_3;

public class Mahasiswa07 {
    public Mahasiswa07 () {
    }
    public Mahasiswa07 (String nim, String nama, String kelas, float ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }
    public String nim;
    public String nama;
    public String kelas;
    public float ipk;

    public void cetakInfo() {
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Kelas      : " + kelas);
        System.out.println("IPK        : " + ipk);
        System.out.println("-----------------------------");
    }
}