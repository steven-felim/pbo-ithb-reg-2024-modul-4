package main;

import model.classes.*;

import java.util.ArrayList;
import java.util.List;

public class ContohInput {
    // Function untuk panduan input
    public static void Nama(List<User> users) {
        System.out.println("Input nama yang tersedia");
        for (User u : users) {
            System.out.println(u.getNama());
        }
    }

    public static void NIM(List<Mahasiswa> mhs) {
        System.out.println("Input NIM yang tersedia");
        for (Mahasiswa m : mhs) {
            System.out.println(m.getNim());
        }
    }

    public static void Matkul(ArrayList<MataKuliah> matkul) {
        System.out.println("Input mata kuliah yang tersedia");
        for (MataKuliah mk : matkul) {
            System.out.println(mk.getKode());
        }
    }

    public static void NIK(List<Staff> staff) {
        System.out.println("Input NIK yang tersedia");
        for (Staff s : staff) {
            System.out.println(s.getNik());
        }
    }

    public static void NIKD(List<Dosen> dosen) {
        System.out.println("Input NIK yang tersedia");
        for (Dosen d : dosen) {
            System.out.println(d.getNik());
        }
    }
}
