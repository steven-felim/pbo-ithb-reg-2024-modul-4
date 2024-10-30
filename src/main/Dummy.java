package main;

import model.classes.*;
import model.enums.Status;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Dummy {
    ArrayList<MataKuliah> mataKuliah = new ArrayList<>();
    ArrayList<MataKuliah> sem1 = new ArrayList<>();
    ArrayList<MataKuliah> sem3 = new ArrayList<>();
    ArrayList<MataKuliah> sem5 = new ArrayList<>();
    ArrayList<MatkulPilihan> mp = new ArrayList<>();
    ArrayList<MatkulAmbil> ambil = new ArrayList<>();
    ArrayList<MatkulAmbil> a1 = new ArrayList<>();
    ArrayList<MatkulAmbil> a2 = new ArrayList<>();
    ArrayList<MatkulAmbil> a3 = new ArrayList<>();
    ArrayList<MatkulAmbil> a4 = new ArrayList<>();
    ArrayList<MatkulAjar> aj1 = new ArrayList<>();
    ArrayList<MatkulAjar> aj2 = new ArrayList<>();
    ArrayList<MatkulAjar> aj3 = new ArrayList<>();
    ArrayList<MatkulAjar> aj4 = new ArrayList<>();
    ArrayList<Presensi> pr1 = new ArrayList<>();
    ArrayList<Presensi> pr2 = new ArrayList<>();
    ArrayList<PresensiStaff> prs1 = new ArrayList<>();
    ArrayList<PresensiStaff> prs2 = new ArrayList<>();
    List<User> users = new ArrayList<>();
    List<Mahasiswa> mhs = new ArrayList<>();
    List<Staff> staff = new ArrayList<>();
    List<Dosen> dosen = new ArrayList<>();

    static List<MahasiswaSarjana> ms = new ArrayList<>();
    static List<MahasiswaMagister> mm = new ArrayList<>();
    static List<MahasiswaDoktor> md = new ArrayList<>();
    static List<Karyawan> k = new ArrayList<>();
    static List<DosenTetap> dt = new ArrayList<>();
    static List<DosenHonor> dh = new ArrayList<>();

    // User
    public List<User> createDummyUsers() {
        createDummyMhs();
        createDummyStaff();
        users.addAll(mhs);
        users.addAll(staff);
        return users;
    }

    public List<Mahasiswa> createDummyMhs() {
        for (Mahasiswa mahasiswa : ms) {
            if (!mhs.contains(mahasiswa)) {
                mhs.add(mahasiswa);
            }
        }
        for (Mahasiswa mahasiswa : mm) {
            if (!mhs.contains(mahasiswa)) {
                mhs.add(mahasiswa);
            }
        }
        for (Mahasiswa mahasiswa : md) {
            if (!mhs.contains(mahasiswa)) {
                mhs.add(mahasiswa);
            }
        }
        return mhs;
    }


    public List<Staff> createDummyStaff() {
        createDummyDosen();
        staff.addAll(k);
        staff.addAll(dosen);
        return staff;
    }

    public List<Dosen> createDummyDosen() {
        dosen.addAll(dt);
        dosen.addAll(dh);
        return dosen;
    }

    public ArrayList<MataKuliah> createDummyMataKuliah() {
        mataKuliah.addAll(sem1);
        mataKuliah.addAll(sem3);
        mataKuliah.addAll(sem5);
        mataKuliah.addAll(mp);
        return mataKuliah;
    }

    public ArrayList<MatkulAmbil> createDummyMatkulAmbil() {
        ambil.addAll(a1);
        ambil.addAll(a2);
        return ambil;
    }

    public Dummy() throws ParseException {
        initializePresensi();
        initializeMataKuliah();
        initializeMatkulAmbil();
        initializeMatkulAjar();
        initializeMahasiswa();
        initializeStaff();
    }

    private void initializePresensi() throws ParseException {
        // Tanggal, untuk presensi
        String[] dates = {
                "2024-10-01", "2024-10-02", "2024-10-03", "2024-10-04",
                "2024-10-05", "2024-10-07", "2024-10-08", "2024-10-09",
                "2024-10-10", "2024-10-11", "2024-10-12", "2024-10-14",
                "2024-10-15", "2024-10-16", "2024-10-17", "2024-10-18",
                "2024-10-19", "2024-10-21", "2024-10-22", "2024-10-23",
                "2024-10-24", "2024-10-25"
        };

        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        for (int i = 0; i < dates.length; i++) {
            Date date = formatter.parse(dates[i]);

            // Presensi mahasiswa untuk pr1 dan pr2
            if (i % 13 == 0) {
                pr1.add(new Presensi(date, Status.ALPHA));
                pr2.add(new Presensi(date, Status.HADIR));
                prs1.add(new PresensiStaff(date, Status.ALPHA, "-"));
                prs2.add(new PresensiStaff(date, Status.HADIR, "09.02.02"));
            } else if (i % 13 == 1) {
                pr1.add(new Presensi(date, Status.HADIR));
                pr2.add(new Presensi(date, Status.ALPHA));
                prs1.add(new PresensiStaff(date, Status.HADIR, "09.00.55"));
                prs2.add(new PresensiStaff(date, Status.ALPHA, "-"));
            } else if (i % 17 == 1) {
                pr1.add(new Presensi(date, Status.ALPHA));
                pr2.add(new Presensi(date, Status.HADIR));
                prs1.add(new PresensiStaff(date, Status.HADIR, "09.00.55"));
                prs2.add(new PresensiStaff(date, Status.ALPHA, "-"));
            } else {
                pr1.add(new Presensi(date, Status.HADIR));
                pr2.add(new Presensi(date, Status.HADIR));
                prs1.add(new PresensiStaff(date, Status.HADIR, "08.58.05"));
                prs2.add(new PresensiStaff(date, Status.HADIR, "09.01.05"));
            }
        }
    }

    private void initializeMataKuliah() {
        // Mata kuliah semester 1
        sem1.add(new MataKuliah("IF-1P3", 4, "Desain Web"));
        sem1.add(new MataKuliah("IF-104", 4, "Algoritma dan Pemrograman"));
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
    }

    private void initializeMatkulAjar() {
        // Matkul yang diajar dosen
        aj1.add(new MatkulAjar(sem1.get(1), prs1));
        aj1.add(new MatkulAjar(sem3.get(1), prs1));
        aj1.add(new MatkulAjar(sem3.get(2), prs1));

        aj2.add(new MatkulAjar(sem1.get(0), prs2));
        aj2.add(new MatkulAjar(sem5.get(0), prs1));
        aj2.add(new MatkulAjar(sem5.get(1), prs2));

        aj3.add(new MatkulAjar(sem3.get(0), prs1));
        aj3.add(new MatkulAjar(mp.get(0), prs2));
        aj3.add(new MatkulAjar(mp.get(1), prs2));

        aj4.add(new MatkulAjar(sem3.get(0), prs1));
        aj4.add(new MatkulAjar(mp.get(1), prs1));
        aj4.add(new MatkulAjar(mp.get(2), prs2));
    }

    private void initializeMatkulAmbil() {
        // List ambil matkul
        a1.add(new MatkulAmbil(sem3.get(0), pr1, 80, 75, 85));
        a1.add(new MatkulAmbil(sem3.get(1), pr2, 78, 80, 83));
        a1.add(new MatkulAmbil(sem3.get(2), pr1, 60, 85, 90));
        a1.add(new MatkulAmbil(sem5.get(1), pr2, 90, 85, 87));
        a1.add(new MatkulAmbil(mp.get(0), pr1, 78, 76, 80));
        a1.add(new MatkulAmbil(mp.get(1), pr2, 78, 76, 80));

        a2.add(new MatkulAmbil(sem1.get(0), pr1, 60, 20, 65));
        a2.add(new MatkulAmbil(sem1.get(1), pr2, 78, 68, 54));
        a2.add(new MatkulAmbil(sem3.get(1), pr2, 50, 62, 43));
        a2.add(new MatkulAmbil(sem3.get(2), pr1, 50, 62, 43));

        a3.add(new MatkulAmbil(sem1.get(0), pr1, 82, 85, 75));
        a3.add(new MatkulAmbil(sem1.get(1), pr1, 78, 85, 72));
        a3.add(new MatkulAmbil(sem1.get(2), pr2, 90, 85, 95));

        a4.add(new MatkulAmbil(mp.get(0), pr1, 82, 85, 75));
        a4.add(new MatkulAmbil(mp.get(1), pr2, 78, 89, 77));
        a4.add(new MatkulAmbil(mp.get(2), pr2, 95, 82, 79));
    }

    private void initializeMahasiswa() {
        // Mahasiswa
        ms.add(new MahasiswaSarjana("Kezia", "Jalan Dadali No. 1", "Bandung, 22-12-2004", "012345678", 1123001, "Informatika", a1));
        ms.add(new MahasiswaSarjana("Steven", "Gang Maksudi No. 10", "Bandung, 14-03-2004", "012345679", 1123002, "Informatika", a1));
        ms.add(new MahasiswaSarjana("Jaysen", "Jalan TKI I No. 92", "Bandung, 21-09-2005", "012345680", 1123006, "Informatika", a2));
        ms.add(new MahasiswaSarjana("Alek", "Jalan TKI V No. 1", "Bandung, 16-02-2004", "012345080", 1123038, "Informatika", a2));
        ms.add(new MahasiswaSarjana("Shinta", "Jalan Cibadak No. 43", "Bandung, 25-12-2005", "012343632", 1124001, "Informatika", a3));
        ms.add(new MahasiswaSarjana("Marvel", "Jalan Rahayu No. 51", "Bandung, 23-07-2006", "012345089", 1124010, "Informatika", a3));

        mm.add(new MahasiswaMagister("Joel", "Jalan Banjaran No. 31", "Bandung, 02-03-2005", "098765432", 1123003, "Informatika", a4, "Dampak Penggunaan Generative AI Terhadap Keterampilan Mahasiswa"));
        mm.add(new MahasiswaMagister("Hans", "Jalan Ujung Berung No. 20", "Bandung, 15-01-2005", "098765412", 1123026, "Informatika", a4, "Dampak Penggunaan AI di Industri Digital"));
        mm.add(new MahasiswaMagister("Felix", "Jalan Babakan Tarogong No. 93", "Bandung, 17-09-2004", "081345672", 1123042, "Informatika", a4, "Pengaruh Sout hehe Terhadap IP Mahasiswa"));

        md.add(new MahasiswaDoktor("Jerryco", "Jalan Rancamanyar No. 12", "Bandung, 02-03-2005", "0831265478", 1123009, "Informatika", "Penerapan Machine Learning dalam Industri Gaming", 90, 89, 95));
        md.add(new MahasiswaDoktor("Aloy", "Jalan Cicendo No. 4", "Bandung, 05-01-2005", "0831967478", 1123011, "Informatika", "Hubungan Penerapan AI dengan Penanganan Pasien di Rumah Sakit Indonesia", 90, 93, 95));
    }

    private void initializeStaff() {
        // Karyawan
        k.add(new Karyawan("Tono", "Jalan Kopo No. 100", "Bandung, 01-01-1980", "03933392471", 9015001, 220000, prs1));
        k.add(new Karyawan("Toni", "Jalan Cihanjuang No. 50", "Subang, 07-03-1986", "03952492471", 9015002, 200000, prs2));

        // Dosen
        dt.add(0, new DosenTetap("Inge", "Jalan Pabaki No. 30", "Bandung, 21-03-1962", "0819234567", 9011001, "Informatika", aj1, 5500000));
        dt.add(1, new DosenTetap("Ken", "Jalan Dipatiukur No. 20", "Bandung, 20-05-1980", "0819234756", 9011002, "Informatika", aj2, 5000000));

        dh.add(0, new DosenHonor("Dion", "Jalan TKI II No. 3A", "Bandung, 18-04-1998", "089531145678", 9011003, "Informatika", aj3, 100000));
        dh.add(0, new DosenHonor("Hans", "Jalan Jendral Sudirman No. 32A", "Bandung, 18-02-1991", "089531145008", 9011004, "Informatika", aj4, 105000));
    }
}