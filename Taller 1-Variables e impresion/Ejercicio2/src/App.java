import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Persona person = new Persona();

        Scanner input = new Scanner(System.in);

        System.out.println("Por favor digte su nombre");
        person.nombre = input.nextLine();
        System.out.println("Por favor digte su apellido");
        person.apellido = input.nextLine();
        System.out.println("Por favor digte su estatura en metros");
        person.estatura = input.nextDouble();
        System.out.println("Hola "+person.nombre+" "+person.apellido+" usted mide "+person.estatura+"m");
    }
}
