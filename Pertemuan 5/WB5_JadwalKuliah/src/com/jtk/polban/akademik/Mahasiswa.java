package com.jtk.polban.akademik;

public class Mahasiswa extends CivitasAcademica {
    private String nim;
    private String kelas;

    public Mahasiswa(String nama, String nim, String kelas) {
        super(nama);
        this.nim = nim;
        this.kelas = kelas;
    }

    public static Mahasiswa[] getAllMahasiswa() {
        return new Mahasiswa[] {
                new Mahasiswa("Erina", "231511043", "2B"),
                new Mahasiswa("Dwi", "231511032", "2B"),
                new Mahasiswa("Yanti", "231511034", "2A"),
                new Mahasiswa("Heru", "231511033", "2D"),
                new Mahasiswa("Setiawan", "231511035", "2E"),
                new Mahasiswa("Ayu", "231511045", "2F"),
                new Mahasiswa("Zata", "231511054", "2B"),
                new Mahasiswa("Amani", "231511060", "2"),
                new Mahasiswa("Bazka", "231511012", "2C"),
                new Mahasiswa("erdy", "231511009", "2A")
        };
    }

    public String getPeran() {
        return "Mahasiswa";
    }

    public void tampilInfo() {
        System.out.println("Nama Mahasiswa: " + nama + ", NIM: " + nim + ", Kelas: " + kelas);
    }
}