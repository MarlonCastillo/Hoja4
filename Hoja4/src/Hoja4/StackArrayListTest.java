/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JavierLima
 */
public class StackArrayListTest {
    
    private AbstractStack<Double> miStack = new StackArrayList<E>();//instanciamos un objeto de tipo Calcu para poder utilizar los metodos de la clase
//esto se ejecuta al inicio del programa y permite declarar los estados iniciales de variables en comun de los metodos
    @Before
    public void push() {
        miStack.push("1");
        miStack.push("2");
        miStack.push("3");
    }
//test para el metodo calcularVector
    @Test
    public void pop(){
        String resultado = miStack.pop();
        assertEquals("3",resultado); //compara el valor esperado y el valor resultante
    }
//test para el metodo getResultado
    @Test
    public void getResultado(){
        int otro = miStack.size();
        assertEquals(2,otro);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
