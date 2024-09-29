// MahasiswaUndip.java
public class MahasiswaUndip {
    protected String nama;
    protected String nim;

    public MahasiswaUndip(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void tampilkanInfo() {
        System.out.println("\nNama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
