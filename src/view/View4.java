package view;

import javax.swing.*;

public class View4 {
    public void displayNomor4(String matkul, int tidakLulus, int total) {
        JOptionPane.showMessageDialog(null, matkul + "\nBanyak mahasiswa tidak lulus: " + tidakLulus + " dari " + total, "Jumlah Mahasiswa Tidak Lulus", JOptionPane.INFORMATION_MESSAGE);
    }
}
