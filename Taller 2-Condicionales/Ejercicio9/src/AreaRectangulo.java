import java.util.Scanner;

public class AreaRectangulo {
    public static String seguir;

    public static void rectangulo() {
        Scanner input = new Scanner(System.in);
        Datos rectangulo = new Datos();

        seguir = "";

        System.out.println("Ingreso a la opcion calcula area de un rectangulo");
        System.out.println("Recuerde que las medidas deben estar en las mismas unidades");
        System.out.println("Por favor digite la medida de la base del rectángulo");
        rectangulo.baseMenor = input.nextDouble();
        System.out.println("Por favor digite la medida de la altura del rectángulo");
        rectangulo.altura = input.nextDouble();

        rectangulo.area = rectangulo.baseMenor * rectangulo.altura;

        System.out.println("El area del rectangulo es " + rectangulo.area);
    }
}
