package latihan;

import java.util.Scanner;
<<<<<<< HEAD

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
            System.out.println("\nMENU ATM ");
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
=======
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
>>>>>>> branch 'main' of https://github.com/marshandaagustin/PBO_JAVA_252310047

        input.close();
    }
}