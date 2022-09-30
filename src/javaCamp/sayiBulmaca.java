package javaCamp;

public class sayiBulmaca {

	public static void main(String[] args) {
		int[] sayılar = new int[] { 1, 5, 8, 3, 0, 3 };
		int aranacak = 3;
		boolean varMı = false;

		for (int sayi : sayılar) {
			if (sayi == aranacak) {
				varMı = true;
				break;

			}
		}

		if (varMı) {
			System.out.println("sayı mevcuttur");
		} else {
			System.out.println("sayı mevcut değildir");
		}

	}

}
