package model.classes;

import java.util.ArrayList;

public class MatkulAmbil {
    private MataKuliah ambil;
    private ArrayList<Presensi> presensi;
    private double n1, n2, n3;

    public MatkulAmbil(MataKuliah ambil, ArrayList<Presensi> presensi, double n1, double n2, double n3) {
        this.ambil = ambil;
        this.presensi = presensi;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public MataKuliah getAmbil() {
        return ambil;
    }

    public void setAmbil(MataKuliah ambil) {
        this.ambil = ambil;
    }

    public ArrayList<Presensi> getPresensi() {
        return presensi;
    }

    public void setPresensi(ArrayList<Presensi> presensi) {
        this.presensi = presensi;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "\n" + getAmbil().toString() +
                "Nilai 1 Mahasiswa   : " + getN1() + "\n" +
                "Nilai 2 Mahasiswa   : " + getN2() + "\n" +
                "Nilai 3 Mahasiswa   : " + getN3() + "\n\n";
    }

}
