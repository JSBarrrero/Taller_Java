import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    public static boolean salir = false;
    public static Integer opcion;
    public static String nombre; 

    public static void menu() {
        Usuario persona = new Usuario();
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a la video tienda del barrio Porvenir");
        System.out.println("Por favor digite su usuario");
        persona.setNombre(input.nextLine());
   
            while (!salir) {
                System.out.println("Bienvenido " + persona.getNombre() + " por favor elija una opcion:");
                System.out.println("1. Alquilar pelicula");
                System.out.println("2. Regresar pelicula");
                System.out.println("3. Salir");
                
                try {
                    opcion = input.nextInt();
                    switch (opcion) {
                        case 1:
                        AlquilarPelicula.alquilarPelicula(persona.getNombre());
                        salir = AlquilarPelicula.salir;
                            break;
                        case 2:
                        RegresarPelicula.regresarPelicula();
                        salir = RegresarPelicula.salir;  
                            break;
                        case 3:
                        salir = true;
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
