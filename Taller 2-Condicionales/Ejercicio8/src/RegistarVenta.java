import java.util.Scanner;

public class RegistarVenta {
    public static Integer ventas = 0;
    public static String seguir;

    public static void registrarVenta() {
        Scanner input = new Scanner(System.in);

        ventas ++;

        System.out.println("Actulamente lleva " + ventas + " ventas en el dia");
        System.out.println("Presione enter para continuar");
        seguir = input.nextLine();
    }
}
