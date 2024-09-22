package com.jtk.polban.akademik;

public class Dosen extends CivitasAcademica {
    private String kodeDosen;
    private MataKuliah mataKuliah;

    public Dosen(String nama, String kodeDosen, MataKuliah mataKuliah) {
        super(nama);
        this.kodeDosen = kodeDosen;
        this.mataKuliah = mataKuliah;
    }

    public static Dosen[] getAllDosen() {
        MataKuliah[] mataKuliahList = MataKuliah.getAllMataKuliah();

        return new Dosen[] {
                new Dosen("Yudi Widhiyasana", "KO013N", mataKuliahList[0]),
                new Dosen("Trisna Gelar A", "KO078N", mataKuliahList[1]),
                new Dosen("Santi Sundari", "KO009N", mataKuliahList[2]),
                new Dosen("Ade Hodijah", "KO060N", mataKuliahList[5]),
                new Dosen("Muhammad Rizqi S", "KO074N", mataKuliahList[6]),
                new Dosen("Bambang Wisnuadhi", "KO003N", mataKuliahList[7]),
                new Dosen("Wendi Wirasta", "KO079N", mataKuliahList[8]),
                new Dosen("Didik Suwito Pribadi", "KO005N", mataKuliahList[8]),
                new Dosen("Ade Chandra Nugraha", "KO001N", mataKuliahList[4]),
                new Dosen("Zulkifli Arsyad", "KO061N", mataKuliahList[9]),
                new Dosen("Siti Dwi Setiarini", "KO075N", mataKuliahList[11]),
                new Dosen("Yadhi Aditya P.", "KO052N", mataKuliahList[3])
        };
    }

    public String getPeran() {
        return "Dosen";
    }

    public String getKodeDosen() {
        return kodeDosen;
    }

    public String getNamaDosen() {
        return nama;
    }

    public MataKuliah getMataKuliah() {
        return mataKuliah;
    }

    public void tampilInfo() {
        System.out.println("Nama Dosen: " + nama + ", Kode Dosen: " + kodeDosen +
                ", Mengampu Mata Kuliah: " + mataKuliah.getNamaMatkul() + " " + mataKuliah.getJenis());
    }
}
