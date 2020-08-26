package denemeler_self;

import java.util.Scanner;

public class DegerAlma {
	
	/*
	1==> Int type'inde  geriye deger dondururken  yine Integer type'inde degiskenler alabilirz
	2==>(int a,int b) olusturdugumda diger degerlere ihtiyacimiz kalmaz Cunku iki deger de bize ekrandan gelir
	
	 */

	public static void main(String[] args) {

		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen Birinci sayiyi giriniz");
		int a=scan.nextInt();
		System.out.println("Lutfen Ikinci sayiyi giriiniz");
		int b=scan.nextInt();
		
		System.out.println("Toplam sonucu:"+ toplamsonuc(a, b));
		
		scan.close();
		
	}
        private static int toplamsonuc(int a,int b) {
	 
        	return a+b;

	}

}
