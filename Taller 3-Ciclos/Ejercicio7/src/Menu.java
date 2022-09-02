import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static Integer opcion;
    public static boolean salir;

    public static void menu() {
        Scanner input = new Scanner(System.in);
        salir = false;

        while (!salir) {
            System.out.println("Bienvenido al parqueadero El Guardian elija una opcion");
            System.out.println("1. Ingresar vehiculo al parqueadero");
            System.out.println("2. Retirar vehiculo del parqueadero");
            System.out.println("3. Consultar vehiculo");
            System.out.println("4. Salir de la aplicacion");
            try {
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        IngresarVehiculo.ingresarVehiculo();
                        break;
                    case 2:
                        RetirarVehiculo.retirarVehiculo();
                        break;
                    case 3:
                        ConsultarVehiculo.consultarVehiculo();
                        break;
                    case 4:
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
