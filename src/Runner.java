package model;

import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
	
		
		HandlingArray handlingArray = new HandlingArray();
		
		System.out.println( Arrays.toString( handlingArray.getArray()));
		
		handlingArray.getArray()[0] = 2523;
		
		System.out.println( Arrays.toString( handlingArray.getArray()));
		System.out.println(Arrays.toString(handlingArray.sortSelection()));

		
		System.out.println("\nMétodo sortInsertion");
		System.out.println( Arrays.toString(handlingArray.sortInsertion()) );

		System.out.println(handlingArray.deleteElement(5));
		
		System.out.println("\nMetodo sortBurbble");
		System.out.println( Arrays.toString( handlingArray.getArray()));
		System.out.println(Arrays.toString(handlingArray.sortBurbble()));
		

	}

}
