package controller;

import model.classes.*;
import view.View3;
import java.util.List;

public class Nomor3 {
    public static void printAllAvg(String kodeMk, List<Mahasiswa> mhs) {
        View3 view = new View3();
        boolean foundMK = false;
        for (Mahasiswa m : mhs) {
            double nilaiAkhir = 0;
            if (m instanceof MahasiswaSarjana) {
                for (MatkulAmbil mk : ((MahasiswaSarjana) m).getAmbil()) {
                    if (mk.getAmbil().getKode().equalsIgnoreCase(kodeMk)) {
                        foundMK = true;
                        nilaiAkhir = HitungNA.hitungNA(mk.getN1(), mk.getN2(), mk.getN3());
                        view.displayNomor3(m.getNim(), mk.getAmbil().getNama(), nilaiAkhir);
                        break;
                    }
                }
            }
            if (m instanceof MahasiswaMagister) {
                for (MatkulAmbil mk : ((MahasiswaMagister) m).getAmbil()) {
                    if (mk.getAmbil().getKode().equalsIgnoreCase(kodeMk)) {
                        foundMK = true;
                        nilaiAkhir = HitungNA.hitungNA(mk.getN1(), mk.getN2(), mk.getN3());
                        view.displayNomor3(m.getNim(), mk.getAmbil().getNama(), nilaiAkhir);
                        break;
                    }
                }
            }
        }

        if (!foundMK) {
            view.displayNomor3(0,kodeMk + " tidak ditemukan", 0);
        }
    }
}