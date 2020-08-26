package interface_groupcalismasi;


public class Nokia implements Telefon,TelefonBatary{
	
	/*
	  Abstract class kullanarak abstraction yaparsak bir class'a 1'den fazla 
	  parent koyamayiz cunku Java inheritance'a musade etmez.Bu yuzden interface
	  kullaniriz ve bir class icin 1'den fazla parent olusturarak calisabiliriz
	  
	  
	 */

	public static void main(String[] args) {

		Nokia s3= new Nokia();
		s3.ekran();
		s3.kamera();
		s3.fiyat();
		s3.Batarya();
		s3.bataryaGucu();
	}

	@Override
	public void fiyat() {
        System.out.println("Sigaradan ucuz suan");		
	}

	@Override
	public void ekran() {
       System.out.println("Ekrani gormek icin ikinci bir goze ihtiyaciniz olabilir");		
	}

	@Override
	public void kamera() {
          System.out.println("telefonda bulunmamakta");		
	}

	@Override
	public void Batarya() {
		System.out.println("Ozel satin aliniz");		
	}

	@Override
	public void bataryaGucu() {
		System.out.println("Herhalde 7 gun sizi idare eder");
		
	}

}
