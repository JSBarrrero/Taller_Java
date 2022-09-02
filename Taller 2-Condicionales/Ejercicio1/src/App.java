import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Persona persona = new Persona();
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor digite su edad:");
        persona.edad = input.nextInt();

        if (persona.edad >= 18) {
            System.out.println("Usted es mayor de edad");
        }
    }
}
