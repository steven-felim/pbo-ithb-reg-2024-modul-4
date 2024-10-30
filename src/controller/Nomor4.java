package controller;

import model.classes.*;
import view.View4;
import java.util.List;

public class Nomor4 {
    public static void printMhsTidakLulus(String kodeMk, List<Mahasiswa> mhs) {
        View4 view = new View4();
        boolean foundMK = false;
        int counterTidakLulus = 0, counterTotal = 0;
        for (Mahasiswa m : mhs) {
            double nilaiAkhir = 0;
            if (m instanceof MahasiswaSarjana) {
                for (MatkulAmbil mk : ((MahasiswaSarjana) m).getAmbil()) {
                    if (mk.getAmbil().getKode().equalsIgnoreCase(kodeMk)) {
                        foundMK = true;
                        counterTotal += 1;
                        nilaiAkhir = HitungNA.hitungNA(mk.getN1(), mk.getN2(), mk.getN3());
                        if (nilaiAkhir < 56) {
                            counterTidakLulus += 1;
                        }
                        break;
                    }
                }
            }
            if (m instanceof MahasiswaMagister) {
                for (MatkulAmbil mk : ((MahasiswaMagister) m).getAmbil()) {
                    if (mk.getAmbil().getKode().equalsIgnoreCase(kodeMk)) {
                        foundMK = true;
                        counterTotal += 1;
                        nilaiAkhir = HitungNA.hitungNA(mk.getN1(), mk.getN2(), mk.getN3());
                        if (nilaiAkhir < 56) {
                            counterTidakLulus += 1;
                        }
                        break;
                    }
                }
            }
        }

        if (foundMK) {
            view.displayNomor4(kodeMk, counterTidakLulus, counterTotal);
        } else {
            view.displayNomor4(kodeMk + " tidak ditemukan", 0, 0);
        }
    }
}