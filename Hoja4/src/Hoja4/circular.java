public CircularList<E> extends abstractList<E> {

  protected Node<E> tail; 
  protected int count;

//constructor
  public CircularList() {
    tail = null;
    count = 0;
  }

//agrega un elemento al inicio de la lista
  public void addFirst(E value) {
    Node<E> temp = new Node<E>(value);
    //si la lista esta vacia, se agrega el primer valor
    if (tail == null) { 
      tail = temp;
      tail.setNext(tail);
    }
    //si ya hay elementos en la lista
    else {
      temp.setNext(tail.next());
      tail.setNext(temp);
    }
    count++;
  }

//agregamos un elemento al final de la lista
  public void addLast(E value) {
    addFirst(value);
    tail = tail.next();
  }

//removemos el ultimo elemento de la lista
  public E removeLast() {
    Node<E> finger = tail;
    while (finger.next() != tail) {
      finger = finger.next();
    }
    //apuntamos al ultimo valor
    Node<E> temp = tail;
    if (finger == tail) {
      tail = null;
    } 
    else {
      finger.setNext(tail.next());
      tail = finger;
    }
    count--;
    return temp.value();
  }

}