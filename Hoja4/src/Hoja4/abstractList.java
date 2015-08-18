public abstract class AbstractList<E> implements List<E>  {

//retorna true si la lista no tiene elementos
  public boolean isEmpty() {
    return size() == 0;
  }

//retorna true si la lista contiene un elemento igual al valor indicado
  public boolean contains(E value) {
    return -1 != indexOf(value);
  }

}