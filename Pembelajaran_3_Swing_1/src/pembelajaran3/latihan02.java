package pembelajaran3;

import javax.swing.JOptionPane;

public class latihan02 {
    public static void main(String[] args) {
        biodata data = new biodata();

        String nama = JOptionPane.showInputDialog(
            "Masukkan Fullname:");

        String usia = JOptionPane.showInputDialog(
            "Masukkan Usia:");

        String alamat = JOptionPane.showInputDialog(
            "Masukkan Alamat:");

        data.setFullname(nama);
        data.setUsia(Integer.parseInt(usia));
        data.setAlamat(alamat);

        JOptionPane.showMessageDialog(
            null,
            "Fullname: " + data.getFullname()
            + "\nUsia: " + data.getUsia()
            + "\nAlamat: " + data.getAlamat()
        );
    }
}