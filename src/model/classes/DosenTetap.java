package model.classes;

import java.util.ArrayList;

public class DosenTetap extends Dosen{
    private double salary;

    public DosenTetap(String nama, String alamat, String ttl, String telepon, int nik, String department, ArrayList<MatkulAjar> ajar, double salary) {
        super(nama, alamat, ttl, telepon, nik, department, ajar);
        this.salary = salary;
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
                getAjar().toString();
    }
}
