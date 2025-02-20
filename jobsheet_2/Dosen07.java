public class Dosen07 {
    public Dosen07() {
    }
    public Dosen07 (String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    void tampilkanInformasi () {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }
    void setStatusAktif (boolean status) {
        statusAktif = status;
        System.out.println("Status Dosen telah berubah menjadi " + statusAktif);
    }
    void hitungMasakerja (int thnSkrg) {
        thnSkrg -= tahunBergabung;
        System.out.println("Lama Dosen bekerja " + thnSkrg + " tahun");
    }
    void ubahKeahlian (String keahlianBaru) {
        bidangKeahlian = keahlianBaru;
        System.out.println("Keahlian telah di ubah menjadi " + bidangKeahlian);
    }
}
