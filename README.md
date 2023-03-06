# Gestión de Arrays

Proyecto que implementa una clase (HandlingArray) que permite gestionar un arreglo de valores numéricos enteros. El desarrollo se realiza a través de un equipo de trabajo de estudiantes de materia del Programación del Programa de Ingeniería de Sistemas y Computación de la [uptc](http://www.uptc.edu.co)

## Elementos de la Clase

### Atributos

- array: arreglo de enteros
- position: atributo de tipo entero que indica la posición del arreglo en donde se almacena el siguiente elemento que se agregue.

### Métodos

- __Constructor vacío__ Inicializa el arreglo de un tamaño de 10 elementos
- __Constructo que recibe un aareglo__ Recibe un arreglo de n elementos
- __Constructor que recibe un tamaño__ Recibe un valor numérico, dimensiona y genera los elementos del arreglo
- __ensureCapacity__ Método que aumenta la capacidad del arreglo en la mitad del tamaño actual.
- __addElement__ Método que agrega un elemento al arreglo, recibe el valor entero que se va a agregar.
- __generateValues__ Método privado que dimensiona de nuevo e arreglo y genera los valores en forma aleatoria.
-  __sortSelection__ Método que ordena el arreglo por medio del algoritmo de Selección. Retorna un arreglo con los elementos ordenados
-  __sortBurbble__ Método que ordena el arreglo por medio del algoritmo de Burbuja. Retorna un arreglo con los elementos ordenados
-  __sortInsertion__ Método que ordena el arreglo por medio del algoritmo de inserción. Retorna un arreglo con los elementos ordenados
-  __sortShell__ Método que ordena el arreglo por medio del algoritmo de Shell. Retorna un arreglo con los elementos ordenados
- __findElement__ Método que busca un element en forma secuencial. Recibe el elemento a buscar. Retorna la posición del primer elemento encontrado, o -1 si no existe
- __findElementBinary__ Método que busca un element aplicando el algoritmo de búsqueda binaria. Recibe el elemento a buscar. Retorna la posición del primer elemento encontrado, o -1 si no existe
- __countElements__ Método que retorna una matriz indicando para cada elemento del arreglo, cuantas veces se repite.

- __showArray__ Método que retorna un String con los elementos del arreglo en forma vectorial.

- __deleteElement__ Método que elimina un elemento. Recibe el elemento a eliminar, retorna verdadero o falso indicando el éxito o fracaso del método

## Responsables

|Método|Responsable|
|--|--|
|sortSelection|Andrés Mateus|
|sortBurbble|Dumar Malpica|
|sortInsertion|Mauricio Vargas|
|sortShell|Daniel Espinosa|
|findElement|Julián Arias|
|findBinaryElement|Jeferson Madera|
|deleteElement|Cristian Galindo|

## Instrucciones

- Cree una nueva versión del proyecto en su repositorio (`fork`)
- Clone su copia
- Escriba las instrucciones para el método correspondiente
- Actualice su repositorio
- Haga un Pull Request
