package Arrays;

public class Strings {

	public static boolean isProbablyApproaching(String[] signs) {
        if (signs == null) {
           System.out.println("Array darf nicht null sein!");
        }
        	for (int i = 1; i < signs.length; i++) {
        		if( signs[i].equals(signs[i+1]) && 
        				signs[i+1].equals(signs[i+2]) && 
        				signs[i+2].equals(signs[i+3])) {
        			return true;
        		}
        	}
        	return false;
	}      
	public static void main(String[] args) {
	
		String[] signs1 = {"F", "DO", "MOS", "MOS", "MOS", "MOS", "WES"};
		System.out.println(isProbablyApproaching(signs1));
	
		String[] signs2 = {"F", "MOS", "DO", "MOS", "MOS", "MOS", "WES"};
		System.out.println(isProbablyApproaching(signs2));
	}	
}