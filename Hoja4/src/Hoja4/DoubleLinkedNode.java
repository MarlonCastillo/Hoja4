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

    public DoubleLinkedNode(E v)
    // post: constructs a single element
    {
        this(v,null,null);
    }

    public DoubleLinkedNode<E> getnextElement(){
        return nextElement;
    }

    public void setNextElement(DoubleLinkedNode<E> next){
        nextElement=next;
    }

    public E getdata(){
        return data;
    }

    public void setdata(E nextElement){
        nextElement=nextElement;
    }

    public DoubleLinkedNode<E> getpreviousElement(){
        return null;
    }

    public void setpreviousElement(DoubleLinkedNode<E> previo){
        previousElement=previo;
    }
}