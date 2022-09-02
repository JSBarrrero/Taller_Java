import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static Integer opcion;
    public static boolean salir;

    public static void menu() {
        Scanner input = new Scanner(System.in);

        salir = false;

        while (!salir) {
            System.out.println("Menu del usuario");
            System.out.println("1. Capturar nombre");
            System.out.println("2. Saludar persona");
            System.out.println("3. Salir del sistema");
            try {
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        CapturarNombre.capturarNombre();
                        break;
                    case 2:
                        if (CapturarNombre.nombre == "") {
                            System.out.println("Usted no ha ingresado ningun nombre, asi que no se puede saludar");
                        } else {
                            System.out.println("Hola " + CapturarNombre.nombre);
                        }
                        break;
                    case 3:
                        salir = true;
                        break;
                
                    default:
                        System.out.println("La opcion que ingreso no es valida, por favor intentelo nuevamente");
                        break;
                }
                
            } catch (InputMismatchException e) {
                System.out.println("La opcion que ingreso no es valida, por favor intentelo nuevamente");
                input.next();
            }
        }
        
    }
}
