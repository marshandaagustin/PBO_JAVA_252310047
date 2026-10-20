package pembelajaran2;

import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka minimal 20: ");
        int angka = input.nextInt();

        if (angka < 20) {
            System.out.println("Angka tidak boleh kurang dari 20.");
        } else {
            System.out.print("Faktor " + angka + " adalah ");

            for (int i = angka; i >= 1; i--) {
                if (angka % i == 0) {
                    System.out.print(i);

                    if (i != 1) {
                        System.out.print(", ");
                    }
                }
            }

            System.out.println();
        }

        input.close();
    }
}