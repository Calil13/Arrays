package JavaArrays;

public class additionMultiplication {
		
	public static void main(String[] args) {
		
		int dizi[] = {3,12,5,8};
		int toplam1 = 0;
		int carpim = 1;
		int toplam2 = 0;
		int toplam3 = 0;
		
		for (int i = 0; i < dizi.length; i++) {
			toplam1 += dizi[i];
			carpim *= dizi[i];
			
			if(dizi[i] % 2 != 0) {
				toplam2 += dizi[i];
			}else if(dizi[i] % 2 == 0) {
				toplam3 += dizi[i];
			}
		}
		System.out.println("1. Toplam : " + toplam1);
		System.out.println("2. Carpim : " + carpim);
		System.out.println("3. Toplam (Tek sayilar) : " + toplam2);
		System.out.println("4. Toplam (Cift sayilar) : " + toplam3);
	}
}

