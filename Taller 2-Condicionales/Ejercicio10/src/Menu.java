import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static Integer opcion;
    public static boolean salir;

    public static void menu() {
        Scanner input = new Scanner(System.in);
        Persona persona = new Persona();
        salir = false;

        System.out.println("Bienvenido al banco Su Banco Fiel");
        System.out.println("Por favor digite el nombre del titular de la cuenta");
        persona.setNombre(input.nextLine());
        System.out.println("Por favor digite la cantidad que tiene actualmente en la cuenta");
        Persona.cantidad = input.nextDouble();
        
        while (!salir) {
            System.out.println("Elija una opcion:");
            System.out.println("1. Realizar un ingreso");
            System.out.println("2. Realizar un retiro");
            System.out.println("3. Consultar saldo");
            System.out.println("4. Salir del programa");
            try {
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        Ingreso.ingreso(Persona.cantidad);
                        break;
                    case 2:
                        Retiro.retiro(Persona.cantidad);
                        break;
                    case 3:
                        ConsultarSaldo.consultarSaldo(Persona.cantidad);
                        break;
                    case 4:
                        salir = true;
                        break;    
                
                    default:
                        System.out.println("La opcion que ingreso no es valida intentelo nuevamente");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("La opcion que ingreso no es valida intentelo nuevamente");
                input.next();
            }   
        }
    }
}
