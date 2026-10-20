package praktikum_4;

public class ArrayApp {
	public static void main(String[] args) {
		String[] nama = new String[5];
		
		nama[0] = "Faisal";
		nama[3] = "Khairul";
		
		System.out.printIn(nama[1]);
		
		int[] angka = new int [6];
		for (int i = 0; i < 6; i++) {
			angka[i] = i + i;
		};
		System.out.printIn(angka[3]);
	}

}
