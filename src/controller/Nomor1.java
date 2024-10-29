package controller;

import model.classes.*;
import view.View1;
import java.util.List;

public class Nomor1 {

    public static void printUserData(String nama, List<User> users) {
        View1 view = new View1();
        boolean found = false;
        for (User user : users) {
            if (user.getNama().equalsIgnoreCase(nama)) {
                found = true;
                String status = cekStatus(user);
                view.displayNomor1(user.toString(), status);
            }
        }

        if (!found) {
            System.out.println("User dengan nama " + nama + " tidak ditemukan.");
        }
    }
    public static String cekStatus(User user) {
        String status = "";
        if (user instanceof MahasiswaSarjana) {
            status = "Mahasiswa Sarjana";
        }
        if (user instanceof MahasiswaMagister) {
            status = "Mahasiswa Magister";
        }
        if (user instanceof MahasiswaDoktor) {
            status = "Mahasiswa Doktor";
        }
        if (user instanceof Karyawan) {
            status = "Karyawan";
        }
        if (user instanceof DosenTetap) {
            status = "Dosen Tetap";
        }
        if (user instanceof DosenHonor) {
            status = "Dosen Honor";
        }
        return status;
    }
}
