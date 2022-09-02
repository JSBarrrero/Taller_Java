import java.util.InputMismatchException;
import java.util.Scanner;

public class RegistrarPedido {
    public static String decoracion;
    public static Integer porciones;
    public static String sabor;
    public static Integer opcion;
    public static boolean salir;

    public static void registrarPedido() {
        Scanner input = new Scanner(System.in);

        salir = false;

        while (!salir) {
            System.out.println("Por favor ingrese el sabor de la torta");
            sabor = input.nextLine();
            System.out.println("Por favor ingrese las porciones de la torta");
            porciones = input.nextInt();
            System.out.println("Por favor escriba detalladamente la decoracion de la torta");
            decoracion = input.nextLine();

            System.out.println("La torta es de sabor "+ sabor + ", cuenta con " + porciones.toString() + " porciones y tiene la siguiente decoracion " + decoracion);
            System.out.println("Esta correcto el pedido:");
            System.out.println("1. Si");
            System.out.println("1. No, registrar nuevamente");

            try {
                opcion = input.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Su pedido quedo registrado correctamente, muchas gracias por su compra");
                        salir = true;
                        break;      
                    default:
                        System.out.println("La opcion que ingreso no es valida por favor intentelo nuevamente");
                        break;
                }     
            } catch (InputMismatchException e) {
                System.out.println("La opcion que ingreso no es valida por favor intentelo nuevamente");
                input.next();
            } 
        }
    }
    
}
