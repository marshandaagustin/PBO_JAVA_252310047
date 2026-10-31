package Pembelajaran4;
import javax.swing.JOptionPane;

public class Latihan07 {
 
    static int[][] inputMatrix(String nama) {
        int[][] m = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                m[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Masukan nilai matrix " + nama + "[" + i + "][" + j + "]:",
                        "Input Matrix " + nama, JOptionPane.QUESTION_MESSAGE));
            }
        }
        return m;
    }
 
    static String tampil(String nama, int[][] m) {
        String s = "Matrix " + nama + ":\n";
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                s += m[i][j] + "\t";
            }
            s += "\n";
        }
        return s;
    }
 
    public static void main(String[] args) {
        int[][] a = inputMatrix("A");
        int[][] b = inputMatrix("B");
        int[][] c = new int[2][2];
 
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
 
        String hasil = "C = A + B\n\n" + tampil("A", a) + "\n" + tampil("B", b) + "\n" + tampil("C", c);
 
        JOptionPane.showMessageDialog(null, hasil, "Output Matrix C", JOptionPane.INFORMATION_MESSAGE);
    }
}