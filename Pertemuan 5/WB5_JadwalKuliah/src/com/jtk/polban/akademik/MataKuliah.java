package com.jtk.polban.akademik;

public class MataKuliah {
    private String namaMatkul;
    private String jenisMatkul;

    public MataKuliah(String namaMatkul, String jenisMatkul) {
        this.namaMatkul = namaMatkul;
        this.jenisMatkul = jenisMatkul;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public String getJenis() {
        return jenisMatkul;
    }

    public static MataKuliah[] getAllMataKuliah() {
        return new MataKuliah[] {
                new MataKuliah("Komputer Grafik", "Teori"),
                new MataKuliah("Komputer Grafik", "Praktikum"),
                new MataKuliah("Pengantar Rekayasa Perangkat Lunak", "Teori"),
                new MataKuliah("Pengantar Rekayasa Perangkat Lunak", "Praktikum"),
                new MataKuliah("Basis Data", "Teori"),
                new MataKuliah("Basis Data", "Praktikum"),
                new MataKuliah("Aljabar Linear", "Teori"),
                new MataKuliah("Proyek 3", "Teori"),
                new MataKuliah("Proyek 3", "Praktikum"),
                new MataKuliah("Pemrograman Berorientasi Objek", "Teori"),
                new MataKuliah("Pemrograman Berorientasi Objek", "Praktikum"),
                new MataKuliah("Matematika Diskrit II", "Teori")
        };
    }
}