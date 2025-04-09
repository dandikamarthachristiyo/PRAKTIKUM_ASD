package jobsheet_7;

public class DataDosen07 {
    Dosen07 [] listDosen;
    int idx;

    public DataDosen07(int jumlahDsn){
        listDosen = new Dosen07[jumlahDsn];
        idx = 0;
    }
    void tambah (Dosen07 m) {
        if (idx<listDosen.length) {
            listDosen[idx]=m;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }
    void tampil() {
        for (int i = 0; i < idx; i++) {
            Dosen07 m = listDosen[i];
            m.tampilkanInformasi();
            System.out.println("-----------------------------");
        }
    }
    void bubbleSort(){
        for (int i=0; i<idx-1; i++){
            for (int j=1; j<idx-i; j++){
                if (listDosen[j-1].usia>listDosen[j].usia) {
                    Dosen07 tmp = listDosen[j];
                    listDosen[j]=listDosen[j-1];
                    listDosen[j-1]=tmp;
                }
            }
        }
    }
    void selectionSort() {
        for (int i=0; i<idx-1; i++) {
            int idxMax=i;
            for (int j=i+1; j<idx; j++) {
                if(listDosen[j].usia>listDosen[idxMax].usia) {
                    idxMax=j;
                }
            }
            Dosen07 tmp = listDosen[idxMax];
            listDosen[idxMax]=listDosen[i];
            listDosen[i]=tmp;
        }
    }
    void insertionSort(){
        for (int i=1; i<idx; i++) {
            Dosen07 temp = listDosen[i];
            int j=i;
            while (j>0 && listDosen[j-1].usia<temp.usia) {
                listDosen[j]=listDosen[j-1];
                j--;
            }
            listDosen[j]=temp;
        }
    }
    int PencarianDataSequential07(String cari) {
        int hasil = 0;
        for (int i = 0; i < idx; i++) {
            if (listDosen[i].nama.equalsIgnoreCase(cari)) {
                hasil++;  
            }
        }
        return hasil;
    }
    void tampilDataSearchNama(String nama) {
        boolean found = false; 
        for (int i = 0; i < idx; i++) {
            if (listDosen[i].nama.equalsIgnoreCase(nama)) {
                listDosen[i].tampilkanInformasi();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data dosen dengan nama '" + nama + "' tidak ditemukan");
        }
    }
    int PencarianDataBinary07(int usiaCari, int left, int right) {
        int mid;
        int hasil = 0;
    
        if (right >= left) {
            mid = (left + right) / 2;
            if (listDosen[mid].usia == usiaCari) {
                hasil++;
                int leftIndeks = mid - 1;
                while (leftIndeks >= left && listDosen[leftIndeks].usia == usiaCari) {
                    hasil++;
                    leftIndeks--;
                }
                int rightIndeks = mid + 1;
                while (rightIndeks <= right && listDosen[rightIndeks].usia == usiaCari) {
                    hasil++;
                    rightIndeks++;
                }
                return hasil; 
            } else if (listDosen[mid].usia > usiaCari) {
                return PencarianDataBinary07(usiaCari, left, mid - 1); 
            } else {
                return PencarianDataBinary07(usiaCari, mid + 1, right);  
            }
        }
        return hasil;  
    }    
    void tampilDataSearchUsia(int usiaCari) {
        boolean found = false;
        for (int i = 0; i < idx; i++) {
            if (listDosen[i].usia == usiaCari) {
                listDosen[i].tampilkanInformasi(); 
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data dosen dengan usia " + usiaCari + " tidak ditemukan");
        }
    }
}
