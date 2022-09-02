import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        
        Persona person = new Persona();

        System.out.println("Digite su nombre");
        person.nombre = input.nextLine();
        System.out.println("Digite su apellido");
        person.apellido = input.nextLine();
        System.out.println("Su nombre completo es: " + person.nombre +' '+ person.apellido);
    }
}
