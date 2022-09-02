import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static Integer opcion;
    public static boolean salir;
    public static Double imc;

    public static void menu() {
        Scanner input = new Scanner(System.in);
        Persona persona = new Persona();

        salir = false;

        System.out.println("Bienvenido al programa para calcular el IMC de la Secretaria de Salud Municipal");
        System.out.println("Por favor digite su nombre");
        persona.nombre = input.nextLine();

        System.out.println("Por favor digite su peso en kilogramos(kg)");
        persona.peso = input.nextDouble();

        System.out.println("Por favor digite su estatura en metros (m)");
        persona.altura = input.nextDouble();

        while (!salir) {
            System.out.println("Ahora elija una opcion:");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Salir del programa");

            try {
                opcion = input.nextInt();
                switch (opcion) {
                    case 1:
                        imc = persona.peso/(Math.pow(persona.altura, 2));
                        if (imc < 18.5) {
                            System.out.println(persona.nombre + " su IMC es de " + imc + " por lo tanto su nivel de peso es bajo");
                            salir = true;
                        } else {
                            if (18.5 <= imc & imc < 25) {
                                System.out.println(persona.nombre + " su IMC es de " + imc + " por lo tanto su nivel de peso es normal");
                                salir = true;
                            } else {
                                if (25 <= imc & imc < 30) {
                                    System.out.println(persona.nombre + " su IMC es de " + imc + " por lo tanto usted esta en sobrepeso");
                                    salir = true;   
                                } else {
                                    System.out.println(persona.nombre + " su IMC es de " + imc + " por lo tanto usted esta obeso");
                                    salir = true;   
                                }
                            }                          
                        }
                        break;
                    case 2:
                        salir = true;  
                        break;
                    default:
                        System.out.println("La opcion que ingreso no es valida, intentelo nuevamente");
                        break;
                }  
            } catch (InputMismatchException e) {
                System.out.println("La opcion que ingreso no es valida, intentelo nuevamente");
                input.next();
            }
        }  
    }
}