/*------------------------------------------------------------------
Carlos Javier Lima Cordón,      14373
Marlon Josué Castillo Martinez, 14427
Sebastian Castillo,             14102
Maria Jose Lopez,               14056
--------------------------------------------------------------------*/

//interfaz para las listas
public interface List<E> {

   public void addFirst(E value);
   // post: value is added to beginning of list

   public E removeFirst();
   // pre: list is not empty
   // post: removes first value from list

}
