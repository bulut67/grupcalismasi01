package groupcalismasi;

public class Kedi extends Hayvan {

	public static void main(String[] args) {
		Kedi kedi=new Kedi();
		kedi.uyurlar();
		kedi.sesCikarirlar();
		
	}

	//1=ALt+Shift+S override ve Implementes method'unu secerek istedgimiz methodu override edebilliriz
	// ya da sol ustte Source a tiklayip override ve implements'i secerek
	
	//Burda hayvan parent'indan uyurlar ve sesCikarirlar methodlarini override ederek 
	//Kedi'nin ozelliklerini consel'a yazdirmis olduk 
	//Eger main method icinde kedi adinda bir obje olusturmasaydik bunlari ekrana yazdiramazdik
	@Override
	public void uyurlar() {
		System.out.println("Cok uyukucudur");

	}

	@Override
	public void sesCikarirlar() {
		System.out.println("Miyavlar");

	}

	
	}


