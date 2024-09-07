import javax.swing.*;
import java.util.Scanner;

public class inputOutput1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String s = scanner.nextLine();
        //memisahkan input menjadi array kata-kata berdasarkan karakter pemisah ! , ? . _ '@
        String[] stringArray = s.split("[! , ? . _ '@]+");

        //menghitung jumlah elemen array hasil pemisahan
        int n = stringArray.length;

        //membuat object StringBuilder untuk menyusun pesan hasil tokenisasi
        StringBuilder resultMessage = new StringBuilder();

        //menambahkan jumlah token yang ditemukan ke dalam pesan
        resultMessage.append("Jumlah token: ").append(n).append("\n");

        //Loop untuk menambahkan setiap elemen dalam array kedalam pesan
        for (int i = 0; i < n; i++) {
            resultMessage.append(stringArray[i]).append("\n");
        }

        // Menampilkan hasil tokenisasi menggunakan JOptionPane
        JOptionPane.showMessageDialog(null, resultMessage.toString(), "Hasil Tokenisasi", JOptionPane.INFORMATION_MESSAGE);
    }
}