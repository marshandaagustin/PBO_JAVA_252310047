package praktikum_3;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        JOptionPane jop = new JOptionPane();

        String nama, jurusan;
        int umur;
        int confirm;

        do{
            nama = jop.showInputDialog(
                null, 
                "Input nama Anda:",
                "Input Nama",
                jop.QUESTION_MESSAGE
            );

            confirm = jop.showConfirmDialog(
                null,
                "Apakah benar nama anda "+nama+" ?",
                "Confimation",
                jop.YES_NO_CANCEL_OPTION
            );

            jurusan = jop.showInputDialog(
                null,
                "Masukan jurusan",
                "Input Jurusan",
                jop.QUESTION_MESSAGE
            );

            umur = Integer.parseInt(jop.showInputDialog(
                null,
                "Masukan umur",
                "Input Umur",
                jop.QUESTION_MESSAGE
            ));

            String output = "Nama           :"+nama+"\n"
                            + "Jurusan      :"+ jurusan+ "\n"
                            + "Umur         :"+ umur;

            jop.showMessageDialog(null, output, "Information", jop.INFORMATION_MESSAGE);
            
        }while(confirm != 0);

        jop.showMessageDialog(
            null,
            "HELLO WORLD!",
            "Information",
            JOptionPane.INFORMATION_MESSAGE
            );
    }
}
