import java.util.Vector;

public class StackVector<E> extends AbstractStack<E> {
    protected Vector<E>data;

//constructor    
    public StackVector(){
        data = new Vector<E>();
    }

//agrega un elemento al stack    
    public void push(E item){
        data.add(item);
    }

//retira el ultimo elemento ingresado en el stack
    public E pop(){
        return data.remove(size()-1);
    }

//extra el valor del ultimo elemento ingresado pero sin retirarlo del stack    
    public E peek(){
        return data.get(size() - 1);
    }

//consulta si el stack esta vacio    
    public boolean empty(){
        return size() == 0;
    }

//retorna el tamaño del stack        
    public int size(){
        return data.size();
    }
    
}