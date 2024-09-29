// Departemen.java
public class Departemen extends Fakultas {
    protected String namaDepartemen;

    public Departemen(String nama, String nim, String namaFakultas, String namaDepartemen) {
        super(nama, nim, namaFakultas);
        this.namaDepartemen = namaDepartemen;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Departemen: " + namaDepartemen);
    }
}
