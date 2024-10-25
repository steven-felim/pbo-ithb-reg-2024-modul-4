package model.classes;

public class MahasiswaDoktor extends Mahasiswa {
    private String judulPenelitianDisertasi;
    private double nilaiSidang1, nilaiSidang2, nilaiSidang3;

    public MahasiswaDoktor(String nama, String alamat, String ttl, String telepon, int nim, String jurusan, String judulPenelitianDisertasi, double nilaiSidang1, double nilaiSidang2, double nilaiSidang3) {
        super(nama, alamat, ttl, telepon, nim, jurusan);
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
        this.nilaiSidang1 = nilaiSidang1;
        this.nilaiSidang2 = nilaiSidang2;
        this.nilaiSidang3 = nilaiSidang3;
    }

    public String getJudulPenelitianDisertasi() {
        return judulPenelitianDisertasi;
    }

    public void setJudulPenelitianDisertasi(String judulPenelitianDisertasi) {
        this.judulPenelitianDisertasi = judulPenelitianDisertasi;
    }

    public double getNilaiSidang1() {
        return nilaiSidang1;
    }

    public void setNilaiSidang1(double nilaiSidang1) {
        this.nilaiSidang1 = nilaiSidang1;
    }

    public double getNilaiSidang2() {
        return nilaiSidang2;
    }

    public void setNilaiSidang2(double nilaiSidang2) {
        this.nilaiSidang2 = nilaiSidang2;
    }

    public double getNilaiSidang3() {
        return nilaiSidang3;
    }

    public void setNilaiSidang3(double nilaiSidang3) {
        this.nilaiSidang3 = nilaiSidang3;
    }

    @Override
    public String toString() {
        return "Nama                       : " + getNama() + "\n" +
                "Alamat                     : " + getAlamat() + "\n" +
                "Tempat & Tanggal Lahir     : " + getTtl() + "\n" +
                "Telepon                    : " + getTelepon() + "\n" +
                "NIM                        : " + getNim() + "\n " +
                "Jurusan                    : " + getJurusan() + "\n" +
                "Judul Penelitian Disertasi : " + judulPenelitianDisertasi + "\n" +
                "Nilai sidang 1             : " + nilaiSidang1 + "\n" +
                "Nilai sidang 2             : " + nilaiSidang2 + "\n" +
                "Nilai sidang 3             : " + nilaiSidang3;
    }
}
