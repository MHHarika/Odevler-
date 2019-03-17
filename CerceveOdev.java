package tekrar1.com.döngü;

import java.util.Scanner;

public class CerceveOdev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen oluþturulacak çercevenin satýr sayýsýný girin:");
		int satir = input.nextInt();

		System.out.println("Lütfen oluþturulacak çercevenin sutun sayýsýný girin:");
		int sutun = input.nextInt();

		for (int i = 1; i <= satir; i++) {
			for (int y = 1; y <= sutun; y++) {
				if ((i == 1 || y == 1) | (i == satir || y == sutun)) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
}