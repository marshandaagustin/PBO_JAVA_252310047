package latihan;

import java.util.Scanner;

public class Latihan06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan usia: ");
        String usia = input.nextLine();

        System.out.print("Masukkan firstname: ");
        String firstName = input.nextLine();

        System.out.print("Masukkan lastname: ");
        String lastName = input.nextLine();

        System.out.print("Masukkan NPM: ");
        String npm = input.nextLine();

        String hasil = usia.concat(firstName)
                           .concat(lastName)
                           .concat(npm);

        System.out.println("Hasil CONCAT: " + hasil);

        input.close();
    }
}