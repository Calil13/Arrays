package JavaArrays;

public class additionMultiplication {
		
	public static void main(String[] args) {
		
		int array[] = {5,10,11,9};
		int toplam1 = 0;
		int carpim = 1;
		int toplam2 = 0;
		int toplam3 = 0;
		
		for (int i = 0; i < array.length; i++) {
			toplam1 += array[i];
			carpim *= array[i];
			
			if(array[i] % 2 != 0) {
				toplam2 += array[i];
			}else if(array[i] % 2 == 0) {
				toplam3 += array[i];
			}
		}
		System.out.println("1. Toplam : " + toplam1);
		System.out.println("2. Carpim : " + carpim);
		System.out.println("3. Toplam (Tek sayilar) : " + toplam2);
		System.out.println("4. Toplam (Cift sayilar) : " + toplam3);
	}
}

