package interface_groupcalismasi;

public interface Telefon {
	
	
	/*
	 
	  1-interface bir class degildir.Interface'dir
	  
	  2-Abstract class'larin icine concrete method'lar koyabilirdik ama interface'lerin icine
	  (bazzi ozel durumlar haric) concrete method koyamayiz
	 
	  3- interface'ler sadece abstract method icerir bu yuzden interface kullanimi
	  full abstraction olarak adlandirilir partial abstraction denir(kismi)
	 
	  4-abstract ister yaz ister yazma cunku interface method'unda abstract olmak zorunda
	
	  5-interface 'de body kullanilmaz interface icine concrete {} koyamazsiniz CTE alirsiniz
	 
	  6-interface 'de ki method'lar default olarak public olurlar
	 
	  7-interface'lerde ki methodlarin access modifierlari default olarak public olur
	  protected,private ve default olamaz
	  
	  8-Interface icinde body'si olan  bir method uretmek isterseniz ya Default veya Static
	 * keyword 'lardan birini kullanmaniz gerekir yoksa CTE alirsin
	 
	 */
	
    public abstract void fiyat();
	
	public void ekran();
	
	void kamera(); 

}
