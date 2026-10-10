package latihan;

import java.util.Scanner;
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

        input.close();
    }
}