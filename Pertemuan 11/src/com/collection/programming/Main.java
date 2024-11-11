package com.collection.programming;

public class Main {
    public static void main(String[] args) {
        Family family = new Family();

        // Tambah paman dan keponakan
        family.addUncle("Albert");
        family.addUncle("Bill");
        family.addUncle("Charlie");

        family.addNiece("Amy", 15, 5);
        family.addNiece("Beatrice", 12, 12);
        family.addNiece("Claire", 9, 7);

        // Tampilkan daftar paman dan keponakan
        System.out.println("\n--- Daftar Paman ---");
        family.listUncles();

        System.out.println("\n--- Daftar Keponakan ---");
        family.listNieces();

        // Tambahkan hadiah
        Uncle albert = family.findUncle("Albert");
        Uncle bill = family.findUncle("Bill");
        Uncle charlie = family.findUncle("Charlie");

        Niece amy = family.findNiece("Amy");
        Niece beatrice = family.findNiece("Beatrice");
        Niece claire = family.findNiece("Claire");

        if (albert != null && amy != null) {
            albert.addPresent(amy, "Laptop");
        }
        if (bill != null && amy != null) {
            bill.addPresent(amy, "Book");
        }
        if (charlie != null && beatrice != null) {
            charlie.addPresent(beatrice, "Toy");
        }

        // Tampilkan hadiah dari setiap paman
        System.out.println("\n--- Hadiah dari Paman Albert ---");
        if (albert != null) albert.listPresents();

        System.out.println("\n--- Hadiah dari Paman Bill ---");
        if (bill != null) bill.listPresents();

        System.out.println("\n--- Hadiah dari Paman Charlie ---");
        if (charlie != null) charlie.listPresents();

        // Tampilkan hadiah untuk keponakan tertentu
        System.out.println("\n--- Hadiah untuk Amy ---");
        if (amy != null) amy.listPresents();

        // Hapus hadiah untuk keponakan setelah ulang tahun
        System.out.println("\n--- Menghapus Hadiah untuk Amy ---");
        if (amy != null) {
            int removedCount = amy.clearPresents();
            System.out.println("Hadiah yang dihapus: " + removedCount);
        }

        System.out.println("\n--- Hadiah untuk Amy Setelah Dihapus ---");
        if (amy != null) amy.listPresents();
    }
}
