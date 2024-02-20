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
	
	}	
}