package com.jtk.polban.akademik;

public class JadwalKuliah {
    private String hari;
    private String waktu;
    private Dosen dosen;
    private String ruangan;

    public JadwalKuliah(String hari, String waktu, Dosen dosen, String ruangan) {
        this.hari = hari;
        this.waktu = waktu;
        this.dosen = dosen;
        this.ruangan = ruangan;
    }

    public static JadwalKuliah[] getAllJadwalKuliah() {
        Dosen[] dosenList = Dosen.getAllDosen();
        int jumlahDosen = dosenList.length;
        return new JadwalKuliah[] {
                new JadwalKuliah("Senin", "08:40-09:30", dosenList[0], "D105-Kelas"),
                new JadwalKuliah("Senin", "09:50-10:40", dosenList[0], "D105-Kelas"),
                new JadwalKuliah("Senin", "10:40-11:30", dosenList[1], "D105-Kelas"),
                new JadwalKuliah("Senin", "11:30-12:20", dosenList[1], "D105-Kelas"),
                new JadwalKuliah("Senin", "13:00-13:50", dosenList[2], "D102-Lab. MT"),
                new JadwalKuliah("Senin", "13:50-14:40", dosenList[2], "D102-Lab. MT"),
                new JadwalKuliah("Senin", "14:40-15:30", dosenList[2], "D102-Lab. MT"),

                new JadwalKuliah("Selasa", "07:00-07:50", dosenList[3], "D106-Lab. SDB"),
                new JadwalKuliah("Selasa", "07:50-08:40", dosenList[3], "D106-Lab. SDB"),
                new JadwalKuliah("Selasa", "08:40-09:30", dosenList[3], "D106-Lab. SDB"),
                new JadwalKuliah("Selasa", "09:50-10:40", dosenList[3], "D106-Lab. SDB"),
                new JadwalKuliah("Selasa", "10:40-11:30", dosenList[3], "D106-Lab. SDB"),
                new JadwalKuliah("Selasa", "11:30-12:20", dosenList[3], "D106-Lab. SDB"),
                new JadwalKuliah("Selasa", "13:00-13:50", dosenList[4], "D101-Kelas"),
                new JadwalKuliah("Selasa", "13:50-14:40", dosenList[4], "D101-Kelas"),

                new JadwalKuliah("Rabu", "07:00-07:50", dosenList[5], "D116-Lab. PjBL-2"),
                new JadwalKuliah("Rabu", "07:50-08:40", dosenList[6], "D116-Lab. PjBL-2"),
                new JadwalKuliah("Rabu", "08:40-09:30", dosenList[6], "D116-Lab. PjBL-2"),
                new JadwalKuliah("Rabu", "13:00-13:50", dosenList[6], "D116-Lab. PjBL-2"),
                new JadwalKuliah("Rabu", "13:50-14:40", dosenList[6], "D116-Lab. PjBL-2"),
                new JadwalKuliah("Rabu", "14:40-15:30", dosenList[6], "D116-Lab. PjBL-2"),
                new JadwalKuliah("Rabu", "15:50-16:40", dosenList[6], "D116-Lab. PjBL-2"),

                new JadwalKuliah("Kamis", "07:00-07:50", dosenList[7], "D105-Kelas"),
                new JadwalKuliah("Kamis", "07:50-08:40", dosenList[7], "D105-Kelas"),
                new JadwalKuliah("Kamis", "08:40-09:30", dosenList[8], "D105-Kelas"),
                new JadwalKuliah("Kamis", "09:50-10:40", dosenList[8], "D105-Kelas"),
                new JadwalKuliah("Kamis", "10:40-11:30", dosenList[9], "D116-Lab. PjBL-2"),
                new JadwalKuliah("Kamis", "11:30-12:20", dosenList[9], "D116-Lab. PjBL-2"),
                new JadwalKuliah("Kamis", "13:00-13:50", dosenList[9], "D116-Lab. PjBL-2"),
                new JadwalKuliah("Kamis", "13:50-14:40", dosenList[10], "D108-Kelas"),
                new JadwalKuliah("Kamis", "14:40-15:30", dosenList[10], "D108-Kelas"),
                new JadwalKuliah("Kamis", "15:50-16:40", dosenList[10], "D108-Kelas"),

                new JadwalKuliah("Jumat", "07:50-08:40", dosenList[11], "D116-Lab. PjBL-2"),
                new JadwalKuliah("Jumat", "08:40-09:30", dosenList[11], "D116-Lab. PjBL-2"),
                new JadwalKuliah("Jumat", "09:50-10:40", dosenList[11], "D116-Lab. PjBL-2"),
                new JadwalKuliah("Jumat", "10:40-11:30", dosenList[11], "D116-Lab. PjBL-2"),
                new JadwalKuliah("Jumat", "13:00-13:50", dosenList[11], "D116-Lab. PjBL-2"),
                new JadwalKuliah("Jumat", "13:50-14:40", dosenList[11], "D116-Lab. PjBL-2")
        };
    }

        public void tampilJadwal() {
        System.out.printf("%-10s %-15s %-40s %-10s %-10s %-20s %-10s\n",
                hari, waktu, dosen.getMataKuliah().getNamaMatkul(),
                dosen.getMataKuliah().getJenis(), dosen.getKodeDosen(),
                dosen.getNamaDosen(), ruangan);
    }
}
