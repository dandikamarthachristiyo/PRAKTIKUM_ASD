package jobsheet_9;

public class StackSurat07 {
    Surat07 [] stack;
    int top;
    int size;
    public StackSurat07 (int size) {
        this.size = size;
        stack = new Surat07[size];
        top = -1;
    }
    public boolean isFull() {
        if (top == size -1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }
    public void push(Surat07 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan tugas lagi.");
        }
    }
    public Surat07 pop() {
        if (!isEmpty()) {
            Surat07 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong! Tidak ada tugas untuk dinilai.");
            return null;
        }
    }
    public Surat07 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada tugas yang dikumpulkan.");
            return null;
        }
    }
    public void print() {
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].idSurat + "\t" + stack[i].namaMahasiswa + "\t" + stack[i].kelas + "\t" + stack[i].jenisIzin + "\t" + stack[i].durasi);
        }
        System.out.println("");
    }
}
