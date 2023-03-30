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
		
		char character = '.';
		
		int code = 66;
		
		System.out.println("El codigo es " + (int)character + " Y el caracter es " + (char) code );
		
		new Runner().countElements();

	}
	
	private void countElements() {
		HandlingArray ha = new HandlingArray(20);
		
		System.out.println("*****************contar elementos*******************");
		
		int[][] matCount = ha.countElements();
		
		System.out.println( Arrays.toString( ha.getArray()));
		
		showMatriz( matCount );
		
		for( int i = 0 ; i < matCount[0].length ; i++ ) {
			System.out.print( matCount[0][i] + "-->");
			for( int j = 1 ; j <= matCount[1][i] ; j++ ) {
				System.out.print( "*" );
			}
			System.out.println();
		}
		
		
		
		System.out.println("*****************************************************");
		
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
		
		int[][] matriz = new int[15][15];
		
		for( int i = 0; i < matriz.length; i++ ) {
			for( int j = 0 ; j < matriz[i].length ; j++ ) {
				matriz[i][j] = new Random().nextInt(9)+ 1;
			}
		}
		
		showMatriz(matriz);
		System.out.printf( "La suma de la Diagonal Principal es %d\n",sumDiagMain(matriz));
		System.out.printf( "La suma de la Diagonal Secundaria es %d\n",sumDiagSec(matriz));
		System.out.printf( "La transpuesta de la Matriz e\n"); 		
		//showMatriz(getTranspuesta(matriz));
	}

	private int[][] getTranspuesta(int[][] matriz) {
		// TODO Auto-generated method stub
		return null;
	}

	private int sumDiagSec(int[][] matriz) {
		// TODO Auto-generated method stub
		return 0;
	}

	private int sumDiagMain(int[][] matriz) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/**
	 * Retorna un vector de tamaño n (n filas de la matriz) con los valores mínimos de cada fila
	 * @param matriz contiene los datos de la matriz
	 * @return vector con los valores mínimos de cada fila
	 */
	private int[] minRows( int[][] matriz) {
		
		return null;
	}
	
	/**
	 * Calcula la suma de dos matrices que recibe como parámetro
	 * @param matOne
	 * @param matTwo
	 * @return La suma de las dos matrices, null si las matrices tienen diferente orden
	 */
	public int[][] sumMatriz(int[][] matOne, int[][] matTwo){
		
		return null;
	}
	
	
	/**
	 * Calcua la multiplicación de dos matrices
	 * @param matOne
	 * @param matTwo
	 * @return Una matriz con la multiplicación, null, si no se puede multiplicar
	 */
	public int[][] multMatriz(int[][] matOne, int[][] matTwo){
		
		return null;
	}
}
