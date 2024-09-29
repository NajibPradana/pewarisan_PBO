// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Nama dan NIM
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        // Pilihan Fakultas yang dibatasi
        String[] fakultasList = {"Fakultas Teknik (FT)", "Fakultas Ekonomi dan Bisnis (FEB)", "Fakultas Ilmu Sosial dan Ilmu Politik (FISIP)"};
        String fakultas = "";

        System.out.println("Pilih Fakultas:");
        for (int i = 0; i < fakultasList.length; i++) {
            System.out.println((i + 1) + ". " + fakultasList[i]);
        }

        int pilihanFakultas;
        do {
            System.out.print("Masukkan pilihan (1-3): ");
            pilihanFakultas = scanner.nextInt();
            if (pilihanFakultas >= 1 && pilihanFakultas <= 3) {
                fakultas = fakultasList[pilihanFakultas - 1];
            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihanFakultas < 1 || pilihanFakultas > 3);

        // Departemen sesuai dengan fakultas yang dipilih
        String[] departemenList = {};
        if (pilihanFakultas == 1) {
            departemenList = new String[]{"Teknik Komputer", "Teknik Mesin", "Teknik Elektro"};
        } else if (pilihanFakultas == 2) {
            departemenList = new String[]{"Akuntansi", "Ekonomi"};
        } else if (pilihanFakultas == 3) {
            departemenList = new String[]{"Ilmu Pemerintahan", "Hubungan Internasional"};
        }

        String departemen = "";
        System.out.println("Pilih Departemen:");
        for (int i = 0; i < departemenList.length; i++) {
            System.out.println((i + 1) + ". " + departemenList[i]);
        }

        int pilihanDepartemen;
        do {
            System.out.print("Masukkan pilihan (1-" + departemenList.length + "): ");
            pilihanDepartemen = scanner.nextInt();
            if (pilihanDepartemen >= 1 && pilihanDepartemen <= departemenList.length) {
                departemen = departemenList[pilihanDepartemen - 1];
            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihanDepartemen < 1 || pilihanDepartemen > departemenList.length);

        // Pilihan Angkatan dari 2019 sampai 2024
        String[] angkatanList = {"2019", "2020", "2021", "2022", "2023", "2024"};
        int tahunAngkatan = 0;

        System.out.println("Pilih Tahun Angkatan:");
        for (int i = 0; i < angkatanList.length; i++) {
            System.out.println((i + 1) + ". " + angkatanList[i]);
        }

        int pilihanAngkatan;
        do {
            System.out.print("Masukkan pilihan (1-6): ");
            pilihanAngkatan = scanner.nextInt();
            if (pilihanAngkatan >= 1 && pilihanAngkatan <= 6) {
                tahunAngkatan = Integer.parseInt(angkatanList[pilihanAngkatan - 1]);
            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihanAngkatan < 1 || pilihanAngkatan > 6);

        // Pilihan Gender
        String[] genderList = {"Pria", "Wanita"};
        String gender = "";

        System.out.println("Pilih Gender:");
        for (int i = 0; i < genderList.length; i++) {
            System.out.println((i + 1) + ". " + genderList[i]);
        }

        int pilihanGender;
        do {
            System.out.print("Masukkan pilihan (1-2): ");
            pilihanGender = scanner.nextInt();
            if (pilihanGender >= 1 && pilihanGender <= 2) {
                gender = genderList[pilihanGender - 1];
            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihanGender < 1 || pilihanGender > 2);

        // Pilihan Aktif Kuliah
        String[] aktifList = {"Ya", "Tidak"};
        boolean aktif = false;

        System.out.println("Apakah Aktif Kuliah?");
        for (int i = 0; i < aktifList.length; i++) {
            System.out.println((i + 1) + ". " + aktifList[i]);
        }

        int pilihanAktif;
        do {
            System.out.print("Masukkan pilihan (1-2): ");
            pilihanAktif = scanner.nextInt();
            if (pilihanAktif >= 1 && pilihanAktif <= 2) {
                aktif = pilihanAktif == 1;
            } else {
                System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihanAktif < 1 || pilihanAktif > 2);

        // Menampilkan informasi akhir
        AktifKuliah mahasiswa = new AktifKuliah(nama, nim, fakultas, departemen, tahunAngkatan, gender, aktif);
        mahasiswa.tampilkanInfo();
    }
}
