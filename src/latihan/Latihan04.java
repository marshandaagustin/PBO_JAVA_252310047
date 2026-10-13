package latihan;

import java.util.Scanner;
<<<<<<< HEAD

public class Latihan04 {
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
=======
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int HARGA = 6300;
        int jumlah;
        double total, diskon = 0, subtotal;

        System.out.print("Masukkan jumlah produk yang dibeli: ");
        jumlah = input.nextInt();

        total = jumlah * HARGA;

        if (jumlah > 0 && jumlah % 3 == 0) {
            diskon = total * 0.05;
        }

        subtotal = total - diskon;

        LocalDateTime sekarang = LocalDateTime.now();
        DateTimeFormatter format =
            DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");

        System.out.println("\n==================================");
        System.out.println("       TOKO SERBAGUNA IBIK");
        System.out.println("==================================");
        System.out.println(sekarang.format(format));
        System.out.println("ITEM       QTY   HARGA     TOTAL");
        System.out.println("----------------------------------");
        System.out.printf("ROTI ENAK  %d     Rp %,d  Rp %,d%n",
                jumlah, HARGA, (int) total);
        System.out.println("----------------------------------");
        System.out.printf("Diskon: Rp %,.0f%n", diskon);
        System.out.printf("Sub Total: Rp %,.0f%n", subtotal);
        System.out.println("==================================");
>>>>>>> branch 'main' of https://github.com/marshandaagustin/PBO_JAVA_252310047

        input.close();
    }
}