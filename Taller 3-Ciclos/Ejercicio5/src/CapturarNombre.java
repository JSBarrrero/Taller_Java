import java.util.Scanner;

public class CapturarNombre {
    public static String nombre="";

    public static void capturarNombre() {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor ingrese su nombre:");
        nombre = input.nextLine();  
    }
    
}
