import java.math.BigInteger;
import java.util.Scanner;

public class big_number {
    public static void main(String[] args) {
        //membuat object Scanner untuk membaca input dari user
        Scanner scanner = new Scanner(System.in);

        //membaca dua angka besar (a dan b) sebagai string
        String a = scanner.nextLine();
        String b = scanner.nextLine();

        //mengonversi string ke BigInteger
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);

        //menghitung penjumlahan dan perkalian
        BigInteger sum = bigA.add(bigB);
        BigInteger product = bigA.multiply(bigB);

        //mencetak hasil penjumlahan dan perkalian
        System.out.println(sum);
        System.out.println(product);

        scanner.close();
    }
}
