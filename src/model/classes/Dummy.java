package model.classes;

import model.enums.Status;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Dummy {
    ArrayList<MataKuliah> sem1 = new ArrayList<>();
    ArrayList<MataKuliah> sem3 = new ArrayList<>();
    ArrayList<MataKuliah> sem5 = new ArrayList<>();
    ArrayList<MatkulPilihan> mp = new ArrayList<>();
    ArrayList<MatkulAmbil> a1 = new ArrayList<>();
    ArrayList<MatkulAmbil> a2 = new ArrayList<>();
    ArrayList<MatkulAjar> aj1 = new ArrayList<>();
    ArrayList<MatkulAjar> aj2 = new ArrayList<>();
    ArrayList<MatkulAjar> aj3 = new ArrayList<>();
    ArrayList<Presensi> pr1 = new ArrayList<>();
    ArrayList<Presensi> pr2 = new ArrayList<>();
    ArrayList<PresensiStaff> prs = new ArrayList<>();
    List<User> users = new ArrayList<>();

    static List<MahasiswaSarjana> ms = new ArrayList<>();
    static List<MahasiswaMagister> mm = new ArrayList<>();
    static List<MahasiswaDoktor> md = new ArrayList<>();
    static List<Karyawan> k = new ArrayList<>();
    static List<DosenTetap> dt = new ArrayList<>();
    static List<DosenHonor> dh = new ArrayList<>();

    public ArrayList<MataKuliah> getSem1() {
        return sem1;
    }

    public ArrayList<MataKuliah> getSem3() {
        return sem3;
    }

    public ArrayList<MataKuliah> getSem5() {
        return sem5;
    }

    public ArrayList<MatkulPilihan> getMp() {
        return mp;
    }

    public ArrayList<Presensi> getPr1() {
        return pr1;
    }

    public ArrayList<Presensi> getPr2() {
        return pr2;
    }

    public ArrayList<PresensiStaff> getPrs() {
        return prs;
    }

    public ArrayList<MatkulAmbil> getA1() {
        return a1;
    }

    public ArrayList<MatkulAmbil> getA2() {
        return a2;
    }

    public List<MahasiswaSarjana> getMs() {
        return ms;
    }

    public List<MahasiswaMagister> getMm() {
        return mm;
    }

    public List<MahasiswaDoktor> getMd() {
        return md;
    }

    public List<Karyawan> getK() {
        return k;
    }

    public ArrayList<MatkulAjar> getAj1() {
        return aj1;
    }

    public ArrayList<MatkulAjar> getAj2() {
        return aj2;
    }

    public ArrayList<MatkulAjar> getAj3() {
        return aj3;
    }

    public List<DosenTetap> getDt() {
        return dt;
    }

    public List<DosenHonor> getDh() {
        return dh;
    }

    public List<User> getUsers() {
        return users;
    }

    // User
    public List<User> createDummyUsers() {
        users.addAll(ms);
        users.addAll(mm);
        users.addAll(md);
        users.addAll(k);
        users.addAll(dh);
        users.addAll(dt);
        return users;
    }

    public Dummy() throws ParseException {
        // Mata kuliah semester 1
        sem1.add(new MataKuliah("IF-1P3", 4, "Desain Web"));
        sem1.add(new MataKuliah("IF-104", 4, "Algoritma dan Pemrogramamn"));
        sem1.add(new MataKuliah("IF-105", 3, "Pengantar Teknologi Informasi"));

        // Mata kuliah semester 3
        sem3.add(new MataKuliah("IF-301", 3, "Pemrograman Berorientasi Objek"));
        sem3.add(new MataKuliah("IF-302", 4, "Basis Data"));
        sem3.add(new MataKuliah("IF-303", 3, "Sistem Berkas"));

        // Mata kuliah semester 5
        sem5.add(new MataKuliah("IF-502", 2, "Interaksi Manusia dan Komputer"));
        sem5.add(new MataKuliah("IF-504", 3, "Kecerdasan Buatan"));

        // Mata kuliah pilihan
        mp.add(new MatkulPilihan("IF-900", 2, "Kapita Selekta", 10));
        mp.add(new MatkulPilihan("IF-903", 3, "Game Development", 10));
        mp.add(new MatkulPilihan("IF-904", 2, "Game Design", 10));

        // Tanggal, untuk presensi
        String d1 = "2024-10-10";
        String d2 = "2024-10-17";
        String d3 = "2024-10-24";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        Date date1 = formatter.parse(d1);
        Date date2 = formatter.parse(d2);
        Date date3 = formatter.parse(d3);

        // Presensi mahasiswa
        pr1.add(new Presensi(date1, Status.HADIR));
        pr1.add(new Presensi(date2, Status.HADIR));
        pr1.add(new Presensi(date3, Status.HADIR));

        pr2.add(new Presensi(date1, Status.HADIR));
        pr2.add(new Presensi(date2, Status.ALPHA));
        pr2.add(new Presensi(date3, Status.HADIR));

        prs.add(new PresensiStaff(date1, Status.HADIR, "09.00.05"));
        prs.add(new PresensiStaff(date2, Status.HADIR, "09.01.05"));
        prs.add(new PresensiStaff(date3, Status.HADIR, "09.00.25"));

        // List ambil matkul
        a1.add(new MatkulAmbil(sem3.get(0), pr1, 80, 75, 85));
        a1.add(new MatkulAmbil(sem3.get(1), pr1, 78, 80, 83));
        a1.add(new MatkulAmbil(sem5.get(1), pr1, 90, 85, 87));
        a1.add(new MatkulAmbil(mp.get(0), pr1, 78, 76, 80));
        a1.add(new MatkulAmbil(mp.get(1), pr1, 78, 76, 80));

        a2.add(new MatkulAmbil(sem1.get(0), pr1, 60, 56, 65));
        a2.add(new MatkulAmbil(sem1.get(1), pr2, 78, 68, 54));
        a2.add(new MatkulAmbil(sem3.get(1), pr1, 50, 62, 43));
        a2.add(new MatkulAmbil(sem3.get(2), pr1, 50, 62, 43));

        // Mahasiswa
        ms.add(new MahasiswaSarjana("Kezia", "Jalan Dadali No. 1", "Bandung, 22-12-2004", "012345678", 1123001, "Informatika", a1));
        ms.add(new MahasiswaSarjana("Steven", "Gang Maksudi No. 10", "Bandung, 14-03-2004", "012345679", 1123002, "Informatika", a1));
        ms.add(new MahasiswaSarjana("Jaysen", "Jalan TKI I No. 92", "Bandung, 21-09-2005", "012345680", 1123006, "Informatika", a2));
        ms.add(new MahasiswaSarjana("Alek", "Jalan TKI V No. 1", "Bandung, 16-02-2004", "012345080", 1123038, "Informatika", a2));

        mm.add(new MahasiswaMagister("Joel", "Jalan Banjaran No. 31", "Bandung, 02-03-2005", "098765432", 1123003, "Informatika", a1, "Dampak Penggunaan Generative AI Terhadap Keterampilan Mahasiswa"));
        mm.add(new MahasiswaMagister("Hans", "Jalan Ujung Berung No. 20", "Bandung, 15-01-2005", "098765412", 1123026, "Informatika", a1, "Dampak Penggunaan AI di Industri Digital"));

        md.add(new MahasiswaDoktor("Jerryco", "Jalan Rancamanyar No. 12", "Bandung, 02-03-2005", "0831265478", 1123009, "Informatika", "Penerapan Machine Learning dalam Industri Gaming", 90, 89, 95));
        md.add(new MahasiswaDoktor("Aloy", "Jalan Cicendo No. 4", "Bandung, 05-01-2005", "0831967478", 1123011, "Informatika", "Hubungan Penerapan AI dengan Penanganan Pasien di Rumah Sakit Indonesia", 90, 93, 95));

        // Karyawan
        k.add(new Karyawan("Tono", "Jalan Kopo No. 100", "Bandung, 01-01-1980", "03933392471", 9015001, 4000000, prs));
        k.add(new Karyawan("Toni", "Jalan Cihanjuang No. 50", "Subang, 07-03-1986", "03952492471", 9015002, 4300000, prs));

        // Matkul yang diajar dosen
        aj1.add(new MatkulAjar(sem1.get(1), prs));
        aj1.add(new MatkulAjar(sem3.get(1), prs));
        aj1.add(new MatkulAjar(sem3.get(2), prs));

        aj2.add(new MatkulAjar(sem1.get(0), prs));
        aj2.add(new MatkulAjar(sem5.get(0), prs));

        aj3.add(new MatkulAjar(sem3.get(0), prs));

        // Dosen
        dt.add(0, new DosenTetap("Inge", "Jalan Pabaki No. 30", "Bandung, 21-03-1962", "0819234567", 8085001, "Informatika", aj1, 8500000));
        dt.add(1, new DosenTetap("Ken", "Jalan Dipatiukur No. 20", "Bandung, 20-05-1980", "0819234756", 8012001, "Informatika", aj2, 8300000));

        dh.add(0, new DosenHonor("Dion", "Jalan TKI II No. 3A", "Bandung, 18-04-1998", "089531145678", 8021002, "Informatika", aj3, 1000000));
        dh.add(0, new DosenHonor("Hans", "Jalan Jendral Sudirman No. 32A", "Bandung, 18-02-1991", "089531145008", 8016002, "Informatika", aj3, 1000000));
    }
}
