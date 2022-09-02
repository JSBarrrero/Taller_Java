import java.util.InputMismatchException;
import java.util.Scanner;

public class AlquilarPelicula {

    public static Integer opcion;
    public static boolean salir = false;
    public static boolean salir2 = false;

    public static void alquilarPelicula(String nombre) {
        Scanner input = new Scanner(System.in);

        salir2 = false;

        while (!salir2) {
        System.out.println("Usted ingreso a la opcion alquilar pelicula");
        System.out.println("Las peliculas disponibles son las siguientes:");
        System.out.println("- Up: Una aventura de altura");
        System.out.println("- Ralph, El demoledor");
        System.out.println("- Moana");
        System.out.println("Elija una opcion:");
        System.out.println("1. Alquilar pelicula");
        System.out.println("2. Regresar al menu anterior");
        System.out.println("3. Salir del programa");
        
        try {
            opcion = input.nextInt();

        switch (opcion) {
            case 1:
            System.out.println("Elija la pelicula que desea alquilar:");
            System.out.println("1. Up: Una aventura de altura");
            System.out.println("2. Ralph, El demoledor");
            System.out.println("3. Moana");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                System.out.println(nombre + " usted alquilo correctamente Up: Una aventura de altura");
                System.exit(0);
                    break;
                case 2:
                System.out.println(nombre + " usted alquilo correctamente Ralph, El demoledor");
                System.exit(0);    
                    break;
                case 3:
                System.out.println(nombre + " usted alquilo correctamente Moana");
                System.exit(0);     
                    break;
            
                default:
                System.out.println("La opcion que ingreso no es valida");
                    break;
            }
                break;
            case 2:
            salir2 = true; 
                break;
            case 3:
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
