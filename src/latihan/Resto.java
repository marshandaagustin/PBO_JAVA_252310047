package latihan;

import java.util.Scanner;

public class Resto {
    private long Harga;
    private int pilihan;

    public void chooseMenu() {
        Scanner input = new Scanner(System.in);

        System.out.println("\nMENU SARAPAN : ");
        System.out.println("1. Nasi Goreng - Rp 22.000");
        System.out.println("2. Bubur Ayam - Rp 15.000");
        System.out.println("3. Soto Ayam - Rp 25.000");
        System.out.print("Pilih menu (1-3): ");

        pilihan = input.nextInt();
        getPrices();

        switch (pilihan) {
            case 1:
                System.out.println(
                    "Anda memesan Nasi Goreng dengan harga Rp "
                    + Harga + ",-"
                );
                break;
            case 2:
                System.out.println(
                    "Anda memesan Bubur Ayam dengan harga Rp "
                    + Harga + ",-"
                );
                break;
            case 3:
                System.out.println(
                    "Anda memesan Soto Ayam dengan harga Rp "
                    + Harga + ",-"
                );
                break;
            default:
                System.out.println(
                    "Maaf menu yang anda masukan salah."
                );
        }
    }

    private Long getPrices() {
        switch (pilihan) {
            case 1:
                Harga = 22000;
                break;
            case 2:
                Harga = 15000;
                break;
            case 3:
                Harga = 25000;
                break;
            default:
                Harga = 0;
        }

        return Harga;
    }
}