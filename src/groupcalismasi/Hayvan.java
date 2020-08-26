package groupcalismasi;

public class Hayvan {
	
	/*Parent class'da bilmemiz ve dikkat edilmesi gerekenler
	 
	 1==>1-Parent'taki metho'du method signature 'ini degistirmeden method body'sini
         degistirerek Child Class'da kullanmaya "Method Overriding" denir 
 	
 	 2==>Parent class'daki Private method'lar ,Final method'lar ve Static method'lar override edilmezler
 	     
 	     Final method neden mi override edilmez cunku,final methodlarin body'leri olabilecekleri son haldedir
         yani method body'leri degistirilemez oysa ki overriding'in amaci method body'i degistirerek
         kullanir bu yuzden 
         
         Private method neden mi override edilmez cunku, private method sadece o class'a aittir
	 		
	 	 Static method neden mi override edilmez cunku,	Static methodlar zaten ortak kullanima aciktir
        onun body'sini degistirmek herkesi etkiler bu yuzden  Java buna izin vermez
        
        
        
	 
	 */
	
	
	
	
	public void uyurlar() {
		System.out.println("Uyurlar");
	}
	public void sesCikarirlar() {
		System.out.println("ses cikarir");
	}
	
	
	
}
