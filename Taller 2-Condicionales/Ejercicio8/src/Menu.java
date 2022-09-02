import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static Integer opcion;
    public static boolean salir;

    public static void menu() {
        Scanner input = new Scanner(System.in);

        salir = false;

        while (!salir) {
            System.out.println("Bienvenido a la pasteleria Don Carlos");
            System.out.println("Por favor elija una opcion:");
            System.out.println("1. Registrar pedido");
            System.out.println("2. Consultar tortas disponibles");
            System.out.println("3. Registrar venta");
            System.out.println("4. Salir del programa");

            try {
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        RegistrarPedido.registrarPedido();
                        break;
                    case 2:
                        ConsultarTortas.consultarTortas();
                        break;
                    case 3:
                        RegistarVenta.registrarVenta();
                        break;
                    case 4:
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
