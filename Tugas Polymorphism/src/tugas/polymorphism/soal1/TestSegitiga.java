package tugas.polymorphism.soal1;

import java.util.Scanner;

public class TestSegitiga {
     public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Masukkan sisi1: ");
		double sisi1 = input.nextDouble();	
                System.out.print("Masukkan sisi2: ");
		double sisi2 = input.nextDouble();
                System.out.print("Masukkan sisi3: ");
		double sisi3 = input.nextDouble();

		System.out.print("Masukan Warna: ");
		String color = input.next();

		System.out.print("Apakah segitiga diisi (true/false) :  ");
		boolean filled = input.nextBoolean();

		Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3);
		segitiga.setWarna(color);
		segitiga.setFilled(filled);

		System.out.println("Luas: " + segitiga.getArea());
		System.out.println("Keliling: " + segitiga.getPerimeter());
		System.out.println("Warna: " + segitiga.getWarna());
                System.out.println("Filled: " + segitiga.isFilled());
                System.out.println(segitiga.toString());
	}
}
