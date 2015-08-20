/*------------------------------------------------------------------
Carlos Javier Lima Cordón,      14373
Marlon Josué Castillo Martinez, 14427
Sebastian Castillo,             14102
Maria Jose Lopez,               14056
--------------------------------------------------------------------*/

//Clase principal que se encarga de la interfaz al usuario y de leer las operaciones en el archivo de texto.

import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CalcuMain {
    public static void main(String[] args) {
        AbstractStack<Double> GeneratedStack;
        factory<Double> ffactory = new factory<Double>();
        Calcu miCalcu = new Calcu();
        System.out.println("BIENVENIDO A NUESTRA CALCULADORA POSTFIX.\nIngrese la opcion deseada:\n");
        System.out.println("1.Vector\n2.ArrayList\n3.Lista simple\n4.Lista doble\n5.Lista circular\n");
        Scanner leer = new Scanner(System.in);
		String opcion = "";
		int var = 0;
		
		do
		{
			var = 0;
			opcion = leer.nextLine();
			if(!opcion.equals("1") && !opcion.equals("2") && !opcion.equals("3") && !opcion.equals("4") && !opcion.equals("5"))
			{
				System.out.println("El dato que ha ingresado es incorrecto, ingrese un numero del 1-5.");
				var = 1;
			}
		}while(var == 1);
		
		switch(opcion){
			case "1":
				GeneratedStack=ffactory.getStack("Vector");
				break;
			case "2":
				GeneratedStack=ffactory.getStack("ArrayList");
				break;
			case "3":
				GeneratedStack=ffactory.getStack("singlyLinkedList"); 
				break;
			case "4":
				GeneratedStack=ffactory.getStack("doubleLinkedList");
				break;
			default:
				GeneratedStack=ffactory.getStack("circular"); 
				break;
		}

		try{
            miCalcu.setStack(GeneratedStack);
            FileReader lector=new FileReader("texto.txt");
            //El contenido de lector se guarda en un BufferedReader
            BufferedReader contenido=new BufferedReader(lector);
            //Con el siguiente ciclo extraemos todo el contenido del objeto "contenido" y lo mostramos
            String linea;
            //System.out.println(linea=contenido.readLine());
            while((linea=contenido.readLine())!=null) {
            	System.out.println(linea);
            	miCalcu.setString(linea);
            	miCalcu.meterVector();
            	if(miCalcu.calcularVector()){
                	System.out.println("El resultado de la operacion es: "+miCalcu.getResultado());
					switch(opcion){
						case "1":
							System.out.println("Ha utilizado el metodo Vector.");
							break;
						case "2":
							System.out.println("Ha utilizado el metodo ArrayList");
							break;
						case "3":
							System.out.println("Ha utilizado el metodo SinglyLinkedList"); 
							break;
						case "4":
							System.out.println("Ha utilizado el metodo DoubleLinkedList");
							break;
						default:
							System.out.println("Ha utilizado el metodo Circular"); 
							break;
					}
            	}
            	else {System.out.println("La operacion es incorrecta y no se puede realizar.");}
           	}
        }
        //Si se causa un error al leer cae aqui
        catch(Exception e) {
            System.out.println("Error al leer el archivo.");
        }
	}
}
