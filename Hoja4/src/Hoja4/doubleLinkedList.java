public class doubleLinkedList<E> extends abstractList<E> {
   protected DoubleLinkedNode<E> head;
   protected DoubleLinkedNode<E> tail;

//constructor
   public doubleLinkedList() {
      head = null;
      tail = null;
   }

//agregamos un elemento al inicio de la lista
   public void addFirst(E value) {
      head = new DoubleLinkedNode<E>(value, head, null);
      size++;
      if (tail == null) tail = head;
   }

   public E removeFirst(){
      if (size!=0){
         DoubleLinkedNode<E> temp=head;
         head=head.getnextElement();
         size--;
         return temp.getdata();
      }
      else{
         return null;
      }
   }
}