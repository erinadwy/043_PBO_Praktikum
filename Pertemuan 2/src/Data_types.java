import java.util.Scanner;

public class Data_types {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

        // Membaca jumlah kasus uji
        int T = scanner.nextInt();

        // Mengiterasi setiap kasus uji
        for (int i = 0; i < T; i++) {
            try {
                // Membaca bilangan integer n
                long n = scanner.nextLong();

                // Menentukan tipe data primitif yang dapat menyimpan n
                System.out.println(n + " dapat disimpan di:");
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (Exception e) {
                // Menangani kasus di mana n terlalu besar untuk disimpan dalam long
                System.out.println(scanner.next() + " tidak dapat disimpan di tipe data manapun.");
            }
        }

        // Menutup scanner
        scanner.close();
    }
}