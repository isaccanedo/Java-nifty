
public class Main {
	
	/*
	 *  What statement returns true if "nifty" is of type String?
	 *  (Qual declaração retorna verdadeiro se "nifty" for do tipo String?)
	 *  
	 *  1 - "nifty" instanceof String ==> correct
	 *  2 - "nifty" .getClass().getSimpleName() == "String"
	 *  3 - "nifty" .getType() == String
	 *  4 - "nifty" .getType().equals("String")
	 *   
	 */

	public static void main(String[] args) {
		
		System.out.println(("nifty")instanceof String);
		System.out.println(("nifty") .getClass().getSimpleName() == "String");
		System.out.println("nifty" .getClass().getSimpleName() == "String");		

	}

}
