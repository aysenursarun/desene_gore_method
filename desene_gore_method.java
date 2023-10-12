package desene_gore_method;

import java.util.Scanner;

public class desene_gore_method {

	public static void desen(int sayi, int yeniSayi, int eksi) {

		if (yeniSayi > sayi)
			return;
		if (yeniSayi < 1)
			eksi *= -1;
		System.out.print(" " + yeniSayi + " ");
		desen(sayi, yeniSayi + eksi * 5, eksi);

	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Sayı girin: ");
		int sayi = input.nextInt();
		desen(sayi, sayi, -1);
	}

}
