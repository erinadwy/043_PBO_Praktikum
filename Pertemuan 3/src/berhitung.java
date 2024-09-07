import java.util.Scanner;

public class berhitung {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // membaca input dalam satu baris
        int A = scanner.nextInt(); // membaca nilai A
        String operator = scanner.next(); // membaca operator (+, -, *, /, %)
        int B = scanner.nextInt(); // membaca nilai B

        // variabel untuk menyimpan hasil
        int hasil = 0;

        // menghitung hasil berdasarkan operator
        switch (operator) {
            case "+":
                hasil = A + B;
                break;
            case "-":
                hasil = A - B;
                break;
            case "*":
                hasil = A * B;
                break;
            case "/":
                hasil = A / B; // dibagi, dijamin A habis dibagi B
                break;
            case "%":
                hasil = A % B;
                break;
            default:
                System.out.println("Operator tidak valid.");
                return; // keluar dari program jika operator tidak valid
        }

        // menampilkan hasil
        System.out.println(hasil);
    }
}