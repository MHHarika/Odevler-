package tekrar1.com.döngü;

import java.util.Scanner;

public class HaftaninGunleriDongu {
	public static void main(String[] args) {

		do {
			Scanner input = new Scanner(System.in);
			System.out.println("Haftanin günü için bir kisaltma giriniz: ");
			String gun = input.next();
			switch (gun.toUpperCase()) {
			case "PTS":
				System.out.println("Pazartesi");
				break;
			case "SL":
				System.out.println("Salı");
				break;
			case "CRS":
				System.out.println("Çarşamba");
				break;
			case "PRS":
				System.out.println("Perşembe");
				break;
			case "CM":
				System.out.println("Cuma");
				break;
			case "CMT":
				System.out.println("Cumartesi");
				break;
			case "PZ":
				System.out.println("PAZAR");
				break;
			default:
				System.out.println("Gün Bulunamadı!");
				break;

			}
			System.out.println("Devam etmek için 2 ye basınız. Çıkmak için 1 e basınız.");
			int deger = input.nextInt();
			if (deger == 2) {
				continue;
			}else {
				System.out.println("Çıkış yaptınız.");
				break;
				
			}}
		 while (true);
	}

}