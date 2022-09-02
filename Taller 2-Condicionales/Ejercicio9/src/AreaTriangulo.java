import java.util.Scanner;

public class AreaTriangulo {
    public static String seguir;

    public static void triangulo() {
        Scanner input = new Scanner(System.in);
        Datos triangulo = new Datos();

        System.out.println("Ingreso a la opcion calcula area de un triangulo");
        System.out.println("Recuerde que las medidas deben estar en las mismas unidades");
        System.out.println("Por favor digite la medida de la base del triangulo");
        triangulo.baseMenor = input.nextDouble();
        System.out.println("Por favor digite la medida de la altura del triangulo");
        triangulo.altura = input.nextDouble();

        triangulo.area = (triangulo.baseMenor * triangulo.altura)/2;

        System.out.println("El area del triangulo es " + triangulo.area);
    }
}
