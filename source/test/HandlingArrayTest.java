import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.HandlingArray;

class HandlingArrayTest {

	@Test
	void testSortSelection() {
		int[] array = new int[] {12,546,72,6,75,90,2000};
		HandlingArray handlingArray = new HandlingArray( array );
		assertArrayEquals(new int[] {6,12,72,75,90,546,2000}, handlingArray.sortSelection());;
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
		fail("Not yet implemented");
	}

	@Test
	void testSortShell() {
		fail("Not yet implemented");
	}

	@Test
	void testFindElement() {
		int[] array = new int[] {12,546,72,6,75,90,2000,53,49,1};
		HandlingArray handlingArray = new HandlingArray( array );
		assertEquals(0, handlingArray.findElement( 12 ) );
		assertEquals(9, handlingArray.findElement( 1 ) );
		assertEquals(7, handlingArray.findElement( 53 ) );
		assertEquals(3, handlingArray.findElement( 6 ) );
		assertEquals(-1, handlingArray.findElement( 567 ) );
	}

	@Test
	void testFindElementBinary() {
		fail("Not yet implemented");
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
		int[] array = new int[] {12,546,72,6,75,90,2000,53,49,1};
		HandlingArray handlingArray = new HandlingArray( array );
		assertEquals("[12,546,72,6,75,90,2000,53,49,1]", handlingArray.showArray());
	}

}
