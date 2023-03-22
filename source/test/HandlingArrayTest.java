import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import model.HandlingArray;

class HandlingArrayTest {

	@Test
	void testSortSelection() {
		int[] array = new int[] {12,546,72,6,75,90,2000};
		HandlingArray handlingArray = new HandlingArray( array );
		assertArrayEquals(new int[] {6,12,72,75,90,546,2000}, handlingArray.sortSelection());;
		//System.out.println( Arrays.toString( handlingArray.getArray()));
	}
	
	@Test
	void addElement() {
		HandlingArray handlingArray = new HandlingArray(new int[] {34,87,12,9,32,65});
		assertEquals(6, handlingArray.getArray().length);
		handlingArray.addElement(10);
		handlingArray.addElement(20);
		handlingArray.addElement(30);
		assertArrayEquals(new int[] {34,87,12,9,32,65,10,20,30}, handlingArray.getArray());
		assertEquals(9, handlingArray.getArray().length);
		
		handlingArray = new HandlingArray( 20 );
		handlingArray.addElement( 367 );
		assertEquals(30, handlingArray.getArray().length);
		
		handlingArray = new HandlingArray();
		handlingArray.addElement(534);
		assertEquals(15, handlingArray.getArray().length);
	}

	@Test
	void testSortBurbble() {
		fail("Not yet implemented");
	}

	@Test
	void testSortInsertion() {
		int[] array = new int[] {12,546,72,6,75,90,2000,53,49,1,12,1,10,10,10,6,6,2000};
		HandlingArray handling = new HandlingArray( array );
		//System.out.println( Arrays.toString( handling.getArray()));
		//System.out.println( Arrays.toString( handling.sortInsertion()));
	}

	@Test
	void testSortShell() {
		fail("Not yet implemented");
	}

	@Test
	void testFindElement() {
		int[] array = new int[] {12,546,72,6,75,90,2000,53,49,1};
		HandlingArray handlingArray = new HandlingArray( array );
		/*assertEquals(0, handlingArray.findElement( 12 ) );
		assertEquals(9, handlingArray.findElement( 1 ) );
		assertEquals(7, handlingArray.findElement( 53 ) );
		assertEquals(3, handlingArray.findElement( 6 ) );
		assertEquals(-1, handlingArray.findElement( 567 ) );*/
	}

	@Test
	void testFindElementBinary() {
		int[] vec = new int[] {34,10,5,54,79,213,210,9,7,2,98,43};
		//[2 - 5 - 7 - 9 -10 - 34 - 43 - 54 - 79 - 98 - 210 - 213]
		HandlingArray handling = new HandlingArray( vec );
		assertEquals(0, handling.findElementBinary(2));
		assertEquals(11, handling.findElementBinary(213));
		assertEquals(-1, handling.findElementBinary(2543));
		assertEquals(1, handling.findElementBinary(5));
		assertEquals(2, handling.findElementBinary(7));
		assertEquals(3, handling.findElementBinary(9));
		handling.addElement(69);
		assertEquals(18, handling.getArray().length);
		assertEquals(69,handling.getArray()[12]);
		assertEquals(12, handling.findElementBinary(213));
	}

	@Test
	void testCountElements() {
		//12 2
		//546 1
		//72 1
		//6 3
		//75 1
		//90 1
		//2000 2
		//53 1
		//49 1
		//1 2
		//10 3
		int[] array = new int[] {12,546,72,6,75,90,2000,53,49,1,12,1,10,10,10,6,6,2000};
		HandlingArray handlingArray = new HandlingArray( array );
		assertEquals(72,handlingArray.countElements()[2][0]);
		assertEquals(1,handlingArray.countElements()[2][1]);
		
		assertEquals(6,handlingArray.countElements()[3][0]);
		assertEquals(3,handlingArray.countElements()[3][1]);
		
	}

	@Test
	void testLoadArray() {
		fail("Not yet implemented");
	}

	@Test
	void testShowArray() {
		fail("Not yet implemented");
	}

}
