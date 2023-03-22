package run;
import model.HandlingArray;

import java.util.Arrays;
import java.util.Random;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HandlingArray handlingArray = new HandlingArray();
		
		System.out.println( Arrays.toString( handlingArray.getArray()));
		
		handlingArray.getArray()[0] = 2523;
		
		System.out.println( Arrays.toString( handlingArray.getArray()));
		System.out.println(Arrays.toString(handlingArray.sortSelection()));

		
		System.out.println("\nMétodo sortInsertion");
		System.out.println( Arrays.toString(handlingArray.sortInsertion()) );

		System.out.println(handlingArray.deleteElement(5));
		
		new Runner().matrices();

	}
	
	public void showMatriz( int[][] mat) {
		for( int i = 0; i < mat.length; i++ ) {
			for( int j = 0 ; j < mat[i].length ; j++ ) {
				System.out.print(mat[i][j] + "\t");
			}
			System.out.println();
		}
	}

	private void matrices() {
		// TODO Auto-generated method stub
		
		int[][] matriz = new int[4][4];
		
		for( int i = 0; i < matriz.length; i++ ) {
			for( int j = 0 ; j < matriz[i].length ; j++ ) {
				matriz[i][j] = new Random().nextInt(99)+ 1;
			}
		}
		
		showMatriz(matriz);
		System.out.printf( "La suma de la Diagonal Principal es %d\n",sumDiagMain(matriz));
		System.out.printf( "La suma de la Diagonal Secundaria es %d\n",sumDiagSec(matriz));
		System.out.printf( "La transpuesta de la Matriz e\n"); 		
		showMatriz(getTranspuesta(matriz));
	}

	private int[][] getTranspuesta(int[][] matriz) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object sumDiagSec(int[][] matriz) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object sumDiagMain(int[][] matriz) {
		// TODO Auto-generated method stub
		return null;
	}

}
