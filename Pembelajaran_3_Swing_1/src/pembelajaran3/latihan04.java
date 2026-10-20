package pembelajaran3;

import javax.swing.JOptionPane;

public class latihan04 {

    static String input(String field) {
        while (true) {
            String hasil = JOptionPane.showInputDialog(
                null, "Masukkan " + field + ":");

            if (hasil != null) {
                return hasil;
            }

            int pilihan = JOptionPane.showConfirmDialog(
                null,
                "Apakah anda ingin keluar ?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION
            );

            if (pilihan == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }

    static boolean kosong(String nilai, String field) {
        if (nilai.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                "Field " + field + " tidak boleh kosong",
                "Error", JOptionPane.ERROR_MESSAGE);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        while (true) {
            Biodata data = new Biodata();
            String nama, usiaText, alamat;
            int usia;

            // Input Fullname
            while (true) {
                nama = input("Fullname");
                if (!kosong(nama, "fullname")) break;
            }

            // Input Usia
            while (true) {
                usiaText = input("Usia");

                if (kosong(usiaText, "usia")) continue;

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

            // Input Alamat
            while (true) {
                alamat = input("Alamat");

                if (kosong(alamat, "alamat")) continue;

                if (alamat.trim().length() < 10) {
                    JOptionPane.showMessageDialog(null,
                        "Masukan alamat minimum 10 karakter",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                    continue;
                }
                break;
            }

            data.setFullname(nama.trim());
            data.setUsia(usia);
            data.setAlamat(alamat.trim());

            // Menampilkan seluruh biodata
            JOptionPane.showMessageDialog(null,
                "Fullname: " + data.getFullname()
                + "\nUsia: " + data.getUsia()
                + "\nAlamat: " + data.getAlamat(),
                "Informasi Biodata",
                JOptionPane.INFORMATION_MESSAGE);

            // Konfirmasi keluar setelah klik OK
            int pilihan = JOptionPane.showConfirmDialog(
                null,
                "Apakah anda ingin keluar ?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION
            );

            if (pilihan == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        }
    }
}