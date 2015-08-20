/*------------------------------------------------------------------
Carlos Javier Lima Cordón,      14373
Marlon Josué Castillo Martinez, 14427
Sebastian Castillo,             14102
Maria Jose Lopez,               14056
--------------------------------------------------------------------*/

//clase para la implementacion de vectores
import java.util.Vector;

public class StackVector<E> extends AbstractStack<E> {
    protected Vector<E>data;

//constructor    
    public StackVector(){
        data = new Vector<E>();
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

//extra el valor del ultimo elemento ingresado pero sin retirarlo del stack    
    public E peek(){
        return data.get(size() - 1);
    }

//retorna el tamaño del stack        
    public int size(){
        return data.size();
    }
    
}