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
                if (m instanceof MahasiswaSarjana) {
                    for (MatkulAmbil mk : ((MahasiswaSarjana) m).getAmbil()) {
                        if (mk.getAmbil().getKode().equalsIgnoreCase(kodeMk)) {
                            foundMK = true;
                            nilaiAkhir = HitungNA.hitungNA(mk.getN1(), mk.getN2(), mk.getN3());
                            view.displayNomor2(m.getNim(), mk.getAmbil().getNama(), nilaiAkhir);
                            break;
                        }
                    }
                    break;
                }
                if (m instanceof MahasiswaMagister) {
                    for (MatkulAmbil mk : ((MahasiswaMagister) m).getAmbil()) {
                        if (mk.getAmbil().getKode().equalsIgnoreCase(kodeMk)) {
                            foundMK = true;
                            nilaiAkhir = HitungNA.hitungNA(mk.getN1(), mk.getN2(), mk.getN3());
                            view.displayNomor2(m.getNim(), mk.getAmbil().getNama(), nilaiAkhir);
                            break;
                        }
                    }
                    break;
                }
                if (m instanceof MahasiswaDoktor) {
                    nilaiAkhir = HitungNA.hitungNA(((MahasiswaDoktor) m).getNilaiSidang1(), ((MahasiswaDoktor) mhs).getNilaiSidang2(), ((MahasiswaDoktor) mhs).getNilaiSidang3());
                    view.displayNomor2(m.getNim(), "Nilai akhir sidang", nilaiAkhir);
                    break;
                }
            }
        }
        if(!foundNim || !foundMK) {
            view.displayNomor2(nim, "Input " + kodeMk + " Tidak Ditemukan", 404);
        }
    }
}