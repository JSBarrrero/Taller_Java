import java.util.Scanner;

public class Retiro {
    public static Double retiro;
    public static Double total=0.0;
    public static boolean salir;

    public static void retiro(Double cantidad1) {
        Scanner input = new Scanner(System.in);
        salir = false;

        while (!salir) {
                System.out.println("Por favor digite la cantidad que va a retirar");
                retiro = input.nextDouble();
                if (retiro > cantidad1) {
                    System.out.println("El retiro no se puede realizar efectivamente ya que la cantidad solicitada a retirar es mayor a la cantidad que actualmente posee la cuenta, intentelo nuevamente");
                } else {
                    Persona.cantidad = (cantidad1 - retiro);
                    System.out.println("Su cuenta ahora tiene un saldo de $ " + Persona.cantidad.toString() + " pesos");
                    salir = true;
                } 
        }
    }
}
