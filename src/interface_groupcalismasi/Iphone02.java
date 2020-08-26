package interface_groupcalismasi;


public class Iphone02 implements Telefon,TelefonBatary {
	
	
	/* 
	 Bir class bir interface'in child'i yapmak icin "implements keyword kullaniriz
	 extends kullanmiyoruz
	 
	 Yukarida gordugunuz gibi bir class'in iki parent'i oldu Telefon ve TelefonBatary adinda 
	 
	 */

	public static void main(String[] args) {

		Iphone02 i7=new Iphone02();
		i7.ekran();
		i7.kamera();
		i7.fiyat();
		i7.Batarya();
		i7.bataryaGucu();
	}

	@Override
	public void fiyat() {
		System.out.println("Iphone 7Plus = 499 euro");

	}

	@Override
	public void ekran() {
		System.out.println("Cift ekran mevcut");

	}

	@Override
	public void kamera() {
		System.out.println("Surumun en iyi kamerasina sahip 12 megapiksel");

	}

	@Override
	public void Batarya() {
        System.out.println("Icerisinde mevcut");		
	}

	@Override
	public void bataryaGucu() {
         System.out.println("2900 mAh kapasiteye sahip");		
	}

}
