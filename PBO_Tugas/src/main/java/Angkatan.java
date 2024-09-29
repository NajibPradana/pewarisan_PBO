// Angkatan.java
public class Angkatan extends Departemen {
    protected int tahunAngkatan;

    public Angkatan(String nama, String nim, String namaFakultas, String namaDepartemen, int tahunAngkatan) {
        super(nama, nim, namaFakultas, namaDepartemen);
        this.tahunAngkatan = tahunAngkatan;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Angkatan: " + tahunAngkatan);
    }
}
