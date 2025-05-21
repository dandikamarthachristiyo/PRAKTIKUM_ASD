package jobsheet_10;

public class AntrianKRS07 {
    Mahasiswa07[] data;
    int front;
    int rear;
    int size;
    int max;
    int krs;
    int maxDPA;
    public AntrianKRS07(int max, int maxDPA) {
        this.max = max;
        this.maxDPA = maxDPA;
        this.data = new Mahasiswa07[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.krs = 0;
    }
    public boolean IsEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean IsFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void clear() {
        if (!IsEmpty()) {
            front = rear = -1;
            size = 0;
            krs = 0;
            System.out.println("Antrian berhasil di kosongkan");
        } else {
            System.out.println("Antrian belum ada");
        }
    }
    public void tambahAntrian(Mahasiswa07 mhs) {
        if (IsFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }
    public Mahasiswa07[] layaniMahasiswa() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        } else if (size < 2) {
            System.out.println("Minimal harus ada 2 mahasiswa dalam antrian untuk diproses.");
            return null;
        } else if (krs + 2 > maxDPA) {
            System.out.println("Kuota KRS DPA tidak mencukupi untuk memproses 2 mahasiswa.");
            return null;
        } else {
            Mahasiswa07[] diproses = new Mahasiswa07[2];
            for (int i = 0; i < 2; i++) {
                diproses[i] = data[front];
                front = (front + 1) % max;
                size--;
                krs++;
            }
            return diproses;
        }
    }
    public void tampilkanSemua() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }
    public void lihatTerdepan() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else if (size < 2){
            System.out.println("Minimal harus ada 2 mahasiswa dalam antrian untuk diproses.");
        } else {
            System.out.println("2 Mahasiswa terdepan:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            for (int i = 0; i < 2; i++) {
                int index = (front + i) % max;
                data[index].tampilkanData();
            }
        }
    }
    public void lihatAkhir() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }
    public int getJumlahAntrian() {
        return size;
    }
    public int getJumlahKRS() {
        return krs;
    }
    public int getSisaKRS() {
        return maxDPA - krs;
    }
}
