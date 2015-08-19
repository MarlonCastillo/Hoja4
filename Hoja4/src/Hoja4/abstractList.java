public abstract class abstractList<E> extends AbstractStack<E> implements List<E>  {

	public abstractList(){}

	public void push(E value){
		addFirst(value);
	}

	public E pop(){
		return removeFirst();
	}

}