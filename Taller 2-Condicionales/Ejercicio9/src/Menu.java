import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu{
    public static Integer opcion;
    public static boolean salir;

    public static void menu() {
        Scanner input = new Scanner(System.in);

        salir = false;

        while (!salir) {
            System.out.println("Bienvenido a la calculadora de areas");
            System.out.println("Por favor digite una opcion:");
            System.out.println("1. Calcular area de un rectangulo");
            System.out.println("2. Calcular area de un triangulo");
            System.out.println("3. Calcular area de un trapecio");
            System.out.println("4. Salir del programa");

            try {
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        AreaRectangulo.rectangulo();
                        break;
                    case 2:
                        AreaTriangulo.triangulo();
                        break;
                    case 3:
                        AreaTrapecio.trapecio();
                        break;
                    case 4:
                        salir = true;
                        System.out.println("Usted salio del programa correctamente");
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