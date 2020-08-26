package denemeler_self;

import java.util.LinkedList;
import java.util.List;

public class CollectionsLinkedList {

	public static void main(String[] args) {

		List<String>linkedList=new LinkedList<>();
		//linkedList eleman ekliyoruz add() ile
		//String adi linkedList.add("elements");
		
		linkedList.add("Ahmet");
		linkedList.add("Derya");
		linkedList.add("Faruk");
		linkedList.add("Bulut");
		System.out.println(linkedList);//[A,D,F,B] olarak consel'a yazdirir
		
		linkedList.add(1, "Yasar");
		System.out.println(linkedList);

		List<String>linkedList2=new LinkedList<>();
		//linkedList eleman ekliyoruz add() ile
		//String adi linkedList.add("elements");
		
		linkedList2.add("S");
		linkedList2.add("B");
		linkedList2.add("C");
		linkedList2.add("X");
		System.out.println(linkedList2);
		
		
		linkedList.addAll(linkedList2);
		System.out.println(linkedList);// linkedList 'den sonra linkedList2 yi ekleyecek
									   //addAll kullandiginda  ilkList degisir parantez icinde ki degismez
		
		linkedList.addAll(4, linkedList2);
		System.out.println(linkedList);//faruk'tan sonra linkedList2 yi koyacak
		
		linkedList.remove(0);
		System.out.println();//ilk elemani siler 
		
		linkedList.remove("Derya");//bu elemani siler 
		System.out.println(linkedList);
		
		
		linkedList.remove("S");
		System.out.println(linkedList);//Tekrar elemanlarda ilk 'S' yi bulur ve siler 
		
		
		linkedList.removeAll(linkedList2);
		System.out.println(linkedList);//linkedList2 de var olan elemanlarin tamamini siler
		
		linkedList.removeIf(t->t.contains("B"));
		System.out.println(linkedList);//eger B varsa sil 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
