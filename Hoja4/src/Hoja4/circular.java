public class circular<E> extends abstractList<E> {

  protected Node<E> tail; 

//constructor
  public circular() {
    tail = null;
  }

//agrega un elemento al inicio de la lista
  public void addFirst(E value) {
    Node<E> temp = new Node<E>(value);
    Node.setValue(value);
    size++;
    //si la lista esta vacia, se agrega el primer valor
    if (tail == null) { 
      Node.setNext(tail.getNext());
      tail.setNext(Node);
    }
    //si ya hay elementos en la lista
    else {
      tail=Node;
      temp.setNext(tail);
    }
  }

  public E removeFirst(){
    if(size!=0){
      Node<E> head = tail.getNext();
      if(head==tail)
        tail = null;
      else
        tail.setNext(head.getNext());
      size--;
      return head.getValue();
    }
    else{
      return null;
    }
  }
  
}