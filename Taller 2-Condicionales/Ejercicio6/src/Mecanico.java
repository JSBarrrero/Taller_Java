import java.util.Scanner;

public class Mecanico {
    public static String nombre;
    public static String obsMec;
    public static String fechaSal;

    public static void mecanico() {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese su nombre(mecanico)");
        nombre = input.nextLine();

        System.out.println("Ingrese las novedades y arreglos realizadas en la moto");
        obsMec = input.nextLine();

        System.out.println("Ingrese la fecha de salida de la motocicleta en forma dd/mm/aa");
        fechaSal = input.nextLine();
        
    }

    
}
