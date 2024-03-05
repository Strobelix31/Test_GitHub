package Arrays;

import java.util.ArrayList;
import java.util.List;

public class Comment {
	  
	public static void main(String[] args) {
		  
		List<String> logEntries = new ArrayList<>();
	       logEntries.add("1. Magnetkompass");
	       logEntries.add("2. Geschwindigkeit der Wasserströmung");
	       logEntries.add("3. Wetter");
	       logEntries.add("4. Kommentar und allgemeine Beobachtungen");
	       logEntries.add("1. Magnetkompass");
	       logEntries.add("2. Geschwindigkeit der Wasserströmung");
	       logEntries.add("3. Wetter");
	       logEntries.add("4. Kommentar und allgemeine Beobachtungen");
	       logEntries.add("1. Magnetkompass");
	       logEntries.add("2. Geschwindigkeit der Wasserströmung");
	       logEntries.add("3. Wetter");
	       logEntries.add("4. Kommentar und allgemeine Beobachtungen");
	       logEntries.add("1. Magnetkompass");
	       logEntries.add("2. Geschwindigkeit der Wasserströmung");
	       logEntries.add("3. Wetter");
	       logEntries.add("4. Kommentar und allgemeine Beobachtungen");
	       reduceToComments(logEntries);
	 
	       for (String comment : logEntries) {
	           System.out.println(comment);
	       }
	   }
		  public static void reduceToComments(List<String> lines) {
			  int i = 0;
		        while (i + 3 < lines.size()) {
		            lines.remove(i);
		            lines.remove(i);
		            lines.remove(i);
		            i++;
		        }
		    }
		}
