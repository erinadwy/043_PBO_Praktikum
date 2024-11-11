package com.collection.programming;

import java.util.HashMap;

public class Uncle {
    private String name;
    private HashMap<Niece, String> presents; // Hadiah untuk masing-masing keponakan

    public Uncle(String name) {
        this.name = name;
        this.presents = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public boolean addPresent(Niece recipient, String description) {
        // Pastikan hadiah belum ada
        if (!presents.containsKey(recipient)) {
            presents.put(recipient, description);
            recipient.addPresent(name, description); // Tambahkan hadiah ke koleksi keponakan
            return true;
        }
        return false; // Hadiah sudah ada
    }

    public void listPresents() {
        System.out.println("Hadiah dari " + name + ":");
        for (Niece niece : presents.keySet()) {
            System.out.println("- " + niece.getName() + ": " + presents.get(niece));
        }
    }
}

