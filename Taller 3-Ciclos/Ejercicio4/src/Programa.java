import java.util.Scanner;

public class Programa {
    public static Integer numero;
    public static Integer resultado;
    public static void programa() {
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido al programa para mostrar la tabla del numero que usted desea");
        System.out.println("Por favor ingrese el numero del cual desea la tabla de multiplicar");
        numero = input.nextInt();

        for (Integer i=1;i<=10;i++) {
            resultado = numero * i;
            System.out.println(i + " X " + numero.toString() + " = " + resultado.toString());  
        }
    }
}
