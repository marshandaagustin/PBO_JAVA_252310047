package quiz;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Inventorybuku {
    public static void main(String[] args) {
        ArrayList<String> buku = new ArrayList<>();
        int menu;

        do {
            String pilihan = JOptionPane.showInputDialog(
                "INVENTORY BUKU\n"
                + "1. Input Buku\n"
                + "2. Hapus Buku\n"
                + "3. Tampilkan Buku\n"
                + "4. Keluar\n\n"
                + "Pilih menu:"
            );

            if (pilihan == null) {
                break;
            }

            menu = Integer.parseInt(pilihan);

            switch (menu) {
                case 1:
                    String judul = JOptionPane.showInputDialog(
                        "Masukkan judul buku:"
                    );

                    if (judul != null && !judul.isEmpty()) {
                        buku.add(judul);
                        JOptionPane.showMessageDialog(
                            null, "Buku berhasil ditambahkan!"
                        );
                    }
                    break;

                case 2:
                    if (buku.isEmpty()) {
                        JOptionPane.showMessageDialog(
                            null, "Belum ada buku!"
                        );
                    } else {
                        String judulHapus = JOptionPane.showInputDialog(
                            "Daftar Buku:\n" + buku
                            + "\nMasukkan judul buku yang dihapus:"
                        );

                        buku.remove(judulHapus);
                    }
                    break;

                case 3:
                    JOptionPane.showMessageDialog(
                        null, "Daftar Buku:\n" + buku
                    );
                    break;

                case 4:
                    JOptionPane.showMessageDialog(
                        null, "Program selesai."
                    );
                    break;

                default:
                    JOptionPane.showMessageDialog(
                        null, "Pilihan tidak tersedia!"
                    );
            }

        } while (menu != 4);
    }
}