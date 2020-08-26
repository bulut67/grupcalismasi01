package groupcalismasi;

public class SiradanOda_Abstract extends Restoran_Abstract {

	public static void main(String[] args) {
		
		
		/*
		 1- SiradanOda ,Restoran'in child class'i ve OyunSalonu methodu'nu override etmedi ama 
		 her hangi bir CTE yok cunku abstract child'larin abstract parent'taki abstract methodlari
		 override etme zorunlugu yoktur
		 
		 2==>Az once soyledgimiz gibi restoran class'inda ki abstract olan metholari override etmek zorundayiz
		 cunku Bu class'i extends ettik restoran'a 
		 
		 3==>Bu override etmek zorunda oldugumuz method'u silelim ve nasil bir hata aldigimizi gozlemleyelim
		 		SU veya Cay method'unu
		 		
		 4==>Aldigimiz bu hatayi 	nasil duzeltiriz Iki yolu var 
		    1=ALt+Shift+S override ve Implementes method'unu secerek sildigimiz method'u override edebiliriz
		    2=public class SiradanOda_Abstract  uzerine giderek altinda cikan unimplemented methods a tiklayarak
		 */

		SiradanOda_Abstract tekKisi=new SiradanOda_Abstract();
		tekKisi.Cay();
		tekKisi.wifi();
		tekKisi.Su();
		
		
		
	}
	
	

	@Override
	public void Cay() {
		System.out.println("Cay servisi zorunlu");
		
	}

	@Override
	public void wifi() {
		System.out.println("Wifi istege baglidir");

	}



	@Override
	void Su() {
		System.out.println("Su servisi zorunlu");

	}

	

}
