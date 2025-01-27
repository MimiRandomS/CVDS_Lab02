package edu.eci.cvds.patterns.archetype;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu nombre:");
        String nombre = scanner.nextLine();
        System.out.println("Ingresa tu apellido:");
        String apellido = scanner.nextLine();
        System.out.println( "Hola" + " " + nombre + " " + apellido);
    }
}
