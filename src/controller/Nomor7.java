package controller;

import model.classes.*;
import model.enums.Status;
import view.View7;

import javax.swing.*;
import java.util.List;

public class Nomor7 {
    public static void printGaji(int nik, List<Staff> staff) {
        View7 view = new View7();
        boolean foundNIK = false;
        double gaji = 0;
        for (Staff s : staff) {
            if (s.getNik() == nik) {
                int counter = 0;
                foundNIK = true;
                if (s instanceof Karyawan) {
                    for (PresensiStaff p : ((Karyawan) s).getPresensiStaff()) {
                        if (p.getStatus().equals(Status.HADIR)) {
                            counter++;
                        }
                    }
                    gaji = ((Karyawan) s).getSalary() * counter;
                }
                if (s instanceof DosenTetap) {
                    for (MatkulAjar ajar : ((DosenTetap) s).getAjar()) {
                        for (PresensiStaff p : ajar.getPresensi()) {
                            if (p.getStatus().equals(Status.HADIR)) {
                                counter++;
                            }
                        }
                    }
                    gaji = ((DosenTetap) s).getSalary() + (counter * 25000);
                }
                if (s instanceof DosenHonor) {
                    for (MatkulAjar ajar : ((DosenHonor) s).getAjar()) {
                        for (PresensiStaff p : ajar.getPresensi()) {
                            if (p.getStatus().equals(Status.HADIR)) {
                                counter++;
                            }
                        }
                    }
                    gaji = ((DosenHonor) s).getHonorPerSKS() * counter;
                }
                view.printGaji(s.getNik(), s.getNama(), gaji);
                break;
            }
        }

        if (!foundNIK) {
            JOptionPane.showMessageDialog(null, "NIK " + nik + " tidak ditemukan");
        }
    }
}
