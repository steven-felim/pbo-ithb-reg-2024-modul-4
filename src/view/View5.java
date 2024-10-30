package view;

import javax.swing.*;

public class View5 {
    public void displayNomor5(int nim, String nama, String matkul, String presensi, double kehadiran, int totalAbsen, int hadir) {
        JOptionPane.showMessageDialog(null, nim + " - " + nama + "\n" + matkul + "\nKehadiran: " + hadir + "/" + totalAbsen + " (" + kehadiran + "%)", "Mata Kuliah Ambil", JOptionPane.INFORMATION_MESSAGE);
    }
}
