package pembelajaran1;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Latihan10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Students myBio = new Students();

        final int HARGA = 6300;
        int jumlah;
        double total, diskon = 0, subtotal;

        System.out.print("Masukkan NPM member: ");
        Integer npm = Integer.valueOf(input.nextLine());

        System.out.print("Masukkan nama member: ");
        String nama = input.nextLine();

        System.out.print("Masukkan nama kelas: ");
        String kelas = input.nextLine();

        System.out.print("Masukkan semester: ");
        Integer semester = Integer.valueOf(input.nextLine());

        System.out.print("Masukkan IPK: ");
        Float ipk = Float.valueOf(input.nextLine());

        myBio.getNPM(npm);
        myBio.getFullname(nama);
        myBio.getClassName(kelas);
        myBio.setSemester(semester);
        myBio.getGPA(ipk);

        System.out.print("Masukkan jumlah roti: ");
        jumlah = Integer.parseInt(input.nextLine());

        total = jumlah * HARGA;

        if (jumlah > 0 && jumlah % 3 == 0) {
            diskon = total * 0.05;
        }

        subtotal = total - diskon;

        DateTimeFormatter format =
            DateTimeFormatter.ofPattern("dd MMM yyyy (HH:mm)");

        System.out.println("\n==================================");
        System.out.println("       TOKO SERBAGUNA IBIK");
        System.out.println("==================================");
        System.out.println(LocalDateTime.now().format(format));
        System.out.println("ITEM       QTY   HARGA     TOTAL");
        System.out.println("----------------------------------");

        System.out.printf("ROTI ENAK  %d     Rp %,d  Rp %,d%n",
                jumlah, HARGA, (int) total);

        System.out.println("----------------------------------");
        System.out.printf("Diskon: Rp %,.0f%n", diskon);
        System.out.printf("Sub Total: Rp %,.0f%n", subtotal);
        System.out.println("Member Name : " + myBio.getFullname(nama));
        System.out.println("==================================");

        input.close();
    }
}