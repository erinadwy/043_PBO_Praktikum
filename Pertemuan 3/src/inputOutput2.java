import java.util.Scanner;

public class inputOutput2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //memproses 3 baris input
        for (int i = 0; i < 3; i++) {
            //membaca string dan integer
            String text = scanner.next();
            int number = scanner.nextInt();

            //menggunakan printf untuk mencetak dengan format yang diminta
            System.out.printf("%-15s%03d%n", text, number);
        }

        scanner.close();
    }
}