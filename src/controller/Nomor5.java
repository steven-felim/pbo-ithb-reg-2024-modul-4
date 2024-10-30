package controller;

import model.classes.*;
import model.enums.Status;
import view.View5;
import javax.swing.*;
import java.util.List;

public class Nomor5 {
    public static void printMatkuAmbil(int nim, List<Mahasiswa> mhs) {
        View5 view = new View5();
        boolean foundNIM = false;
        for (Mahasiswa m : mhs) {
            if (m.getNim() == nim) {
                foundNIM = true;
                if (m instanceof MahasiswaSarjana) {
                    for (MatkulAmbil mK : ((MahasiswaSarjana) m).getAmbil()) {
                        int counter = 0, counterHadir = 0;
                        for (Presensi p : mK.getPresensi()) {
                            counter++;
                            if (p.getStatus() == Status.HADIR) {
                                counterHadir++;
                            }
                        }
                        double persenHadir = hitungKehadiran(counterHadir, counter);
                        view.displayNomor5(m.getNim(), m.getNama(), mK.getAmbil().getNama(), mK.getPresensi().toString(), persenHadir, counter, counterHadir);
                    }
                    break;
                }
                if (m instanceof MahasiswaMagister) {
                    for (MatkulAmbil mK : ((MahasiswaMagister) m).getAmbil()) {
                        int counter = 0, counterHadir = 0;
                        for (Presensi p : mK.getPresensi()) {
                            counter++;
                            if (p.getStatus() == Status.HADIR) {
                                counterHadir++;
                            }
                            double persenHadir = hitungKehadiran(counterHadir, counter);
                            view.displayNomor5(m.getNim(), m.getNama(), mK.getAmbil().getNama(), mK.getPresensi().toString(), persenHadir, counter, counterHadir);
                        }
                    }
                    break;
                }
                if (m instanceof MahasiswaDoktor) {
                    view.displayMhsDoktor(m.getNim(), m.getNama());
                }
            }
        }
        if (!foundNIM) {
            JOptionPane.showMessageDialog(null, nim, "NIM Tidak Ditemukan", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static double hitungKehadiran(double counterHadir, double counter) {
        return Math.round(counterHadir / counter * 100);
    }
}
