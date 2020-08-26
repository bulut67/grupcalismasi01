package denemeler_self;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class day34Iterator {

	public static void main(String[] args) {
		
		List<String>l1=new ArrayList<>();//List ve ArrayList'i import ediyoruz
		//List'e eleman ekliyoruz add() ile
		//String adi l1.add("elements");
		
		l1.add("A");
		l1.add("D");
		l1.add("F");
		l1.add("B");
		System.out.println(l1);//[A,D,F,B] olarak consel'a yazdirir
		
		//Simdi List'i [AX,DX,FX,BX] seklinde iterator kullanarak donusturelim
		//1==>ilk once ListIterator olusturacagiz ve import edelim
		//2==>While dongusu olusturup istenilen elemani ekleyelim
		//Bu dongu ile eklemek istediginiz character'i sag tarafina yazdirir
		//Bunu yazmamizda ki amac iterator' i sag'a tasimak
		ListIterator<String>l2=l1.listIterator();
		
		while (l2.hasNext()) {
			Object el=l2.next();
			l2.set(el+"X");
		}
		System.out.println(l1);
		
		
		//Hasprevious methodu ile elemanlari sagdan sola dogru yazdirir
		//Hasprevious kullanmak icin oncesinde MUTLAKA hasNext() kullanmamiz gerekir
		//Aksi taktirde bir hic gorursunuz consel'da bosluk yani 
		
		while (l2.hasPrevious()) {
			
			Object el=l2.previous();
			
			System.out.print(el+" ");//BX FX DX AX   bu sekilde consel'a yazdirir
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
