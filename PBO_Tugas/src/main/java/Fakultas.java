// Fakultas.java
public class Fakultas extends MahasiswaUndip {
    protected String namaFakultas;

    public Fakultas(String nama, String nim, String namaFakultas) {
        super(nama, nim);
        this.namaFakultas = namaFakultas;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Fakultas: " + namaFakultas);
    }
}
