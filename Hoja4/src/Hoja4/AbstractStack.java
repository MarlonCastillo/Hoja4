public abstract class AbstractStack<E> implements Stack<E> {

//agrega un elemento al stack
  public void push(E item){
    data.add(item);
  }

//retira el ultimo elemento ingresado en el stack
  public E pop(){
    return data.remove(size()-1);
  }

//solamente extrae el valor del ultimo elemento ingresado en el stack pero no lo retira
  public E peek(){
    return data.get(size() - 1);
  }

//consulta si el stack esta vacio   
  public boolean empty(){
    return size() == 0;
  }

//retorna la cantidad de elementos en el stack
  public int size(){
    return data.size();
  }
  
}