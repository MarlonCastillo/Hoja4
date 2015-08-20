/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JavierLima
 */
public class CalcuTest {
    
    private Calculadora miCalcu = new Calcu();//instanciamos un objeto de tipo Calcu para poder utilizar los metodos de la clase
//esto se ejecuta al inicio del programa y permite declarar los estados iniciales de variables en comun de los metodos
    @Before
    public void setUp() {
        String linea = "1 2 + 4 * 3 +";
        miCalcu.setString(linea);
    }
//test para el metodo calcularVector 
    @Test
    public void calcularVector(){
        miCalcu.meterVector();
        boolean estado=miCalcu.calcularVector();
        assertEquals(true,estado); //compara el valor esperado y el valor resultante
    }
//test para el metodo getResultado
    @Test
    public void getResultado(){
        miCalcu.meterVector();
        miCalcu.calcularVector();
        int estado=miCalcu.getResultado();
        assertEquals(15,estado);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
