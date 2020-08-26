package groupcalismasi;

public abstract class Restoran_Abstract {
	
	
	/* Abstract method'u icin Onemli Bilgiler
	 1==>Abstract'larda ,Final ve Private ve Static  olamazlar, cunku final olurlarsa override edilemezler.
	     Aksi taktirde kullandiginizde CTE(Compile Time Error) alirsiniz

	 2==>Abstract class olusturarak child classlari bazi seyleri yapmaya mecbur kilariz 
	   Abstract class icersinde olusturdugunuz Abstract methodlar Child class'lar tarafindan 
	   uygulanmak zorundadir. Kullanmadiginiz zaman child class'in isminin altinda CTE alirsiniz 
	   
	   
	 3==>Concrete class'lar parent'lari olan abstract class'larda ki concrete methodlari 
	      override etmek zorunda degil. Concrete methodlar override edilmesi istege bagli
	 */

	
	//Cay hizmeti her Child class' ta olmak zorunda  
	public abstract void Cay();
	
	  
    abstract void Su();
	//Su hizmeti her Child class' ta olmak zorunda
    
   
	public void wifi() {
		System.out.println("7/24 Wifi baglantisi mevcut");
	//Wifi method'u abstract'a olan bir concrete methodu'dur bunlari child class'lardan override etmek 
    //istege baglidir 
	}
	 
   
	
	public void oyunSalonu() {
		System.out.println("Aileler icin oyun salonu mevcut");
	//OyunSalonu method'u abstract'a olan bir concrete methodu'dur bunlari child class'lardan override etmek 
    //istege baglidir 
		}
	

}
