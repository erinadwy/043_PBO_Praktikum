package com.collection.programming;

import java.util.HashMap;

public class Niece {
    private String name;
    private int birthDay;
    private int birthMonth;
    private HashMap<String, String> presents; // Hadiah yang diterima (key: nama paman, value: deskripsi hadiah)

    public Niece(String name, int day, int month) {
        this.name = name;
        this.birthDay = day;
        this.birthMonth = month;
        this.presents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void addPresent(String uncleName, String description) {
        presents.put(uncleName, description);
    }

    public void listPresents() {
        System.out.println("Hadiah untuk " + name + ":");
        if (presents.isEmpty()) {
            System.out.println("- Tidak ada hadiah.");
        } else {
            for (String uncle : presents.keySet()) {
                System.out.println("- Dari paman" + uncle + ": " + presents.get(uncle));
            }
        }
    }

    public int clearPresents() {
        int count = presents.size();
        presents.clear(); // Hapus semua hadiah
        return count; // Kembalikan jumlah hadiah yang dihapus
    }
}


