package StudiKasus3;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String[] strList;  // Menggunakan array String[]
        int size;

        Scanner scan = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah elemen array
        System.out.print("\nHow many strings do you want to sort? ");
        size = scan.nextInt();
        scan.nextLine();  // Menghilangkan karakter newline dari input sebelumnya
        strList = new String[size];  // Membuat array String

        // Input data array
        System.out.println("\nEnter the strings... ");
        for (int i = 0; i < size; i++) {
            strList[i] = scan.nextLine();  // Membaca input string dari pengguna
        }

        // Panggil selectionSort dari kelas Sorting
//        Sorting.selectionSort(strList);

        // Panggil insertionSort dari kelas Sorting
        Sorting.insertionSort(strList);

        // Tampilkan hasil pengurutan
        System.out.println("\nYour strings in sorted order... ");
        for (int i = 0; i < size; i++) {
            System.out.println(strList[i]);
        }
    }
}

