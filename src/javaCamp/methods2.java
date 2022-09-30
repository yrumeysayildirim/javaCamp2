package javaCamp;

public class methods2 {

	public static void main(String[] args) {
    
		String mesaj = "bugün hava çok güzel";
        String yeniMesaj = sehirVer();
           System.out.println(yeniMesaj);
           int sayı = topla(2,5);
           
           System.out.println(sayı);
           
           int toplam = topla2(2,3,4,5,7,8);
           System.out.println(toplam);
	}
	
	public static void ekle() {
		System.out.println("eklendi");
	}
	
	public static void sil() {
		System.out.println("silindi");
	}
	
    public static void guncelle() {
    	System.out.println("güncellendi");
	}
    
    public static int topla(int sayi1,int sayi2) {
    	return sayi1+sayi2;
    } 
    
    public static int topla2(int... sayilar) {
    	int toplam=0;
    	for(int sayı:sayilar) {
    		toplam += sayı;
    }
    	return toplam;
    }
    
    public static String sehirVer() {
    	return "Ankara";
    }
}
