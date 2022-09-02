import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static Integer opcion;
    public static boolean salir = false;
    
    public static void menu() {
        Scanner input = new Scanner(System.in);
        Persona persona = new Persona();

        System.out.println("Por favor escriba su nombre:");
        persona.setNombre(input.nextLine());

        while (!salir) {
            System.out.println("Hola " + persona.getNombre() + " bienvenido a la drogueria Mi Salud");
            System.out.println("Por favor elija una opcion;");
            System.out.println("1. Productos disponibles");
            System.out.println("2. Devolucion de producto");
            System.out.println("3. Salir del programa");

            try {
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        ProductoDisp.productoDisp();    
                        break;
                    case 2:
                        Devolucion.devolucion();
                        break;
                    case 3:
                        salir = true;
                        break;                       
                
                    default:
                        System.out.println("La opcion que ingreso no es valida, intentelo nuevamente");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("La opcion que ingreso no es valida, intentelo nuevamente");
                input.next();
            }                        
        }        
    }
}
