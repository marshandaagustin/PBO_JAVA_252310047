package latihan;

import java.util.Scanner;

public class Latihan07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
<<<<<<< HEAD
        Resto resto = new Resto();

        char ulang;

        do {
            resto.chooseMenu();

            System.out.print(
                "Apakah anda akan memesan kembali? (y/n): "
            );
            ulang = input.next().charAt(0);

        } while (ulang == 'y' || ulang == 'Y');

        System.out.println("Terimakasih telah memesan.");
=======

        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        String hasil = nama.replaceAll(
            "(?i)[aiueo]", "X"
        );

        System.out.println("Hasil: " + hasil);
>>>>>>> branch 'main' of https://github.com/marshandaagustin/PBO_JAVA_252310047

        input.close();
    }
}