package controller;

import model.classes.*;
import view.DataView;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataController {
    private ArrayList<MataKuliah> sem1;
    private ArrayList<MataKuliah> sem3;
    private ArrayList<MataKuliah> sem5;
    private ArrayList<MatkulPilihan> matkulPilihan;
    private ArrayList<Presensi> pr1;
    private ArrayList<Presensi> pr2;
    private ArrayList<PresensiStaff> prs;
    private ArrayList<MatkulAmbil> a1;
    private ArrayList<MatkulAmbil> a2;
    private List<MahasiswaSarjana> ms;
    private List<MahasiswaMagister> mm;
    private List<MahasiswaDoktor> md;
    private List<Karyawan> k;
    private ArrayList<MatkulAjar> aj1;
    private ArrayList<MatkulAjar> aj2;
    private ArrayList<MatkulAjar> aj3;
    private List<DosenTetap> dt;
    private List<DosenHonor> dh;

    public DataController(ArrayList<MataKuliah> sem1, ArrayList<MataKuliah> sem3, ArrayList<MataKuliah> sem5, ArrayList<MatkulPilihan> matkulPilihan, ArrayList<Presensi> pr1, ArrayList<Presensi> pr2, ArrayList<PresensiStaff> prs, ArrayList<MatkulAmbil> a1, ArrayList<MatkulAmbil> a2, List<MahasiswaSarjana> ms, List<MahasiswaMagister> mm, List<MahasiswaDoktor> md, List<Karyawan> k, ArrayList<MatkulAjar> aj1, ArrayList<MatkulAjar> aj2, ArrayList<MatkulAjar> aj3, List<DosenTetap> dt, List<DosenHonor> dh) {
        this.sem1 = sem1;
        this.sem3 = sem3;
        this.sem5 = sem5;
        this.matkulPilihan = matkulPilihan;
        this.pr1 = pr1;
        this.pr2 = pr2;
        this.prs = prs;
        this.a1 = a1;
        this.a2 = a2;
        this.ms = ms;
        this.mm = mm;
        this.md = md;
        this.k = k;
        this.aj1 = aj1;
        this.aj2 = aj2;
        this.aj3 = aj3;
        this.dt = dt;
        this.dh = dh;
    }

    public void printData() {
        Scanner input = new Scanner(System.in);
        int pilih = 0;
        while(pilih != 99) {
            DataView view = new DataView();
            System.out.println("""
                    Pilih Menu:
                    1. Lihat daftar mata kuliah
                    2. Lihat daftar mahasiswa sarjana
                    3. Lihat daftar mahasiswa magister
                    4. Lihat daftar mahasiswa doktor
                    5. Lihat daftar karyawan
                    6. Lihat daftar dosen tetap
                    7. Lihat daftar dosen honor
                    99. Berhenti""");
            pilih = input.nextInt();
            switch (pilih){
                case 1:
                    System.out.println("""
                            Pilih semester:
                            11. Semester 1
                            12. Semester 3
                            13. Semester 5
                            14. Mata kuliah pilihan
                            """);
                    int pilih2 = input.nextInt();
                    switch (pilih2){
                        case 11:
                            view.displayMataKuliah("Semester 1", sem1);
                            break;
                        case 12:
                            view.displayMataKuliah("Semester 3", sem3);
                            break;
                        case 13:
                            view.displayMataKuliah("Semester 5", sem5);
                            break;
                        case 14:
                            view.displayMatkulPilihan(matkulPilihan);
                            break;
                        default:
                            System.out.println("Tidak valid");
                    }
                    break;
                case 2:
                    view.displayMhsSarjana(ms);
                    break;
                case 3:
                    view.displayMhsMagister(mm);
                    break;
                case 4:
                    view.displayMhsDoktor(md);
                    break;
                case 5:
                    view.displayKaryawan(k);
                    break;
                case 6:
                    view.displayDosenTetap(dt);
                    break;
                case 7:
                    view.displayDosenHonor(dh);
                    break;
                case 99:
                    System.out.println("Terima kasih!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Tidak valid");
            }
        }
    }
}
