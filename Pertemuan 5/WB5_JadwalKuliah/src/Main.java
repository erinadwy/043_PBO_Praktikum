import com.jtk.polban.akademik.*;

public class Main {
    public static void main(String[] args) {
        // Menampilkan Data Mahasiswa
        System.out.println("Data Mahasiswa:");
        Mahasiswa[] mahasiswaList = Mahasiswa.getAllMahasiswa();
        for (Mahasiswa mahasiswa : mahasiswaList) {
            mahasiswa.tampilInfo();
        }

        // Menampilkan Data Dosen
        System.out.println("\nData Dosen:");
        Dosen[] dosenList = Dosen.getAllDosen();
        for (Dosen dosen : dosenList) {
            dosen.tampilInfo();
        }

        // Menampilkan Jadwal Kuliah
        System.out.println("\nJadwal Kuliah:");
        System.out.printf("%-10s %-15s %-40s %-10s %-10s %-20s %-10s\n",
                "Hari", "Waktu", "Nama Mata Kuliah", "Jenis", "Kode Dosen", "Nama Dosen", "Ruangan");
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        JadwalKuliah[] jadwalList = JadwalKuliah.getAllJadwalKuliah();
        for (JadwalKuliah jadwalKuliah : jadwalList) {
            jadwalKuliah.tampilJadwal();
        }
    }
}
