package tutoria_27_10_20;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Opción 1
        /*
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        boolean numeroCorrecto = false;
        do{
            try {
                System.out.print("Introduzca un número entero: ");
                numero = teclado.nextInt();
                numeroCorrecto = true;
            }
            catch(InputMismatchException e){
                System.err.println("Error. No ha introducido un número entero");
                teclado.next();
            }
        }while(!numeroCorrecto); // !numeroCorrecto -> numeroCorrecto == false
        
        System.out.format("El valor de la variable número es %d\n", numero);
        */
        
        // Opcion 2
        Scanner teclado = new Scanner(System.in);
        int numero = 0;
        do{
            try {
                System.out.print("Introduzca un número entero: ");
                numero = teclado.nextInt();
                break;
            }
            catch(InputMismatchException e){
                System.err.println("Error. No ha introducido un número entero");
                teclado.next();
            }
        }while(true); // !numeroCorrecto -> numeroCorrecto == false
        
        System.out.format("El valor de la variable número es %d\n", numero);
    }

}
