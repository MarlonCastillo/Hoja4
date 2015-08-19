/*
Carlos Javier Lima Cordón, 14373
Marlon Josué Castillo Martinez, 14427
Sebastian Castillo, 14102
Maria Jose Lopez, 14056

Clase principal que se encarga de la interfaz al usuario y de leer las operaciones en el archivo de texto.
*/
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
        int opcion = leer.nextInt();
        if (opcion==1){
            GeneratedStack=ffactory.getStack("Vector");
        }
        else if(opcion==2){
            GeneratedStack=ffactory.getStack("ArrayList");   
        }
        else {//if(opcion==3){
            GeneratedStack=ffactory.getStack("singlyLinkedList");   
        }
        /*else if(opcion==4){
            GeneratedStack=ffactory.getStack("doubleLinkedList");   
        }
        else{
            GeneratedStack=ffactory.getStack("circular");   
        }*/

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
