package latihan;

import java.util.Scanner;

public class Latihan03 {

    static final double PI = 3.14;

    static double luasSegitiga(double alas, double tinggi) {
        return alas * tinggi / 2;
    }

    static double kelilingSegitiga(double a, double b, double c) {
        return a + b + c;
    }

    static double luasKerucut(double r, double s) {
        return PI * r * (r + s);
    }

    static double volumeKerucut(double r, double t) {
        return PI * r * r * t / 3;
    }

    static double luasTabung(double r, double t) {
        return 2 * PI * r * (r + t);
    }

    static double volumeTabung(double r, double t) {
        return PI * r * r * t;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double alas, tinggi, a, b, c;

        System.out.println("=== SEGITIGA ===");
        System.out.print("Masukkan alas: ");
        alas = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        tinggi = input.nextDouble();

        System.out.print("Masukkan sisi a: ");
        a = input.nextDouble();

        System.out.print("Masukkan sisi b: ");
        b = input.nextDouble();

        System.out.print("Masukkan sisi c: ");
        c = input.nextDouble();

        System.out.println("Luas segitiga = "
                + luasSegitiga(alas, tinggi));
        System.out.println("Keliling segitiga = "
                + kelilingSegitiga(a, b, c));

        double r, t, s;

        System.out.println("\n=== KERUCUT DAN TABUNG ===");
        System.out.print("Masukkan jari-jari: ");
        r = input.nextDouble();

        System.out.print("Masukkan tinggi: ");
        t = input.nextDouble();

        System.out.print("Masukkan garis pelukis kerucut: ");
        s = input.nextDouble();

        System.out.println("Luas permukaan kerucut = "
                + luasKerucut(r, s));
        System.out.println("Volume kerucut = "
                + volumeKerucut(r, t));

        System.out.println("Luas permukaan tabung = "
                + luasTabung(r, t));
        System.out.println("Volume tabung = "
                + volumeTabung(r, t));

        input.close();
    }
}