import model.classes.*;
import model.enums.Status;
import controller.DataController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        // Mata kuliah semester 1
        ArrayList<MataKuliah> sem1 = new ArrayList<>();
        sem1.add(new MataKuliah("IF-1P3", 4, "Desain Web"));
        sem1.add(new MataKuliah("IF-104", 4, "Algoritma dan Pemrogramamn"));
        sem1.add(new MataKuliah("IF-105", 3, "Pengantar Teknologi Informasi"));

        // Mata kuliah semester 3
        ArrayList<MataKuliah> sem3 = new ArrayList<>();
        sem3.add(new MataKuliah("IF-301", 3, "Pemrograman Berorientasi Objek"));
        sem3.add(new MataKuliah("IF-302", 4, "Basis Data"));
        sem3.add(new MataKuliah("IF-303", 3, "Sistem Berkas"));

        // Mata kuliah semester 5
        ArrayList<MataKuliah> sem5 = new ArrayList<>();
        sem5.add(new MataKuliah("IF-502", 2, "Interaksi Manusia dan Komputer"));
        sem5.add(new MataKuliah("IF-504", 3, "Kecerdasan Buatan"));

        // Mata kuliah pilihan
        ArrayList<MatkulPilihan> mp = new ArrayList<>();
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
        ArrayList<Presensi> pr1 = new ArrayList<>();
        pr1.add(new Presensi(date1, Status.HADIR));
        pr1.add(new Presensi(date2, Status.HADIR));
        pr1.add(new Presensi(date3, Status.HADIR));

        ArrayList<Presensi> pr2 = new ArrayList<>();
        pr2.add(new Presensi(date1, Status.HADIR));
        pr2.add(new Presensi(date2, Status.ALPHA));
        pr2.add(new Presensi(date3, Status.HADIR));

        ArrayList<PresensiStaff> prs = new ArrayList<>();
        prs.add(new PresensiStaff(date1, Status.HADIR, "09.00.05"));
        prs.add(new PresensiStaff(date2, Status.HADIR, "09.01.05"));
        prs.add(new PresensiStaff(date3, Status.HADIR, "09.00.25"));

        // List ambil matkul
        ArrayList<MatkulAmbil> a1 = new ArrayList<>();
        a1.add(new MatkulAmbil(sem3.get(0), pr1, 80, 75, 85));
        a1.add(new MatkulAmbil(sem3.get(1), pr1, 78, 80, 83));
        a1.add(new MatkulAmbil(sem5.get(1), pr1, 90, 85, 87));
        a1.add(new MatkulAmbil(mp.get(0), pr1, 78, 76, 80));

        ArrayList<MatkulAmbil> a2 = new ArrayList<>();
        a2.add(new MatkulAmbil(sem1.get(0), pr1, 60, 56, 65));
        a2.add(new MatkulAmbil(sem1.get(1), pr2, 78, 68, 54));
        a2.add(new MatkulAmbil(sem3.get(2), pr1, 56, 70, 73));

        // Mahasiswa
        List<MahasiswaSarjana> ms = new ArrayList<>();
        ms.add(new MahasiswaSarjana("Kezia", "Jalan Dadali No. 1", "Bandung, 22-12-2004", "012345678", 1123001, "Informatika", a1));
        ms.add(new MahasiswaSarjana("Steven", "Gang Maksudi No. 10", "Bandung, 14-03-2004", "012345679", 1123002, "Informatika", a1));
        ms.add(new MahasiswaSarjana("Jaysen", "Jalan TKI I No. 92", "Bandung, 21-09-2005", "012345680", 1123006, "Informatika", a2));

        List<MahasiswaMagister> mm = new ArrayList<>();
        mm.add(new MahasiswaMagister("Joel", "Jalan Banjaran No. 31", "Bandung, 02-03-2005", "098765432", 1123003, "Informatika", a1, "Dampak Penggunaan Generative AI Terhadap Keterampilan Mahasiswa"));
        mm.add(new MahasiswaMagister("Hans", "Jalan Ujung Berung No. 20", "Bandung, 15-01-2005", "098765412", 1123026, "Informatika", a1, "Dampak Penggunaan AI di Industri Digital"));

        List<MahasiswaDoktor> md = new ArrayList<>();
        md.add(new MahasiswaDoktor("Jerryco", "Jalan Rancamanyar No. 12", "Bandung, 02-03-2005", "0831265478", 1123009, "Informatika", "Penerapan Machine Learning dalam Industri Gaming", 90, 89, 95));
        md.add(new MahasiswaDoktor("Aloy", "Jalan Cicendo No. 4", "Bandung, 05-01-2005", "0831967478", 1123011, "Informatika", "Hubungan Penerapan AI dengan Penanganan Pasien di Rumah Sakit Indonesia", 90, 93, 95));

        // Karyawan
        List<Karyawan> k = new ArrayList<>();
        k.add(new Karyawan("Tono", "Jalan Kopo No. 100", "Bandung, 01-01-1980", "03933392471", 9015001, 4000000, prs));
        k.add(new Karyawan("Toni", "Jalan Cihanjuang No. 50", "Subang, 07-03-1986", "03952492471", 9015002, 4300000, prs));

        // Matkul yang diajar dosen
        ArrayList<MatkulAjar> aj1 = new ArrayList<>();
        aj1.add(new MatkulAjar(sem1.get(1), prs));
        aj1.add(new MatkulAjar(sem3.get(1), prs));
        aj1.add(new MatkulAjar(sem3.get(2), prs));

        ArrayList<MatkulAjar> aj2 = new ArrayList<>();
        aj2.add(new MatkulAjar(sem1.get(0), prs));
        aj2.add(new MatkulAjar(sem5.get(0), prs));

        ArrayList<MatkulAjar> aj3 = new ArrayList<>();
        aj3.add(new MatkulAjar(sem3.get(0), prs));

        // Dosen
        List<DosenTetap> dt = new ArrayList<>();
        dt.add(0, new DosenTetap("Inge", "Jalan Pabaki No. 30", "Bandung, 21-03-1962", "0819234567", 8085001, "Informatika", aj1, 8500000));
        dt.add(1, new DosenTetap("Ken", "Jalan Dipatiukur No. 20", "Bandung, 20-05-1980", "0819234756", 8012001, "Informatika", aj2, 8300000));

        List<DosenHonor> dh = new ArrayList<>();
        dh.add(0, new DosenHonor("Dion", "Jalan TKI II No. 3A", "Bandung, 18-04-1998", "089531145678", 8021002, "Informatika", aj3, 7000000));

        DataController dc = new DataController(sem1, sem3, sem5, mp, pr1, pr2, prs, a1, a2, ms, mm, md, k, aj1, aj2, aj3, dt, dh);

        dc.printData();
    }
}
