import java.util.InputMismatchException;
import java.util.Scanner;

public class RegresarPelicula {
    public static String anotacion;
    public static Integer opcion;
    public static boolean salir = false;
    public static boolean salir2 = false;

    public static void regresarPelicula() {
        Scanner input = new Scanner(System.in);

        salir2 = false;

        while (!salir2) {
         System.out.println("Usted ingreso a regresar pelicula");
         System.out.println("Elija una opcion");
         System.out.println("1. Sin novedad o anotacion");
         System.out.println("2. Registar novedad o anotacion");
         System.out.println("3. Regresar al menu anterior");
         System.out.println("4. Salir del programa");
        
         try {
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                System.out.println("Gracias por entregar la pelicula en perfecto estado");    
                    break;
                case 2:
                System.out.println("Por favor ingrese la novedad o anotacion sobre la pelicula"); 
                anotacion = input.nextLine();
                System.out.println("Muchas gracias por la honestidad, se tendra en cuenta su novedad sobre la pelicula");   
                    break;
                case 3:
                salir2 = true;
                    break;    
                case 4:
                salir = true;
                salir2 = true;
                    break;
            
                default:
                System.out.println("La opcion que ingreso no es valida");
                    break;
            }
            
         } catch (InputMismatchException e) {
            System.out.println("La opcion que ingreso no es valida");
            input.next();
         }
            
        }
        
    }
}
