package model.classes;

import java.util.ArrayList;

public class Karyawan extends Staff{
    private double salary;
    private ArrayList<PresensiStaff> presensiStaff;

    public Karyawan(String nama, String alamat, String ttl, String telepon, int nik, double salary, ArrayList<PresensiStaff> presensiStaff) {
        super(nama, alamat, ttl, telepon, nik);
        this.salary = salary;
        this.presensiStaff = presensiStaff;
    }

    public ArrayList<PresensiStaff> getPresensiStaff() {
        return presensiStaff;
    }

    public void setPresensiStaff(ArrayList<PresensiStaff> presensiStaff) {
        this.presensiStaff = presensiStaff;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Nama                   : " + getNama() + "\n" +
                "Alamat                 : " + getAlamat() + "\n" +
                "Tempat & Tanggal Lahir : " + getTtl() + "\n" +
                "Telepon                : " + getTelepon() + "\n" +
                "NIK                    : " + getNik() + "\n" +
                "Gaji                   : " + getSalary() + "\n" +
                presensiStaff.toString();
    }
}
