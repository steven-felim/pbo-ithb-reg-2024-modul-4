package model.classes;

import java.util.ArrayList;

public class MatkulPilihan extends MataKuliah {
    private int minimumMhs;

    public MatkulPilihan(String kode, int sks, String nama, int minimumMhs) {
        super(kode, sks, nama);
        this.minimumMhs = minimumMhs;
    }

    public int getMinimumMhs() {
        return minimumMhs;
    }

    public void setMinimumMhs(int minimumMhs) {
        this.minimumMhs = minimumMhs;
    }

    @Override
    public String toString() {
        return "Kode Mata Kuliah    : " + getKode() + "\n" +
                "Nama Mata Kuliah    : " + getNama() + "\n" +
                "Jumlah SKS          : " + getSks() + "\n" +
                "Minimum Mahasiswa   : " + getMinimumMhs();
    }
}
