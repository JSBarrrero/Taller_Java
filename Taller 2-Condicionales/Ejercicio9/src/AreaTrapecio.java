import java.util.Scanner;

public class AreaTrapecio {
    public static String seguir;

    public static void trapecio() {
        Scanner input = new Scanner(System.in);
        Datos trapecio = new Datos();

        System.out.println("Ingreso a la opcion calcula area de un trapecio");
        System.out.println("Recuerde que las medidas deben estar en las mismas unidades");
        System.out.println("Por favor digite la medida de la base menor del trapecio");
        trapecio.baseMenor = input.nextDouble();
        System.out.println("Por favor digite la medida de la base mayor del trapecio");
        trapecio.baseMayor = input.nextDouble();
        System.out.println("Por favor digite la medida de la altura del trapecio");
        trapecio.altura = input.nextDouble();

        trapecio.area = ((trapecio.baseMenor + trapecio.baseMayor) * trapecio.altura)/2;

        System.out.println("El area del trapecio es " + trapecio.area);
    }
}
