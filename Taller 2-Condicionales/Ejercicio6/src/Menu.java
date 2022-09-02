import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static Integer opcion;
    public static boolean salir;

    public static void menu() {
        Scanner input = new Scanner(System.in);

        salir = false;

        while (!salir) {
            System.out.println("Por favor espere, recopilando datos");
            System.out.println("Elija una opcion");
            System.out.println("1. Conocer el registro de entrada");
            System.out.println("2. Conocer el registro de salida");
            System.out.println("3. Salir");
            
            try {
                opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("La motocicleta de placa " + Cliente.placa + " ingreso la fecha " + Cliente.fecha + " con las siguientes observaciones realizadas por el cliente " + Cliente.obsCliente);
                    break;
                case 2:
                    System.out.println("La motocicleta de placa " + Cliente.placa + " ingreso la fecha " + Mecanico.fechaSal + " con las siguientes observaciones realizadas por el mecanico " + Mecanico.nombre + ": " + Mecanico.obsMec);
                    break;
                case 3:
                    System.out.println("Usted ha salido correctamente");
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
