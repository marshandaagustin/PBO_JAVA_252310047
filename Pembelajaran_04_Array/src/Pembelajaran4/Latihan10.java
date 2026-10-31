package Pembelajaran4;
import java.util.ArrayList;
import javax.swing.JOptionPane;
 
public class Latihan10 {
    public static void main(String[] args) {
        ArrayList<String> field = new ArrayList<>();
        field.add("Nama Lengkap");
        field.add("Alamat");
        field.add("No Telp");
 
        ArrayList<String> data = new ArrayList<>();
 
        for (int i = 0; i < field.size(); i++) {
            data.add(JOptionPane.showInputDialog(null, "Masukan " + field.get(i) + ":",
                    "Data array ke-" + i, JOptionPane.QUESTION_MESSAGE));
        }
 
        String hasil = "";
        for (int i = 0; i < field.size(); i++) {
            hasil += field.get(i) + ": " + data.get(i) + "\n";
        }
 
        JOptionPane.showMessageDialog(null, hasil, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}