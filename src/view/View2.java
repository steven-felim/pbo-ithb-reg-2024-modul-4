package view;

import javax.swing.*;

public class View2 {
    public void displayNomor2(int nim, String matkul, double nilai) {
        JOptionPane.showMessageDialog(null, nim + "\n" + matkul + "\nNilai Akhir:" + nilai, "Nilai Akhir", JOptionPane.INFORMATION_MESSAGE);
    }
}
