import java.util.Scanner;

public class ConsultarTortas {
    public static String seguir;

    public static void consultarTortas() {
        Scanner input = new Scanner(System.in);

        System.out.println("Las tortas disponibles actualmente son:");
        System.out.println("1. Torta de chocolate");
        System.out.println("2. Torta genovesa");
        System.out.println("3. Totar de mora");
        System.out.println("Presione enter para continuar");
        seguir = input.nextLine();
    }
}
