package StudiKasus3;

import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many salespeople do you want to enter? ");
        int numberOfSalespeople = scan.nextInt();
        scan.nextLine();  // Clear the newline character

        SalesPerson[] salesStaff = new SalesPerson[numberOfSalespeople];

        // Input dari pengguna
        for (int i = 0; i < numberOfSalespeople; i++) {
            System.out.println("\nEnter details for salesperson " + (i + 1) + ":");

            System.out.print("First Name: ");
            String firstName = scan.nextLine();

            System.out.print("Last Name: ");
            String lastName = scan.nextLine();

            System.out.print("Total Sales: ");
            int totalSales = scan.nextInt();
            scan.nextLine();  // Clear the newline character

            salesStaff[i] = new SalesPerson(firstName, lastName, totalSales);
        }

        // Mengurutkan menggunakan insertionSort
        Sorting.insertionSort(salesStaff);

        // Menampilkan hasil pengurutan
        System.out.println("\nRanking of Sales for the Week\n");
        for (SalesPerson s : salesStaff) {
            System.out.println(s);
        }
    }
}
