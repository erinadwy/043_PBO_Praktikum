package StudiKasus3;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Integer[] intList;  // Ubah dari int[] ke Integer[]
        int size;

        Scanner scan = new Scanner(System.in);

        // Meminta pengguna memasukkan jumlah elemen array
        System.out.print("\nHow many integers do you want to sort?  ");
        size = scan.nextInt();
        intList = new Integer[size];  // Autoboxing akan mengkonversi int ke Integer

        // Input data array
        System.out.println("\nEnter the numbers... ");
        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextInt();  // Autoboxing dari int ke Integer terjadi di sini
        }

        // Panggil selectionSort dari kelas Sorting
//        Sorting.selectionSort(intList);

        // Panggil insertionSort dari kelas Sorting
        Sorting.insertionSort(intList);

        // Tampilkan hasil pengurutan
        System.out.println("\nYour numbers in sorted order... ");
        for (int i = 0; i < size; i++) {
            System.out.print(intList[i] + " ");
        }
        System.out.println();
    }
}
