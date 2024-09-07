import java.util.Scanner;

public class gaji_agent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input user untuk memasukkan jumlah penjualan
        System.out.print("Masukkan jumlah penjualan bulan ini: ");
        int jumlahPenjualan = scanner.nextInt();

        //deklarasi variable
        double gajiPokok = 500000.0; // gaji pokok Rp500.000,00
        double hargaItem = 50000.0;  // harga tiap item Rp50.000,00
        double totalGaji = gajiPokok; // gaji akhir yang akan dihitung

        //hitung total penjualan dalam rupiah
        double totalPenjualan = jumlahPenjualan * hargaItem;

        //kondisi bonus dan denda
        if (jumlahPenjualan > 80) {
            // bonus 35% jika penjualan di atas 80 item
            totalGaji += 0.35 * totalPenjualan;
        } else if (jumlahPenjualan >= 40) {
            //bonus 25% jika penjualan minimal 40 item
            totalGaji += 0.25 * totalPenjualan;
        } else if (jumlahPenjualan < 15) {
            //denda 15% dari penjualan kurang dari 15 item
            totalGaji -= 0.15 * (15 - jumlahPenjualan) * hargaItem;
            //bonus 10% untuk setiap item terjual
            totalGaji += 0.10 * totalPenjualan;
        } else {
            //bonus 10% untuk setiap item jika penjualan di bawah 40 dan tidak mendapat denda
            totalGaji += 0.10 * totalPenjualan;
        }

        //total gaji yang diterima
        System.out.printf("Gaji yang diterima: Rp%.2f\n", totalGaji);
    }
}
