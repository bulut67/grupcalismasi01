package denemeler_self;

public class Void20 {
	
	//Gordugunuz uzere bir sinif icerisinde birden cok method olusturabiliriz ama
	
	//Method icinde method olusturamayiz Java buna izin vermez 
	
	//Java ilk main method icine baktigi icin biz mesajimizi main method icine yazdikdiktan sonra
	//fonksion olarak MesajGoster method'una gider ve bize mesaji verir

	public static void main(String[] args) {
		
	
		MesajGoster();

	}
       private static void MesajGoster() {
    	   System.out.println("Bu mesaj method icerisnden gosteriliyor");
	
}
       
       
}
