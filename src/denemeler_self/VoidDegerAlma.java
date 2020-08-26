package denemeler_self;

import java.util.Scanner;

public class VoidDegerAlma {

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen Birinci sayiyi giriniz");
		int a=scan.nextInt();
		System.out.println("Lutfen Ikinci sayiyi giriiniz");
		int b=scan.nextInt();
		toplamsonuc(a, b);
		
		scan.close();
	}private static void toplamsonuc(int a , int b) {
		
		int EnBuyukSayi;
		if (a>b) {
			EnBuyukSayi=a;
			
		}else {
			EnBuyukSayi=b;
		}
		System.out.println("En Buyuk sayi: "+EnBuyukSayi);
		
		
	}

}
