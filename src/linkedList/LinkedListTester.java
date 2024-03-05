package linkedList;

import java.util.Collections;
// import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTester {
	
	public static void main(String[] args) {
		
		// ArrayList: List<Integer> list = new ArrayList<Integer>();
		List<Integer> list = new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Collections.rotate(list, 2);
		
		//"Laufvariable" zum Iterieren einer Datenstruktur
		// läuft immer vom Anfang zum Ende
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			//System.out.println(iterator.next());
			if(iterator.next() == 3) {
				// System.out.println("Found 3");
				iterator.remove();
			}
		}
		// iterator muss wieder zurückgesetzt werden
		// iterator muss wieder an den Anfang der Liste gesetzt werden
		iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
			iterator.next();
			// iterator.next();
		}
	
	}

}
