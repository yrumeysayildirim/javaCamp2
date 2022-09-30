package javaCamp;

public class methods {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	public static void sayiBulmaca() {
		int[] sayılar = new int[] { 1, 5, 8, 3, 0, 3 };
		int aranacak = 0;
		boolean varMı = false;

		for (int sayi : sayılar) {
			if (sayi == aranacak) {
				varMı = true;
				break;

			}
		}

		if (varMı) {
			System.out.println("sayı mevcuttur:" + aranacak);
		} else {
			System.out.println("sayı mevcut değildir:" + aranacak);
		}

	}

	public static void mesajVer(int aranacak) {
		System.out.println("sayı mevcuttur:" + aranacak);
	}

}
