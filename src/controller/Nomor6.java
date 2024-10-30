package controller;

import model.classes.*;
import model.enums.Status;
import view.View6;

import javax.swing.*;
import java.util.List;

public class Nomor6 {
    public static void printJamAjar(int nik, List<Dosen> dosen) {
        View6 view = new View6();
        boolean foundNIK = false;
        for (Dosen d : dosen) {
            if (d.getNik() == nik) {
                foundNIK = true;
                int counterMK = 0, counterJam = 0, counterPertemuan = 0, counterHadir = 0;
                if (d instanceof DosenTetap) {
                    for (MatkulAjar ajar : d.getAjar()) {
                        counterMK++;
                        for (PresensiStaff p : ajar.getPresensi()) {
                            if (p.getStatus().equals(Status.HADIR)) {
                                counterJam += ajar.getAjar().getSks();
                                counterHadir++;
                            }
                            counterPertemuan++;
                        }
                    }
                    view.printJamAjar(d.getNik(), d.getNama(), counterMK, counterHadir, counterJam, counterPertemuan);
                    break;
                }
                if (d instanceof DosenHonor) {
                    for (MatkulAjar ajar : d.getAjar()) {
                        counterMK++;
                        for (PresensiStaff p : ajar.getPresensi()) {
                            if (p.getStatus().equals(Status.HADIR)) {
                                counterJam += ajar.getAjar().getSks();
                                counterHadir++;
                            }
                        }
                    }
                    view.printJamAjar(d.getNik(), d.getNama(), counterMK, counterHadir, counterJam, counterPertemuan);
                    break;
                }
                break;
            }
        }
        if (!foundNIK) {
            JOptionPane.showMessageDialog(null, "NIK " + nik + " tidak ditemukan");
        }
    }
}
