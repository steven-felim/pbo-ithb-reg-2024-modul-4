import controller.*;
import model.classes.Dummy;
import model.classes.User;
import view.ContohInput;
import javax.swing.*;
import java.text.ParseException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        Dummy dummy = new Dummy();
        List<User> users = dummy.createDummyUsers();

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
                    ContohInput.Nama(users);
                    String nama = JOptionPane.showInputDialog("Masukkan nama yang dicari:");
                    Nomor1.printUserData(nama, dummy.getUsers());
                    break;
                case "2":
                    ContohInput.NIM(dummy.getMhs());
                    int nim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIM:"));
                    ContohInput.Matkul(dummy.getMataKuliah());
                    String kode = JOptionPane.showInputDialog("Masukkan Kode Mata Kuliah:");
                    Nomor2.printAvg(nim, kode, dummy.getMhs());
                    break;
                case "3":
                    ContohInput.Matkul(dummy.getMataKuliah());
                    kode = JOptionPane.showInputDialog("Masukkan kode Mata Kuliah:");
                    Nomor3.printAllAvg(kode, dummy.getMhs());
                    break;
                case "4":
                    ContohInput.Matkul(dummy.getMataKuliah());
                    kode = JOptionPane.showInputDialog("Masukkan kode Mata Kuliah:");
                    Nomor4.printMhsTidakLulus(kode, dummy.getMhs());
                    break;
                case "5":
                    ContohInput.NIM(dummy.getMhs());
                    nim = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIM:"));
                    Nomor5.printMatkuAmbil(nim, dummy.getMhs());
                    break;
                case "6":
                    ContohInput.NIKD(dummy.getDosen());
                    int nik = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIK:"));
                    Nomor6.printJamAjar(nik, dummy.getDosen());
                    break;
                case "7":
                    ContohInput.NIK(dummy.getStaff());
                    nik = Integer.parseInt(JOptionPane.showInputDialog("Masukkan NIK:"));
                    Nomor7.printGaji(nik, dummy.getStaff());
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
