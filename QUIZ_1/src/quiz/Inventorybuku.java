package quiz;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Inventorybuku {
    public static void main(String[] args) {
        ArrayList<String> daftarBuku = new ArrayList<>();

        while (true) {
            String[] pilihanMenu = {
                "1. Input Buku", 
                "2. Hapus Buku", 
                "3. Output Seluruh Data", 
                "4. Keluar"
            };

            int menuDipilih = JOptionPane.showOptionDialog(
                null, 
                "Silakan pilih menu operasi inventory:", 
                "Menu Utama Inventory Buku", 
                JOptionPane.DEFAULT_OPTION, 
                JOptionPane.PLAIN_MESSAGE, 
                null, 
                pilihanMenu, 
                pilihanMenu
            );

            switch (menuDipilih) {
                case 0:
                    String judul = JOptionPane.showInputDialog(
                        null, 
                        "Masukkan Judul Buku yang ingin di-input:", 
                        "Input Buku", 
                        JOptionPane.QUESTION_MESSAGE
                    );

                    if (judul != null && !judul.trim().isEmpty()) {
                        daftarBuku.add(judul.trim());
                        JOptionPane.showMessageDialog(null, "Buku '" + judul + "' berhasil disimpan!");
                    }
                    break;

                
                    
                    System.exit(0); 
        }
    }
}
}