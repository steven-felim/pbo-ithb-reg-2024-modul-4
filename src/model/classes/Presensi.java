package model.classes;

import model.enums.Status;

import java.util.Date;

public class Presensi {
    Date tanggal;
    Status status;

    public Presensi(Date tanggal, Status status) {
        this.tanggal = tanggal;
        this.status = status;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String toString() {
        return getTanggal().toString() + " - " + getStatus() + "\n";
    }
}
