package model;

import java.util.Arrays;
import java.util.Random;
/**
 * Clase que gestiona un arreglo de enteros
 * @author jairo
 *
  */
public class HandlingArray {
	//Arreglo de enteros
	private int[] array;
	
	//atributo que indica la posición en donde se almacena el siguiente elemento
	private int position;

	public HandlingArray() {
		array = new int[10];
		position = 0;
		generateValues();
	}

	public HandlingArray(int size) {
		array = new int[size];
		position = 0;
		generateValues();
	}

	public HandlingArray(int[] array) {
		this.array = array;
		position = array.length;
	}
	
	private int[] ensureCapacity() {
		int newCapacity = array.length % 2 == 0 ? array.length + array.length / 2 : ( array.length + array.length / 2 ) + 1;  
		int[] auxArray = new int[ newCapacity ];
				
        auxArray = Arrays.copyOf(array, newCapacity);
        
        //array = auxArray;
        
        return auxArray;
	}
	
	public void addElement( int element ) {
		if (position >= array.length ) {
			array = ensureCapacity();
		}
		array[position++] = element;
	}
	
	/**
	 * Método que reinicia el arreglo y genera valores segun capacidad
	 */
	private void generateValues() {
		
		array = new int[ array.length ];
		position = 0;
		for( int i = 0 ; i < array.length ; i++ ) {
			addElement( new Random().nextInt(99)+1) ;
		}
	}
	
	/**
	 * Método que ordena el arreglo por medio del algoritmo de Selección
	 * @return  un arreglo con los elementos ordenados
	 * responsable: Andrés Mateus
	 */
	public int[] sortSelection() {
		int[] arraySort = array.clone();
		int i,j,menor,pos,tmp;
		for (i = 0; i < arraySort.length; i++) {
			menor=arraySort[i];
			pos=i;
			for (j = i+1; j < arraySort.length; j++) {
				if(arraySort[j]<menor){
					menor=arraySort[j];
					pos=j;
				}
			}
			if(pos !=i){
				tmp=arraySort[i];
				arraySort[i]=arraySort[pos];
				arraySort[pos]=tmp;
			}
		}
		
		return arraySort;
	}
	
	/**
	 * 
	 * @return
	 * responsable: Dumar Malpica
	 */
	public int[] sortBurbble() {
		int[] arraySort = new int[ array.length ];
		
		return arraySort;
	}
	
	
	/**
	 * 
	 * @return
	 * responsable: Mauricio Vargas
	 */
	public int[] sortInsertion() {
		int[] arraySort = new int[ array.length ];
		
		return arraySort;
	}
	
	/**
	 * 
	 * @return
	 * responsable: Daniel Espinosa
	 */
	public int[] sortShell() {
		int[] arraySort = new int[ array.length ];
		
		return arraySort;
	}
	
	/**
	 * Método que busca en forma secuencia, un elemento
	 * @param element especifica el elemento a buscar
	 * @return la posición del elemento, o -1 cuando no existe
	 * responsable: Julián Arias
	 */
	public int findElement( int element) {
		
		return 0;
	}
	
	/**
	 * 
	 * @param element
	 * @return
	 * responsable: Jeferson Madera
	 */
	public int findElementBinary(int element) {
		
		return 0;
	}
	
	/**
	 * 
	 * @return
	 * responsable: Jairo Riaño
	 */
	public int[][] countElements(){
		
		return null;
	}
	
	public int[] getArray() {
		
		return array.clone();
	}
	
	/**
	 * 
	 * @return
	 * responsable Robinson Molina
	 */
	public String showArray() {
		
		return null;
	}
	
	/**
	 * Método que elimina un elemento del arreglo
	 * @param element indica el elemento a borrar
	 * @return verdadero o falso, indicando si se pudo o no, eliminar
	 * Responsable: Cristian Galindo
	 */
	public boolean deleteElement( int element ) {
		
		
		return false;
	}

}
