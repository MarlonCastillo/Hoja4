import java.util.*;
public class factory<E>{
	
	public AbstractStack<E> getStack(String object){
		if (object.equals("Vector"))
			return new StackVector<E>();
		if (object.equals("ArrayList"))
			return new StackArrayList<E>();
		if (object.equals("singlyLinkedList"))
			return new singlyLinkedList<E>();
		//if (object.equals("doubleLinkedList"))
		//	return new doubleLinkedList<E>();
		//if (object.equals("circular"))
		//	return new circular<E>();
		return null;
	}
}