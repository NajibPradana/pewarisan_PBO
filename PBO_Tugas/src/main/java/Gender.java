// Gender.java
public class Gender extends Angkatan {
    protected String gender;

    public Gender(String nama, String nim, String namaFakultas, String namaDepartemen, int tahunAngkatan, String gender) {
        super(nama, nim, namaFakultas, namaDepartemen, tahunAngkatan);
        this.gender = gender;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Gender: " + gender);
    }
}
