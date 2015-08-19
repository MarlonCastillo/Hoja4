public class singlyLinkedList<E> extends abstractList<E> {
 
  protected Node<E> head;

//constructor
  public singlyLinkedList() {
    head = null;
  }

//agrega un elemento al inicio de la lista  
  public void addFirst(E value) {
    head = new Node<E>(value, head);
    size++;
  }

//removemos el primer elemento de la lista
  public E removeFirst() {
    if(size!=0){
      Node<E> temp = head;
      head = head.next(); 
      size--;
      return temp.value();
    }
    else { return null; }
  }

}