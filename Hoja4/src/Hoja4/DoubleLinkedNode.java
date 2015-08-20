/*------------------------------------------------------------------
Carlos Javier Lima Cordón,      14373
Marlon Josué Castillo Martinez, 14427
Sebastian Castillo,             14102
Maria Jose Lopez,               14056
--------------------------------------------------------------------*/

//clase para los nodos de la lista doblemente encadenada
public class DoubleLinkedNode<E> {
    protected E data;
    protected DoubleLinkedNode<E> nextElement;
    protected DoubleLinkedNode<E> previousElement;

    public DoubleLinkedNode(E v, DoubleLinkedNode<E> next, DoubleLinkedNode<E> previous) {
        data = v;
        nextElement = next;
        if (nextElement != null)
            nextElement.previousElement = this;
        previousElement = previous;
        if (previousElement != null)
            previousElement.nextElement = this;
    }
//constructor
    public DoubleLinkedNode(E v)
    // post: constructs a single element
    {
        this(v,null,null);
    }

//devuelve el elemento siguiente
    public DoubleLinkedNode<E> getnextElement(){
        return nextElement;
    }

//modfica el elemento siguiente
    public void setNextElement(DoubleLinkedNode<E> next){
        nextElement=next;
    }
//regresa el valor del elemento
    public E getdata(){
        return data;
    }

//modifica el valor del elemento
    public void setdata(E nextElement){
        nextElement=nextElement;
    }
//devuelve el elemento anterior
    public DoubleLinkedNode<E> getpreviousElement(){
        return null;
    }
//modifica el elemento anterior
    public void setpreviousElement(DoubleLinkedNode<E> previo){
        previousElement=previo;
    }
}