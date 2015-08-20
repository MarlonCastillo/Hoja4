/*------------------------------------------------------------------
Carlos Javier Lima Cordón, 		14373
Marlon Josué Castillo Martinez, 14427
Sebastian Castillo, 			14102
Maria Jose Lopez, 				14056
--------------------------------------------------------------------*/

//clase abstracta para el stack y que implementa la interfaz stack
public abstract class AbstractStack<E> implements Stack<E> {

	int size;  
  	public AbstractStack(){
  		size = 0;
  	}
//retorna el tamaño
  	public int size(){
  		return size;
  	}
  
}