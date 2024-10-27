package controller;

import model.classes.User;
import view.DataView;

import java.util.List;

public class Nomor1 {

    public static void printUserData(String nama, List<User> users) {
        DataView view = new DataView();
        boolean found = false;
        for (User user : users) {
            if (user.getNama().equalsIgnoreCase(nama)) {
                found = true;
                view.displayNomor1(user.toString());
            }
        }

        if (!found) {
            System.out.println("User dengan nama " + nama + " tidak ditemukan.");
        }
    }

}
