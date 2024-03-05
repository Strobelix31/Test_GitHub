package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTester {
	
	public void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		//"Laufvariable" zum Iterieren einer Datenstruktur
		// läuft immer vom Anfang zum Ende
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
