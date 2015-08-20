/*------------------------------------------------------------------
Carlos Javier Lima Cordón, 		14373
Marlon Josué Castillo Martinez, 14427
Sebastian Castillo, 			14102
Maria Jose Lopez, 				14056
--------------------------------------------------------------------*/

//clase abstracta para las listas, esta extiende de la clase abstracta e implementa la interfaz lista
public abstract class abstractList<E> extends AbstractStack<E> implements List<E>  {

	public abstractList(){}
//agrega un valor a la lista
	public void push(E value){
		addFirst(value);
	}
//retira un valor de la lista
	public E pop(){
		return removeFirst();
	}

}