/*------------------------------------------------------------------
Carlos Javier Lima Cordón,      14373
Marlon Josué Castillo Martinez, 14427
Sebastian Castillo,             14102
Maria Jose Lopez,               14056
--------------------------------------------------------------------*/

//clase factory para el patron de diseño
public class factory<E>{

//devolvemos la instancia requerida	
	public AbstractStack<E> getStack(String object){
		if (object.equals("Vector"))
			return new StackVector<E>();
		if (object.equals("ArrayList"))
			return new StackArrayList<E>();
		if (object.equals("singlyLinkedList"))
			return new singlyLinkedList<E>();
		if (object.equals("doubleLinkedList"))
			return new doubleLinkedList<E>();
		if (object.equals("circular"))
			return new circular<E>();
		return null;
	}
}