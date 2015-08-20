/*------------------------------------------------------------------
Carlos Javier Lima Cordón,      14373
Marlon Josué Castillo Martinez, 14427
Sebastian Castillo,             14102
Maria Jose Lopez,               14056
--------------------------------------------------------------------*/

//clase para la lista circula y que extiende de la clase abstracta de la lista
public class circular<E> extends abstractList<E> {

   Node<E> tail; 

//constructor
  public circular() {
    tail = null;
  }

//agrega un elemento al inicio de la lista
  public void addFirst(E value) {
    Node<E> temp = new Node<E>(value);
    temp.setValue(value);
    size++;
    //si la lista esta vacia, se agrega el primer valor
    if (tail == null) { 
      temp.setNext(tail.next());
      tail.setNext(temp);
    }
    //si ya hay elementos en la lista
    else {
      tail=temp;
      tail.setNext(tail);
    }
  }

//remueve el primer elemento de la lista
  public E removeFirst(){
    if(size!=0){
      Node<E> head = tail.next();
      if(head==tail)
        tail = null;
      else
        tail.setNext(head.next());
      size--;
      return head.value();
    }
    else{
      return null;
    }
  }
  
}