import java.util.Scanner;

public class buka_tutup_jalan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //plat nomor untuk 4 mobil
        System.out.print("Masukkan plat nomor 4 mobil (pisahkan dengan spasi): ");
        String plat1 = scanner.next();
        String plat2 = scanner.next();
        String plat3 = scanner.next();
        String plat4 = scanner.next();

        //menambahkan seluruh gaburngan plat nomor 4 mobil
        String gabunganPlat = plat1 + plat2 + plat3 + plat4;

        //mengubah gabungan plat menjadi long untuk perhitungan
        long gabunganAngka = Long.parseLong(gabunganPlat);

        //melakukan operasi sesuai aturan (gabunganAngka - 999999) % 5
        long hasil = (gabunganAngka - 999999) % 5;

        //menentukan apakah "Jalan" atau "Berhenti"
        if (hasil == 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
    }
}