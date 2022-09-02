import java.util.Scanner;

public class Devolucion {
    public static String devol;

    public static void devolucion() {
        Scanner input = new Scanner(System.in);

        System.out.println("Escriba el motivo de su devolucion");
        devol = input.nextLine();
        System.out.println("El motivo de su devolucion se tendra en cuenta, muchas gracias");
    }
}
