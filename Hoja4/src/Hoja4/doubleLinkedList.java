public DoublyLinkedList<E> extends abstractList<E> {
   protected int count;
   protected DoublyLinkedNode<E> head;
   protected DoublyLinkedNode<E> tail;

//constructor
   public DoublyLinkedList() {
      head = null;
      tail = null;
      count = 0;
   }

//agregamos un elemento al inicio de la lista
   public void addFirst(E value) {
      head = new DoublyLinkedNode<E>(value, head, null);
      if (tail == null) tail = head;
      count++;
   }

//agregamos un elemento al final de la lista
   public void addLast(E value) {
      tail = new DoublyLinkedNode<E>(value, null, tail);
      if (head == null) head = tail;
      count++;
   }

//removemos el ultimo elemento de la lista
   public E removeLast() {
      DoublyLinkedNode<E> temp = tail;
      tail = tail.previous();
      if (tail == null) {
         head = null;
      } 
      else {
         tail.setNext(null);
      }
      count--;
      return temp.value();
   }

}