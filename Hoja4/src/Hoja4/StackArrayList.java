/*------------------------------------------------------------------
Carlos Javier Lima Cordón,      14373
Marlon Josué Castillo Martinez, 14427
Sebastian Castillo,             14102
Maria Jose Lopez,               14056
--------------------------------------------------------------------*/

//clase para la implementacion de arraylist
import java.util.ArrayList;

public class StackArrayList<E> extends AbstractStack<E> {
	protected ArrayList<E> data;

//constructor
	public StackArrayList()
	{
		data = new ArrayList<E>();
	}

//agrega un elemento al stack    
    public void push(E item){
        size++;
        data.add(item);
    }

//retira el ultimo elemento ingresado en el stack
    public E pop(){
        size--;
        return data.remove(size()-1);
    }

//retorna el tamaño del stack        
    public int size(){
        return data.size();
    }

}