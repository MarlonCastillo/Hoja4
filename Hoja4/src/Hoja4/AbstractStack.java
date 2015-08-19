public abstract class AbstractStack<E> implements Stack<E> {
//consulta si el stack esta vacio 
	int size;  
  	public AbstractStack(){
  		size = 0;
  	}

  	public int size(){
  		return size;
  	}
  
}