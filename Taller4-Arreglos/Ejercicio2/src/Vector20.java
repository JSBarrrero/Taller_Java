import java.util.Scanner;

public class Vector20 {
    public static Integer [] vector = new Integer [20];
    public static Integer cont=0;

    public static void vector20() {
        Scanner input = new Scanner(System.in);

        while (cont < 20) {
            System.out.println("Por favor ingrese un numero entero:");
            vector[cont] = Integer.parseInt(input.nextLine());
            cont++;
        }
    }
    
}
