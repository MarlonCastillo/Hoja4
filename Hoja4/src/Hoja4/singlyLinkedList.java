public SinglyLinkedList<E> extends abstractList<E> {

  protected int count; 
  protected Node<E> head;

//constructor
  public SinglyLinkedList() {
    head = null;
    count = 0;
  }
  
//retorna el tamaño de la lista 
  public int size() {
    return count;
  }

//agrega un elemento al inicio de la lista  
  public void addFirst(E value) {
    head = new Node<E>(value, head);
    count++;
  }

//removemos el primer elemento de la lista
  public E removeFirst() {
    Node<E> temp = head;
    head = head.next(); 
    count--;
    return temp.value();
  }

//retorna el valor del primer elemento de la lista pero no lo retira
  public E getFirst() {
    return head.value();
  }

//agrega un elemento al final de la lista
  public void addLast(E value) {
    Node<E> temp = new Node<E>(value,null);
    if (head != null) {
      Node<E> finger = head;
      while (finger.next() != null) {
        finger = finger.next();
      }
		 
      finger.setNext(temp);
    } else head = temp;
	  count++;
  }
   
//retorna true si el valor ingresado es igual a algun elemento de la lista 
  public boolean contains(E value) {
    Node<E> finger = head;
	  while (finger != null && !finger.value().equals(value)) {
      finger = finger.next();
    }
    return finger != null;
  }

}