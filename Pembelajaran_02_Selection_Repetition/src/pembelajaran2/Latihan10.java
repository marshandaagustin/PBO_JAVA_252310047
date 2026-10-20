package pembelajaran2;

import java.util.Scanner;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pinBenar = "252310047";

        String pin;
        long saldo = 500000;
        int pilihan;

        do {
            System.out.print("Masukkan PIN: ");
            pin = input.nextLine();

            if (!pin.equals(pinBenar)) {
                System.out.println("PIN salah, silakan coba lagi.");
            }
        } while (!pin.equals(pinBenar));

        System.out.println("PIN benar. Selamat datang!");

        do {
            System.out.println("\nMENU ATM");
            System.out.println("1. Lihat Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Saldo Anda: Rp " + saldo);
                    break;

                case 2:
                    System.out.print("Masukkan jumlah setoran: Rp ");
                    long setor = input.nextLong();

                    if (setor > 0) {
                        saldo += setor;
                        System.out.println("Setor tunai berhasil.");
                        System.out.println("Saldo sekarang: Rp " + saldo);
                    } else {
                        System.out.println("Jumlah setoran tidak valid.");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan jumlah penarikan: Rp ");
                    long tarik = input.nextLong();

                    if (tarik <= 0) {
                        System.out.println("Jumlah penarikan tidak valid.");
                    } else if (tarik > saldo) {
                        System.out.println("Saldo tidak mencukupi.");
                    } else {
                        saldo -= tarik;
                        System.out.println("Tarik tunai berhasil.");
                        System.out.println("Saldo sekarang: Rp " + saldo);
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah menggunakan ATM.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 4);

        input.close();
    }
}