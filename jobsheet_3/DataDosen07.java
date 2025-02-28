package jobsheet_3;

public class DataDosen07 {
    public void dataSemuaDosen(Dosen07[] arrayOfDosen) {
        int index = 1;
        for (Dosen07 dosen : arrayOfDosen) { 
            System.out.println("Data Dosen ke-" + index);
            System.out.println("Kode           : " + dosen.kode);
            System.out.println("Nama           : " + dosen.nama);
            System.out.println("Jenis Kelamin  : " + (dosen.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia           : " + dosen.usia);
            System.out.println("-----------------------------");
            index++;
        }
    }
    public void jumlahDosenPerJeniskelamin(Dosen07[] arrayOfDosen) {
        int jumlahDosenPria = 0;
        int jumlahDosenWanita = 0;
        for (Dosen07 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin == true) {
                jumlahDosenPria++;
            } else {
                jumlahDosenWanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + jumlahDosenPria);
        System.out.println("Jumlah Dosen Wanita : " + jumlahDosenWanita);
    }
    public void rerataUsiaDosen(Dosen07[] arrayOfDosen) {
        int jumlahDosenPria = 0;
        int jumlahDosenWanita = 0;
        int usiaDosenPria = 0;
        int usiaDosenWanita = 0;
        for (Dosen07 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin == true) {
                jumlahDosenPria++;
                usiaDosenPria += dosen.usia;
            } else {
                jumlahDosenWanita++;
                usiaDosenWanita += dosen.usia;
            }
        }
        if (jumlahDosenPria > 0) {
            System.out.println("Rata-rata usia Dosen Pria   : " + (double) usiaDosenPria / jumlahDosenPria);
        } else {
            System.out.println("Tidak ada Dosen Pria.");
        }
        if (jumlahDosenWanita > 0) {
            System.out.println("Rata-rata usia Dosen Wanita : " + (double) usiaDosenWanita / jumlahDosenWanita);
        } else {
            System.out.println("Tidak ada Dosen Wanita.");
        }
    }
    public void infoDosenPalingTua(Dosen07[] arrayOfDosen) {
        Dosen07 dosenTua = arrayOfDosen[0];
        for (Dosen07 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTua.usia) {
                dosenTua = dosen;
            }
        }
        System.out.println("===================");
        System.out.println("Dosen Paling Tua:");
        System.out.println("===================");
        System.out.println("Kode           : " + dosenTua.kode);
        System.out.println("Nama           : " + dosenTua.nama);
        System.out.println("Jenis Kelamin  : " + (dosenTua.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia           : " + dosenTua.usia);
        System.out.println("-----------------------------");
    }
    public void infoDosenPalingMuda(Dosen07[] arrayOfDosen) {
        Dosen07 dosenMuda = arrayOfDosen[0];
        for (Dosen07 dosen : arrayOfDosen) {
            if (dosen.usia < dosenMuda.usia) {
                dosenMuda = dosen;
            }
        }
        System.out.println("===================");
        System.out.println("Dosen Paling Muda:");
        System.out.println("===================");
        System.out.println("Kode           : " + dosenMuda.kode);
        System.out.println("Nama           : " + dosenMuda.nama);
        System.out.println("Jenis Kelamin  : " + (dosenMuda.jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia           : " + dosenMuda.usia);
        System.out.println("-----------------------------");
    }
}
