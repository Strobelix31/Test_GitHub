package musicalChaírs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class MusicalChair {
			
		private List<String> names;

		public MusicalChair(String... names) {
			// String... kann beliebig viele Strings übernehmen
			// Java regelt das intern mit einem Array
			// dadurch wird length und nicht size verwendet!
			if(names.length > 0) {
				// Arrays.asList(names) - wandelt ein Array in eine Liste um
				this.names = new LinkedList<String>(Arrays.asList(names));
			}
		}

		public List<String> getNames() {
			return names;
		}

		public void setNames(List<String> names) {
			this.names = names;
		}
		
		public void rotate(int distance) {
			Collections.rotate(this.names, distance);
		}
		
		// Aufgabe B der Reise nach Jerusalem:
		public void rotateAndRemove(int distance) {
			this.rotate(distance);
			((LinkedList<String>) this.names).removeLast();
		}
		
		public String play(List<String> names) {
		    if (names.isEmpty()) {
		        System.out.println("Keine Kandidaten vorhanden!");
		        return null;
		    }
		    System.out.println("Kandidaten:");
		    for (String name : names) {
		        System.out.println(name);
		    }
		    while (names.size() > 1) {
		        int index = ThreadLocalRandom.current().nextInt(names.size());
		        String removedName = names.remove(index);
		        names.add(removedName);
		        System.out.println("Kandidaten nach Entfernen von " + removedName + ":");
		        for (String name : names) {
		            System.out.println(name);
		        }
		    }
		    String winner = names.get(0);
		    System.out.println("Gewinner: " + winner);
		    return winner;
		}
		
		public String toString() {
			Iterator<String> itr = this.names.iterator();
			String tmp = "";
			while(itr.hasNext()) {
				tmp = tmp + itr.next() + ", ";
			}
			return tmp;
		}
}
