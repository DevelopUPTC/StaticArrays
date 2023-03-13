import java.util.Arrays;

import model.HandlingArray;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingArray handlingArray = new HandlingArray();
		
		System.out.println( Arrays.toString( handlingArray.getArray()));
		
		handlingArray.getArray()[0] = 2523;
		
		System.out.println( Arrays.toString( handlingArray.getArray()));
		System.out.println(Arrays.toString(handlingArray.sortSelection()));

	}

}
