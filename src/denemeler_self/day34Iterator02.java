package denemeler_self;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class day34Iterator02 {

	public static void main(String[] args) {
 
		
		List<String>l1=new ArrayList<>();//List ve ArrayList'i import ediyoruz
		//List'e eleman ekliyoruz add() ile
		//String adi l1.add("elements");
		
		l1.add("A");
		l1.add("D");
		l1.add("F");
		l1.add("B");
		System.out.println(l1);//[A,D,F,B] olarak consel'a yazdirir
		
		ListIterator<String>l2=l1.listIterator();
		
		//Burda pointer'i en saga tasidi
		while (l2.hasNext()) {
			Object el=l2.next();
			
		}
		while (l2.hasPrevious()) {
			Object el=l2.previous();
			l2.set(el+"X");
		}
		
		Collections.reverse(l1);//bu kod ile  List'i ters cevirdik
		System.out.println(l1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
