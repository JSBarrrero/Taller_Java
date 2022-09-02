import java.util.Scanner;

public class Ingreso {
    public static Double ingreso;
    public static Double total=0.0;
    public static boolean salir;

    public static void ingreso(Double cantidad1) {
        Scanner input = new Scanner(System.in);


        salir = false;

        while (!salir) {

                System.out.println("Por favor digite la cantidad que va a ingresar");
                ingreso = input.nextDouble();
                if (ingreso < 0) {
                    System.out.println("Para los ingresos no se permiten valores negativos, por favor intentelo nuevamente");
                } else {
                    Persona.cantidad = ingreso + cantidad1;
                    System.out.println("Su cuenta ahora tiene un saldo de $ " + Persona.cantidad.toString() + " pesos");
                    salir = true;
                } 
 
        }
    }
}
