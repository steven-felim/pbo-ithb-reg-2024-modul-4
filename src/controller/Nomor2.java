package controller;

import model.classes.*;
import view.View2;
import java.util.ArrayList;
import java.util.List;

public class Nomor2 {
    public static void printAvg(int nim, String kodeMk, List<Mahasiswa> mhs, ArrayList<MatkulAmbil> matkul) {
        View2 view = new View2();
        boolean foundNim = false, foundMK = false;
        for (Mahasiswa m : mhs) {
            if (m.getNim() == nim) {
                foundNim = true;
                double nilaiAkhir = 0;
                if (m instanceof MahasiswaDoktor) {
                    double nilai1 = ((MahasiswaDoktor) mhs).getNilaiSidang1();
                    double nilai2 = ((MahasiswaDoktor) mhs).getNilaiSidang2();
                    double nilai3 = ((MahasiswaDoktor) mhs).getNilaiSidang3();
                    nilaiAkhir = (nilai1 + nilai2 + nilai3) / 3;
                    view.displayNomor2(m.getNim(), "Nilai akhir sidang", nilaiAkhir);
                    break;
                } else if (m instanceof MahasiswaSarjana || m instanceof MahasiswaMagister) {
                    for (MatkulAmbil mk : matkul) {
                        if (mk.getAmbil().getKode().equalsIgnoreCase(kodeMk)) {
                            foundMK = true;
                            double nilai1 = mk.getN1();
                            double nilai2 = mk.getN2();
                            double nilai3 = mk.getN3();
                            nilaiAkhir = (nilai1 + nilai2 + nilai3) / 3;
                            view.displayNomor2(m.getNim(), mk.getAmbil().getNama(), nilaiAkhir);
                            break;
                        }
                    }
                }
                break;
            }
        }

        if (!foundNim) {
            view.displayNomor2(nim, "Tidak ditemukan", 404);
        }
        if (!foundMK) {
            view.displayNomor2(nim, kodeMk + " tidak ditemukan", 404);
        }
    }
}