package latihan;

import java.util.Scanner;

public class Latihan05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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