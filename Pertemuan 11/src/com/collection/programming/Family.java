package com.collection.programming;

import java.util.ArrayList;

public class Family {
    private ArrayList<Niece> nieces;
    private ArrayList<Uncle> uncles;

    public Family() {
        this.nieces = new ArrayList<>();
        this.uncles = new ArrayList<>();
    }

    // Tambahkan keponakan baru
    public boolean addNiece(String name, int day, int month) {
        for (Niece niece : nieces) {
            if (niece.getName().equalsIgnoreCase(name)) {
                return false; // Nama sudah ada
            }
        }
        nieces.add(new Niece(name, day, month));
        return true;
    }

    // Tambahkan paman baru
    public boolean addUncle(String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equalsIgnoreCase(name)) {
                return false; // Nama sudah ada
            }
        }
        uncles.add(new Uncle(name));
        return true;
    }

    // Cari keponakan berdasarkan nama
    public Niece findNiece(String name) {
        for (Niece niece : nieces) {
            if (niece.getName().equalsIgnoreCase(name)) {
                return niece;
            }
        }
        return null; // Tidak ditemukan
    }

    // Cari paman berdasarkan nama
    public Uncle findUncle(String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equalsIgnoreCase(name)) {
                return uncle;
            }
        }
        return null; // Tidak ditemukan
    }

    // Tampilkan daftar keponakan
    public void listNieces() {
        System.out.println("Daftar Keponakan (diurutkan berdasarkan tanggal lahir):");
        nieces.sort((a, b) -> a.getBirthMonth() == b.getBirthMonth()
                ? a.getBirthDay() - b.getBirthDay()
                : a.getBirthMonth() - b.getBirthMonth());
        for (Niece niece : nieces) {
            System.out.println("- " + niece.getName() + ": " + niece.getBirthDay() + "/" + niece.getBirthMonth());
        }
    }

    // Tampilkan daftar paman
    public void listUncles() {
        System.out.println("Daftar Paman (diurutkan berdasarkan nama):");
        uncles.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
        for (Uncle uncle : uncles) {
            System.out.println("- " + uncle.getName());
        }
    }
}

