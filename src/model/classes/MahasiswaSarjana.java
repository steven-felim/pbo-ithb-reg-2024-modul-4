package model.classes;

import java.util.ArrayList;

public class MahasiswaSarjana extends Mahasiswa {
    private ArrayList<MatkulAmbil> ambil = new ArrayList<MatkulAmbil>();

    public MahasiswaSarjana(String nama, String alamat, String ttl, String telepon, int nim, String jurusan, ArrayList<MatkulAmbil> ambil) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.ambil = ambil;
    }

    public ArrayList<MatkulAmbil> getAmbil() {
        return ambil;
    }

    public void setAmbil(ArrayList<MatkulAmbil> ambil) {
        this.ambil = ambil;
    }

    @Override
    public String toString() {
        return "Nama                   : " + getNama() + "\n" +
                "Alamat                 : " + getAlamat() + "\n"+
                "Tempat & Tanggal Lahir : " + getTtl() + "\n" +
                "Telepon                : " + getTelepon() + "\n" +
                "NIM                    : " + getNim() + "\n" +
                "Jurusan                : " + getJurusan() + "\n" +
                "Mata kuliah            : "  + "\n" +
                ambil.toString();
    }
}
