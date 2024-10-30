import controller.*;
import javax.swing.*;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Dummy dummy = new Dummy();
        int nim, nik;
        String kode;

        while (true) {
            String pilih = JOptionPane.showInputDialog("""
                    Pilih Menu:
                    1. Print User Berdasarkan Nama
                    2. Print Nilai Akhir
                    3. Print Rata-rata Nilai Akhir
                    4. Print Banyak Mahasiswa yang Tidak Lulus
                    5. Print Mata Kuliah Ambil
                    6. Print Total Jam Dosen Mengajar
                    7. Print Gaji Karyawan
                    99. Berhenti""");
            switch (pilih) {
                case "1":
                    ContohInput.Nama(dummy.createDummyUsers());
                    String nama = JOptionPane.showInputDialog("Masukkan nama yang dicari:");
                    Nomor1.printUserData(nama, dummy.createDummyUsers());
                    break;
                case "2":
                    ContohInput.NIM(dummy.createDummyMhs());
                    nim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIM:"));
                    ContohInput.Matkul(dummy.createDummyMataKuliah());
                    kode = JOptionPane.showInputDialog("Masukkan Kode Mata Kuliah:");
                    Nomor2.printAvg(nim, kode, dummy.createDummyMhs());
                    break;
                case "3":
                    ContohInput.Matkul(dummy.createDummyMataKuliah());
                    kode = JOptionPane.showInputDialog("Masukkan kode Mata Kuliah:");
                    Nomor3.printAllAvg(kode, dummy.createDummyMhs());
                    break;
                case "4":
                    ContohInput.Matkul(dummy.createDummyMataKuliah());
                    kode = JOptionPane.showInputDialog("Masukkan kode Mata Kuliah:");
                    Nomor4.printMhsTidakLulus(kode, dummy.createDummyMhs());
                    break;
                case "5":
                    ContohInput.NIM(dummy.createDummyMhs());
                    nim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIM:"));
                    Nomor5.printMatkuAmbil(nim, dummy.createDummyMhs());
                    break;
                case "6":
                    ContohInput.NIKD(dummy.createDummyDosen());
                    nik = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIK:"));
                    Nomor6.printJamAjar(nik, dummy.createDummyDosen());
                    break;
                case "7":
                    ContohInput.NIK(dummy.createDummyStaff());
                    nik = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIK:"));
                    Nomor7.printGaji(nik, dummy.createDummyStaff());
                    break;
                case "99":
                    JOptionPane.showMessageDialog(null, "Terima Kasih");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Input Tidak Valid");
            }
        }
    }
}
