package model.classes;

public class Staff extends User {
    private int nik;

    public Staff(String nama, String alamat, String ttl, String telepon, int nik) {
        super(nama, alamat, ttl, telepon);
        this.nik = nik;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    @Override
    public String toString() {
        return "Nama                   : " + getNama() + "\n" +
                "Alamat                 : " + getAlamat() + "\n" +
                "Tempat & Tanggal Lahir : " + getTtl() + "\n" +
                "Telepon                : " + getTelepon() + "\n " +
                "NIK                    : " + getNik();
    }
}
