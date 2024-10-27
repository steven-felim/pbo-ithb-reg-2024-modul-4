package view;

import model.classes.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class DataView {
    public void displayNomor1(String user) {
        JOptionPane.showMessageDialog(null, user, "Data", JOptionPane.INFORMATION_MESSAGE);
    }

    public void displayMataKuliah(String semester, ArrayList<MataKuliah> mataKuliah) {
        System.out.println("Daftar Mata Kuliah " + semester + ":");
        for (MataKuliah m : mataKuliah) {
            System.out.println(m.toString() + "\n");
        }
    }

    public void displayMatkulPilihan(ArrayList<MatkulPilihan> matkulPilihan) {
        System.out.println("Daftar Mata Kuliah Pilihan:");
        for (MatkulPilihan m : matkulPilihan) {
            System.out.println(m.toString() + "\n");
        }
    }

    public void displayMhsSarjana(List<MahasiswaSarjana> ms) {
        System.out.println("Daftar Mahasiswa Sarjana:");
        for (MahasiswaSarjana m : ms) {
            System.out.println(m.toString() + "\n");
        }
    }

    public void displayMhsMagister(List<MahasiswaMagister> mm) {
        System.out.println("Daftar Mahasiswa Magister:");
        for (MahasiswaMagister m : mm) {
            System.out.println(m.toString() + "\n");
        }
    }

    public void displayMhsDoktor(List<MahasiswaDoktor> md) {
        System.out.println("Daftar Mahasiswa Doktor:");
        for (MahasiswaDoktor m : md) {
            System.out.println(m.toString() + "\n");
        }
    }

    public void displayKaryawan(List<Karyawan> kary) {
        System.out.println("Daftar Karyawan:");
        for (Karyawan k : kary) {
            System.out.println(k.toString() + "\n");
        }
    }

    public void displayDosenTetap(List<DosenTetap> dt) {
        System.out.println("Daftar Dosen Tetap:");
        for (DosenTetap d : dt) {
            System.out.println(d.toString() + "\n");
        }
    }

    public void displayDosenHonor(List<DosenHonor> dh) {
        System.out.println("Daftar Dosen Honor:");
        for (DosenHonor d : dh) {
            System.out.println(d.toString() + "\n");
        }
    }
}
