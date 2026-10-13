package latihan;

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

<<<<<<< HEAD
        System.out.print("Masukkan jumlah baris: ");
        int baris = input.nextInt();

        int i = 1;

        while (i <= baris) {
            int j = 1;

            while (j <= baris) {
                System.out.print("* ");
                j++;
            }

            System.out.println();
            i++;
        }

        input.close();
    }
}
=======
        System.out.print("Masukkan sebuah kalimat: ");
        String teks = input.nextLine();

        System.out.println("Hasil: " + teks.toUpperCase());

        input.close();
    }
}
>>>>>>> branch 'main' of https://github.com/marshandaagustin/PBO_JAVA_252310047
