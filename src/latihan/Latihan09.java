package latihan;

import java.util.Scanner;

public class Latihan09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Students myBio = new Students();

        System.out.print("Masukkan NPM: ");
        Integer npm = Integer.valueOf(input.nextLine());

        System.out.print("Masukkan nama lengkap: ");
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

        System.out.println("\nDATA MAHASISWA");
        System.out.println("NPM      : " + myBio.getNPM(npm));
        System.out.println("Nama     : " + myBio.getFullname(nama));
        System.out.println("Kelas    : " + myBio.getClassName(kelas));
        System.out.println("Semester : " + myBio.setSemester(semester));
        System.out.println("IPK      : " + myBio.getGPA(ipk));

        input.close();
    }
}