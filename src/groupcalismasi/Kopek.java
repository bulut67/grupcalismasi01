package groupcalismasi;

public class Kopek extends Hayvan{

	public static void main(String[] args) {
		Kopek kopek=new Kopek();
		kopek.sesCikarirlar();
		kopek.uyurlar();
		
		
	}
	
	
	
	//Burda hayvan parent'indan uyurlar ve sesCikarirlar methodlarini override ederek 
	//Kopek'in ozelliklerini consel'a yazdirmis olduk 
    //Eger main method icinde kopek adinda bir obje olusturmasaydik bunlari ekrana yazdiramazdik

	@Override
	public void uyurlar() {
		System.out.println("Cok uyumazlar");
	}

	@Override
	public void sesCikarirlar() {
		System.out.println("Havlarlar");
	}

	
	
	

}
