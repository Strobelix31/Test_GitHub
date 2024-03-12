package linkedList;

// import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;

public class CheeseInserter {
	
	// private - Sichtbarkeitsbereich auf die Klasse beschr�nkt
	// static - von der Klasse abh�ngig und nicht von Objekt
	// final - Variable nach Initialisierung unver�nderbar

	private static final Pattern vegetables = Pattern.compile(
			"Zucchini|Paprikas?|Zwiebeln?|Tomaten?|Melanzani"
			);
	
	public static void insertCheeseAroundVegetable(List<String> ingredients) {
		// Initialisierung Laufvariable (iterator)
		// Abbruchbedingung (hasNext())
		// keine Inkrementierung --> passiert im Schleifenk�rper
		for(ListIterator<String> iterator = ingredients.listIterator();iterator.hasNext();) {
			String ingredient = iterator.next();
			// matcher --> wird verwendet, um ingredient in unserem Muster zu finden
			// matches() --> f�r den direkten Vergleich
			if(vegetables.matcher(ingredient).matches()) {
				iterator.add("K�se");
			}
		}
	}
	
	public static void main(String[] args) {	
		List<String> ingredients = new LinkedList<String>();
		Collections.addAll(ingredients, "Gnocchi", "Paprika", "Tomate", "Pfeffer", "Melanzani");
		insertCheeseAroundVegetable(ingredients);
		System.out.println(ingredients);
	}
}
