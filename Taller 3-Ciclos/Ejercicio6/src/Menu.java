import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static Integer opcion;
    public static boolean salir;

    public static void menu() {
        Scanner input = new Scanner(System.in);
        salir = false;

        while (!salir) {
            System.out.println("Bienvenido a la aplicacion contactos");
            System.out.println("Elija una opcion");
            System.out.println("1. Registrar contacto");
            System.out.println("2. Buscar contacto");
            System.out.println("3. Eliminar contacto");
            System.out.println("4. Salir de la aplicacion");

            try {
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        RegistrarContanto.registrarContacto();
                        break;
                    case 2:
                        BuscarContacto.buscarContacto();
                        break;
                    case 3:
                        EliminarContacto.eliminarContacto();
                        break;
                    case 4:
                        salir = true;
                        break;    
                
                    default:
                        System.out.println("La opcion que ingreso no es valida por favor intenlo nuevamente");
                        break;
                }
                
            } catch (InputMismatchException e) {
                System.out.println("La opcion que ingreso no es valida por favor intenlo nuevamente");
                input.next();
            }
            
        }




        
    }
    
}
