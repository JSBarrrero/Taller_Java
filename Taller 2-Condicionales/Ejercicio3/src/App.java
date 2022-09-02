import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor digite su nombre");
        persona.nombre = input.nextLine();
        System.out.println("Por favor digite su apellido");
        persona.apellido = input.nextLine();
        System.out.println("Por favor digite su edad");
        persona.edad = input.nextInt();

        if (persona.edad >= 18) {
            System.out.println(persona.nombre + " " + persona.apellido + " usted es mayor de edad, por lo tanto puede entrar a la fiesta");
            
        } else {
            System.out.println(persona.nombre + " " + persona.apellido + " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa");
        }

    }
}
