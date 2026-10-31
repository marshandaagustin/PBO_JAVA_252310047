package Pembelajaran4;
import java.util.ArrayList;
import javax.swing.JOptionPane;
 
public class Latihan09 {
    public static void main(String[] args) {
        int jumlah = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Masukan jumlah array:", "Input", JOptionPane.QUESTION_MESSAGE));
 
        ArrayList<Integer> nilai = new ArrayList<>();
 
        for (int i = 0; i < jumlah; i++) {
            nilai.add(Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Masukan angka:", "Data array ke-" + i,
                            JOptionPane.QUESTION_MESSAGE)));
        }
 
        int terbesar = nilai.get(0);
        int terkecil = nilai.get(0);
        String hasil = "";
 
        for (int i = 0; i < nilai.size(); i++) {
            hasil += "x[" + i + "]=" + nilai.get(i) + "\n";
            if (nilai.get(i) > terbesar) {
                terbesar = nilai.get(i);
            }
            if (nilai.get(i) < terkecil) {
                terkecil = nilai.get(i);
            }
        }
 
        hasil += "Nilai terbesar adalah " + terbesar + "\n";
        hasil += "Nilai terkecil adalah " + terkecil;
 
        JOptionPane.showMessageDialog(null, hasil, "Output ArrayList", JOptionPane.INFORMATION_MESSAGE);
    }
}