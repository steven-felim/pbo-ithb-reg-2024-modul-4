package view;

import javax.swing.*;

public class View6 {
    public void printJamAjar(int nik, String namaDosen, int jumlahMK, int hadir, int jam, int pertemuan) {
        JOptionPane.showMessageDialog(null, nik + " - " + namaDosen + "\nTotal Mata Kuliah yang Diajar\t: " + jumlahMK + "\nKehadiran: " + hadir + "/" + pertemuan + "\nTotal Jam Mengajar: " + jam, "Jam Mengajar Dosen", JOptionPane.INFORMATION_MESSAGE);
    }
}
