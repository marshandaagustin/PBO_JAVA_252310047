package pembelajaran3;

import javax.swing.JOptionPane;

public class latihan03 {
    public static void main(String[] args) {
        biodata data = new Biodata();
        String nama, usiaText, alamat;
        int usia;

        while (true) {
            nama = JOptionPane.showInputDialog(
                "Masukkan Fullname:");

            if (nama == null) return;

            if (nama.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                    "Field fullname tidak boleh kosong",
                    "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                break;
            }
        }

        while (true) {
            usiaText = JOptionPane.showInputDialog(
                "Masukkan Usia:");

            if (usiaText == null) return;

            if (usiaText.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                    "Field usia tidak boleh kosong",
                    "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            try {
                usia = Integer.parseInt(usiaText.trim());

                if (usia < 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                    "Isian usia harus angka",
                    "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        while (true) {
            alamat = JOptionPane.showInputDialog(
                "Masukkan Alamat:");

            if (alamat == null) return;

            if (alamat.trim().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                    "Field alamat tidak boleh kosong",
                    "Error", JOptionPane.ERROR_MESSAGE);
                continue;
            }

            if (alamat.trim().length() < 10) {
                JOptionPane.showMessageDialog(null,
                    "Masukan alamat minimum 10 karakter",
                    "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                break;
            }
        }

        data.setFullname(nama.trim());
        data.setUsia(usia);
        data.setAlamat(alamat.trim());

        JOptionPane.showMessageDialog(null,
            "Fullname: " + data.getFullname()
            + "\nUsia: " + data.getUsia()
            + "\nAlamat: " + data.getAlamat(),
            "Informasi Biodata",
            JOptionPane.INFORMATION_MESSAGE);
    }
}