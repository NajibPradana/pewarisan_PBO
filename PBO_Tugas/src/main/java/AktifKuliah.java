// AktifKuliah.java
public class AktifKuliah extends Gender {
    private boolean aktif;

    public AktifKuliah(String nama, String nim, String namaFakultas, String namaDepartemen, int tahunAngkatan, String gender, boolean aktif) {
        super(nama, nim, namaFakultas, namaDepartemen, tahunAngkatan, gender);
        this.aktif = aktif;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Aktif Kuliah: " + (aktif ? "Ya" : "Tidak"));
        System.out.println(); // Menambah jarak enter di akhir
    }
}
