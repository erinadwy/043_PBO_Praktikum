package com.jtk.polban.akademik;

public abstract class CivitasAcademica extends Akademik {
    protected String nama;

    public CivitasAcademica(String nama) {
        this.nama = nama;
    }

    public abstract String getPeran();
}