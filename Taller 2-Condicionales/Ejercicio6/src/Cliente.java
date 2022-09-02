import java.util.Scanner;

public class Cliente {
    public static String placa;
    public static String fecha;
    public static String obsCliente;

    public static void cliente() {
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido al taller de motos El Maquinista");
        System.out.println("Por favor ingrese la placa de su motocicleta:");
        placa = input.nextLine();

        System.out.println("Ingrese la fecha en la cual entro su motocicleta en forma dd/mm/aa");
        fecha = input.nextLine();

        System.out.println("Ingrese el motivo por el cual trae su moto al taller");
        obsCliente = input.nextLine();

        System.out.println("Su solictud esta siendo procesada por favor esperar a que el mecanico realice su diagnostico");
        
    }
}
