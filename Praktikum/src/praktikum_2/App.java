package praktikum_2;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		int c;
		
		System.out.println("Masukkan sisi a: ");
		a = scanner.nextInt();
		
		System.out.println("Masukkan sisi b: ");
		b = scanner.nextInt();
		
		System.out.println("Masukkan sisi c: ");
		c = scanner.nextInt();
		
		Segitiga segitiga = new Segitiga(a, b, c);
		
		if(segitiga.a * segitiga.a + segitiga.b * segitiga.b == segitiga.c * segitiga.c) {
			System.out.println("Segitiga sempurna");
		} else {
			System.out.println("Segitiga tidak sempurna	");
		}
	}
}