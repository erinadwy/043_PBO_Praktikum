import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Str1, Str2;
        int totalLength;

        // Menginputkan string 1 dan 2
        System.out.print("Masukkan string pertama: ");
        Str1 = scanner.nextLine();
        System.out.print("Masukkan string pertama: ");
        Str2 = scanner.nextLine();

        // Menjumlahkan panjang String 1 dan 2
        totalLength = Str1.length() + Str2.length();
        System.out.println("Panjang gabungan: " + totalLength);

        // Menentukan apakah String 1 lebih besar secara leksikografis dibandingkan String 2
        if (Str1.compareTo(Str2) > 0) {
            System.out.println("Str 1 lebih besar dari Str2? Yes");
        } else {
            System.out.println("Str 1 lebih besar dari Str2? No");
        }

        // Kapitalisasi huruf pertama dari A dan B
        String capitalizedStr1 = Str1.substring(0, 1).toUpperCase() + Str1.substring(1);
        String capitalizedStr2 = Str2.substring(0, 1).toUpperCase() + Str2.substring(1);
        System.out.println("String setelah dikapitalisasi: " + capitalizedStr1 + " " + capitalizedStr2);

        scanner.close();
    }
}
