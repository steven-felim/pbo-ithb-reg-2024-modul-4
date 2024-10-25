package model.classes;

import java.util.Date;
import model.enums.Status;

public class PresensiStaff extends Presensi {
    String jam;

    public PresensiStaff(Date tanggal, Status status, String jam) {
        super(tanggal, status);
        this.jam = jam;
    }

    public String getJam() {
        return jam;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    @Override
    public String toString() {
        return getTanggal().toString() + " - " + getJam() + " - " + getStatus() + "\n";
    }
}
